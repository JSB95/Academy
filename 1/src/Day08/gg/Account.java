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
		System.out.println("���¸� �����մϴ�.");
		System.out.printf("����� ���¹�ȣ�� : %d - %d - %d �Դϴ�.\n",first, second, third);
		long account1;
		account1 = first * 10000000 + second * 1000 + third; 
		account = Long.toString(account1);
		return account;
	}
	


	int receipt() {
		Member member = new Member(id, null, null, null, null, balance);
		System.out.print("\n�Ա��� �ݾ� : "); int receipt = Day08_5.scanner.nextInt();
		if (receipt >= 0 ) {
			balance = balance + receipt;
			member.balance1 = balance;
			System.out.println(member.balance1);
			System.out.println(balance);
			System.out.println("\n���� �ܾ� : " + Day08_5.formatter.format(member.balance1));
			return balance;
		} else {
			System.out.println("\n�ùٸ� �ݾ��� �Է��ϼ���.");
			return 0;
		}
	}
	
	void transfer() {
		
	}
	
	void payment() {
		System.out.print("\n����� �ݾ� : "); int payment = Day08_5.scanner.nextInt();
		if (payment > balance) {
			System.err.println("\n�ܾ��� �����մϴ�.");
			return;
		} else {
			balance -= payment;
			System.out.println("\n���� �ܾ� : " + Day08_5.formatter.format(balance));
		}
	}
	
	void list() {
		Member member = new Member();
		System.out.println(member.account1);
	}

}
