package Day03;

import java.util.*;

public class Day03_7 { // c s

	public static void main(String[] args) { // m s
		// TODO Auto-generated method stub
		/* Ȯ�ι���
		 * 
		 * 1. if, switch / for, while, do-while
		 * 
		 * 2. 2��
		 * 	break; : ���� ����� { } Ż�� (switch, for, while)
		 * 
		 * 3.	int sum = 0;
		 * 		for (int i = 0; i <= 100; i += 3) {
		 * 				sum += i;
		 * 	 	}
		 * 
		 * 4. 
		 * 
		 * 5. 4x + 5y = 60 [�� : x�� y�� �� �� �ִ� �� ã��]
		 * 	for (int x = 1 ; x <=10; x++) { // x�� 1���� 10���� 1�� ���� ���� �ݺ�ó��
		 * 		for(int y = 1; y <=10; y++) {
		 * 			if ((4*x) + (5*y) == 60) {
		 * 				System.out.println(x + " " + y);
		 *  		}
		 * 		}
		 * 	}		
		 * 
		 * 6. 
		 * 	for (int i = 1; i <= 5; i++) { // i�� 1���� 5���� 1�� �����ϸ鼭 ���� �ݺ�ó��
		 * 		for (int s = 1; s <= i; i++) {
		 * 			System.out.println("*");
		 * 		}
		 * 		System.out.println(); // �ٹٲ� ó��
		 *  }
		 */
		// 7.
		Scanner scanner = new Scanner(System.in);
		boolean run = true;												// ���� ���� ���� / true = ����
		int balance = 0;												// ���ݾ�[���� �ȿ� �ִ� �ݾ�] ����		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------------");
			System.out.print("���� > "); 
			int choice = scanner.nextInt();
			
			if (choice == 1) {											// ���� �Է°��� 1�̸�
				System.out.print("���ݾ� : "); 							
				int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�;										// �Է¹��� �ݾ��� ���忡 �߰�
			}
			
			else if (choice == 2) {										// ���� �Է°��� 2�̸�
				System.out.print("��ݾ� : "); 
				int ��ݾ� = scanner.nextInt();
				if (��ݾ� > balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else balance -= ��ݾ�;									// �Է¹��� �ݾ��� ���忡�� ����
			}
			
			else if (choice == 3) {										// ���� �Է°��� 3�̸�
				System.out.println("�ܰ� : " + balance);
			}
			
			else if (choice == 4) {										// ���� �Է°��� 4�̸�
				break;													// ���α׷� ����
			} else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}
		}
		
		System.out.println("���α׷� ����");

	} // m e

} // c e
