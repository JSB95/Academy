package Day06;

import java.util.*;

public class Day06_6 {

	public static void main(String[] args) {

		// 전역변수 선언
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		// 프로그램 실행
		while (true) { // 종료조건 없음
			
			System.out.println("---------- 게시판 ----------");
			System.out.println("번호\t작성자\t제목");
			// 배열 내 모든 객체 출력
			int index = 0; // 인덱스 변수
			for (Board temp : boardlist) {
				if (temp != null) {
					System.out.printf("%d\t%s\t%s", index, temp.writer, temp.title);
					index++;
				}
			}
			System.out.println("1. 글쓰기 2. 글보기");
			int ch = scanner.nextInt();
			if (ch == 1) { // 1. 글쓰기
				// 4개 변수를 입력받는다
				System.out.println("---------- 글쓰기 페이지 ----------");
				System.out.print("제목 : "); 			String title = scanner.next();
				System.out.print("내용 : ");			String content = scanner.next();
				System.out.print("작성자 : ");		String writer = scanner.next();
				System.out.print("비밀번호 : "); 		String password = scanner.next();
				// 4개 변수를 객체화 [객체를 만들어서 4개변수를 객체 내 필드에 저장]
				Board board = new Board(title, content, writer, password);
				int i = 0;
				// 배열 내 빈공간을 찾아서 빈공간에 객체 대입
				for (Board temp : boardlist) {
					if (temp == null) {					// 빈공간이라면
						boardlist[i] = board;			// 해당 인덱스에 새로운 객체 저장
						break;							// 한번 저장했으면 반복문 종료
					}
					i++;
				}
			} else if (ch == 2) {
				
			} else {
				
			}
		}

	}

}
