package Day03;

import java.util.*;

public class Day03_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ������ : �Է¹��� �� ��ŭ �ֽ��͸���ũ ��� , ���� ������ i�� ����.
		/*
		// 1
		System.out.println("����1) ������ : "); int s1 = scanner.nextInt();
		for (int i = 1; i <= s1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// 2
		System.out.println("����2) ������ : "); int s2 = scanner.nextInt();
		for (int i = 1; i <= s2; i++) {
			System.out.print("*");
			// 5������ �ٹٲ� -> 5�� �������
			if (i%5 == 0) {
				System.out.println("");
			}
		} 
		
		// 3
		System.out.println("����3) ������ : "); int line3 = scanner.nextInt();
		for (int i = 1 ; i <=line3; i++) {		// i�� 1���� �Է¹��� �� ������ 1�� ����
			for (int s = 1 ; s <= i; s++) {		// 1. �����
				System.out.print("*");
			}
			System.out.println();				// 2. �ٹٲ�ó��
		}
		// ������ 
			// ����ڰ� 3�� �Է�������
			// i = 1 i <= 3 [true]
				// s = 1 1 <= 1 [true] -> * -> s++
				// s = 2 2 <= 1 [false] -> �ݺ��� ����
			// �ٹٲ�
			// i = 2 i <= 3 [true]
				// s = 1 1 <= 2 [true] -> * -> s++
				// s = 2 2 <= 2 [true] -> * -> s++
				// s = 3 3 <= 3 [false] -> �ݺ��� ����
			// �ٹٲ�
			// i = 3 i <= 3 [true]
				// s = 1 1 <= 2 [true] -> * -> s++
				// s = 2 2 <= 2 [true] -> * -> s++
				// s = 3 3 <= 3 [true] -> * -> s++
				// s = 4 4 <= 4 [false] -> �ݺ��� ����
			// �ٹٲ�
			// i = 4 i <= 4 [false] -> �ݺ��� ���� 
		
		// 4
		System.out.println("����4) ������ : "); int line4 = scanner.nextInt();
		for (int i = 1; i <= line4; i++) {
			for (int s = line4; s >= i; s--) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		// 5
		System.out.println("����5) ������ : "); int line5 = scanner.nextInt();
		for (int i = 1 ; i <=line5; i++) {		
			for (int j = line5 ; j > i; j--) {		
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();		
		} 
		
		//6
		System.out.println("����6) ������ : "); int line6 = scanner.nextInt();
		for (int i = 1 ; i <=line6; i++) {		
			for (int j = 1 ; j < i; j++) {		
				System.out.print(" ");
			}
			for (int k = line6; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		//7
		System.out.println("����7) ������ : "); int line7 = scanner.nextInt();
		for (int i = 0 ; i < line7; i++) {	
			for (int j = 0; j <= ((line7-1) * 2 + 1); j++) {
				if (j >= line7 - i && j <= line7 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n"); 
		}
		
		//8
		System.out.println("����8) ������ : "); int line8 = scanner.nextInt();
		for (int i = 0 ; i < line8; i++) {	
			for (int j = 0; j <= ((line8-1) * 2 + 1); j++) {
				if (j >= line8 - i && j <= line8 + i) {
					System.out.printf("%d",i+1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}*/
		System.out.println("����9) ������ : "); int line9 = scanner.nextInt();
		for (int i = 0 ; i < line9; i++) {	
			for (int j = ((line9-1) * 2 + 1); j >=i; j--) {
				if (j >= line9 - i && j <= line9 + i) {
					System.out.printf("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
	} // me

} // ce 
