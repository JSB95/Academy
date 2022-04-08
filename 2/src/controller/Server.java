package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {
	
	public Vector<Client> clientlist = new Vector<>();
	
	public ExecutorService threadpool;
	
	ServerSocket serverSocket;
	
	
	public void serverstart(String ip, int port) {
		
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress(ip,port));
			
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
	
	// 중첩 클래스
	
	public class Client {
		
		public Socket socket;
		
		public Client (Socket socket) {
			this.socket = socket;
			receive();
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
							for (Client client : clientlist) {
								client.send(msg);
							}
						}
					} catch (Exception e) {
						System.err.println("RECEIVE ERROR : " + e);
					}
					
				}
			};
			
			threadpool.submit(runnable);
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
			
			threadpool.submit(runnable);
			
		}
		
	} // public class end

}
