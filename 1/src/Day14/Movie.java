package Day14;

public class Movie extends Thread{
	
	static boolean stop = true;			// ���� / ���� ���� ����
	
	public void Moviestop(boolean stop) {
		this.stop = stop;
		if (stop) {
			System.out.println("�������");
		} else {
			System.out.println("��������");
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (stop) {
			System.out.println("���� �����");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
