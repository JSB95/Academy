package Day11.board;

import java.util.Scanner;

public class init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��� �Խñ� ���
		Scanner scanner = new Scanner(System.in); // ���ܿ� �����Ͱ� ����, while �� ���̸� �����Ͱ� ���������� ���ѷ���
		Controller.load();
		while (true) {
			try {
				// program title
				
				System.out.println("=========================================================");
				System.out.println("                          �Խ���");
				System.out.println("=========================================================\n");
				System.out.printf("%s\t%3s\t%10s\t%7s\t%3s\t \n","��ȣ", "����", "�ۼ���", "�ۼ���", "��ȸ��");
				System.out.println("---------------------------------------------------------");
				int i = 0;
				for (Board temp : Controller.boardlist) {
					System.out.printf("%s\t%3s\t%10s\t%8s\t%3s\t \n\n", " "+i, temp.getTitle(), temp.getWriter(), temp.getDate(), temp.getViewcount());
					i++;
				}
				System.out.println("1. ���� 2. ����\n");
				System.out.print("���� > "); 
				int ch = scanner.nextInt();
				System.out.println("");
				if (ch == 1) {
					System.out.println("----------------------- �Խù� ��� -----------------------\n");
					scanner.nextLine();
					System.out.print("���� : "); 				String title = scanner.nextLine();
					System.out.print("���� : "); 				String content = scanner.nextLine();
					System.out.print("�ۼ��� : ");	 		String writer = scanner.next();
					System.out.print("��й�ȣ : ");  			String pw = scanner.next();
					Controller.write(title, content, writer, pw);
					System.out.println("\n�Խù� �ۼ� �Ϸ�\n");
				} else if (ch == 2) {
					System.out.print("�Խù� ��ȣ : "); 		int index = scanner.nextInt();
					Board temp = Controller.boardlist.get(index);
					System.out.println("----------------------- �Խù� ���� -----------------------\n");
					System.out.println("���� : " + temp.getTitle());
					System.out.println("�ۼ��� : " + temp.getWriter());
					System.out.println("���� : " + temp.getContent());
					System.out.println("\n1. �ڷΰ��� 2. ���� 3. ���� 4. ��۾���");
					System.out.print("\n���� > "); int ch2 = scanner.nextInt();
					if (ch2 == 1) {
						
					} else if (ch2 == 2) {
						System.out.print("��й�ȣ : ");  		String pw = scanner.next();
						scanner.nextLine();
						System.out.print("������ ���� : ");  	String title = scanner.next();
						System.out.print("������ ���� : "); 	String content = scanner.next();
						boolean result = Controller.update(index, pw, title, content);
						if (result) {
							System.out.println("\n���� ����\n");
						} else {
							System.err.println("\n��й�ȣ�� �ٸ��ϴ�.\n");
						}
					} else if (ch2 == 3) {
						System.out.print("��й�ȣ : "); 	String pw = scanner.next();
						boolean result = Controller.delete(index, pw);
						if (result) {
							System.err.println("\n���� ����\n");
						} else {
							System.err.println("\n��й�ȣ�� �ٸ��ϴ�.\n");
						}
					} else if (ch2 == 4) {
						Controller.replywrite();
					} else {
						
					}
				} else {
					
				}
			} catch (Exception e) {
				System.err.println("��ȣ�� �Է��ϼ���.\n" + e);
				scanner = new Scanner(System.in);
			}
		}

	}

}
