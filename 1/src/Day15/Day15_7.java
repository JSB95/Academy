package Day15;

import java.awt.Toolkit;

public class Day15_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.601 ������ ����
			// 1. sleep (�и���) : �־��� �ð����� �Ͻ� ����
				// �ð� ���� : �и��� ( 1 / 1000 ��)
			// 2. Thread.yield() : �ٸ� �����忡�� ���� �纸 [������]
			// 3. Thread.join() : �ٸ� �������� ���Ḧ ��ٸ�
		
		// p.602 sleep ����
//		Toolkit toolkit = Toolkit.getDefaultToolkit();		// �Ҹ� ���� Ŭ����
//		for (int i = 0; i < 10; i++) {
//			toolkit.beep();									// �Ҹ� ���
//			try {
//				Thread.sleep(3000);							// 3�ʰ� �Ͻ�����
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// p.604 ~ 606 yield()
		// 1. ��ü ����
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// 2. ������ ����
		threadA.start();
		threadB.start();
		// 3. ������ 3�ʰ� �Ͻ�����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ������A�� work �� ���� [ �ش� ������ �Ͻ�����]
		threadA.work = false; // -> thread.yield();
		
		// ������ 3�ʰ� �Ͻ�����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ������A�� work �� ���� [�ش� ������ �Ͻ����� Ǯ��]
		threadA.work = true;
		
		// ������ 3�ʰ� �Ͻ�����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ������ A,B ����
		threadA.stop = true;
		threadB.stop = true;
		
		
		// p.607 : join();
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~100 �� : " + sumThread.getsum());
		// main �����尡 join �������� : 0
			// SumThread�� ���ϱ⸦ ������ ���� main������ sum ���
		// main �����尡 join ������ : 5050

	}

}
