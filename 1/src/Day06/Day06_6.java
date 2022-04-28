package Day06;

import java.util.*;

public class Day06_6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 전역변수 선언
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		// 프로그램 실행
		while (true) { // 종료조건 없음
			
			System.out.println("---------- 게시판 ----------");
			System.out.println("번호\t작성자\t제목 ");
			// 배열 내 모든 객체 출력
			int index = 0; // 인덱스 변수
			for (Board temp : boardlist) {
				if (temp != null) {
					System.out.printf("%d\t%s\t%s \n", index, temp.writer, temp.title);
					index++;
				}
			}
			System.out.println("\n1. 글쓰기 2. 글보기");
			System.out.print("\n선택 > ");
			int ch = scanner.nextInt();
			if (ch == 1) { // 1. 글쓰기
				// 4개 변수를 입력받는다
				System.out.println("\n---------- 글쓰기 페이지 ----------");
				System.out.print("제목 : "); 			String title = scanner.next();
				System.out.print("내용 : ");			String content = scanner.next();
				System.out.print("작성자 : ");		String writer = scanner.next();
				System.out.print("비밀번호 : "); 		String password = scanner.next();
				System.out.println("");
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
				System.out.print("\n글번호 선택 > ");
				int board_num = scanner.nextInt();
				System.out.printf("\n작성자 : %s   제목 : %s \n", boardlist[board_num].writer, boardlist[board_num].title); // 반복문 사용 X : 사용할 위치를 입력받았기 때문에
				System.out.printf("\n내용 : %s \n",boardlist[board_num].content);
				System.out.println("\n----------------------------");
				System.out.println("\n1. 목록보기 2. 삭제 3. 수정");
				System.out.print("\n선택 > ");
				int board_num2 = scanner.nextInt();
				if (board_num2 == 1) {
					ch = 1;
				} else if (board_num2 == 2) { 	// 게시글 삭제
					System.out.print("\n비밀번호 : ");
					String pw = scanner.next();
					// 보고있는 게시물을 삭제하는것 -> 반복문 X
					if (boardlist[board_num].password.equals(pw)) {
						boardlist[board_num] = null;
						System.err.println("\n삭제 성공\n");
					} else {
						System.err.println("\n비밀번호 오류\n");
					}
					// 삭제 후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동
						// 해당 코드가 없을 경우 배열 내 공백 발생
					for (int i = board_num; i <= boardlist.length; i++) {
						// 검색된 게시물의 인덱스부터 마지막 인덱스까지 1씩 증가
						boardlist[board_num] = boardlist[board_num+1]; // 삭제된 게시물 다음 인덱스의 게시물
						if (board_num == boardlist.length-1) {
														/* 2번삭제 
														 * 2 -> 3
														 * 3 -> 4
														 * 4 -> 5
														 * 98 -> 99
														 * 99 -> null
														 */
							boardlist[boardlist.length-1] = null;
						}
					}
				} else if (board_num2 == 3) { // 게시글 수정
					System.out.print("\n비밀번호 : ");
					String pw = scanner.next();
					if (boardlist[board_num].password.equals(pw)) {
						System.out.println("\n---------- 수정 페이지 ----------");
						System.out.print("제목 : "); 			boardlist[board_num].title = scanner.next();
						System.out.print("내용 : ");			boardlist[board_num].content = scanner.next();
					} else if (!boardlist[board_num].password.equals(pw)) {
						System.err.println("\n비밀번호 오류");
					}
				} else {
					System.err.println("\n잘못된 접근입니다.\n");
				}
				
			} else {
				System.err.println("\n잘못된 접근입니다.\n");
			}
		} // while end

	} // main end

} // class end
