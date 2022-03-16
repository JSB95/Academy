package Day11.board;

import java.io.*;
import java.util.ArrayList;

public class Controller {
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	
	// ��� �޼ҵ�� static
	
	// 1. ��� �޼ҵ�
	
	// 2. ���� �޼ҵ�
	public static void write(String title, String content, String writer, String pw) {
		// ��üȭ -> ���� ������ -> ��ü 1���� ����
		Board board  = new Board(title, content, writer, pw);
		
		// ����Ʈ�� ����
		boardlist.add(board);
		
		// ���Ͽ� ����
		save();
			
	}
	
	// 3. ���� �޼ҵ�
	public static void view() {
		
	}
	
	// 4. ���� �޼ҵ�
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
	
	// 5. ���� �޼ҵ�
	public static boolean delete(int index, String pw) {
		if (pw.equals(boardlist.get(index).getPw())){
			boardlist.remove(index);
			save();
			return true;
		} else {
			return false;
		}
		
	}
	
	// 6. ��� ���� �޼ҵ�
	public static void replywrite() {
		
	}
	
	// 7. �Խù� ���� �޼ҵ�
	public static void save() {
		// ����Ʈ�� ��� �Խù��� ���Ͽ� ����
		try {
			// ���� ��� Ŭ����
			FileOutputStream fileOutputStream = new FileOutputStream("D:/java/1/board_backup.txt");
			// ���Ͽ� �ۼ��� ���� [���پ�]
			for (Board board : boardlist) {
				String content = board.getTitle() + "," + board.getContent()+ "," + board.getWriter() + "," + board.getPw() + "," + board.getViewcount() + "," +  board.getDate() + "\n"; 	// ���� ���� �ʱ�
				// ����[���ڿ�] -> ����Ʈ�� ��ȯ -> �������� [write()]
				fileOutputStream.write(content.getBytes());
			}
			
		} catch (IOException e) {
			System.err.println("\n���� ���� ����\n");
		}
		
	}
	
	// 8. �Խù� �ҷ����� �޼ҵ�
	public static void load() {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/1/board_backup.txt");
			// ����Ʈ �迭 ����
			byte[] bs = new byte[1000];
			// ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
			fileInputStream.read(bs);
			// ����Ʈ -> ���ڿ� ��ȯ
			String file = new String(bs);
			// ���ڿ� �ڸ��� (���پ�[\n] -> 1�� ��ü)
			String[] boards = file.split("\n");
			// ���ڿ� �ڸ��� (����[,] -> 1�� �ʵ�)
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
