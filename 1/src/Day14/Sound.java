package Day14;

public class Sound extends Thread{
	
	static boolean stop = true;		// ���� ���� [true : ���� / false : ����]
	
	public Sound (boolean stop) {
		this.stop = stop;
		if (this.stop) {
			System.out.println("�Ҹ��� �׽��ϴ�.");
		} else {
			System.out.println("�Ҹ��� �����ϴ�.");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (stop) {
			System.out.println("�Ҹ� �����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
