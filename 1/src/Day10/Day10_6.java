package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	
	public static void main (String[] args) throws IOException{
		// 파일 출력
		FileOutputStream file_out = new FileOutputStream("D:/java/java1.txt");
		String content = "자바에서 입력된 데이터";
		file_out.write(content.getBytes());
		
		// 파일 입력
		FileInputStream file_in = new FileInputStream("D:/java/java1.txt");
		byte[] bytes = new byte[1000];
		file_in.read(bytes);
		System.out.println("파일내용 : " + new String(bytes));
	}

}
