package Day03;

import java.util.*;

public class Day03_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		// ���� 6 : ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ�
		
		System.out.println("������ �Է��ϼ��� : ");
		int score1 = scanner.nextInt();
		if (score1 > 90) { System.out.println("�հ�"); }
		else { System.out.println("���հ�");}
		
		
		// ���� 7 : ������ �Է¹޾� ������ 90�� �̻��̸� A���, 80�� �̻��̸� B���, 70�� �̻��̸� C���, �� �� �����
		
		System.out.println("������ �Է��ϼ��� : ");
		int score2 = scanner.nextInt();
		if (score2 > 90) { System.out.println("A");}
		else if (score2 > 80) { System.out.println("B");}
		else if (score2 > 70) { System.out.println("C");}
		else System.out.println("�����"); 
		*/
		
		// ���� 8 : �α��� / ���̵� admin�̰� ��й�ȣ�� 1234�� ��쿡�� �α��� ����, �ƴϸ� �α��� ���� ���
		System.out.println("ID : ");
			// char �ڷ��� [���� 1�� ����]
			// �ڷ������� ���ڿ��� ������ �� ����.
				// 1. String Ŭ���� ����ϸ� ���ڿ� ���� ����
				// 2. char �迭/����Ʈ ����ϸ� ����
		String id = scanner.next();
		System.out.println("PASSWORD : ");
		int pw = scanner.nextInt();
			// ��ü�� ���� �Ұ� -> ���ڴ� ũ�� ���� ��� ���� �Ұ�
			// �޼ҵ� ���(�Լ�)
				// �ڷ��� ����ϴ� ������ ������ ��� ����
				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
					// ���ڿ� �񱳽� .equals
					// ���ڿ�1.equlas(���ڿ�2)
		
		boolean �α��μ��� = false;						// boolean : 1��Ʈ true Ȥ�� false ����
		
		if (id.equals("admin")) {						// id�� Ŭ���� ��ü�̱� ������ == �Ұ���, ��ü �񱳽ÿ��� .equals()���
			
			if (pw == 1234) {							// pw�� �ڷ��� �����̱� ������ == ����
				 System.out.println("�α��� ����");
				 �α��μ��� = true;						// id, pw��� �����ϸ� ������ ����
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");	// �Է��� pw�� �������� ������
			}
			
		} else {  										// �Է��� id�� admin�� �ƴ϶��
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
		if (�α��μ��� == false) {							// �α��μ��� ������ false�̸� ���
			System.out.println("�α��� ����");
		}
		
		/* ����9
		[ �Է� ] : ����,����,���� �Է¹ޱ�
		[ ���� ]
			����� 90�� �̻��̸鼭 
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '���п��' ���
			����� 80�� �̻��̸鼭 
				�������� 90�� �̸� '�������' ���
				�������� 90�� �̸� '��������' ���
				�������� 90�� �̸� '�������' ���
			�׿� ����� 
		 */
		
		System.out.println("�������� : "); int korean = scanner.nextInt();
		System.out.println("�������� : "); int english = scanner.nextInt();
		System.out.println("�������� : "); int math = scanner.nextInt();
		int avg = (korean + english + math)/3;
		if (avg >= 90) {										// ��� 90�� �̻��̸�
			// if ��ø
			if (korean == 100) System.out.println("������");
			if (english == 100) System.out.println("������");
			if (math == 100) System.out.println("���п��");
		} else if (avg >= 80) {									// ��� 80�� �̻��̸�
			if (korean >= 900) System.out.println("�������");
			if (english >= 90) System.out.println("�������");
			if (math >= 90) System.out.println("�������");
		} else {												// �� ��
			System.out.println("�����");
		}
			
		

	}

}
