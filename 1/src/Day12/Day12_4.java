package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ȣ ���� ���α׷�
		// ����
			// 1. ���� 0000~9999 ���� ���� 10�� ����
			// 2. ��� ���� ��ȣ�� �迭�� ����
			// 3. �������ڸ� ��ȣ�� Ȧ/¦ ����
			// 4. ���� ���ڸ� Ȧ��
			// 5. ���� ���ڸ� ¦�� 
			// 6. ���
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] carlist = new String[10];
		
		while (true) {
			
			// ������ȣ ���
			for (String temp : carlist) {
				if (temp != null) {
					System.out.println(temp);
				}
			}
			

			
			// ����
			System.out.println("1. ���� ����"); int ch = scanner.nextInt();
			if (ch == 1) {
				int intnum = random.nextInt(10000);
				String strnum = String.format("%04d", intnum);
				
				boolean save = false;
				for (int i = 0; i <= carlist.length; i++) {
					if (carlist[i] == null) {
						carlist[i] = strnum;
						save = true;
						break;
					}
				}
				
				// Ȧ�� ������ȣ 
				
				// ¦�� ���� ��ȣ
				
				
			}
			
			
			
		}

	}

}
