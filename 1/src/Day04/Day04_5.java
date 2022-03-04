package Day04;

import java.lang.reflect.Array;
import java.util.*;

public class Day04_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();	
		/*
		 * 1. ����ڿ��� 6�� �� �Է¹ޱ� : 1~45������ ���� / �ƴϸ� ���Է� / �ߺ��̸� ���Է� -> �迭�� ����
		 * 2. ��÷��ȣ : ��ǻ�Ͱ� ���� 6�� �߻� : 1~45 ���� / �ߺ� X -> �迭�� ����
		 * 3. ����� ��ȣ�� ��ǻ���� ��ȣ�� ���� ���� ����
		 * 
		 */
		int[] user = new int[6];
		int[] com = new int[6];
		
		// 1. ����ڿ��� �Է¹ޱ�
		for(int i = 0; i < user.length; i++) {											// i�� 1���� �迭�� ���̱��� 1�� ����
			System.out.printf("%d��° ��ȣ �Է� : ",i+1);
			int number = scanner.nextInt();
			boolean pass = true;
			
			if (number > 45 || number < 1) {											// ��ȿ�� �˻�
				System.err.println("1~45������ ���ڸ� �Է��ϼ���");
				i--;
				pass = false;
			}																			// ��ȿ�� �˻� ��
			
			for (int j = 0; j < 6; j++) {												// �ߺ��˻�
				if (number == user[j]) {
					System.err.println("�ߺ��� �����Դϴ�.");			
					i--;
					pass = false;
				}
			}																			// �ߺ��˻� ��
			if(pass == true) {
				user[i] = number;
			}
			
		}
		Arrays.sort(user);
		System.out.print("����� ��ȣ�� : ");
		for (int temp : user) {															// ����� �迭�� ��� �ε��� ���
			System.out.print(temp + " ");
		}
		System.out.println("");
		
		// 2. ���� ����
		for (int i = 0; i < com.length; i++) {
			int com_number = random.nextInt(44)+1;										// ������  int������ �������� / random.nextInt() : +-20�� ������ ���� �߻� / random.nextInt(��) : 0~�� ������ ������ ���� �߻� / random.nextInt(��) + ���۹�ȣ : ���۹�ȣ ~ �� ������ ���� �߻�
			boolean pass = true;
			for (int temp : com) {
				if(com_number == temp) {
					i--;
					pass = false;
				}
			}
			if (pass) {
				com[i] = com_number;
			}
		}
		System.out.print("��÷��ȣ : ");
		Arrays.sort(com);
		for (int temp : com) {
			System.out.print(temp + " ");
		}
		
		// 3. ��
		int ��÷ = 0;
		for (int i = 0; i <user.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (user[i] == com[j]) {
					��÷++;
				} 
			}
		}
		System.out.println("");
		System.out.println("��÷�� : " + ��÷);
		
	} // m e
} // c e



