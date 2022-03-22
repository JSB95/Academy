package Day15;

public class Day15_4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// 12장 : 스레드
			// 코드 > 파일 > 프로세스[프로그램]
			// 목적 : 병렬 처리
				// main 메소드에 main 스레드 포함
			// 사용방법
				// 1. Thread 클래스
				// 2. Runnable 인터페이스
		
		// 예1) Thread
		
		Music m1 = new Music();
		m1.start();				// run 메소드 실행 -> 스레드 실행
		
//		while(true) {			// main스레드 실행중
//			System.out.println("프로그램 실행중");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		// 예2) Runnable
		Chatting c1 =  new Chatting();
		c1.run();
		Thread thread = new Thread(c1);
		thread.start();
		
		while (true) {
			System.out.println("프로그램 작동중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
