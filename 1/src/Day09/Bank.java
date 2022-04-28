package Day09;

public class Bank {
	
	// field
	private String account;
	private String pw;
	private String name;
	private int balance;
	
	// constructor
	public Bank() { }
	public Bank(String account, String pw, String name, int balance) {
		super();
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = balance;
	}
	
	// method -> get /set : field = private
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
