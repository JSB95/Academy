package Day02;

public class Day02_2 { // c s

	@SuppressWarnings("unused")
	public static void main(String[] args) { // m s
		
		//; : 실행 단위 구분
		// 동일한 변수 명은 사용할 수 없다. [이름이 중복되면 오류(구분불가)]
		
		// p.40 byte : 1바이트 +- 128
		byte var1 = -128;	System.out.println(var1);
		byte var2 = -30;	System.out.println(var2);
		byte var3 = 0;		System.out.println(var3);
		byte var4 = 30;		System.out.println(var4);
		byte var5 = 127;	System.out.println(var5);
		//byte var6 = 128;	System.out.println(var6);	
			// 오류 발생 : 128 이상은 저장할 수 없다.
		byte var7 = 'j';	System.out.println(var7);
			// 문자 -> 정수
		
		// p.43 char : 2바이트 [1문자] - 유니코드(2바이트:세계 공용어) vs 아스키코드
		char c1 = 'a';		System.out.println(c1);
		char c2 = 97; 		System.out.println(c2); // 10진수 표현 : 0~9
			// 정수 -> 문자 변환
		char c3 = '\u0041'; System.out.println(c3); // 16진수 표현
		char c4 = '가'; 		System.out.println(c4);
		char c5 = 44032; 	System.out.println(c5);
		char c6 = '\uac00';	System.out.println(c6);
		
		// 진법 [컴퓨터가 2진수만 사용하면 표현단위가 적기 때문에 다양성을 위해 다른 진수도 사용]
			// 2진수 : 0, 1	/ 기계어(2진코드) / 용량(1비트)
			// 8진수 : 0 ~ 7
			// 10진수 : 0 ~ 9
			// 16진수 : 0 ~ 9 A B C D E F
		
		// p.44 short : 2바이트 정수 +-3만정도
		short num1 = 30000;	System.out.println(num1);
		//short num2 = 40000; System.out.println(num2); 오류 발생
		
		
		// p.45 int : 4바이트 정수 +-20억정도 (기본)
		int num2 = 10;		System.out.println(num2); // 10진수
		int num3 = 012;		System.out.println(num3); // 8진수는 앞에 0 붙이기
		int num4 = 0x4;		System.out.println(num4); // 16진수는 앞에 0x붙이기
		
		// p.46 long : 8바이트 정수 +-20억 이상 [데이터 뒤에 L]
		long num5 = 10000000000L;	System.out.println(num5);
					// int형 -> long형
		
		// p.47 float [데이터 뒤에 f] : 4바이트 - 소수점 이하 9자리 / double [실수 기본 타입] : 8바이트 - 소수점 이하 17자리
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14f; System.out.println(num7);
		
		double num8 = 0.123456789123465789111111111; System.out.println(num8);
		float num9 = 0.12345678912345678911111111f;  System.out.println(num9);
		
		// p.48 boolean : 1비트 [true or false]
			// 스위치 : on, off
		boolean bol = true;	System.out.println(bol);
		
		// p.49 타입 변환
			// * 크기 순서 : byte -> short -> int -> long -> float -> double [자동 형변환 방향]
			// 1. 자동 형변환 : 작은 상자에서 큰 상자로 이동 가능, 큰 상자에서 작은 상자로 이동 불가
		byte 바이트 = 10;
		int 인트 = 바이트; // 자동 형변환 O
			// 2. 강제 형변환 : 큰 상자에서 작은 상자로 이동 가능 단, 데이터 손실 감안 (변경할자료)변수명
		short 쇼트 = (short)인트; // int형 변수를 short로 변환하는데, 데이터 손실
		
		/* p.60 연습문제
		 * 변수는 숫자로 시작할 수 없다, 예약어[미리 만들어진 언어] 불가
		 * 기본자료형 사용한 메모리는 변수 -> 메모리 할당 / new X
		 * 클래스를 사용한 메모리는 객체 -> 메모리 할당 / new O
		 * 자료형 연산시 자료형 변환 	byte + byte = int
		 * 						int + byte = int
		 * 						int + float = int
		 * 						int + double = int
		 */
		
	} // m e

} // c e
