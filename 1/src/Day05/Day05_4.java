package Day05;

import java.util.*;

public class Day05_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String [100][2];
		String[][] booklist = new String [100][2];
		
		
		while (true) {
			// 1. 전역변수 선언
			
			System.out.println("--------------------------------");
			System.out.println("---------- 도서 대여 -------------");
			System.out.println("--------------------------------");
			System.out.println("1. 회원가입 2. 로그인 ");
			System.out.println("선택 > ");
			// 2. 초기 메뉴
			String id = scanner.next();
			
			// 3. 로그인 시 메뉴

			while (true) {
				System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
				System.out.println("선택 > ");
				int login_ch = scanner.nextInt();
				if (login_ch == 1) {
					System.out.println("도서명 : "); 
					String book_search = scanner.next();
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null && booklist[i][0].equals(book_search)) {
							System.out.println(booklist[i][0] + "" + booklist[i][1]);
						}
					}
				} else if (login_ch == 2) {
					System.out.println("번호\t도서명\t도서대여여부\t대여인");
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null) {
							System.out.printf("%d\t%s\t%s\t%s", i+1, booklist[i][0], booklist[i][1], booklist[i][2]);
						}
					}
				} else if (login_ch == 3) {
					System.out.println("도서명 : ");
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][0] != null && booklist[i][1].equals('O')) {
							System.out.println("도서대여 완료");
							booklist[i][1] = "X";
							booklist[i][2] = id;
						}
					}
				} else if (login_ch == 4) {
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i][2].equals(id)) {
							booklist[i][1] = "O";
							booklist[i][2] = null;
						}
					}
				} else if (login_ch == 5) {
					System.out.println("로그아웃 완료");
					break;
				} else {
					System.err.println("잘못된 접근입니다.");
				}
			}
			
		}


	}

}
