package Day08.gg;

public class af {

	public static void main(String[] args) {
		int first = Day08_5.random.nextInt(100) + 10;
		int second = Day08_5.random.nextInt(10000) + 1000;
		int third = Day08_5.random.nextInt(1000) + 100;
		long account;
		int balance = 100005548;
		
		
		System.out.println("���¸� �����Ͻðڽ��ϱ�?\n\n1.�� 2.�ƴϿ�");
		System.out.println("\n���� > "); int create_ch = Day08_5.scanner.nextInt();
		if (create_ch == 1) {
			System.out.printf("����� ���¹�ȣ�� : %d - %d - %d �Դϴ�.",first,second, third);
			account = first * 10000000 + second * 1000 + third; 
			System.out.println("\n���� �ܾ� : " + Day08_5.formatter.format(balance) + "��");
		} else if (create_ch == 2) {
			return;
		} else {
			System.err.println("\n�߸��� �����Դϴ�.");
			return;
		}

	}

}
