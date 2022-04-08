package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.Roomlive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class Chatting implements Initializable{
	
	@FXML
    private Button btnconnect;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private TableView<Room> roomtable;

    @FXML
    private TextField txtroomname;

    @FXML
    private Button btnadd;

    @FXML
    private TextArea txtmidlist;

    @FXML
    private Label lblselect;
    
    public Server server;
    
    public Room selectroom;
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void show() {
    	
    	ObservableList<Room> roomlist = RoomDao.roomDao.roomlist();
    	
    	TableColumn tc = roomtable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
    	
    	tc = roomtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
    	
    	tc = roomtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
    	
    	roomtable.setItems(roomlist);
    	
    	roomtable.setOnMouseClicked(e -> {
    		
    		selectroom = roomtable.getSelectionModel().getSelectedItem();
    		
    		lblselect.setText("현재 선택된 방 : " + selectroom.getRoname());
    		
    		btnconnect.setDisable(false);
    	});
    	
  
    }

    @FXML
    void add(ActionEvent event) {
    	
    	String roomname = txtroomname.getText();
    	if (roomname.length() < 4) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("방 개설 실패 (4글자 미만)");
    		alert.showAndWait();
    		return;
    	}
    	Room room = new Room(0, roomname, "127.0.0.1" , 0);
    	RoomDao.roomDao.roomadd (room);
    	server = new Server();
    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
    	System.out.println("서버 시작");
    	txtroomname.setText("");
    	show();
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("방 개설 성공 방번호 : " + RoomDao.roomDao.getroomnum());
    	alert.showAndWait();
    	
    }

    @FXML
    void msg(ActionEvent event) {
    	
    	String msg = Login.member.getMid() + " : " + txtmsg.getText() + "\n";
    	send(msg);
    	txtmsg.setText("");
    	txtmsg.requestFocus();
    	
    	ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getRoomlivelist(selectroom.getRonum());
    	txtmidlist.setText("");
    	int i = 1;
    	for (Roomlive temp : roomlivelist) {
    		txtmidlist.appendText(i + "번" + temp.getMid() + "\n");
    		i++;
    	}

    }
    
    Socket socket;
    
    public void clientstart(String ip, int port) {
    	Thread thread = new Thread() {
    		
    		@Override
    		public void run() {
    			try {
    				socket = new Socket(ip, port);
    				send(Login.member.getMid() + "님 입장했습니다.");
    				receive();
    			} catch (Exception e) {
    				System.err.println("CLIENTSTART ERROR : " + e);
    				e.printStackTrace();
    			}
    		}
    	};
    	thread.start();
    	
    }
    
    public void clientstop() {
    	try {
    		socket.close();
    	} catch (Exception e) {
    		System.err.println("CLIENTSTOP ERROR : " + e);
    	}
    }
    
    public void send (String msg) {
    	
    	Thread thread = new Thread() {
    		@Override
    		public void run() {
    			try {
    				OutputStream outputStream = socket.getOutputStream();
    				outputStream.write(msg.getBytes());
    				outputStream.flush();
    			} catch (Exception e) {
    				//System.err.println("SEND ERROR : " + e);
    			}
    		}
    		
    	};
    	thread.start();
    }
    
    public void receive() {
    	
    	try {
    		while (true) {
	    		InputStream inputStream = socket.getInputStream();
	    		byte[] bytes = new byte[9999];
	    		inputStream.read(bytes);
	    		String msg = new String(bytes);
	    		txtcontent.appendText(msg);
    		}
    	} catch (Exception e) {
    		System.err.println("RECEIVE ERROR : " + e);
    	}
    	
    }

    @FXML
    void connect(ActionEvent event) {
    	
    	if (btnconnect.getText().equals("채팅방 입장")) {
    		clientstart(selectroom.getRoip(), selectroom.getRonum());
    		
    		Roomlive roomlive = new Roomlive(0, selectroom.getRonum(), Login.member.getMid());
    		RoomDao.roomDao.addroomlive(roomlive);
    		
    		txtcontent.appendText("================ 채팅방 입장 ================\n");
    		btnconnect.setText("채팅방 나가기");
    		
    		txtmsg.setText("");
    		txtmsg.setDisable(false);
    		txtcontent.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus();
    		
    		txtroomname.setDisable(true);
    		btnadd.setDisable(true);
    		roomtable.setDisable(true);
    		
    		
    	} else {
    		clientstop();
    		txtcontent.appendText("================ 채팅방 퇴장 ================\n");
    		btnconnect.setText("채팅방 입장");
    		txtmsg.setText("채팅방 입장 후 사용 가능");
    		txtmsg.setDisable(true);
    		txtcontent.setDisable(true);
    		btnsend.setDisable(true);
    		
    		txtroomname.setDisable(false);
    		btnadd.setDisable(false);
    		roomtable.setDisable(false);
    		
    		selectroom = null;
    		lblselect.setText("현재 선택된 방 : ");
    	}

    }

    @FXML
    void send(ActionEvent event) {
    	String msg = txtmsg.getText() + "\n";
    	send (msg);
    	txtmsg.setText("");
    	txtmsg.requestFocus();
    	ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getRoomlivelist(selectroom.getRonum());
    	txtmidlist.setText("");
    	int i = 1;
    	for (Roomlive temp : roomlivelist) {
    		txtmidlist.appendText(i + "번" + temp.getMid() + "\n");
    		i++;
    	}
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	txtmsg.setText("채팅방 입장 후 사용 가능");
    	txtmsg.setDisable(true);
    	txtcontent.setDisable(true);
    	btnsend.setDisable(true);
    	btnconnect.setDisable(true);
    	txtmidlist.setDisable(true);
    	show();
    	
    	
    }
    
    
    


}
