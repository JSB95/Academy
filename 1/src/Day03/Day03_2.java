package Day03;

import java.util.*;

public class Day03_2 { // c s

	public static void main(String[] args) { // m s
		
		// �Է� ��ü = {} �� 1�� ����
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū �� ���
		
		System.out.println("����1 �Է�");
		int int1_1 = scanner.nextInt();
			// int�� ���� �����ϰ� �Է¹��� ���� ������ �����ͼ� ����
		System.out.println("����2 �Է�");
		int int1_2 = scanner.nextInt();
		
		// ����1_����
		if (int1_1 > int1_2 ) {							// ���࿡ �Է¹��� ����1 ������ ����2���� ũ�� ���� �ƴϸ� ���� ����
			System.out.println("�� ū�� : " + int1_1);	
		} else if (int1_2 > int1_1){					// [��������] ����1 ������ ����2���� ������ ���� �ƴϸ� �� ��
			System.out.println("�� ū�� : " + int1_2);
		} else {										// ������ [�� ��] ����
			System.out.println("����");
		}

		// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū �� ���
		
		System.out.println("����1 �Է�");
		int int2_1 = scanner.nextInt();
		System.out.println("����2 �Է�");
		int int2_2 = scanner.nextInt();
		System.out.println("����3 �Է�");
		int int2_3 = scanner.nextInt();
		int max = int2_1; 				// ���� ū ���� �����ϴ� �ӽ�����, max�� ù��° �� �־�α�
		if (max < int2_2) {
			max = int2_2;
		} 								// ���࿡ max���� ����2�� �� ũ�� max ��ü
		if (max < int2_3) {
			max = int2_3;
		} 								// ���࿡ max���� ����3�� �� ũ�� max ��ü
		System.out.println("���� ū �� : " + max);
		
		// ����3 : 4���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.println("����1 �Է�");
		int int3_1 = scanner.nextInt();
		System.out.println("����2 �Է�");
		int int3_2 = scanner.nextInt();
		System.out.println("����3 �Է�");
		int int3_3 = scanner.nextInt();
		System.out.println("����4 �Է�");
		int int3_4 = scanner.nextInt();
		
		int max2 = int3_1;
		if(max2 < int3_2) { max = int3_2; }
		if(max2 < int3_3) { max = int3_3; }
		if(max2 < int3_4) { max = int3_4; }
		System.out.println("���� ū �� : " + max2);
	} // m e

} // c e
