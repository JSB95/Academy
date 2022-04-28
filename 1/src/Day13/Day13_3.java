package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3 {
	
	public static void calendar (int year, int month) {
		
		while (true) {
			// 1. Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
			
			int day = calendar.get(calendar.DAY_OF_MONTH);
			
			// �ش� ���� 1���� ���� ã��
				// ����� ���� Ķ���� ����
				calendar.set(year, month-1, 1);		// ��) 3�� 1��
				// 3�� 1���� ����
				int sweek = calendar.get(calendar.DAY_OF_WEEK);
				// 3���� ��������
				int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
				
			// 2. ���
			System.out.println(" ******************** " + year + "�� " + month + "��" + " ******************** \n");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			// ���� �� 1���� ��ġ �տ� ���� ä���
			for (int i = 1; i < sweek; i++) { // ���� 3�� 1���� ȭ���� -> 3, 3���� �۴ٸ� ���� ����
				System.out.print("\t");
			}
			
			// 1�Ϻ��� ��������¥���� ���
			for (int i = 1; i <= eday; i++) {
				// i = �ϼ� ���
				System.out.print(i + "\t");
				// ����ϸ��� �ٹٲ�
				if (sweek % 7 == 0) {		// 7�� ���
					System.out.println();	 
				}
				sweek++;					// �Ϸ羿 ���� ����
			}
			
			
			try {
				// ��ư [1.��(������)  2.��(������) 3.�ٽð˻�]
				System.out.println("\n\n[1. ��(������)  2. ��(������) 3. �ٽð˻� 4. ����]");
				Scanner scanner = new Scanner(System.in);
				System.out.print("���� > "); 		int ch = scanner.nextInt();
				
				if (ch == 1) {
					month = month - 1;
					if (month == 0) {			// �����޷� ���� 1�� �����׸�
						year -= 1;				// ������ �۳⵵����
						month = 12;				// 12����
					}
				} else if (ch == 2) {
					month += 1;
					if (month == 13) {			// �����޷� ���� 12���� ������
						year += 1;				// ������ �������� 
						month = 1;				// 1����
					}
				} else if (ch == 3) {
					System.out.print("���� : ");		year = scanner.nextInt();
					System.out.print("�� : ");		month = scanner.nextInt();
				} else if (ch == 4) {
					System.out.println("\n����");
					return;
				} else {
					System.err.println("�߸��� �����Դϴ�.");
				}
			} catch (Exception e) {
				System.err.println("���� �߻�");
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� : ");		int year = scanner.nextInt();
		System.out.print("�� : ");		int month = scanner.nextInt();
		calendar(year, month);
		
		
			
		
	}

}
