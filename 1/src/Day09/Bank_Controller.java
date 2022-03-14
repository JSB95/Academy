package Day09;

import java.util.*;

public class Bank_Controller {	// class
	
	// M : moder [data]
	// V : view [I/O]
	// C : M �� V�� ���� ����
	
	// V���� ��û�ϴ� ����[���] ����
	
	// 1. ���� ���� [C]
	public String create_account (String pw, String name, int bank_num) {
		// 1. �Է¹��� ���� �������� [factor]
			String account = null;
			while (true) {
				// ���¹�ȣ �ڵ� ����
				Random random = new Random();
				// 4�ڸ� 
				int rand = random.nextInt(10000); // 0~9999 ����
				account = String.format("%04d", rand); // %04d : �ڸ����� ������ 0�� �־� ó�� 15 -> 0015
				
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
			
		// 2. ��üȭ [�ټ��� ������ �ϳ��� ��ü�� �����]
			Bank temp = null;
			if (bank_num == 1) {
				temp = new Kookmin(account, pw, name, 0);
			} else if (bank_num == 2) {
				temp = new Shinhan(account, pw, name, 0);
			} else if (bank_num == 3) {
				temp = new Hana(account, pw, name, 0);
			} 
		// 3. �迭�� ����
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
	// 2. �Ա� [U]
	public boolean deposit(String account, int balance) {
		int i = 0;
		// ���¹�ȣ �Է¹���
		// �Է¹��� ���¹�ȣ�� ������
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account)) {
				// �Ա�ó��
				Day09_6.banklist[i].setBalance(temp.getBalance() + balance);
				return true;
			}
			i++;
		}
		return false; // �Է¹��� ���¹�ȣ�� ������
		}
	// 3. ��� [U]
	public int payment(String account, int balance, String pw) {
		int i = 0;
		// ���¹�ȣ �Է¹���
		// �Է¹��� ���¹�ȣ�� 
		// ��й�ȣ�� ��ġ�ϸ� 
		// ���ó�� 
		// �ƴϸ� ��� ����
		// �ƴϸ� ���ݾ׺��� ��ݾ��� ũ�ٸ�
		// ��� ����
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account) && temp.getPw().equals(pw)) {
				// ���ó��
				if (temp.getBalance() < balance) {
					return 1; // �ܾ׺��� �ǹ�
				} else {
					Day09_6.banklist[i].setBalance(temp.getBalance() - balance);
					return 2;
				}
			}
			i++;
		}
		return 3; // ������ ������ �ƴ� ��� ���� �ǹ� ��ȯ
		}
	// 4. ��ü [U]
	public int transfer(String account, String pw, String transfer_account, int transfer_amount) {
		int i = 0;
		for (Bank temp : Day09_6.banklist) {
			if (temp != null && temp.getAccount().equals(account) )
		}
		return 4;
	}
	// 5. �����¸�� [R]
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
	// 6. ���� [R]
	public boolean load() {return false;}

}
