package Day06;

import java.util.*;

public class Day06_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// �������� ����
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		// ���α׷� ����
		while (true) { // �������� ����
			
			System.out.println("---------- �Խ��� ----------");
			System.out.println("��ȣ\t�ۼ���\t���� ");
			// �迭 �� ��� ��ü ���
			int index = 0; // �ε��� ����
			for (Board temp : boardlist) {
				if (temp != null) {
					System.out.printf("%d\t%s\t%s \n", index, temp.writer, temp.title);
					index++;
				}
			}
			System.out.println("\n1. �۾��� 2. �ۺ���");
			System.out.print("\n���� > ");
			int ch = scanner.nextInt();
			if (ch == 1) { // 1. �۾���
				// 4�� ������ �Է¹޴´�
				System.out.println("\n---------- �۾��� ������ ----------");
				System.out.print("���� : "); 			String title = scanner.next();
				System.out.print("���� : ");			String content = scanner.next();
				System.out.print("�ۼ��� : ");		String writer = scanner.next();
				System.out.print("��й�ȣ : "); 		String password = scanner.next();
				System.out.println("");
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
				System.out.print("\n�۹�ȣ ���� > ");
				int board_num = scanner.nextInt();
				System.out.printf("\n�ۼ��� : %s   ���� : %s \n", boardlist[board_num].writer, boardlist[board_num].title); // �ݺ��� ��� X : ����� ��ġ�� �Է¹޾ұ� ������
				System.out.printf("\n���� : %s \n",boardlist[board_num].content);
				System.out.println("\n----------------------------");
				System.out.println("\n1. ��Ϻ��� 2. ���� 3. ����");
				System.out.print("\n���� > ");
				int board_num2 = scanner.nextInt();
				if (board_num2 == 1) {
					ch = 1;
				} else if (board_num2 == 2) { 	// �Խñ� ����
					System.out.print("\n��й�ȣ : ");
					String pw = scanner.next();
					// �����ִ� �Խù��� �����ϴ°� -> �ݺ��� X
					if (boardlist[board_num].password.equals(pw)) {
						boardlist[board_num] = null;
						System.err.println("\n���� ����\n");
					} else {
						System.err.println("\n��й�ȣ ����\n");
					}
					// ���� �Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
						// �ش� �ڵ尡 ���� ��� �迭 �� ���� �߻�
					for (int i = board_num; i <= boardlist.length; i++) {
						// �˻��� �Խù��� �ε������� ������ �ε������� 1�� ����
						boardlist[board_num] = boardlist[board_num+1]; // ������ �Խù� ���� �ε����� �Խù�
						if (board_num == boardlist.length-1) {
														/* 2������ 
														 * 2 -> 3
														 * 3 -> 4
														 * 4 -> 5
														 * 98 -> 99
														 * 99 -> null
														 */
							boardlist[boardlist.length-1] = null;
						}
					}
				} else if (board_num2 == 3) { // �Խñ� ����
					System.out.print("\n��й�ȣ : ");
					String pw = scanner.next();
					if (boardlist[board_num].password.equals(pw)) {
						System.out.println("\n---------- ���� ������ ----------");
						System.out.print("���� : "); 			boardlist[board_num].title = scanner.next();
						System.out.print("���� : ");			boardlist[board_num].content = scanner.next();
					} else if (!boardlist[board_num].password.equals(pw)) {
						System.err.println("\n��й�ȣ ����");
					}
				} else {
					System.err.println("\n�߸��� �����Դϴ�.\n");
				}
				
			} else {
				System.err.println("\n�߸��� �����Դϴ�.\n");
			}
		} // while end

	} // main end

} // class end
