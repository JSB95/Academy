package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);					// 1. �Է°�ü
		HashSet<Integer> set = new HashSet<Integer>();				// 2. set�÷��� ȣ��
		
		int count = 0; 	
		while (true) {
			System.out.print("1~45���� ���� (�ߺ� �Ұ�) > ");
			int num = scanner.nextInt();							// 3. �Է¹ޱ�
			
			if (num < 1 || num > 45) {
				System.err.println("\n���� �� �� ���� ��ȣ\n");
			} else {
				set.add(num);
				System.out.println("\nȮ�� : " + set);
			}
			
			if (set.size() == 6) {
				break;
			}
		}

	}

}
