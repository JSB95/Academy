package Day08.gg;

public class Account {
	
	// field

	int balance=0;
	static String account;
	String id;
	
	// constructor
	public Account(int balance, String account) {
		this.balance = balance;
		this.account = account;
	}

	// method
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public static String account_create() {

		int first = Day08_5.random.nextInt(100) + 10;
		int second = Day08_5.random.nextInt(10000) + 1000;
		int third = Day08_5.random.nextInt(1000) + 100;
		System.out.println("계좌를 생성합니다.");
		System.out.printf("당신의 계좌번호는 : %d - %d - %d 입니다.\n",first, second, third);
		long account1;
		account1 = first * 10000000 + second * 1000 + third; 
		account = Long.toString(account1);
		return account;
	}
	


	int receipt() {
		Member member = new Member(id, null, null, null, null, balance);
		System.out.print("\n입금할 금액 : "); int receipt = Day08_5.scanner.nextInt();
		if (receipt >= 0 ) {
			balance = balance + receipt;
			member.balance1 = balance;
			System.out.println(member.balance1);
			System.out.println(balance);
			System.out.println("\n현재 잔액 : " + Day08_5.formatter.format(member.balance1));
			return balance;
		} else {
			System.out.println("\n올바른 금액을 입력하세요.");
			return 0;
		}
	}
	
	void transfer() {
		
	}
	
	void payment() {
		System.out.print("\n출금할 금액 : "); int payment = Day08_5.scanner.nextInt();
		if (payment > balance) {
			System.err.println("\n잔액이 부족합니다.");
			return;
		} else {
			balance -= payment;
			System.out.println("\n현재 잔액 : " + Day08_5.formatter.format(balance));
		}
	}
	
	void list() {
		Member member = new Member();
		System.out.println(member.account1);
	}

}
