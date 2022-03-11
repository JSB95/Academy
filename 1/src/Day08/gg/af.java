package Day08.gg;

public class af {

	public static void main(String[] args) {
		int first = Day08_5.random.nextInt(100) + 10;
		int second = Day08_5.random.nextInt(10000) + 1000;
		int third = Day08_5.random.nextInt(1000) + 100;
		long account;
		int balance = 100005548;
		
		
		System.out.println("계좌를 생성하시겠습니까?\n\n1.예 2.아니오");
		System.out.println("\n선택 > "); int create_ch = Day08_5.scanner.nextInt();
		if (create_ch == 1) {
			System.out.printf("당신의 계좌번호는 : %d - %d - %d 입니다.",first,second, third);
			account = first * 10000000 + second * 1000 + third; 
			System.out.println("\n현재 잔액 : " + Day08_5.formatter.format(balance) + "원");
		} else if (create_ch == 2) {
			return;
		} else {
			System.err.println("\n잘못된 접근입니다.");
			return;
		}

	}

}
