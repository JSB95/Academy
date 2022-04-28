package bank_example;


public class Member {
	
	// field
	String id, pw, name, contact;
	static String pw_chk;
	int balance, num, account;
	
	// constructor
	public Member() { }
	
	public Member(int balance, int account) {
		this.balance = balance;
		this.account = account;
	}

	public Member(int num, String id, String pw, String name, String contact) {
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.contact = contact;
	};
	
	public Member(int num, String id, String pw, String name, String contact, int balance, int account) {
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.contact = contact;
		this.balance = balance;
		this.account = account;
	}
	
	// method
	boolean sign_up() {
		System.out.println("\n------------- 회원가입 -------------\n");
		System.out.print("NAME : ");		String name = init.scanner.next();
		System.out.print("ID : "); 			String id = init.scanner.next();
		System.out.print("PASSWORD : "); 	String pw = init.scanner.next();
		System.out.print("CONTACT : ");		String contact = init.scanner.next();
		
		// duplication check
		for (Member temp : init.members){
			if (temp != null && temp.id.equals(id)) {
				System.err.println("\n이미 사용중인 아이디입니다.\n");
				return false;
			}
		}
		// numbering process
		int member_num = 0, j = 0;
		for (Member temp : init.members) {
			if (temp == null) {
				if (j == 0) {
					member_num = 1;
					break;
				} else {
					member_num = init.members[j-1].num + 1;
					break;
				}
			}
			j++;
		}

		Member member = new Member(member_num, id, pw, name, contact, balance, account);
		// sign up process
		int i = 0;
		for (Member temp : init.members) {
			if (temp == null) {
				init.members[i] = member;
				System.out.println("\n회원번호 : " + member_num);
				return true;
			}
			i++;
		}
		return false;
	}
	
	String sign_in() {
		System.out.println("\n------------- 로그인 -------------\n");
		System.out.print("ID : "); 			String id = init.scanner.next();	
		System.out.print("PASSWORD : ");	String pw = init.scanner.next();	pw_chk = pw;
		for (Member temp : init.members) {
			if (temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				pw_chk = temp.pw;
				return pw_chk;
			}
		}
		return null;
	}
	
	void id_find() {
		System.out.println("\n------------- 아이디 찾기 -------------\n");
		System.out.print("NAME : "); 			String name = init.scanner.next();
		System.out.print("CONTACT : ");			String contact = init.scanner.next();
		for (Member temp : init.members) {
			if (temp != null && temp.name.equals(name) && temp.contact.equals(contact)){
				System.out.println("ID : " + temp.id + "\n");
				return;
			}
		}
		System.err.println("\n회원 정보가 없습니다.");
	}
	
	void pw_find() {
		System.out.println("\n------------- 비밀번호 찾기 -------------\n");
		System.out.print("ID : "); 				String id = init.scanner.next();
		System.out.print("CONTACT : ");			String contact = init.scanner.next();
		for (Member temp : init.members) {
			if (temp != null && temp.id.equals(id) && temp.contact.equals(contact)){
				System.out.println("PW : " + temp.pw + "\n");
				return;
			}
		}
		System.err.println("\n회원 정보가 없습니다.");
	}
	
	public void add_account(int account) {
		for (Member temp : init.members) {
			if (temp != null && temp.pw.equals(pw_chk))
				temp.account = account;
		}
		
	
	}
	


	

	
	
	

}
