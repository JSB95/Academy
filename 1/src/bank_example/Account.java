package bank_example;

public class Account {
	
	// field
	int account,balance = 0;
	String id = Member.id;
	
	// constructor
	public Account() { }
	public Account(int account, int balance, String id) {
		this.account = account;
		this.balance = balance;
		this.id = id;
	}
	
	// method
	int account_create() {
		int balance  = 0;
		int first = init.random.nextInt(100) + 10;
		int second = init.random.nextInt(10000) + 1000;
		int third = init.random.nextInt(1000) + 100;
		System.out.println("���¸� �����Ͻðڽ��ϱ�?\n\n1.�� 2.�ƴϿ�");
		System.out.print("\n���� > "); int create_ch = init.scanner.nextInt();
		if (create_ch == 1) {
			int account_num = first * 10000000 + second * 1000 + third; 
			Account account = new Account(account_num, balance, id);
			int i = 0;
			for (Account temp : init.accounts) {
				if (temp == null) {
					init.accounts[i] = account;
					System.out.println("ID : " + id);
					System.out.printf("����� ���¹�ȣ�� : %d - %d - %d �Դϴ�\n",first,second, third);
					return account_num;
				}
				i++;
			}
		} else if (create_ch == 2) {
			return 0;
		} else {
			System.err.println("\n�߸��� �����Դϴ�.");
			return 0;
		}
		return 0;
	}
	
	void account_add() {
		Account account = new Account();
		int i = 0;
		for (Account temp : init.accounts) {
			if (temp == null) {
				init.accounts[i] = account;
			}
		}
		
	}

	

}
