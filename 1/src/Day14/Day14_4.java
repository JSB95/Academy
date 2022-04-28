package Day14;

import java.awt.Toolkit;

public class Day14_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// p.576 ��Ƽ������ ����
			// ���μ��� : �ü�������� ���� ���� �ϳ��� ���ø����̼�
			// �ü���� ���μ����� �ʿ��� �޸𸮸� �Ҵ� [�ڹٿ��� �޸� ���� �Ұ���, �ü������ ����]
			// �̱� ������ : �ڵ带 �о��ִ� �帧�� 1�� = main �޼ҵ�
			// ��Ƽ ������ : �ڵ带 �о��ִ� �帧�� ������
			// ���� : ����� �����帧������ / �����尡 �ϳ��� ������ (�켱���� ��ü�� �Ҵ�)
		
			// Thread Ŭ���� (���ο� ������) vs main method
				// 1. Thread Ŭ����
				// 2. Runnable �������̽�
					// 1) ���� Ŭ������ implements Runnable
					// 2) run �޼ҵ带 �����Ѵ�.
					// 3) �ܺο��� ������ü �����Ѵ�.
					// 4) Thread Ŭ���� ��ü ���� �� �����ڿ� ������ü �־��ش�.
					// 5. thread Ŭ���� ��ü �� start() �޼ҵ� ����
					// * .start �޼ҵ�� run() �޼ҵ� ȣ��
					// * run() �޼ҵ�� main ������ ������ ���ο� ������ �����
		
		
		
		
		
		// p.581 ����1)
		Toolkit toolkit = Toolkit.getDefaultToolkit();			// �Ҹ� ���� �޼ҵ�
		
		for (int i = 0 ; i < 5; i++) {
			toolkit.beep();			// .beep() : �Ҹ� �޼ҵ�
			
			Thread.sleep(500);		// ���� ������ main�� 0.5�ʰ� �Ͻ�����
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			Thread.sleep(500);
		}
		
		// p.582 ����2) ��Ƽ ������
		
		// 1. �������̽��� ������ü
		Runnable beepTask = new Beeptask();
		
		// 2. Thread Ŭ���� ��ü ���� �� �����ڿ� ������ü �ֱ�
		Thread thread = new Thread(beepTask);
		
		// 3. Thread ��ü �� start()  �޼ҵ� ȣ��
		thread.start();
		
		// 4. ���
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			Thread.sleep(500);
		}
		
		// p.584 ����3)
		// 1. Ŭ���� ��ü ����
		Thread thread2 = new BeepThread();
		// 		����Ŭ���� = �ڽ�Ŭ������ ������
		// 			�θ� <- �ڽ� [�ڵ�����ȯ]
		// 			�θ� -> �ڽ� [��������ȯ]
		
		// 2. ������ ��ü �� start() ȣ��
			// run �޼ҵ� ȣ�� ���� [��Ƽ������ ����]
		thread2.start();
		
		// 3. ���
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			Thread.sleep(500);
		}
		
		// �������̽� ��� ���
			// 1. Ŭ�������� implements �� �Ŀ� ���� => ������ü
			// 2. �������̽��� new �����ڸ� ���� �߻�޼ҵ� ���� => �͸�ü
				// �޸𸮸� �Ҵ��ϱ� ���ؼ� �߻�޼ҵ带 ���� ����
				// �߻�޼ҵ带 ���� ���ҽÿ� �͸�ü ���� �Ұ�
		
		// * �͸� ������ ��ü
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
			System.out.println("��");
			Thread.sleep(500);
		}
		
		System.out.println("main �޼ҵ� �ȿ� �ִ� ������ �̸� : " + Thread.currentThread().getName());
			// Thread.currentTread() : �� �ڵ带 �о��ִ� ������ ȣ�� / .getName() : ������ �̸� ȣ�� / .setName() : ������ �̸� ����
		System.out.println("�۾�1 ������ �̸� : " + thread.getName());
		System.out.println("�۾�2 ������ �̸� : " + thread2.getName());
		System.out.println("�۾�3 ������ �̸� : " + thread3.getName());
		
		// p.590
		for (int i = 1; i <= 10; i++) {		// 10ȸ �ݺ�ó��
			// i�� 1�϶� ���� ���� ������ ��ü ���� - thread1
			// ���� �����Ǿ ��ȯ�Ҵ� [�ü�� -> �����ٸ�] �̹Ƿ� ���� ���� ������� ����
			
			// 1. i��° ������ ��ü ����
			Thread thread4 = new CalcThread("thread" + i);
			// * �켱����
			if (i != 0) {
				thread4.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread4.setPriority(Thread.MAX_PRIORITY);
			}
			thread4.start();
		}
		
		
		
		
	}

}
