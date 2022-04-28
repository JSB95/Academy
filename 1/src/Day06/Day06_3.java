package Day06;

import java.util.Scanner;

public class Day06_3 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// main 메소드 모든 곳에서 사용
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // Member 클래스로 만들어진 객체(id, pw, name, phone) 100개 저장할 수 있는 배열 선언
		while (true) {
			
			System.out.println("---------- 회원제 [클래스] ----------\n");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기\n");
			System.out.print("선택 > "); int ch = scanner.nextInt();
			
			if (ch == 1) {		// 회원가입
				System.out.println("---------- 회원가입 페이지 ----------");
				System.out.print("아이디 : "); 		String id = scanner.next();
				System.out.print("비밀번호 : ");		String pw = scanner.next();
				System.out.print("이름 : ");		String name = scanner.next();
				System.out.print("연락처 : ");		String phone = scanner.next();
				
				Member member = new Member();	// 2. 객체 생성
				member.id = id; 	// 객체 내 필드 = 입력받은 값
				member.pw = pw;
				member.name = name;
				member.phone = phone;
				
				// 아이디 중복확인
					// 배열 내 객체중 입력한 아이디와 동일한 아이디 찾기
				boolean idchk = false;
				for (Member temp : memberlist) { 	// memberlist 배열 내 객체들을 하나씩 temp에 대입 반복
					if (temp != null && temp.id.equals(id)) { 		// 해당 객체 내 id가 입력받은 id와 같다면
						System.out.println("\n사용중인 아이디입니다.\n");		// 오류메세지 출력
						idchk = true;
						break;
					}
				}
				
				// 아이디가 중복이 아닐경우 저장
				if (idchk == false) {
					// 여러개 객체를 저장하는 배열에 저장
					// 공백 인덱스 찾기 [공백이 아니면 기존회원이 존재] 
					int i = 0;
					for (Member temp : memberlist) { // memberlist 배열 내 member 객체 하나씩 꺼내와서 temp에 저장 반복
						if (temp == null) { // 공백 인덱스에 객체 저장
							memberlist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
							System.out.println("\n회원가입 완료\n");
							break;
						}
						i++;	// 인덱스 증가
					}
				}
				
			 } else if (ch == 2) {		// 로그인
				 // 1. 입력받기
				 System.out.println("---------- 로그인 페이지 ----------");
				 System.out.print("아이디 : "); 	String loginid = scanner.next();
				 System.out.print("비밀번호 : "); 	String loginpw = scanner.next();
				 
				 // 2. 기존 배열[memberlist] 내 입력받은 값과 비교
				 boolean loginchk = false; 	// true : 로그인 성공 false : 로그인 실패
				 for (Member temp : memberlist) {
					 if (temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
						 System.out.println("\n로그인 성공\n");
						 loginchk = true;
					 }
				 }
				 
				 // 3. 로그인 성공 유무
				if (loginchk == false) {
					System.out.println("\n회원 정보가 없습니다.\n");
				}
				
			 } else if (ch == 3) { 		// 아이디 찾기
				 System.out.println("---------- 아이디 찾기 페이지 -----------");
				 System.out.print("이름 : ");		String name = scanner.next();		// 이름과 연락처를 입력받는다
				 System.out.print("연락처 : ");  	String phone = scanner.next();
				 boolean findid = false;
				 for (Member temp : memberlist) {
					 if (temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { 		// 돟일한 결과가 있다면
						 System.out.println("회원 아이디 : " + temp.id);								// 아이디 출력
						 findid = true;
						 break;
					 }
				 }
				 if (findid == false) {
					 System.out.println("\n동일한 회원정보가 없습니다.\n");
				 }
			 } else if (ch == 4) {		// 비밀번호 찾기
				 System.out.println("---------- 비밀번호 찾기 페이지 ----------");
				 System.out.print("아이디 : ");		String id = scanner.next();
				 System.out.print("연락처 : ");  	String phone = scanner.next();
				 boolean findpw = false;
				 for (Member temp : memberlist) {
					 if (temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						 System.out.println("비밀번호 : " + temp.pw);
						 findpw = true;
						 break;
					 }
				 }
				 if (findpw == false) {
					 System.out.println("\n회원정보가 다릅니다.\n");
				 }
			 } else {
				 System.err.println("\n잘못된 접근입니다.\n");
			 }
			
		} // while end

	} // main end

} // class end
