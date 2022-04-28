package Day07;

import javax.xml.transform.Templates;

public class Book {
	
	// field
	String ISBN, book_name, book_writer, mid;
	boolean rental;
	int rental_count;
	
	// constructor
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String iSBN, String book_name, String book_writer, String mid, boolean rental) {
		ISBN = iSBN;
		this.book_name = book_name;
		this.book_writer = book_writer;
		this.mid = mid;
		this.rental = rental;
	}
	
	// method
	void search() {
		while (true) {
			System.out.println("\n1. ISBN���� �˻� 2. ���������� �˻� 3. ���ڸ����� �˻� 4. ������\n");
			System.out.print("���� > ");
			int search_ch = Day07_5.scanner.nextInt();
			if (search_ch == 1) {
				System.out.print("ISBN : "); String isbn = Day07_5.scanner.next();
				System.out.println("\nISBN\t������\t����\t����");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.ISBN.equals(isbn)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩����\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩�Ұ���\n");
						}
					} 
				}
			} else if (search_ch == 2) {
				System.out.print("������ : "); String book_name = Day07_5.scanner.next();
				System.out.println("\nISBN\t������\t����\t����");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.book_name.equals(book_name)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩����\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩�Ұ���\n");
						}
					} 
				}
			} else if (search_ch == 3) {
				System.out.print("���ڸ� : "); String book_writer = Day07_5.scanner.next();
				System.out.println("\nISBN\t������\t����\t����");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.book_writer.equals(book_writer)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩����\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩�Ұ���\n");
						}
					} 
				}
			} else if (search_ch == 4) {
				return;
			} else {
				System.err.println("�߸��� �����Դϴ�.\n");
			}
		}
	}
	
	void list() {
		System.out.println("\nISBN\t������\t����\t����");
		for (Book temp : Day07_5.books) {
			if (temp != null && temp.rental) {
				System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩����\n");
			} else if(temp != null && !temp.rental) {
				System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t�뿩�Ұ���\n");
			}
		}
	}
	
	void rental() {
		
		

	}
	
	void return_() {
		
	}
	
	void regist() {
		System.out.println("\n-------------- ������� --------------\n");
		System.out.print("������ : "); String book_name = Day07_5.scanner.next();
		System.out.print("���ڸ� : "); String book_writer = Day07_5.scanner.next();
		System.out.print("ISBN : "); String isbn = Day07_5.scanner.next();
		
		// ISBN �ߺ�üũ
		for (Book temp : Day07_5.books) {
			if (temp != null && temp.ISBN.equals(isbn)) {
				System.err.println("\n���� ������� ISBN�Դϴ�.\n");
				return;
			}
		}
		
		// �������
		int i = 0;
		Book book = new Book(isbn, book_name, book_writer, null, true);
		for(Book temp : Day07_5.books) {
			if (temp == null) {
				Day07_5.books[i] = book;
				System.out.println("���� ��� �Ϸ�");
				return;
			}
			i++;
		}
		
	}
	
	private Book book(String regist, String book_writer2, String isbn2) {
		// TODO Auto-generated method stub
		return null;
	}
	void delete() {
		
	}
	

}
