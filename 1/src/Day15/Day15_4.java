package Day15;

public class Day15_4 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// 12�� : ������
			// �ڵ� > ���� > ���μ���[���α׷�]
			// ���� : ���� ó��
				// main �޼ҵ忡 main ������ ����
			// �����
				// 1. Thread Ŭ����
				// 2. Runnable �������̽�
		
		// ��1) Thread
		
		Music m1 = new Music();
		m1.start();				// run �޼ҵ� ���� -> ������ ����
		
//		while(true) {			// main������ ������
//			System.out.println("���α׷� ������");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		// ��2) Runnable
		Chatting c1 =  new Chatting();
		c1.run();
		Thread thread = new Thread(c1);
		thread.start();
		
		while (true) {
			System.out.println("���α׷� �۵���");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
