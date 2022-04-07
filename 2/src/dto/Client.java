package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	
	public Socket socket;
	
	public Client (Socket socket) {
		this.socket = socket;
	}
	
	// 서버로 메시지 받는 메소드
	
	public void receive() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while (true) {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[9999];
						inputStream.read(bytes);
						String msg = new String(bytes);
						for (Client client : Server.clientlist) {
							client.send(msg);
						}
					}
				} catch (Exception e) {
					System.err.println("RECEIVE ERROR" + e);
				}
				
			}
		};
		
		Server.threadpool.submit(runnable);
	}
	
	// 서버가 메시지를 보내는 메소드
	public void send(String msg) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
					
				} catch (Exception e) {
					System.err.println("SEND ERROR : " + e);
				}
				
			}
		};
		
		Server.threadpool.submit(runnable);
		
	}
}
