package Day08.gg;

public class Account {
	
	// field
	int first = Day08_5.random.nextInt(100) + 10;
	int second = Day08_5.random.nextInt(1000000) + 100000;
	int third = Day08_5.random.nextInt(100000) + 10000;
	int balance = 0;
	long account;
	
	// constructor
	public Account(int first, int second, int third, int balance, long account) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.balance = balance;
		this.account = account;
	}

	// method
	
	public long account_create() {
		System.out.println("���¸� �����մϴ�.");
		System.out.printf("����� ���¹�ȣ�� : %d - %d - %d �Դϴ�.",first, second, third);
		account = first * 10000000 + second * 1000 + third; 
		return account;
	}
	


	void receipt() {
		System.out.print("\n�Ա��� �ݾ� : "); int receipt = Day08_5.scanner.nextInt();
		if (receipt >= 0 ) {
			balance += receipt;
			System.out.println("\n���� �ܾ� : " + Day08_5.formatter.format(balance));
			return;
		} else {
			System.out.println("\n�ùٸ� �ݾ��� �Է��ϼ���.");
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
			return;
		}
	}

}
