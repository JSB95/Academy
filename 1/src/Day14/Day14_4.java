package Day14;

import java.awt.Toolkit;

public class Day14_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// p.576 멀티스레드 개념
			// 프로세스 : 운영체제에서는 실행 중인 하나의 애플리케이션
			// 운영체제가 프로세스에 필요한 메모리를 할당 [자바에서 메모리 관리 불가능, 운영체제에서 관리]
			// 싱글 스레드 : 코드를 읽어주는 흐름이 1개 = main 메소드
			// 멀티 스레드 : 코드를 읽어주는 흐름이 여러개
			// 병렬 : 설계상 병렬흐름이지만 / 스레드가 하나씩 순차적 (우선순위 자체가 할당)
		
			// Thread 클래스 (새로운 스레드) vs main method
				// 1. Thread 클래스
				// 2. Runnable 인터페이스
					// 1) 임의 클래스에 implements Runnable
					// 2) run 메소드를 구현한다.
					// 3) 외부에서 구현객체 생성한다.
					// 4) Thread 클래스 객체 생성 시 생성자에 구현객체 넣어준다.
					// 5. thread 클래스 객체 내 start() 메소드 실행
					// * .start 메소드는 run() 메소드 호출
					// * run() 메소드는 main 스레드 제외한 새로운 스레드 만들기
		
		
		
		
		
		// p.581 예제1)
		Toolkit toolkit = Toolkit.getDefaultToolkit();			// 소리 관련 메소드
		
		for (int i = 0 ; i < 5; i++) {
			toolkit.beep();			// .beep() : 소리 메소드
			
			Thread.sleep(500);		// 현재 스레드 main을 0.5초간 일시정지
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
		
		// p.582 예제2) 멀티 스레드
		
		// 1. 인터페이스에 구현객체
		Runnable beepTask = new Beeptask();
		
		// 2. Thread 클래스 객체 생성 시 생성자에 구현객체 넣기
		Thread thread = new Thread(beepTask);
		
		// 3. Thread 객체 내 start()  메소드 호출
		thread.start();
		
		// 4. 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
		
		// p.584 예제3)
		// 1. 클래스 객체 생성
		Thread thread2 = new BeepThread();
		// 		슈퍼클래스 = 자식클래스의 생성자
		// 			부모 <- 자식 [자동형변환]
		// 			부모 -> 자식 [강제형변환]
		
		// 2. 스레드 객체 내 start() 호출
			// run 메소드 호출 역할 [멀티스레드 실행]
		thread2.start();
		
		// 3. 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
		
		// 인터페이스 사용 방법
			// 1. 클래스에게 implements 한 후에 구현 => 구현객체
			// 2. 인터페이스에 new 연산자를 통한 추상메소드 구현 => 익명객체
				// 메모리를 할당하기 위해서 추상메소드를 먼저 구현
				// 추상메소드를 구현 알할시에 익명객체 선언 불가
		
		// * 익명 스레드 개체
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		};
		
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			Thread.sleep(500);
		}
		
		System.out.println("main 메소드 안에 있는 스레드 이름 : " + Thread.currentThread().getName());
			// Thread.currentTread() : 현 코드를 읽어주는 스레드 호출 / .getName() : 스레드 이름 호출 / .setName() : 스레드 이름 변경
		System.out.println("작업1 스레드 이름 : " + thread.getName());
		System.out.println("작업2 스레드 이름 : " + thread2.getName());
		System.out.println("작업3 스레드 이름 : " + thread3.getName());
		
		// p.590
		for (int i = 1; i <= 10; i++) {		// 10회 반복처리
			// i가 1일때 가장 먼저 스레드 객체 생성 - thread1
			// 먼저 생성되어도 순환할당 [운영체제 -> 스케줄링] 이므로 가장 먼저 종료되지 않음
			
			// 1. i번째 스레드 객체 생성
			Thread thread4 = new CalcThread("thread" + i);
			// * 우선순위
			if (i != 0) {
				thread4.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread4.setPriority(Thread.MAX_PRIORITY);
			}
			thread4.start();
		}
		
		
		
		
	}

}
