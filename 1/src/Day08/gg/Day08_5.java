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
		}
	}
	
	void menu_member() {
		while (true) {
			System.out.println("==========================================");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���");
			System.out.print("���� > "); int member_ch = scanner.nextInt();
			if (member_ch == 1) {
				
			} else if (member_ch == 2) {
				
			} else if (member_ch == 3) {
				
			} else if (member_ch == 4) {
				
			} else if (member_ch == 5) {
				
			} else if (member_ch == 6) {
				
			} else {
				System.err.println("�߸��� �����Դϴ�.");
				return;
			}

		}
	}

}
