package Day06;

import java.util.*;

public class Day06_6 {

	public static void main(String[] args) {

		// �������� ����
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		// ���α׷� ����
		while (true) { // �������� ����
			
			System.out.println("---------- �Խ��� ----------");
			System.out.println("��ȣ\t�ۼ���\t����");
			// �迭 �� ��� ��ü ���
			int index = 0; // �ε��� ����
			for (Board temp : boardlist) {
				if (temp != null) {
					System.out.printf("%d\t%s\t%s", index, temp.writer, temp.title);
					index++;
				}
			}
			System.out.println("1. �۾��� 2. �ۺ���");
			int ch = scanner.nextInt();
			if (ch == 1) { // 1. �۾���
				// 4�� ������ �Է¹޴´�
				System.out.println("---------- �۾��� ������ ----------");
				System.out.print("���� : "); 			String title = scanner.next();
				System.out.print("���� : ");			String content = scanner.next();
				System.out.print("�ۼ��� : ");		String writer = scanner.next();
				System.out.print("��й�ȣ : "); 		String password = scanner.next();
				// 4�� ������ ��üȭ [��ü�� ���� 4�������� ��ü �� �ʵ忡 ����]
				Board board = new Board(title, content, writer, password);
				int i = 0;
				// �迭 �� ������� ã�Ƽ� ������� ��ü ����
				for (Board temp : boardlist) {
					if (temp == null) {					// ������̶��
						boardlist[i] = board;			// �ش� �ε����� ���ο� ��ü ����
						break;							// �ѹ� ���������� �ݺ��� ����
					}
					i++;
				}
			} else if (ch == 2) {
				
			} else {
				
			}
		}

	}

}
