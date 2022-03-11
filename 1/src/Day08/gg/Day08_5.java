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
			System.out.println("\n1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기");
			int ch = scanner.nextInt();
			Member member = new Member();
			if (ch == 1) {
				boolean result = member.addMember();
				if (result) {
					System.out.println("\n회원가입 성공");
				} else {
					System.err.println("\n회원가입 실패");
				}
			} else if (ch == 2) {
				boolean result = member.login();
				if (result) {
					System.out.println("\n로그인 성공");
					menu_member();
				} else {
					System.out.println("\n로그인 실패");
				}
			} else if (ch == 3) {
				member.idCheck();
			} else if (ch == 4) {
				member.pwCheck();
			} else {
				System.err.println("잘못된 접근입니다.");
			}
		}
	}
	
	void menu_member() {
		while (true) {
			System.out.println("==========================================");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 목록");
			System.out.print("선택 > "); int member_ch = scanner.nextInt();
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
				System.out.println("계좌번호 : " + member.account1);
				
			} else {
				System.err.println("잘못된 접근입니다.");
				return;
			}

		}
	}

}
