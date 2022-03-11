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
			System.out.println("                  모바일 뱅킹");
			System.out.println("===========================================\n");
		}
	}
	
	void menu_member() {
		while (true) {
			System.out.println("==========================================");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 목록");
			System.out.print("선택 > "); int member_ch = scanner.nextInt();
			if (member_ch == 1) {
				
			} else if (member_ch == 2) {
				
			} else if (member_ch == 3) {
				
			} else if (member_ch == 4) {
				
			} else if (member_ch == 5) {
				
			} else if (member_ch == 6) {
				
			} else {
				System.err.println("잘못된 접근입니다.");
				return;
			}

		}
	}

}
