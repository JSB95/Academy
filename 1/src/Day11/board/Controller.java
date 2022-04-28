package Day11.board;

import java.io.*;
import java.util.ArrayList;

public class Controller {
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	
	// 모든 메소드는 static
	
	// 1. 목록 메소드
	
	// 2. 쓰기 메소드
	public static void write(String title, String content, String writer, String pw) {
		// 객체화 -> 변수 여러개 -> 객체 1개로 관리
		Board board  = new Board(title, content, writer, pw);
		
		// 리스트에 저장
		boardlist.add(board);
		
		// 파일에 저장
		save();
			
	}
	
	// 3. 보기 메소드
	public static void view() {
		
	}
	
	// 4. 수정 메소드
	public static boolean update(int index, String pw, String title, String content) {
		if (pw.equals(boardlist.get(index).getPw())) {
			boardlist.get(index).setTitle(title);
			boardlist.get(index).setContent(content);
			save();
			return true;
		} else {
			return false;
		}
		
		
		
	}
	
	// 5. 삭제 메소드
	public static boolean delete(int index, String pw) {
		if (pw.equals(boardlist.get(index).getPw())){
			boardlist.remove(index);
			save();
			return true;
		} else {
			return false;
		}
		
	}
	
	// 6. 댓글 쓰기 메소드
	public static void replywrite() {
		
	}
	
	// 7. 게시물 저장 메소드
	public static void save() {
		// 리스트내 모든 게시물을 파일에 저장
		try {
			// 파일 출력 클래스
			FileOutputStream fileOutputStream = new FileOutputStream("D:/java/1/board_backup.txt");
			// 파일에 작성할 내용 [한줄씩]
			for (Board board : boardlist) {
				String content = board.getTitle() + "," + board.getContent()+ "," + board.getWriter() + "," + board.getPw() + "," + board.getViewcount() + "," +  board.getDate() + "\n"; 	// 공백 넣지 않기
				// 내용[문자열] -> 바이트열 변환 -> 내보내기 [write()]
				fileOutputStream.write(content.getBytes());
			}
			
		} catch (IOException e) {
			System.err.println("\n파일 저장 실패\n");
		}
		
	}
	
	// 8. 게시물 불러오기 메소드
	public static void load() {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/1/board_backup.txt");
			// 바이트 배열 선언
			byte[] bs = new byte[1000];
			// 모든 바이트 읽어와서 바이트에 저장
			fileInputStream.read(bs);
			// 바이트 -> 문자열 변환
			String file = new String(bs);
			// 문자열 자르기 (한줄씩[\n] -> 1개 객체)
			String[] boards = file.split("\n");
			// 문자열 자르기 (한줄[,] -> 1개 필드)
			int i = 0;
			for (String temp : boards) {
				if (i+1 == boards.length) break;
				String[] field = temp.split(",");
				Board board = new Board(field[0], field[1], field[2], field[3], Integer.parseInt(field[4]), field[5], null);
				boardlist.add(board);
				i++;
			}
			
		} catch (NumberFormatException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
