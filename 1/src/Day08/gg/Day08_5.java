package Day08.gg;

import java.text.DecimalFormat;
import java.util.*;

public class Day08_5 {
	
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	static Member[] members = new Member[1000];
	static Account[] accounts = new Account[1000];
	static Loan[] loans = new Loan[1000];
	static DecimalFormat formatter = new DecimalFormat("###,###");
	
	public static void main(String[] args) {
		Day08_5 day08_5 = new Day08_5();
		day08_5.menu();
	}
	
	void menu() {
		while (true) {
			System.out.println("===========================================");
			System.out.println("                  ����� ��ŷ");
			System.out.println("===========================================\n");
			System.out.println("\n1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��");
			int ch = scanner.nextInt();
			Member member = new Member();
			if (ch == 1) {
				boolean result = member.addMember();
				if (result) {
					System.out.println("\nȸ������ ����");
				} else {
					System.err.println("\nȸ������ ����");
				}
			} else if (ch == 2) {
				boolean result = member.login();
				if (result) {
					System.out.println("\n�α��� ����");
					menu_member();
				} else {
					System.out.println("\n�α��� ����");
				}
			} else if (ch == 3) {
				member.idCheck();
			} else if (ch == 4) {
				member.pwCheck();
			} else {
				System.err.println("�߸��� �����Դϴ�.");
			}
		}
	}
	
	void menu_member() {
		while (true) {
			System.out.println("==========================================");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���");
			System.out.print("���� > "); int member_ch = scanner.nextInt();
			Account account = new Account();
			Member member = new Member();
			if (member_ch == 1) {
				member.addAccount();
			} else if (member_ch == 2) {
				account.receipt();
			} else if (member_ch == 3) {
				account.payment();
			} else if (member_ch == 4) {
				
			} else if (member_ch == 5) {
				
			} else if (member_ch == 6) {
				System.out.println("���¹�ȣ : " + member.account1);
				
			} else {
				System.err.println("�߸��� �����Դϴ�.");
				return;
			}

		}
	}

}
