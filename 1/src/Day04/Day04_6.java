package Day04;

import java.util.*;

public class Day04_6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();	
		// TODO Auto-generated method stub
		/*
		 * 9ĭ ĭ ���� => �迭, string,String[] �迭 = new String[9]
		 * ����ڿ��� �ε�����ȣ �Է¹޾� �ش� �ε����� O ǥ��	
		 * ��ǻ�ʹ� 0~8 ���� ���� �߻� -> �ش� �ε����� X ǥ��
		 * �̹� �� �ڸ��� ���Է�/�糭��
		 * �¸�
		 * ����, ����, �밢�� �ε����� ���� 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// �� �����
		String[] board = { 	"[ ]", "[ ]", "[ ]",
							"[ ]", "[ ]", "[ ]",
							"[ ]", "[ ]", "[ ]" };
		String win = null;																// 3�� �Ǿ��� �� �ش���� �����ϴ� ����
		
		// ���� ����
		while(true) {																	// �������� : 9ĭ ��� ���� ���� ��� 2. �¸��ڰ� ������ ���
			for (int i = 0; i <board.length; i++) {
				System.out.print(board[i]);
				if( i%3 == 2) {
					System.out.println("");
				}
			}
		// 1. �����
			while (true) {
				System.out.println("��ġ ���� : "); int point = scanner.nextInt();			// ����� ��ġ ����
				try {
					if (board[point].equals("[ ]")) {
						board[point] = "[O]";												// ����� �� ǥ��
						break;																// ���� ����� �ݺ��� Ż��
					} else {
						System.err.println("�ش� ��ġ�� �̹� ���� �����մϴ�.");
					} 
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("��Ȯ�� ���ڸ� �Է��ϼ���.");
				}
			}
		// 2. ��ǻ��
			while (true) {
				int com_number = random.nextInt(9);										// ���� ����
				if (board[com_number].equals("[ ]")) {
					board[com_number] = "[X]";										 	// ��ǻ�� �� ǥ��
					break;																// ���� ����� �ݺ��� Ż��
				} else {
					com_number = random.nextInt(9);
				}
			}
			
		// 3. �¸��� �Ǵ�
			
			// 1. ���η� �̱�� ��
			for (int i = 0; i <= 6; i += 3) {
				// i�� 0���� 6���� 3�� ���� -> 0 3 6 -> 3ȸ
				if(board[i].equals(board[i+1]) && board[i+1].equals(board[i+2])) {		// 0 �ε��� == 1 �ε��� �׸��� 1 �ε��� == 2 �ε���
					win = board[i];
				}
			}
			// 2. ���η� �̱�� ��
			for (int i = 0; i <= 2; i++) {
				if(board[i].equals(board[i+3]) && board[i+3].equals(board[i+6])) {
					win = board[i];
				}
			}
			// 3. �밢������ �̱�� ��
			if (board[0].equals(board[4]) && board[4].equals(board[8])) { 
				win = board[0];
			}
			if (board[2].equals(board[4]) && board[4].equals(board[6])) {
				win = board[2];
			}

				
				
		// 4. ���� ����
			
			if (win.equals("[O]")) {
				System.out.println("����� �¸�");
				break;
			} else if (win.equals("[X]")) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
		
			
			
			
			
			
			
			
		}
	} // me

} // ce
