package Day10;

import java.util.ArrayList;
import java.util.Scanner;


public class Day10_5 {
	
	public static void main(String[] args) {
		
		// 1. 리스트[객체] 생성
		ArrayList<Book> booklist = new ArrayList<>();
		
		// 리스트클래스<리스트안에 저장할 클래스>
			// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장
		// 길이는 가변 [기본 : 10]
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 등록 2. 목록 3. 삭제 4. 수정");
			int ch = scanner.nextInt();
			if (ch == 1) {
				// 1. 변수 입력 받기
				System.out.print("도서명 : "); 	String book_name = scanner.next();
				System.out.print("저자 : "); 		String writer = scanner.next();
				// 2. 객체화 [여러개의 변수 -> 1개의 객체, 관리가 편리]
				Book book = new Book(book_name, writer);
				// 3. 배열 저장 (공백을 찾아서 저장) -> 리스트 저장
				booklist.add(book);
				// .add(객체명) -> 마지막 인덱스에 자동으로 개체 추가
			} else if (ch == 2) {
				System.out.println("도서명\t저자");;
				for (Book book : booklist) {
					System.out.println(book.getBook_name() + "\t" + book.getWriter());
				}
				
			} else if (ch == 3) {
				// 1. 배열 -> 삭제 후 뒤 인덱스 당기기 
				System.out.print("삭제할 도서명 : "); String book_name = scanner.next();
				for (Book book : booklist) {
					if (book.getBook_name().equals(book_name)) {
						booklist.remove(book);
						break;
					}
				}
				
			} else if (ch == 4) {
				System.out.print("수정할 도서명 : "); String book_name = scanner.next();
				for (Book book : booklist) {
					if (book.getBook_name().equals(book_name)) {
						System.out.print("수정 저자 : "); String writer = scanner.next();
						book.setWriter(writer);
					}
				}
			}
		}
	}

}
