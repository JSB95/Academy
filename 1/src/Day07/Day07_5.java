package Day07;

import java.util.Scanner;

public class Day07_5 {	// class start
	
	// main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		// �������� : {���� ����} ��ȣ������ ����� ������ { } ���� ����� ����
		// �������� : ���� �ٸ� { } ��ȣ ������ ����
		// static : ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ����� �޸� �ʱ�ȭ
		//			-> ���α׷� ���������� ��� ���� ���Ǵ� �޸�[����]
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Book[] books = new Book[1000];

	public static void main(String[] args) { // main start
		// static : �޸𸮰� �켱�Ҵ�Ǳ� ������ static �� �޼ҵ�, �ʵ带 ���� ����
		//			-> static �޼ҵ常 ����ȣ�� ����
		
		// �޼ҵ� ȣ��
		// 1. menu() : static void menu
		// 2. �ܺ� ȣ�� : ��ü ����(�޸� �Ҵ�) -> �޼ҵ� ȣ��
		
		Day07_5 day07_5 = new Day07_5();
		day07_5.menu();

	} // main end
	
	void menu() {
		while (true) {	// �������� : ����
			Member member = new Member();	// ��� while�� ������ ����ϱ� ����
			System.out.println("===========================================");
			System.out.println("               ���� �뿩 ���α׷�");
			System.out.println("===========================================\n");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��");
			System.out.print("\n���� > ");
			int menu_ch = scanner.nextInt();
			if (menu_ch == 1) {
				// ȸ������ �޼ҵ� ȣ��
				
				if (member.sign_up()) {
					System.out.println("ȸ������ �Ϸ�\n");
				} else {
					System.err.println("ȸ������ ����\n");
				}
			} else if (menu_ch == 2) {
				// �α��� �޼ҵ� ȣ��
					// 1. �Ϲ�ȸ�� 2. ������
				String result = member.sign_in();
				if (result == null) {
					System.err.println("\n������ ȸ�������� �����ϴ�.\n");
				} else if (result.equals("admin")) {
					System.out.println("\n������ �α��� ����\n");
					menu_admin();
				} else {
					System.out.println("\n�α��� ����\n");
					menu_member();
				}
				
			} else if (menu_ch == 3) {
				// ���̵� ã�� �޼ҵ� ȣ��
				member.id_find();
			} else if (menu_ch == 4) {
				// ��й�ȣ ã�� �޼ҵ� ȣ��
				member.pw_find();
			} else {
				System.err.println("\n�߸��� �����Դϴ�.\n");
			}
		}
	} 	// menu end
	
	void menu_member() {
		while (true) {
			System.out.println("===========================================");
			System.out.println("                    ȸ�� �޴�");
			System.out.println("===========================================\n");
			System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
			System.out.print("\n���� > ");
			int member_ch = scanner.nextInt();
			Book book = new Book();// ������ ȣ���
			if (member_ch == 1) {
				book.search();
			} else if (member_ch == 2) {
				book.list();
			} else if (member_ch == 3) {
				book.rental();
			} else if (member_ch == 4) {
				book.return_();
			} else if (member_ch == 5){
				return;
			} else {
				System.err.println("�߸��� �����Դϴ�.");
			}
		}
		
	}
	
	void menu_admin() {
		while (true) {
			System.out.println("===========================================");
			System.out.println("                   ������ �޴�");
			System.out.println("===========================================\n");
			System.out.println("1. ������� 2. ������� 3. �������� 4. �α׾ƿ�");
			System.out.print("\n���� > ");
			int admin_ch = scanner.nextInt();
			Book book = new Book();
			if (admin_ch == 1) {
				book.regist();
			} else if (admin_ch == 2) {
				book.list();
			} else if (admin_ch == 3) {
				book.delete();
			} else if (admin_ch == 4) {
				return;
			} else {
				System.err.println("�߸��� �����Դϴ�.");
			}
		}
	}

}	// class end
