package bank_example;

public class Account {
	
	// field
	int account,balance;
	String pw;
	
	// constructor
	public Account() { }
	public Account(int account, int balance, String id) {
		this.account = account;
		this.balance = balance;
		this.pw = Member.pw_chk;
	}
	
	// method
	int account_create(int create_ch) {
		int first = init.random.nextInt(100) + 10;
		int second = init.random.nextInt(10000) + 1000;
		int third = init.random.nextInt(1000) + 100;
		int balance = 0;
		if (create_ch == 1) {
			System.out.print("\n비밀번호를 한번 더 입력하세요 : "); String pw = init.scanner.next();
			if (Member.pw_chk.equals(pw)) {
				int account_num = first * 10000000 + second * 1000 + third; 
				System.out.printf("\n당신의 계좌번호는 : %d - %d - %d 입니다\n",first, second, third);
				Account account = new Account(account_num, balance, pw);
				int i = 0;
				for (Account temp : init.accounts) {
					if (temp == null) {
						init.accounts[i] = account;
						System.out.println("\n계좌생성완료");
						return account_num;
					}
					i++;
				}
			} else if (!Member.pw_chk.equals(pw)){
				System.err.println("\n비밀번호가 틀립니다.\n");
			} else {
				System.err.println("\n잘못된 접근입니다.(1)");
			}
		} else if (create_ch == 2) {
			return 0;
		} else {
			System.err.println("\n잘못된 접근입니다.(2)");
		}
		return account;
	}
	
	void deposit(int account) {
		for (Account temp : init.accounts) {
			if (temp != null && temp.account == account) {
				System.out.print("\n입금할 금액 : ");		int deposit_amount = init.scanner.nextInt();
				temp.balance += deposit_amount;
				Account account2 = new Account(account, deposit_amount, pw);
				if (deposit_amount >= 0) {
					int j = 0;
					for (Account temp2 : init.accounts) {
						if (temp != null && Member.pw_chk.equals(pw)) {
							init.accounts[j] = account2;
							return;
						}
						j++;
					}
				}
				System.out.println("\n입급 완료\n");
				break;
			} else if (temp != null && temp.account != account) {
				System.err.println("\n입력하신 계좌번호와 일치하는 계좌가 없습니다.");
				return;
			} else if (temp == null){
				System.err.println("\n계좌가 존재하지 않습니다.");
				return;
			} else {
				System.err.println("\n잘못된 접근입니다.");
				return;
			}
		}
	}
	
	void payment(int account) {
		for (Account temp : init.accounts) {
			if (temp != null && temp.account == account) {
				System.out.print("\n출금할 금액 : ");		int payment_amount = init.scanner.nextInt();
				temp.balance -= payment_amount;
				Account account2 = new Account(temp.account, payment_amount, pw);
				if (payment_amount >= 0) {
					int i = 0;
					for (Account temp2 : init.accounts) {
						if (temp != null && Member.pw_chk.equals(pw)) {
							init.accounts[i] = account2;
						}
						i++;
					}

				} else if (temp.balance < payment_amount) {
					
				}
				return;
			} else if (temp != null && temp.account != account) {
				System.err.println("\n입력하신 계좌번호와 일치하는 계좌가 없습니다.");
				return;
			} else if (temp == null){
				System.err.println("\n계좌가 존재하지 않습니다.");
				return;
			} else {
				System.err.println("\n잘못된 접근입니다.");
				return;
			}
		}
	}
	
	public void list_account(String pw) {

		System.out.println("\n================================================");
		System.out.println("계좌번호\t\t잔액");
		System.out.println("================================================\n");
		for (Account temp : init.accounts) {
			if (temp != null && Member.pw_chk.equals(pw) && temp.pw.equals(pw)) {
				System.out.println(temp.account + "\t" + temp.balance + "\n");
				System.out.println("================================================\n");
			} else if (temp != null && !Member.pw_chk.equals(pw)) {
				System.err.println("\n비밀번호가 틀립니다.\n");
				return;
			} else if (temp != null){
				System.err.println("\n잘못된 접근입니다.");
				
			} 
			
		}
	}
}


