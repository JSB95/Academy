package Day13;

import java.util.Random;

public class Day13_1 {
	
	public static void main(String[] args) {
		
		// p.534 Math Ŭ���� (java.lang ��Ű��) ���� ���� �޼ҵ� 
		System.out.println("���� : " + Math.abs(-5));
		System.out.println("���� : " + Math.abs(-3.14));
		
		System.out.println("�ø��� : " + Math.ceil(5.3));		// �Ҽ��� ù°�ڸ����� �ø�
		System.out.println("�ø��� : " + Math.ceil(-5.3));
		
		System.out.println("������ : " + Math.floor(5.3));
		System.out.println("������ : " + Math.floor(-5.3));
		
		System.out.println("�ִ� : " + Math.max(5, -9));
		System.out.println("�ִ� : " + Math.max(5.3, 2.5));
		
		System.out.println("�ּڰ� : " + Math.min(5, -9));
		System.out.println("�ּڰ� : " + Math.min(5.3, 2.5));
		
		Random random = new Random();
		
		System.out.println("���� : " + Math.random());
		
		System.out.println("�ݿø� �Ǽ��� : " + Math.rint(5.3)); // �ݿø� -> 5
		System.out.println("�ݿø� �Ǽ��� : " + Math.rint(5.7)); // �ݿø�  -> 6
		// round : �Ҽ��� ù°�ڸ����� �ݿø�
		System.out.println("�ݿø� ������ : " + Math.round(5.3));
		System.out.println("�ݿø� ������ : " + Math.round(5.7));
		// Ư�� �Ҽ��� �ڸ����� �ݿø�
		double value = 12.3456;				// �Ҽ��� ��°�ڸ����� �ݿø� �Ϸ���
		double temp = value * 100;			// 100�� ���ѵ� �Ҽ��� ù°�ڸ����� �ݿø�
		long temp2 = Math.round(temp);		// 1234.56 -> 1235
		double v16 = temp2 / 100;			// 12.35 (long / int, int�� �⺻ ������)
		double v16_1 = temp2 / 100.0;		// temp2 / 100.0 -> long / double, double�� �⺻ �Ǽ���
		System.out.println("v16 : " + v16);
		System.out.println("v16_1 : " + v16_1);
		
		// p.536 �ֻ��� (1~6)
		System.out.println("0 ~ 1 ������ �Ǽ��� : " + Math.random());		 
		System.out.println(Math.random() * 6);		// 0 ~ 1 * 6 => 0 ~ 6
		System.out.println(Math.random() * 6 + 1);	// 1 ~ 7
		
		// ù��° ���
		int num = (int)(Math.random() * 6) + 1;		// (�⺻�ڷ���) �� / ���� = ���� ����ȯ , double -> int ����ȯ�� �Ҽ��� ����
		System.out.println("����1 : " + num);
		
		// �ι�° ���
		System.out.println("����2 : " + (random.nextInt(6) +1));
		
	}

}
