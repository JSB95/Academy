package Day14;

public class Day14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ex : 강아지소리, 고양이소리, 호랑이소리 동시에 5번 출력
		// 1. Thread 클래스로부터 extends
			// overriding -> 재정의
		// 2. Runnable 인터페이스로부터 implements
			// overriding -> 구현
		
		// main스레드가 새로 생성된 스레드
		
		Dog_Sound dog_Sound = new Dog_Sound();
		dog_Sound.start();

	}

}
