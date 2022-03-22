package Day15;

public class StatePrintThread extends Thread {
	
	// field
	private Thread targetThread;
	
	// constructor
	public StatePrintThread(Thread targetThread) {
		// TODO Auto-generated constructor stub
		this.targetThread = targetThread;
	}
	
	// ����ó��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			
			// ������ ���� ����
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
