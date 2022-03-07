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
				
				// 회원 저장
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] == null) { // i번째행에 id가 없으면(빈공간)
						memberlist[i][0] = id;		// id저장
						memberlist[i][1] = pw;		// pw 저장
						memberlist[i][2] = name;	// name 저장
						System.out.println("회원가입 완료");
						break;
					}
				}
				
				// 아이디 중복체크
				
				
			} else if (ch == 2) {
				System.out.println("----------- 로그인 --------------");
				System.out.print("MEMBER ID : ");		String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); String pw = scanner.next();
				
				// 배열 내 데이터가 입력받은 값과 일치하면 로그인처리
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) { // null은 객체가 아니기 때문에 equals 불가능, 연산자 사용
						System.out.println("로그인 성공");
					}
				}
			}
			
		} // while end

	} // main end

} // class end
