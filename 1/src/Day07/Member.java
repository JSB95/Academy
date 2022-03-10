package Day07;

public class Member {
	
	// field : 회원번호, 아이디, 비밀번호, 이름, 연락처
	int member_num;
	String id, pw, name, contact;
	
	// constructor
	public Member() {}
	public Member(int member_num, String id, String pw, String name, String contact) {
		this.member_num = member_num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.contact = contact;
	}
	// method : 회원가입, 로그인, 아이디 찾기, 비밀번호 찾기, 회원탈퇴, 회원수정
	boolean sign_up() {
		System.out.println("\n------------- 회원가입 -------------\n");
		System.out.print("NAME : ");		String name = Day07_5.scanner.next();
		System.out.print("ID : "); 			String id = Day07_5.scanner.next();
		System.out.print("PASSWORD : "); 	String pw = Day07_5.scanner.next();
		System.out.print("CONTACT : ");		String contact = Day07_5.scanner.next();
		
		
		// 아이디 중복체크
		for (Member temp : Day07_5.members) {
			if (temp != null && temp.id.equals(id)) {
				System.err.println("\n이미 사용중인 아이디입니다.\n");
				return false;
			}
		}
		
		
		// 회원번호 자동부여
		int member_num = 0, j =0;
		for(Member temp : Day07_5.members) {
			if (temp == null) {
				if (j == 0) {
					member_num = 1;	// 첫번째 인덱스가 null -> 첫번째 회원
					break;
				} else {
					member_num = Day07_5.members[j-1].member_num + 1;
					break;
				}
			}
			j++;
		}
		
		Member member = new Member(member_num, id, pw, name, contact);	// 변수 4개를 객체 1개로
		
		
		// 회원가입
		int i = 0;
		for (Member temp : Day07_5.members) {
			if (temp == null) {
				Day07_5.members[i] = member;
				System.out.println("\n회원번호 : " + member_num + "\n");
				return true;
			}
			i++;
		}
		return false;
	}

	String sign_in() {
		System.out.println("\n-------------- 로그인 --------------\n");
		System.out.print("ID : "); 		String id = Day07_5.scanner.next();
		System.out.print("PASSWORD : "); 	String pw = Day07_5.scanner.next();
		
		for (Member temp : Day07_5.members) {
			if (temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
			}
		}
		return null;
	}

	void id_find() {
		System.out.println("\n------------ 아이디 찾기 ------------\n");
		System.out.print("NAME : ");		String name = Day07_5.scanner.next();
		System.out.print("CONTACT : "); 	String contact = Day07_5.scanner.next();
		for (Member temp : Day07_5.members) {
			if (temp != null && temp.name.equals(name) && temp.contact.equals(contact)) {
				System.out.println("ID : " + temp.id + "\n");
				return;
			}
		}
		System.err.println("\n회원 정보가 없습니다.\n");
	}

	void pw_find() {
		System.out.println("\n------------ 비밀번호 찾기 ------------\n");
		System.out.print("ID : ");			String id = Day07_5.scanner.next();
		System.out.print("CONTACT : "); 	String contact = Day07_5.scanner.next();
		for (Member temp : Day07_5.members) {
			if (temp != null && temp.id.equals(id) && temp.contact.equals(contact)) {
				System.out.println("PASSWORD : " + temp.pw + "\n");
				return;
			}
		}
		System.err.println("\n회원 정보가 없습니다.\n");
	}

}
