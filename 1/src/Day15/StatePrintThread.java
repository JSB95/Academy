package Day15;

public class StatePrintThread extends Thread {
	
	// field
	private Thread targetThread;
	
	// constructor
	public StatePrintThread(Thread targetThread) {
		// TODO Auto-generated constructor stub
		this.targetThread = targetThread;
	}
	
	// 병렬처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : " + state);
			
			// 스레드 상태 제어
			if (state == Thread.State.NEW) {
				targetThread.start();
			} 
			if (state == Thread.State.TERMINATED) {
				break;
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
