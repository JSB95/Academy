package Day11.board;

import java.util.Scanner;

public class init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 모든 게시글 출력
		Scanner scanner = new Scanner(System.in); // 예외에 데이터가 저장, while 문 밖이면 데이터가 못빠져나와 무한루프
		Controller.load();
		while (true) {
			try {
				// program title
				
				System.out.println("=========================================================");
				System.out.println("                          게시판");
				System.out.println("=========================================================\n");
				System.out.printf("%s\t%3s\t%10s\t%7s\t%3s\t \n","번호", "제목", "작성자", "작성일", "조회수");
				System.out.println("---------------------------------------------------------");
				int i = 0;
				for (Board temp : Controller.boardlist) {
					System.out.printf("%s\t%3s\t%10s\t%8s\t%3s\t \n\n", " "+i, temp.getTitle(), temp.getWriter(), temp.getDate(), temp.getViewcount());
					i++;
				}
				System.out.println("1. 쓰기 2. 보기\n");
				System.out.print("선택 > "); 
				int ch = scanner.nextInt();
				System.out.println("");
				if (ch == 1) {
					System.out.println("----------------------- 게시물 등록 -----------------------\n");
					scanner.nextLine();
					System.out.print("제목 : "); 				String title = scanner.nextLine();
					System.out.print("내용 : "); 				String content = scanner.nextLine();
					System.out.print("작성자 : ");	 		String writer = scanner.next();
					System.out.print("비밀번호 : ");  			String pw = scanner.next();
					Controller.write(title, content, writer, pw);
					System.out.println("\n게시물 작성 완료\n");
				} else if (ch == 2) {
					System.out.print("게시물 번호 : "); 		int index = scanner.nextInt();
					Board temp = Controller.boardlist.get(index);
					System.out.println("----------------------- 게시물 보기 -----------------------\n");
					System.out.println("제목 : " + temp.getTitle());
					System.out.println("작성자 : " + temp.getWriter());
					System.out.println("내용 : " + temp.getContent());
					System.out.println("\n1. 뒤로가기 2. 수정 3. 삭제 4. 댓글쓰기");
					System.out.print("\n선택 > "); int ch2 = scanner.nextInt();
					if (ch2 == 1) {
						
					} else if (ch2 == 2) {
						System.out.print("비밀번호 : ");  		String pw = scanner.next();
						scanner.nextLine();
						System.out.print("수정할 제목 : ");  	String title = scanner.next();
						System.out.print("수정할 내용 : "); 	String content = scanner.next();
						boolean result = Controller.update(index, pw, title, content);
						if (result) {
							System.out.println("\n수정 성공\n");
						} else {
							System.err.println("\n비밀번호가 다릅니다.\n");
						}
					} else if (ch2 == 3) {
						System.out.print("비밀번호 : "); 	String pw = scanner.next();
						boolean result = Controller.delete(index, pw);
						if (result) {
							System.err.println("\n삭제 성공\n");
						} else {
							System.err.println("\n비밀번호가 다릅니다.\n");
						}
					} else if (ch2 == 4) {
						Controller.replywrite();
					} else {
						
					}
				} else {
					
				}
			} catch (Exception e) {
				System.err.println("번호를 입력하세요.\n" + e);
				scanner = new Scanner(System.in);
			}
		}

	}

}
