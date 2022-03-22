package Day15;

import java.awt.Toolkit;

public class Day15_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.601 스레드 제어
			// 1. sleep (밀리초) : 주어진 시간동안 일시 정지
				// 시간 단위 : 밀리초 ( 1 / 1000 초)
			// 2. Thread.yield() : 다른 스레드에게 실행 양보 [대기상태]
			// 3. Thread.join() : 다른 스레드의 종료를 기다림
		
		// p.602 sleep 에제
//		Toolkit toolkit = Toolkit.getDefaultToolkit();		// 소리 관련 클래스
//		for (int i = 0; i < 10; i++) {
//			toolkit.beep();									// 소리 출력
//			try {
//				Thread.sleep(3000);							// 3초간 일시정지
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// p.604 ~ 606 yield()
		// 1. 객체 생성
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// 2. 스레드 시작
		threadA.start();
		threadB.start();
		// 3. 스레드 3초간 일시정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 스레드A에 work 값 변경 [ 해당 스레드 일시정지]
		threadA.work = false; // -> thread.yield();
		
		// 스레드 3초간 일시정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 스레드A의 work 값 변경 [해당 스레드 일시정지 풀기]
		threadA.work = true;
		
		// 스레드 3초간 일시정지
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 스레드 A,B 종료
		threadA.stop = true;
		threadB.stop = true;
		
		
		// p.607 : join();
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~100 합 : " + sumThread.getsum());
		// main 스레드가 join 안했을때 : 0
			// SumThread가 더하기를 끝나기 전에 main스레드 sum 출력
		// main 스레드가 join 했을때 : 5050

	}

}
