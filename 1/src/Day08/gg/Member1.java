//package Day08.gg;
//
//public class Member1 {
//	
//	// field
//	String account1;
//	String id;
//	String pw;
//	String name;
//	String contact;
//	int balance1;
//
//	
//	// constructor
//	public Member1() { };
//	public Member1(String account1, String id, String pw, String name, String contact,int balance1) {
//		this.account1 = account1;
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.contact = contact;
//		this.balance1 = balance1;
//
//	}
//	
//	// method
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getpw() {
//		return pw;
//	}
//	public void setpw(String pw) {
//		this.pw = pw;
//	}
//	public String getContact() {
//		return contact;
//	}
//	public void setcontact(String contact) {
//		this.contact = contact;
//	}
//	
//		//회원가입
//	public boolean addMember() {
//		System.out.print("ID : "); 			String id = Day08_5.scanner.next();
//			//중복확인
//		System.out.print("PASSWORD : "); 	String pw = Day08_5.scanner.next();
//		System.out.print("NAME: ");			String name = Day08_5.scanner.next();
//		System.out.print("휴대폰번호 입력: ");	String contact = Day08_5.scanner.next();
//		Member1 member = new Member1(account1, name,id,pw,contact,balance1);
//		int i = 0;
//		for(Member1 temp : Day08_5.members) {
//			if(temp == null) {
//				Day08_5.members[i]=member;
//				return true;
//			}
//			i++;
//		}
//	return false;
//	}
//	
//		//로그인
//	public boolean login() {
//		System.out.print("ID :  ");			String id = Day08_5.scanner.next();
//		System.out.print("PASSWORD :  ");	String pw = Day08_5.scanner.next();
//		for(Member1 temp : Day08_5.members) {
//			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	//아이디찾기
//	public void idCheck() {
//		System.out.print("NAME : ");		String name = Day08_5.scanner.next();
//		System.out.print("PASSWORD : ");	String pw = Day08_5.scanner.next();
//		System.out.print("CONTACT : ");		String contact = Day08_5.scanner.next();
//		for(Member1 temp : Day08_5.members) {
//			if(temp != null && temp.name.equals(name) && temp.pw.equals(pw) && temp.contact.equals(contact)) {
//				System.out.println("ID : "+temp.id);
//			}
//		}
//	}
//	
//	//비번찾기
//	public void pwCheck() {
//		System.out.print("NAME : ");		String name = Day08_5.scanner.next();
//		System.out.print("ID :  ");			String id = Day08_5.scanner.next();
//		System.out.print("CONTACT : ");		String contact = Day08_5.scanner.next();
//		for(Member1 temp : Day08_5.members) {
//			if(temp != null && temp.name.equals(name) && temp.id.equals(id) && temp.contact.equals(contact)) {
//				System.out.println("PASSWORD : "+ temp.pw);
//			}
//		}
//	}
//	
//	public void addAccount() {
//		account1 = Account.account_create();
//		Member1 member = new Member1(account1, id, pw, name, contact, balance1);
//		int i = 0;
//		for (Member1 temp : Day08_5.members) {
//			if (temp == null) {
//				Day08_5.members[i] = member;
//			}
//		}
//	}
//	
//
//
//}
