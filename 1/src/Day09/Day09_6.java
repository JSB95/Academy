package Day09;
import java.util.*;




public class Day09_6 {
	
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) { // �������� : ����
			System.out.println("---------- ���� �ý��� ----------");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ���� ����");
			System.out.print("\n���� > ");
			int ch = scanner.nextInt();
			// controller method 
			Bank_Controller bank_Controller = new Bank_Controller();
			if (ch == 1) {
				// input
				System.out.println("\n---------- ���µ�� ������ ----------\n");
				System.out.print("PW : "); 		String pw = scanner.next();
				System.out.print("NAME : ");	String name = scanner.next();
				System.out.println("\n---------- ���� ���� ----------\n");
				System.out.print("1. ���� 2. ���� 3. �ϳ� \n\n���� > "); int bank_num = scanner.nextInt();
				// controller connect
				String account = bank_Controller.create_account(pw, name, bank_num);
				if (account != null) {
					System.out.println("\n���»��� �Ϸ�\n");
				} else {
					System.err.println("\n���»��� ����\n");
				}
			} else if (ch == 2) {
				System.out.println("\n---------- �Ա� ������ ----------");
				System.out.print("���¹�ȣ : "); 			String account = scanner.next();
				System.out.print("�Աݾ� : ");			int balance = scanner.nextInt();
				boolean result = bank_Controller.deposit(account, balance);
				if (result) {
					System.out.println("\n�Ա� �Ϸ�");
				} else {
					System.err.println("\n�Ա� ����");
				}
			} else if (ch == 3) {
				System.out.println("\n---------- ��� ������ ----------");
				System.out.print("���¹�ȣ : "); 			String account = scanner.next();
				System.out.print("��й�ȣ : ");			String pw  = scanner.next();
				System.out.print("��ݾ� : ");			int balance = scanner.nextInt();
				// �޼ҵ� ȣ��
				int result = bank_Controller.payment(account, balance, pw);
				if (result == 1) {
					System.err.println("\n�ܾ� ����");
				} else if (result == 2){
					System.out.println("\n��� ����");
				} else if (result == 3) {
					System.err.println("\n�Է��Ͻ� ������ ��ġ���� �ʽ��ϴ�.");
				}
			} else if (ch == 4) {
				System.out.println("\n---------- ��ü ������ ----------");
				System.out.print("���¹�ȣ : ");				String account = scanner.next();
				System.out.print("��й�ȣ : ");				String pw = scanner.next();
				System.out.print("��ü���� : ");				String transfer_account = scanner.next();
				System.out.print("��ü�ݾ� : ");				int transfer_amount = scanner.nextInt();
				int result = bank_Controller.transfer(account, pw, transfer_account, transfer_amount);
				if (result == 1) {
					System.err.println("\n�ܾ׺���");
				} else if (result == 2) {
					System.out.println("\n��ü����");
				} else if (result == 3) {
					System.err.println("\n�޴� ���� ������ �����ϴ�.");
				} else if (result == 4) {
					System.err.println("\n������ ���� ������ �����ϴ�.");
				}
			} else if (ch == 5) {
				System.out.println("---------- ���¸�� ������ ----------"); 
				System.out.print("\nNAME : ");	String name = scanner.next();
				Bank[] accoun_list = bank_Controller.account_list(name);
				int i = 1;
				for (Bank temp : accoun_list) {
					if (temp != null) {
						System.out.println("���¹�ȣ : " + temp.getAccount());
					}
				}
			} else if (ch == 6) {
				System.out.println("\n---------- ���� ������ ----------");
			}
		}
	}
	
	
	

}
