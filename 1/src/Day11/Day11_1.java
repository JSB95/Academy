package Day11;

public class Day11_1 {
	
	// p. 386 확인 문제
		// 1. 3번 인터페이스의 멤버 : 상수 필드, 추상메소드, 디폴트메소드, 정적메소드
		// 2. 4번 인터페이스 변수 = 구현 객체
			// 구현 객체 = 클래스가 implements한 객체
	
		// 3.
	
	private static void printSound (Soundable soundable) {
//  접근제한자 정적    반환 타입 메소드명  (인수 - 변수, 배열, 객체, 인터페이스)
		System.out.println(soundable.sound());
	}
	
	public static void dbwork (DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		printSound(new Cat()); 	// 구현 객체
		printSound(new Dog());
		Soundable soundable = new Cat();
		Soundable[] soundables = new Cat[100];
		
		// 4. 
		dbwork(new OracleDAO());
		dbwork(new MySQLDAO());
		
		// 5. 익명객체 [인터페이스가 직접 구현]
			// 구현객체 : 인터페이스명 객체명 = new 클래스명();
			// 익명객체 : 인터페이스명 객체명 = new 인터페이스 ( {구현} )
		Action action = new Action() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("복사를 합니다.");
			}
		}; // 구현 끝
		
		action.work();
	}

}
