package Day05;

import java.util.*;

public class Day05_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String [100][2];
		String[][] booklist = new String [100][2];
		
		
		while (true) {
			// 1. �������� ����
			
			System.out.println("--------------------------------");
			System.out.println("---------- ���� �뿩 -------------");
			System.out.println("--------------------------------");
			System.out.println("1. ȸ������ 2. �α��� ");
			System.out.println("���� > ");
			// 2. �ʱ� �޴�
			String id = scanner.next();
			
			// 3. �α��� �� �޴�

			while (true) {
				System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
				System.out.println("���� > ");
				int login_ch = scanner.nextInt();
				if (login_ch == 1) {
					System.out.println("������ : "); 
					String book_search = scanner.next();
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null && booklist[i][0].equals(book_search)) {
							System.out.println(booklist[i][0] + "" + booklist[i][1]);
						}
					}
				} else if (login_ch == 2) {
					System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null) {
							System.out.printf("%d\t%s\t%s\t%s", i+1, booklist[i][0], booklist[i][1], booklist[i][2]);
						}
					}
				} else if (login_ch == 3) {
					System.out.println("������ : ");
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null && booklist[i][1].equals('O')) {
							System.out.println("�����뿩 �Ϸ�");
							booklist[i][1] = "X";
							booklist[i][2] = id;
						}
					}
				} else if (login_ch == 4) {
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][2].equals(id)) {
							booklist[i][1] = "O";
							booklist[i][2] = null;
						}
					}
				} else if (login_ch == 5) {
					System.out.println("�α׾ƿ� �Ϸ�");
					break;
				} else {
					System.err.println("�߸��� �����Դϴ�.");
				}
			}
			
		}


	}

}
