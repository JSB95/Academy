package Day05;

import java.util.Scanner;

public class Day05_3 {
	
	public static void main(String[] args) {
	

	// p.181 Ȯ�ι���
		// 1.
		// 2.
		// 3. 2 (��ü �񱳽� equals �޼ҵ� ���)
		// 4. 2 (���̰� ���� ��� �� �߰� �Ұ���)
		// 5. 3 (boolean �ʱⰪ�� false)
		// 6. 3(���� ��)/5(3���� �� ��)
		// 7.
			int max = 0;
			int[] array = { 1, 5, 3, 8, 2 };
			for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];	// ���࿡ max ���� i��° �ε����� ���� �� ũ�ٸ� max�� i��° �� ����
				}
			}
			System.out.println("max : " + max);
		// 8.
			
			int [][] array2 = { { 95, 86 }, { 83, 92, 96 },{ 78, 83, 93, 87, 88 } };
			int sum = 0, count = 0; double avg = 0.0;
			for (int row = 0; row < array2.length; row++) { // ���� 0���� �迭�� �� ���� [3]�̸����� 1�� ����
				for (int column = 0; column < array2[row].length; column++) { // ���� 0���� �迭�� ������ [2, 3, 5] �̸����� 1�� ����
					sum += array2[row][column];
				}
				count += array2[row].length;
			}
			avg = (double)sum / count;
			System.out.println("sum : " + sum);
			System.out.println("avg : " + avg);
			
		// 9.
			boolean run = true;
			int studentNum = 0;
			int scores[] = null;
			Scanner scanner = new Scanner(System.in);
			
			while (run) {
				System.out.println("==================================================");
				System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
				System.out.println("==================================================");
				
				int selectNo = scanner.nextInt();
				
				if (selectNo == 1) {	// �л� �� �Է¹ޱ�
					System.out.println("�л���> "); studentNum = scanner.nextInt();		// �Է¹��� �л� �� ��ŭ �迭���� ����
					scores = new int[studentNum];
				} else if (selectNo == 2) { // �л� ���� �Է¹ޱ�
					for (int i = 0; i < scores.length; i++) {							
						System.out.printf("scores[%d] : \n", i);
						scores[i] = scanner.nextInt();									// �Է¹޾� i��° �ε����� ����
					}
				} else if (selectNo == 3) {	// �л� ���� ����ϱ�
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d] : %d \n", i,scores[i]);
					}
				} else if (selectNo == 4) {
					
				} else if (selectNo == 5) {
					run = false;
				}
			}
			
	}
}

