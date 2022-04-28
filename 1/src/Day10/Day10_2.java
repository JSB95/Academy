package Day10;

public class Day10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인터페이스 [추상 메소드]
			// 목적 : 동일한 목적하에 동일한 기능을 수행
				// 서로 다른 클래스들간의 객체들을 동일한 목적으로 조작
			// 추상 : 선언 O 정의 X
				// 인터페이스에서 선언하고 각 클래스들이 구현한다. [다형성]
			// 예) 인터페이스 : 방향키, A버튼, B버튼
			
		
		// 1. 인터페이스 객체 선언
		RemoteControl rc; 	// 인터페이스명 객체명;
		
		// 2. 인터페이스에 텔레비전 클래스 메모리 할당
		rc = new Television();
		
		// 3. 인터페이스 실행
		rc.turnOn();	// tv실행 메소드
		rc.turnOff(); 	// tv종료 메소드
		rc.setVolume(10); // tv소음 변경 메소드
		

	}

}
