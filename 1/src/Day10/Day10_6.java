package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	
	public static void main (String[] args) throws IOException{
		// ���� ���
		FileOutputStream file_out = new FileOutputStream("D:/java/java1.txt");
		String content = "�ڹٿ��� �Էµ� ������";
		file_out.write(content.getBytes());
		
		// ���� �Է�
		FileInputStream file_in = new FileInputStream("D:/java/java1.txt");
		byte[] bytes = new byte[1000];
		file_in.read(bytes);
		System.out.println("���ϳ��� : " + new String(bytes));
	}

}
