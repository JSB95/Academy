package Day05;

import java.util.Scanner;

public class Day05_2 { // class start
	
	// 회원제 방문록 프로그램 [2차원 배열]
		// 1. 초기메뉴 [1. 회원가입 2. 로그인]
			// 1. 회원가입 [아이디, 비밀번호, 로그인]
			// 2. 로그인 [아이디, 비밀번호 동일하면 로그인 처리]
		// 2. 로그인시 메뉴 [1. 방문록 쓰기 2. 방문록 삭제 3. 로그아웃]
			// 1. 방문록 쓰기 [제목, 내용, 작성자(로그인된 아이디)]
			// 2. 로그아웃 [초기메뉴로 돌아가기]

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 전역변수 선언
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		// 회원 배열 (100명)
		String[][] memberlist = new String[100][3]; // 100행 3열 => [1열 = 아이디][2열 = 비밀번호][3열 = 이름]
		
		// 방문록 배열(100개)
		String[][] boardlist = new String[100][3]; // 100행 3열 => [1열 = 제목][2열 = 내용][3열 = 작성자]
		
		while(true) { // 무한루프 종료조건 : 없음
			
			System.out.println("--------------------------------");
			System.out.println("---------- 회원제 방문록 ----------");
			System.out.println("--------------------------------");
			System.out.print("1. 회원가입 2. 로그인 선택 : ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("----------- 회원가입 --------------");
				System.out.print("MEMBER ID : ");		String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); String pw = scanner.next();
				System.out.print("MEMBER NAME : "); 	String name = scanner.next();
				
				// 아이디 중복체크
				boolean idchk = true;
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("중복된 아이디입니다.");
						idchk = false;
						break;
					}
				}
				
				// 회원 저장
				if (idchk) {
					for (int i = 0; i < memberlist.length; i++) {
						if (memberlist[i][0] == null) { // i번째행에 id가 없으면(빈공간)
							memberlist[i][0] = id;		// id저장
							memberlist[i][1] = pw;		// pw 저장
							memberlist[i][2] = name;	// name 저장
							System.out.println("회원가입 완료");
							break;
						}
					}
				}			
			} else if (ch == 2) {
				System.out.println("----------- 로그인 --------------");
				System.out.print("MEMBER ID : ");		String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); String pw = scanner.next();
				boolean loginchk = false; // 로그인 성공 초기값
				
				// 배열 내 데이터가 입력받은 값과 일치하면 로그인처리
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) { // null은 객체가 아니기 때문에 equals 불가능, 연산자 사용
						System.out.println("로그인 성공");
						loginchk = true; // 로그인 성공값
						while(true) {
							System.out.println("----------- 방문록 --------------");
							
							// 모든 방문록 출력
							System.out.println("번호\t작성자\t제목\t내용");
							for (int j = 0; j < boardlist.length; j++) {
								if (boardlist[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s \n",j+1,boardlist[j][2],boardlist[j][0],boardlist[j][1]);
								}
							}
								
							System.out.println("1. 작성 2. 로그아웃 선택 : "); 
							int ch2 = scanner.nextInt();
							
							if (ch2 == 1) {
								System.out.println("----------- 작성 --------------");
								System.out.println("제목 : "); String title = scanner.next();
								System.out.println("내용 : "); String content = scanner.next();
								
								// 배열 내 공백 찾아서 저장
								for (int j = 0; j < boardlist.length; j++) {
									if (boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // 로그인시 사용된 아이디 대입
										System.out.println("작성 완료");
										break;
									}
								}
							} else if (ch2 == 2) {
								System.err.println("로그아웃 되었습니다.");
								break;	
							} else {
								System.err.println("잘못된 접근입니다.");
							}
						}
					}
				}
				if (loginchk == false) {
					System.err.println("회원 정보가 없거나 다릅니다.");
				}
			} else {
				System.err.println("잘못된 접근입니다.");
			}
			
		} // while end

	} // main end

} // class end
