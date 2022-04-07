package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			System.out.println("네트워크 : " + inetAddress);
			System.out.println("이름 : " + inetAddress.getHostName());
			System.out.println("ip : " + inetAddress.getHostAddress());
			
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 네트워크 : " + inetAddress2);
			System.out.println("네이버 이름 : " + inetAddress2.getHostName());
			System.out.println("네이버 ip : " + inetAddress2.getHostAddress());
			
			InetAddress inetAddress3 = InetAddress.getByName("www.fb.com");
			System.out.println("네이버 네트워크 : " + inetAddress3);
			System.out.println("네이버 이름 : " + inetAddress3.getHostName());
			System.out.println("네이버 ip : " + inetAddress3.getHostAddress());
			
		} catch (Exception e) {
			
		}

	}

}
