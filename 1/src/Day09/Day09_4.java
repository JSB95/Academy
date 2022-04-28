package Day09;

public class Day09_4 {
	
	public static void main(String[] args) {
		// p.296~297
		// @override : 재정의
		// 동일한 인수의 동일한 메소드명 불가능
		// 목적 : 동일한 메소드를 재정의[수정]
		
		int r = 10;
		// 슈퍼클래스로 객체 생성
		Calculator calculator = new Calculator();
		// 슈퍼클래스로 만든 객체로 메소드 호출
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println("");
		
		// 서브클래스로 객체 생성
		Computer computer = new Computer();
		// 서브클래스로 만든 객체로 메소드 호출
		System.out.println("원면적 : " + computer.areaCircle(r)); // 슈퍼클래스와 서브클래스 내 메소드는 다르다
		
		// final 을 쓰면 상속 불가능
	}
}
