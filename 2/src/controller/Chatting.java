package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Chatting implements Initializable{
	
    @FXML
    private TextField txtport;

    @FXML
    private Button btnconnect;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextArea txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtip;
    
    Socket socket;
    
    public void clientstart() {
    	Thread thread = new Thread() {
    		
    		@Override
    		public void run() {
    			try {
    				socket = new Socket("127.0.0.1",1234);
    				send(Login.member.getMid() + "님 입장했습니다.");
    				receive();
    			} catch (Exception e) {
    				System.err.println("CLIENTSTART ERROR : " + e);
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
    		
    		public void run() {
    			try {
    				OutputStream outputStream = socket.getOutputStream();
    				outputStream.write(msg.getBytes());
    				outputStream.flush();
    			} catch (Exception e) {
    				System.err.println("SEND ERROR : " + e);
    			}
    		}
    		
    	};
    	thread.start();
    }
    
    public void receive() {
    	
    	try {
    		InputStream inputStream = socket.getInputStream();
    		byte[] bytes = new byte[9999];
    		inputStream.read(bytes);
    		String msg = new String(bytes);
    		txtcontent.appendText(msg);
    	} catch (Exception e) {
    		System.err.println("RECEIVE ERROR : " + e);
    	}
    	
    }

    @FXML
    void connect(ActionEvent event) {
    	
    	
    	
    	if (btnconnect.getText().equals("채팅방 입장")) {
    		clientstart();
    		txtcontent.appendText("==================================== 채팅방 입장 ====================================\n");
    		btnconnect.setText("채팅방 나가기");
    		
    		txtmsg.setText("");
    		txtmsg.setEditable(true);
    		txtcontent.setDisable(false);
    		btnsend.setDisable(false);
    		txtmsg.requestFocus();
    		
    	} else {
    		clientstop();
    		txtcontent.appendText("==================================== 채팅방 퇴장 ====================================\n");
    		btnconnect.setText("채팅방 입장");
    		txtmsg.setText("채팅방 입장 후 사용 가능");
    		txtmsg.setEditable(false);
    		txtcontent.setDisable(true);
    		btnsend.setDisable(true);
    	}

    }

    @FXML
    void send(ActionEvent event) {
    	String msg = txtmsg.getText() + "\n";
    	send (msg);
    	txtmsg.setText("");
    	txtmsg.requestFocus();
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    	txtmsg.setEditable(false);
    	txtcontent.setDisable(true);
    	btnsend.setDisable(true);
    	
    }
    
    
    


}
