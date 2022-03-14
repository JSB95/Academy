package Day09;
import java.util.*;




public class Day09_6 {
	
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) { // 종료조건 : 없음
			System.out.println("---------- 계좌 시스템 ----------");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출 선택");
			System.out.print("\n선택 > ");
			int ch = scanner.nextInt();
			// controller method 
			Bank_Controller bank_Controller = new Bank_Controller();
			if (ch == 1) {
				// input
				System.out.println("\n---------- 계좌등록 페이지 ----------\n");
				System.out.print("PW : "); 		String pw = scanner.next();
				System.out.print("NAME : ");	String name = scanner.next();
				System.out.println("\n---------- 은행 선택 ----------\n");
				System.out.print("1. 국민 2. 신한 3. 하나 \n\n선택 > "); int bank_num = scanner.nextInt();
				// controller connect
				String account = bank_Controller.create_account(pw, name, bank_num);
				if (account != null) {
					System.out.println("\n계좌생성 완료\n");
				} else {
					System.err.println("\n계좌생성 실패\n");
				}
			} else if (ch == 2) {
				System.out.println("\n---------- 입금 페이지 ----------");
				System.out.print("계좌번호 : "); 			String account = scanner.next();
				System.out.print("입금액 : ");			int balance = scanner.nextInt();
				boolean result = bank_Controller.deposit(account, balance);
				if (result) {
					System.out.println("\n입금 완료");
				} else {
					System.err.println("\n입금 실패");
				}
			} else if (ch == 3) {
				System.out.println("\n---------- 출금 페이지 ----------");
				System.out.print("계좌번호 : "); 			String account = scanner.next();
				System.out.print("비밀번호 : ");			String pw  = scanner.next();
				System.out.print("출금액 : ");			int balance = scanner.nextInt();
				// 메소드 호출
				int result = bank_Controller.payment(account, balance, pw);
				if (result == 1) {
					System.err.println("\n잔액 부족");
				} else if (result == 2){
					System.out.println("\n출금 성공");
				} else if (result == 3) {
					System.err.println("\n입력하신 정보가 일치하지 않습니다.");
				}
			} else if (ch == 4) {
				System.out.println("\n---------- 이체 페이지 ----------");
				System.out.print("계좌번호 : ");				String account = scanner.next();
				System.out.print("비밀번호 : ");				String pw = scanner.next();
				System.out.print("이체계좌 : ");				String transfer_account = scanner.next();
				System.out.print("이체금액 : ");				int transfer_amount = scanner.nextInt();
				int result = bank_Controller.transfer(account, pw, transfer_account, transfer_amount);
				if (result == 1) {
					System.err.println("\n잔액부족");
				} else if (result == 2) {
					System.out.println("\n이체성공");
				} else if (result == 3) {
					System.err.println("\n받는 계좌 정보가 없습니다.");
				} else if (result == 4) {
					System.err.println("\n보내는 계좌 정보가 없습니다.");
				}
			} else if (ch == 5) {
				System.out.println("---------- 계좌목록 페이지 ----------"); 
				System.out.print("\nNAME : ");	String name = scanner.next();
				Bank[] accoun_list = bank_Controller.account_list(name);
				int i = 1;
				for (Bank temp : accoun_list) {
					if (temp != null) {
						System.out.println("계좌번호 : " + temp.getAccount());
					}
				}
			} else if (ch == 6) {
				System.out.println("\n---------- 대출 페이지 ----------");
			}
		}
	}
	
	
	

}
