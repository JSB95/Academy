package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	
	public static void main(String[] args) throws IOException {
		// p.496 String class
		
		
		
		// p. 497 예제1
		// 1. 여러개 바이트를 저장할 수 있는 바이트 배열 선언
		byte[] bytes = { 72, 101, 108, 108 , 111, 32, 74, 97, 118, 97 };
		String str1 = new String (bytes);
		// 3. 확인
		System.out.println("바이트배열 -> 문자열 변환 : " + str1);
		// 4. 특정 위치부터 변환 [new String 배열명, 시작인덱스, 갯수)]
		String str2 = new String (bytes, 6, 4);
		// 5. 확인
		System.out.println("바이트 배열 내 6번인덱스부터 4개 반환: " + str2);
		
		// p.498 예제2
			// System.out : 시스템 클래스 내 출력 필드
			// System.in : 시스템 클래스 내 입력 필드
		
		byte[] bytes2 = new byte[100];		// 100개의 바이트를 저장할 수 있는 배열
		
		System.out.print("입력 : ");		// 출력필드 내 print 메소드 호출
		int readByteNo = System.in.read(bytes2);		// 외부 통신 : 자바프로그램 외 키보드 파일 네트워크 등 -> 입출력 일반예외 발생
		// 키보드 입력 ---> 스트림(통신 : 바이트) ---> 컴퓨터
		// a -> 97 // a + enter -> 97, 13[\n], 10[\r : 커서를 앞으로]
		System.out.println("입력받은 바이트 : " + Arrays.toString(bytes2));
		String str = new String(bytes2, 0 , readByteNo-2);		// 읽은 바이트수 - 2
		System.out.println("입력받은 바이트 -> 문자열변환 : " + str);
		
		// Scanner 클래스 [System.in]으로 입력받은
		Scanner scanner = new Scanner(System.in)
				;
	}

}
