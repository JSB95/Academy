package controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dto.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable{
	
	@FXML
    private Button btnserver;
    @FXML
    private TextArea txtserver;
	
	public static Vector<Client> clientlist = new Vector<>();
	
	public static ExecutorService threadpool;
	
	ServerSocket serverSocket;
	
	public void serverstart() {
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1",1234));
			
		} catch (Exception e) {
			System.err.println("SERVERSTART ERROR : " + e);
		}
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					while (true) {
						Socket socket = serverSocket.accept();
						clientlist.add(new Client(socket));
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("SERVERSTART_RUN ERROR : " + e);
				}
				
				
			}
		};
		
		threadpool = Executors.newCachedThreadPool();
		
		threadpool.submit(runnable);
	}
	
	public void serverstop() throws IOException {
		
		for (Client client : clientlist) {
			client.socket.close();
		}
		serverSocket.close();
		
		threadpool.shutdown();
		
	}
	
	@FXML
	void server(ActionEvent event) throws IOException {
		if (btnserver.getText().equals("서버 실행")) {
			txtserver.appendText("서버 실행\n");
			serverstart();
			btnserver.setText("서버 중지");
		} else {
			serverstop();
			txtserver.appendText("서버 중지\n");
			btnserver.setText("서버 실행");
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		txtserver.setDisable(true);
		
	}

}
