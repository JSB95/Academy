package Day08;

public class Day08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.238 : static
			// 정적변수
			// 공용적인 데이터 = 프로그램 전반적으로 사용되는 메모리
		
		// 클래스 내 필드, 메소드(멤버) 접근방법
			// 1. 객체 생성 -> 객체.멤버
		Calculator calculator = new Calculator();
		System.out.println("객체를 이용한 멤버접근 : " + calculator.pi);
			// (static 멤버일때) 1. 클래스명.멤버
				// 클래스 로딩되고 메소드 영역에 static 변수에 메모리 할당
		System.out.println("객체 없이 멤버접근 : " + calculator.pi);
		
		double result = 10 * 10 * calculator.pi;
								// 클래스명.정적변수명
		int result2 = calculator.plus(10, 5);
		int result3 = calculator.minus(10, 5);
		
		System.out.println("result1 = " + result);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	}

}