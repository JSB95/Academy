package Day05;

import java.util.*;

public class Day05_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [][] memberlist = new String [100][3];
		String [][] boardlist = new String [100][3];
		
		
		while (true) {
			
			System.out.println("------------도서대여-------------");
			System.out.println("1. 회원가입  2.로그인");
			System.out.println("선택> "); int 선택 = scanner.nextInt();
			
			if(선택==1) {
				System.out.println("------------회원가입--------");
				System.out.println("아이디: "); String id = scanner.next();
				System.out.println("비밀번호: "); String pw = scanner.next();
				System.out.println("이름: "); String name = scanner.next();
				
				
				//아이디 중복
				boolean 아이디체크 =true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id)) {
						System.err.println("중복된 아이디가 존재합니다.");
						아이디체크=false;
						break;
					}//// if
				} /////for
				
				///아이디 저장
				if(아이디체크) {
					for(int i=0; i<memberlist.length; i++) {
						if(memberlist[i][0]==null) {
							memberlist[i][0]=id;
							memberlist[i][1]=pw;
							memberlist[i][2]=name;
							System.err.println("회원가입이 완료되었습니다.");
							break;
						} ///if
					}////for
				}///if
				
			}////if 선택1
			else if(선택==2) {
				System.out.println("--------로그인페이지---------");
				System.out.println("아이디: "); String id = scanner.next();
				System.out.println("비밀번호: "); String pw= scanner.next();
				
				boolean 로그인확인 = false;
				for(int j =0; j<memberlist.length; j++) {
					if(memberlist[j][0] != null && memberlist[j][0].equals(id) & memberlist[j][1].equals(pw)) {
						memberlist[j][0]=id;
						memberlist[j][1]=pw;
						로그인확인=true;
						System.out.println("로그인이 완료되었습니다.");
						if(로그인확인 = false) System.out.println("로그인에 실패하였습니다.");
						while (true) {
							System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
							System.out.println("선택 > ");
							int login_ch = scanner.nextInt();
							if (login_ch == 1) {
								System.out.println("도서명 : "); 
								String book_search = scanner.next();
								for (int i = 0; i < boardlist.length; i++) {
									if (boardlist[i][0] != null && boardlist[i][0].equals(book_search)) {
										System.out.println(boardlist[i][0] + "" + boardlist[i][1]);
									}
								}
							} else if (login_ch == 2) {
								System.out.println("번호\t도서명\t도서대여여부\t대여인");
								for (int i = 0; i < boardlist.length; i++) {
									if (boardlist[i][0] != null) {
										System.out.printf("%d\t%s\t%s\t%s", i+1, boardlist[i][0], boardlist[i][1], boardlist[i][2]);
									}
								}
							} else if (login_ch == 3) {
								System.out.println("도서명 : ");
								for (int i = 0; i < boardlist.length; i++) {
									if (boardlist[i][0] != null && boardlist[i][1].equals('O')) {
										System.out.println("도서대여 완료");
										boardlist[i][1] = "X";
										boardlist[i][2] = id;
									}
								}
							} else if (login_ch == 4) {
								for (int i = 0; i < boardlist.length; i++) {
									if (boardlist[i][2].equals(id)) {
										boardlist[i][1] = "O";
										boardlist[i][2] = null;
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
				}// for
			} /// else if
			else {System.out.println("알수없는 번호입니다.");}
			// 1. 전역변수 선언
			
			// 3. 로그인 시 메뉴

			
			
		}


	}

}
