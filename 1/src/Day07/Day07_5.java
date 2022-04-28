package Day07;

import java.util.Scanner;

public class Day07_5 {	// class start
	
	// main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해서
		// 지역변수 : {변수 선언} 괄호내에서 선언된 변수는 { } 밖을 벗어나지 못함
		// 전역변수 : 서로 다른 { } 괄호 내에서 사용시
		// static : 프로그램 시작시 메모리 할당 / 프로그램 종료시 메모리 초기화
		//			-> 프로그램 전반적으로 모든 곳에 사용되는 메모리[변수]
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Book[] books = new Book[1000];

	public static void main(String[] args) { // main start
		// static : 메모리가 우선할당되기 때문에 static 외 메소드, 필드를 읽지 못함
		//			-> static 메소드만 내부호출 가능
		
		// 메소드 호출
		// 1. menu() : static void menu
		// 2. 외부 호출 : 객체 생성(메모리 할당) -> 메소드 호출
		
		Day07_5 day07_5 = new Day07_5();
		day07_5.menu();

	} // main end
	
	void menu() {
		while (true) {	// 종료조건 : 없음
			Member member = new Member();	// 모든 while문 내에서 사용하기 위해
			System.out.println("===========================================");
			System.out.println("               도서 대여 프로그램");
			System.out.println("===========================================\n");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기");
			System.out.print("\n선택 > ");
			int menu_ch = scanner.nextInt();
			if (menu_ch == 1) {
				// 회원가입 메소드 호출
				
				if (member.sign_up()) {
					System.out.println("회원가입 완료\n");
				} else {
					System.err.println("회원가입 실패\n");
				}
			} else if (menu_ch == 2) {
				// 로그인 메소드 호출
					// 1. 일반회원 2. 관리자
				String result = member.sign_in();
				if (result == null) {
					System.err.println("\n동일한 회원정보가 없습니다.\n");
				} else if (result.equals("admin")) {
					System.out.println("\n관리자 로그인 성공\n");
					menu_admin();
				} else {
					System.out.println("\n로그인 성공\n");
					menu_member();
				}
				
			} else if (menu_ch == 3) {
				// 아이디 찾기 메소드 호출
				member.id_find();
			} else if (menu_ch == 4) {
				// 비밀번호 찾기 메소드 호출
				member.pw_find();
			} else {
				System.err.println("\n잘못된 접근입니다.\n");
			}
		}
	} 	// menu end
	
	void menu_member() {
		while (true) {
			System.out.println("===========================================");
			System.out.println("                    회원 메뉴");
			System.out.println("===========================================\n");
			System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
			System.out.print("\n선택 > ");
			int member_ch = scanner.nextInt();
			Book book = new Book();// 생성자 호출용
			if (member_ch == 1) {
				book.search();
			} else if (member_ch == 2) {
				book.list();
			} else if (member_ch == 3) {
				book.rental();
			} else if (member_ch == 4) {
				book.return_();
			} else if (member_ch == 5){
				return;
			} else {
				System.err.println("잘못된 접근입니다.");
			}
		}
		
	}
	
	void menu_admin() {
		while (true) {
			System.out.println("===========================================");
			System.out.println("                   관리자 메뉴");
			System.out.println("===========================================\n");
			System.out.println("1. 도서등록 2. 도서목록 3. 도서삭제 4. 로그아웃");
			System.out.print("\n선택 > ");
			int admin_ch = scanner.nextInt();
			Book book = new Book();
			if (admin_ch == 1) {
				book.regist();
			} else if (admin_ch == 2) {
				book.list();
			} else if (admin_ch == 3) {
				book.delete();
			} else if (admin_ch == 4) {
				return;
			} else {
				System.err.println("잘못된 접근입니다.");
			}
		}
	}

}	// class end
