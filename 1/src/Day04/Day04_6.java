package Day04;

import java.util.*;

public class Day04_6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();	
		// TODO Auto-generated method stub
		/*
		 * 9칸 칸 생성 => 배열, string,String[] 배열 = new String[9]
		 * 사용자에게 인덱스번호 입력받아 해당 인덱스에 O 표시	
		 * 컴퓨터는 0~8 사이 난수 발생 -> 해당 인덱스에 X 표시
		 * 이미 둔 자리는 재입력/재난수
		 * 승리
		 * 가로, 세로, 대각선 인덱스가 동일 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// 판 만들기
		String[] board = { 	"[ ]", "[ ]", "[ ]",
							"[ ]", "[ ]", "[ ]",
							"[ ]", "[ ]", "[ ]" };
		String win = null;																// 3목 되었을 때 해당알을 저장하는 변수
		
		// 게임 실행
		while(true) {																	// 종료조건 : 9칸 모두 알이 있을 경우 2. 승리자가 나왔을 경우
			for (int i = 0; i <board.length; i++) {
				System.out.print(board[i]);
				if( i%3 == 2) {
					System.out.println("");
				}
			}
		// 1. 사용자
			while (true) {
				System.out.println("위치 선택 : "); int point = scanner.nextInt();			// 사용자 위치 선택
				try {
					if (board[point].equals("[ ]")) {
						board[point] = "[O]";												// 사용자 알 표시
						break;																// 가장 가까운 반복문 탈출
					} else {
						System.err.println("해당 위치에 이미 알이 존재합니다.");
					} 
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("정확한 숫자를 입력하세요.");
				}
			}
		// 2. 컴퓨터
			while (true) {
				int com_number = random.nextInt(9);										// 난수 생성
				if (board[com_number].equals("[ ]")) {
					board[com_number] = "[X]";										 	// 컴퓨터 알 표시
					break;																// 가장 가까운 반복문 탈출
				} else {
					com_number = random.nextInt(9);
				}
			}
			
		// 3. 승리자 판단
			
			// 1. 가로로 이기는 수
			for (int i = 0; i <= 6; i += 3) {
				// i는 0부터 6까지 3씩 증가 -> 0 3 6 -> 3회
				if(board[i].equals(board[i+1]) && board[i+1].equals(board[i+2])) {		// 0 인덱스 == 1 인덱스 그리고 1 인덱스 == 2 인덱스
					win = board[i];
				}
			}
			// 2. 세로로 이기는 수
			for (int i = 0; i <= 2; i++) {
				if(board[i].equals(board[i+3]) && board[i+3].equals(board[i+6])) {
					win = board[i];
				}
			}
			// 3. 대각선으로 이기는 수
			if (board[0].equals(board[4]) && board[4].equals(board[8])) { 
				win = board[0];
			}
			if (board[2].equals(board[4]) && board[4].equals(board[6])) {
				win = board[2];
			}

				
				
		// 4. 게임 종료
			
			if (win.equals("[O]")) {
				System.out.println("사용자 승리");
				break;
			} else if (win.equals("[X]")) {
				System.out.println("컴퓨터 승리");
				break;
			}
		
			
			
			
			
			
			
			
		}
	} // me

} // ce
