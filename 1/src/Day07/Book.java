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
			System.out.println("\n1. ISBN으로 검색 2. 도서명으로 검색 3. 저자명으로 검색 4. 나가기\n");
			System.out.print("선택 > ");
			int search_ch = Day07_5.scanner.nextInt();
			if (search_ch == 1) {
				System.out.print("ISBN : "); String isbn = Day07_5.scanner.next();
				System.out.println("\nISBN\t도서명\t저자\t상태");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.ISBN.equals(isbn)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여가능\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여불가능\n");
						}
					} 
				}
			} else if (search_ch == 2) {
				System.out.print("도서명 : "); String book_name = Day07_5.scanner.next();
				System.out.println("\nISBN\t도서명\t저자\t상태");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.book_name.equals(book_name)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여가능\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여불가능\n");
						}
					} 
				}
			} else if (search_ch == 3) {
				System.out.print("저자명 : "); String book_writer = Day07_5.scanner.next();
				System.out.println("\nISBN\t도서명\t저자\t상태");
				for (Book temp : Day07_5.books) {
					if (temp != null && temp.book_writer.equals(book_writer)) {
						if (temp != null && temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여가능\n");
						} else if(temp != null && !temp.rental) {
							System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여불가능\n");
						}
					} 
				}
			} else if (search_ch == 4) {
				return;
			} else {
				System.err.println("잘못된 접근입니다.\n");
			}
		}
	}
	
	void list() {
		System.out.println("\nISBN\t도서명\t저자\t상태");
		for (Book temp : Day07_5.books) {
			if (temp != null && temp.rental) {
				System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여가능\n");
			} else if(temp != null && !temp.rental) {
				System.out.println(temp.ISBN + "\t" + temp.book_name + "\t" + temp.book_writer + "\t대여불가능\n");
			}
		}
	}
	
	void rental() {
		
		

	}
	
	void return_() {
		
	}
	
	void regist() {
		System.out.println("\n-------------- 도서등록 --------------\n");
		System.out.print("도서명 : "); String book_name = Day07_5.scanner.next();
		System.out.print("저자명 : "); String book_writer = Day07_5.scanner.next();
		System.out.print("ISBN : "); String isbn = Day07_5.scanner.next();
		
		// ISBN 중복체크
		for (Book temp : Day07_5.books) {
			if (temp != null && temp.ISBN.equals(isbn)) {
				System.err.println("\n현재 사용중인 ISBN입니다.\n");
				return;
			}
		}
		
		// 도서등록
		int i = 0;
		Book book = new Book(isbn, book_name, book_writer, null, true);
		for(Book temp : Day07_5.books) {
			if (temp == null) {
				Day07_5.books[i] = book;
				System.out.println("도서 등록 완료");
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
