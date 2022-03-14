package Day09;

import java.util.*;

public class Bank_Controller {	// class
	
	// M : moder [data]
	// V : view [I/O]
	// C : M 과 V의 연결 연할
	
	// V에서 요청하는 서비스[기능] 제공
	
	// 1. 계좌 생성 [C]
	public String create_account (String pw, String name, int bank_num) {
		// 1. 입력받은 값을 가져오기 [factor]
			String account = null;
			while (true) {
				// 계좌번호 자동 생성
				Random random = new Random();
				// 4자리 
				int rand = random.nextInt(10000); // 0~9999 사이
				account = String.format("%04d", rand); // %04d : 자릿수가 없으면 0을 넣어 처리 15 -> 0015
				
				// duplication check
				boolean duplication = false;
				for (Bank temp2 : Day09_6.banklist) {
					if (temp2 != null && temp2.getAccount().equals(account)) {
						duplication = true;
					}
				}
				if (duplication == false) {
					break;
				}
			}
			
		// 2. 객체화 [다수의 변수를 하나의 객체로 만들기]
			Bank temp = null;
			if (bank_num == 1) {
				temp = new Kookmin(account, pw, name, 0);
			} else if (bank_num == 2) {
				temp = new Shinhan(account, pw, name, 0);
			} else if (bank_num == 3) {
				temp = new Hana(account, pw, name, 0);
			} 
		// 3. 배열에 저장
			int i = 0;
			for (Bank temp2 : Day09_6.banklist) {
				if (temp2 == null) {
					Day09_6.banklist[i] = temp;
					return account;
				}
				i++;
			}
			return null;
	}
	// 2. 입금 [U]
	public boolean deposit(String account, int balance) {
		int i = 0;
		// 계좌번호 입력받음
		// 입력받은 계좌번호가 있으면
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account)) {
				// 입금처리
				Day09_6.banklist[i].setBalance(temp.getBalance() + balance);
				return true;
			}
			i++;
		}
		return false; // 입력받은 계좌번호가 없으면
		}
	// 3. 출금 [U]
	public int payment(String account, int balance, String pw) {
		int i = 0;
		// 계좌번호 입력받음
		// 입력받은 계좌번호와 
		// 비밀번호가 일치하면 
		// 출금처리 
		// 아니면 출금 실패
		// 아니면 예금액보다 출금액이 크다면
		// 출금 실패
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account) && temp.getPw().equals(pw)) {
				// 출금처리
				if (temp.getBalance() < balance) {
					return 1; // 잔액부족 의미
				} else {
					Day09_6.banklist[i].setBalance(temp.getBalance() - balance);
					return 2;
				}
			}
			i++;
		}
		return 3; // 동일한 정보가 아닐 경우 실패 의미 반환
		}
	// 4. 이체 [U]
	public int transfer(String account, String pw, String transfer_account, int transfer_amount) {
		int i = 0;
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account) )
		}
		return 4;
	}
	// 5. 내계좌목록 [R]
	public Bank[] account_list(String name) { // factor : extra data
		Bank[] account_list = new Bank[100];
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getName().equals(name)) {
				int i = 0;
				for (Bank temp2 : account_list) {
					if (temp2 == null) {
						account_list[i] = temp; break;
					}
					i++;
				}
			}
		}
		return account_list;
	}
	// 6. 대출 [R]
	public boolean load() {return false;}

}
