package Day15;

public class ThreadA extends Thread {
	
	// field
	public boolean stop = false;		// 종료 플래그
	public boolean work  = true;		// 작업 진행여부 플래그
	
	
	// parallel
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!stop) {					// stop = false이면 반복
			if (work) {
				System.out.println("ThreadA 작업내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}

}
