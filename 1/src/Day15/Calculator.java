package Day15;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// method
		// 스레드1이 100을 넣고 스레드2가 50넣고 값변경 => 문제발생
		// synchronized : 동기화
			// 스레드 1이100 넣고 (스레드 2 대기중) 100 출력
				// 스레드2는 스레드 1이 메소드 종료가 될때까지 대기
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// memory 출력
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
