package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_����� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ����ȣ = 0;
		ArrayList<���> ����� = new ArrayList<���>();
		
		while (true) {
			// ����Ʈ�� ��� ��ü ȣ��
			for (��� temp : �����) {
				if (�����.indexOf(temp) == 0) {
					System.out.println(temp.����ȣ + "\t" + temp.�ο��� + "\t ����");
				} else {
					System.out.println(temp.����ȣ + "\t" + temp.�ο��� + "\t" + �����.indexOf(temp) * 3 + "��");
				}
			}
			
			System.out.println("[��] 1. ����߰� 2. ������ [������] 3. ���������\n");
			int ch = scanner.nextInt();
			
			if (ch == 1) {
				// 1. �Է¹��� ���� ������ ����
				System.out.print("��ȭ��ȣ : ");		String ��ȭ��ȣ = scanner.next();
				System.out.print("�ο��� : ");		int �ο��� = scanner.nextInt();
				// 2. 3�� ���� -> 1�� ��üȭ
				��� temp = new ���(����ȣ, ��ȭ��ȣ, �ο���);
				// 3. ����ο��� ����Ʈ�� ����
				�����.add(temp);
				����ȣ++;
			} else if (ch == 2) {
				System.out.print("����ȣ : ");		int ��������ȣ = scanner.nextInt();
				for (��� temp : �����) {
					if (temp.����ȣ == ��������ȣ) {
						�����.remove(temp);
						break;
					}
				}
			} else if (ch == 3) {
				System.out.println("���� �տ� �ִ� ����ڸ� �����ŵ�ϴ�.");
				�����.remove(0);
			} else {
				
			}
		}
		
	}

}
