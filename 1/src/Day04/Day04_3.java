package Day04;

import java.util.*;

@SuppressWarnings("unused")
public class Day04_3 {	// class start

	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * ���������� 
		 * ����0 ����1 ��2 ����3 �Է¹ޱ�
		 * ��ǻ�� ����
		 * �¸��� �Ǵ�
		 * �����
		 * �Ѱ��Ӽ�
		 * �����¸��� �¸� �й� ���º� ��ǻ�� �¸� �� ����� �¸� ��
		 */
		
		// ���� ����
		
		int user;																	// ����ڰ� ������ �� ����
		int com;																	// ��ǻ���� ���� ����
		int game = 0;																	// ���� ��
		int user_win = 0;																// ����� �¸� ��
		int com_win = 0;																// ��ǻ�� �¸� ��
		
		// ���α׷� ����
		
		while (true) {																// ���α׷� ����[���ѷ��� �������� : 3�� �Է½�]
			System.out.println("---------����������---------");
			System.out.println("����[0] ����[1] ��[2] ����[3]");
			System.out.println("-------------------------");
			System.out.print("�����ϼ��� : ");
			System.out.println("");
			user = scanner.nextInt();												// ����� �� �Է¹ޱ�
			
			Random random = new Random();											// ���� ��ü ����
			com = random.nextInt(3);												// ������ integer�� �������� ()�� ����-1���� ����, ������ +- 20��, ���갡�� (random.nextInt(10) + 10)
			
			
			if ((user == 0 && com ==2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
				System.out.println("��ǻ�Ͱ� �� ��: " + com + "\n");
				System.out.println("����� �̰���ϴ�.\n");
				user_win++;
				game++;
			} else if ((user == 0 && com == 0) || (user == 1 && com == 1) || (user == 2 && com == 2)) {
				System.out.println("��ǻ�Ͱ� �� ��: " + com + "\n");
				System.out.println("�����ϴ�.\n");
				game++;
			} else if ((user == 2 && com == 0) || (user == 0 && com == 1) || (user == 1 && com == 2)) {
				System.out.println("��ǻ�Ͱ� �� ��: " + com + "\n");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.\n");
				com_win++;
				game++;
			} else if (user == 3) {
				System.out.println("�� ���� ��: " + game);
				System.out.println("����� �¸� �� : " + user_win);
				System.out.println("��ǻ�� �¸� �� : " + com_win);
				if (user_win > com_win) {
					System.out.println("�����¸� : �����\n");
				} else if (user_win == com_win) {
					System.out.println("���º� �Դϴ�.\n");
				} else {
					System.out.println("�����¸� : ��ǻ��\n");
				}
				game = 0;
				user_win = 0;
				com_win = 0;
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�.\n");
			}
			
		}

	} // main end

} // class end
