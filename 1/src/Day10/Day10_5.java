package Day10;

import java.util.ArrayList;
import java.util.Scanner;


public class Day10_5 {
	
	public static void main(String[] args) {
		
		// 1. ����Ʈ[��ü] ����
		ArrayList<Book> booklist = new ArrayList<>();
		
		// ����ƮŬ����<����Ʈ�ȿ� ������ Ŭ����>
			// <Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
		// ���̴� ���� [�⺻ : 10]
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. ��� 2. ��� 3. ���� 4. ����");
			int ch = scanner.nextInt();
			if (ch == 1) {
				// 1. ���� �Է� �ޱ�
				System.out.print("������ : "); 	String book_name = scanner.next();
				System.out.print("���� : "); 		String writer = scanner.next();
				// 2. ��üȭ [�������� ���� -> 1���� ��ü, ������ ��]
				Book book = new Book(book_name, writer);
				// 3. �迭 ���� (������ ã�Ƽ� ����) -> ����Ʈ ����
				booklist.add(book);
				// .add(��ü��) -> ������ �ε����� �ڵ����� ��ü �߰�
			} else if (ch == 2) {
				System.out.println("������\t����");;
				for (Book book : booklist) {
					System.out.println(book.getBook_name() + "\t" + book.getWriter());
				}
				
			} else if (ch == 3) {
				// 1. �迭 -> ���� �� �� �ε��� ���� 
				System.out.print("������ ������ : "); String book_name = scanner.next();
				for (Book book : booklist) {
					if (book.getBook_name().equals(book_name)) {
						booklist.remove(book);
						break;
					}
				}
				
			} else if (ch == 4) {
				System.out.print("������ ������ : "); String book_name = scanner.next();
				for (Book book : booklist) {
					if (book.getBook_name().equals(book_name)) {
						System.out.print("���� ���� : "); String writer = scanner.next();
						book.setWriter(writer);
					}
				}
			}
		}
	}

}
