package Day15;

public class ThreadB extends Thread {
	
	// field
	public boolean stop = false;		// ���� �÷���
	public boolean work  = true;		// �۾� ���࿩�� �÷���
	
	
	// parallel
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!stop) {					// stop = false�̸� �ݺ�
			if (work) {
				System.out.println("ThreadB �۾�����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}

}
