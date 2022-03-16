package Day11;

public class Day11_2 {
	
	// p.422
		// 컴퓨터의 하드웨어 문제를 에러라 정의 (실행 불가능)
		// 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩 -> 에러 -> 예외
		// 1. 일반예외 : 컴파일[실행]전에 예외 검사 -> 개발자에게 강제 예외처리 안내
		// 2. 실행예외 : 컴파일[실행]후에 예외 검사 -> 개발자의 경험에 의해 판단해서 예외처리
		// 예외 처리
			// 목적 : 에러가 발생하면 프로그램은 종료 (안정성 문제)
			// 만약에 에러가 발생하면 대체 코드가 실행 (프로그램이 종료되지 않게)
	
		/*
		 * 	try{
		 * 	예외가 발생할 것 같은 코드
		 * 	} catch (예외 클래스 객체명) {
		 * 	예외가 발생하면 실행 될 코드
		 * 	}
		 */
	
	public static void main(String[] args) {
		// p.423 NullPointException
		
		try {
			String data = null;
			System.out.println(data.toString()); 		// object클래스 메소드 toString : 객체 정보 출력
			// null 은 메모리 할당이 없기 때문에 객체 정보 출력 불가능
		} catch (NullPointerException e) {
			System.out.println("예외 발생 : " + e);
		}
		
		// p.424 ArrayIndexOutOfBoundsException
		try {
			String[] array = new String[2];				// String 2개를 저장할 수 있는 배열
			array[0] = "a";
			array[1] = "b";
			array[2] = "c";
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("예외발생 : " + e);
		}
		
		// p.426 NumberFormatException
		try {
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1);		// "100" -> 100
			int value2 = Integer.parseInt(data2);		// "a100" -> a는 정수로 표현 불가능
					//	 Integer.parseInt(String) : 문자열을 정수로 변환
			// 오류 : 문자열 내 숫자형식은 정수형으로 변환이 가능하지만, 문자열내 문자형식은 정수형으로 변환 불가능
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("오류 발생 : " + e);
		}
		
		// p.428
		String string_object = "유재석";			// 자바 클래스 중 하나 (Object 상속)
		Object super_object;		// 자바 클래스 내 최상위 클래스
		
		super_object = string_object;			// 자식 -> 부모 가능
		string_object = (String) super_object;	// 부모 -> 자식 불가능
		
		// 예외처리 판단
			// 입출력 (사용자 입장에서) 관련된 코드 -> 예외처리
	}

}
