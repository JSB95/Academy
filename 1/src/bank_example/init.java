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
			System.out.println("                  모바일 뱅킹");
			System.out.println("===========================================\n");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기");
			System.out.print("\n선택 > ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				boolean result = member.sign_up();
				if (result) {
					System.out.println("\n회원가입 성공\n");
				} else {
					System.err.println("\n회원가입 실패\n");
				}
			} else if (ch == 2) {
				String result = member.sign_in();
				if (result == null) {
					System.err.println("\n동일한 회원정보가 없습니다.\n");
				} else if (result.equals("admin")) {
					System.out.println("\n관리자 로그인 성공\n");
					admin_menu();
				} else {
					System.out.println("\n로그인 성공\n");
					member_menu();
				}
			} else if (ch == 3) {
				member.id_find();
			} else if (ch == 4) {
				member.pw_find();
			} else {
				System.err.println("잘못된 접근입니다.");
			}
		}
	}
	
	void member_menu() {
		while (true) {
			System.out.println("========================================================");
			System.out.println("                           회원 메뉴");
			System.out.println("========================================================\n");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 내 계좌목록 7. 로그아웃");
			System.out.print("\n선택 > ");
			int ch = scanner.nextInt();
			Member member = new Member();
			Account account = new Account();
			if (ch == 1) {
				System.out.println("\n계좌를 생성하시겠습니까?\n\n1.예 2.아니오");
				System.out.print("\n선택 > "); int create_ch = init.scanner.nextInt();
				int account_num = account.account_create(create_ch);
				member.add_account(account_num);
			} else if (ch == 2) {
				System.out.print("\n계좌번호를 입력하세요 : "); int account_num = scanner.nextInt();
				account.deposit(account_num);
			} else if (ch == 3) {
				
			} else if (ch == 4) {
				
			} else if (ch == 5) {
				
			} else if (ch == 6) {
				System.out.print("\n비밀번호를 한번 더 입력하세요 : "); String pw = scanner.next();
				account.list_account(pw);
			} else if (ch == 7) {
				break;
			} else {
				System.err.println("\n잘못된 접근입니다.");
			}
		}
		
	}
	
	void admin_menu() {

		while (true) {
			System.out.println("==========================================================");
			System.out.println("                          관리자 메뉴");
			System.out.println("========================================================\n");
			System.out.println("1. 대출상품 생성 2. 대출상품 목록 3. 로그아웃");
		}
	}

}
