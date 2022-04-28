package Day12;

public class Day12_2 {
	
	// String method
	
	public static void main(String[] args) {
		// p.501 equals() : 문자열 비교
		// 기본 자료형 사용하는 변수는 연산자 사용 가능 [==]
		// String 클래스 사용하는 객체는 연산자 이용 불가능 [equlas ==]
		// 1. 문자열 선언
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		// 2. 문자열 비교
		
		if (strVar1 == strVar2) {
			System.out.println("같은 String객체를 참조");
		} else {
			System.out.println("다른 String객체를 참조");
		}
		
		
		
		// p.502 .getBytes() : 문자열 -> 바이트열 변환
		String str = "안녕하세요"; // 영문 1바이트 한글 2바이트
		// 문자열 -> 바이트열 변환
		byte[] bytes1 = str.getBytes();
		System.out.println("영문 1바이트 한글 2바이트 : " + bytes1.length);
		// 바이트열 -> 문자열 변환
		String str1 = new String(bytes1);
		System.out.println("바이트열 -> 문자열 " + str1);
		// 인코딩 타입
		try {
			// 1. EUC-KR
			byte[] bytes2 = str.getBytes("EUC-KR");	 // 일반예외
			System.out.println("EUC-KR 길이 : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("바이트열 -> 문자열 : " + str2);
			// 2. UTF-8
			byte[] bytes3 = str.getBytes("UTF-8");	 // 일반예외
			System.out.println("UTF-8 길이 : " + bytes3.length);
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("바이트열 -> 문자열 : " + str2);
		} catch (Exception e) {
			
		}
	
	}

}
