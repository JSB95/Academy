package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			
			System.out.println("��Ʈ��ũ : " + inetAddress);
			System.out.println("�̸� : " + inetAddress.getHostName());
			System.out.println("ip : " + inetAddress.getHostAddress());
			
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� ��Ʈ��ũ : " + inetAddress2);
			System.out.println("���̹� �̸� : " + inetAddress2.getHostName());
			System.out.println("���̹� ip : " + inetAddress2.getHostAddress());
			
			InetAddress inetAddress3 = InetAddress.getByName("www.fb.com");
			System.out.println("���̹� ��Ʈ��ũ : " + inetAddress3);
			System.out.println("���̹� �̸� : " + inetAddress3.getHostName());
			System.out.println("���̹� ip : " + inetAddress3.getHostAddress());
			
		} catch (Exception e) {
			
		}

	}

}
