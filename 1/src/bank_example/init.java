package bank_example;

import java.util.*;
import java.text.DecimalFormat;


public class init {
	

	
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static Member[] members = new Member[1000];
	static Account[] accounts = new Account[1000];
	static Loan[] loans = new Loan[1000];
	static DecimalFormat formatter = new DecimalFormat("###,###");


	public static void main(String[] args) {
		init init = new init();
		init.menu();
	}
	
	void menu() {
		while (true) {
			Member member = new Member();
			System.out.println("===========================================");
			System.out.println("                  ����� ��ŷ");
			System.out.println("===========================================\n");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��");
			System.out.print("\n���� > ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				boolean result = member.sign_up();
				if (result) {
					System.out.println("\nȸ������ ����\n");
				} else {
					System.err.println("\nȸ������ ����\n");
				}
			} else if (ch == 2) {
				String result = member.sign_in();
				if (result == null) {
					System.err.println("\n������ ȸ�������� �����ϴ�.\n");
				} else if (result.equals("admin")) {
					System.out.println("\n������ �α��� ����\n");
					admin_menu();
				} else {
					System.out.println("\n�α��� ����\n");
					member_menu();
				}
			} else if (ch == 3) {
				member.id_find();
			} else if (ch == 4) {
				member.pw_find();
			} else {
				System.err.println("�߸��� �����Դϴ�.");
			}
		}
	}
	
	void member_menu() {
		while (true) {
			System.out.println("========================================================");
			System.out.println("                           ȸ�� �޴�");
			System.out.println("========================================================\n");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. �� ���¸�� 7. �α׾ƿ�");
			System.out.print("\n���� > ");
			int ch = scanner.nextInt();
			Member member = new Member();
			Account account = new Account();
			if (ch == 1) {
				System.out.println("\n���¸� �����Ͻðڽ��ϱ�?\n\n1.�� 2.�ƴϿ�");
				System.out.print("\n���� > "); int create_ch = init.scanner.nextInt();
				int account_num = account.account_create(create_ch);
				member.add_account(account_num);
			} else if (ch == 2) {
				System.out.print("\n���¹�ȣ�� �Է��ϼ��� : "); int account_num = scanner.nextInt();
				account.deposit(account_num);
			} else if (ch == 3) {
				
			} else if (ch == 4) {
				
			} else if (ch == 5) {
				
			} else if (ch == 6) {
				System.out.print("\n��й�ȣ�� �ѹ� �� �Է��ϼ��� : "); String pw = scanner.next();
				account.list_account(pw);
			} else if (ch == 7) {
				break;
			} else {
				System.err.println("\n�߸��� �����Դϴ�.");
			}
		}
		
	}
	
	void admin_menu() {

		while (true) {
			System.out.println("==========================================================");
			System.out.println("                          ������ �޴�");
			System.out.println("========================================================\n");
			System.out.println("1. �����ǰ ���� 2. �����ǰ ��� 3. �α׾ƿ�");
		}
	}

}
