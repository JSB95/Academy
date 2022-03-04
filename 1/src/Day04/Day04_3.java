package Day04;

import java.util.*;

@SuppressWarnings("unused")
public class Day04_3 {	// class start

	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 가위바위보 
		 * 가위0 바위1 보2 종료3 입력받기
		 * 컴퓨터 난수
		 * 승리자 판단
		 * 종료시
		 * 총게임수
		 * 최종승리자 승리 패배 무승부 컴퓨터 승리 수 사용자 승리 수
		 */
		
		// 변수 생성
		
		int user;																	// 사용자가 선택한 수 저장
		int com;																	// 컴퓨터의 난수 저장
		int game = 0;																	// 게임 수
		int user_win = 0;																// 사용자 승리 수
		int com_win = 0;																// 컴퓨터 승리 수
		
		// 프로그램 실행
		
		while (true) {																// 프로그램 실행[무한루프 종료조건 : 3번 입력시]
			System.out.println("---------가위바위보---------");
			System.out.println("가위[0] 바위[1] 보[2] 종료[3]");
			System.out.println("-------------------------");
			System.out.print("선택하세요 : ");
			System.out.println("");
			user = scanner.nextInt();												// 사용자 수 입력받기
			
			Random random = new Random();											// 난수 객체 선언
			com = random.nextInt(3);												// 난수를 integer로 가져오기 ()안 숫자-1까지 범위, 없으면 +- 20억, 연산가능 (random.nextInt(10) + 10)
			
			
			if ((user == 0 && com ==2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
				System.out.println("컴퓨터가 낸 수: " + com + "\n");
				System.out.println("당신이 이겼습니다.\n");
				user_win++;
				game++;
			} else if ((user == 0 && com == 0) || (user == 1 && com == 1) || (user == 2 && com == 2)) {
				System.out.println("컴퓨터가 낸 수: " + com + "\n");
				System.out.println("비겼습니다.\n");
				game++;
			} else if ((user == 2 && com == 0) || (user == 0 && com == 1) || (user == 1 && com == 2)) {
				System.out.println("컴퓨터가 낸 수: " + com + "\n");
				System.out.println("컴퓨터가 이겼습니다.\n");
				com_win++;
				game++;
			} else if (user == 3) {
				System.out.println("총 게임 수: " + game);
				System.out.println("사용자 승리 수 : " + user_win);
				System.out.println("컴퓨터 승리 수 : " + com_win);
				if (user_win > com_win) {
					System.out.println("최종승리 : 사용자\n");
				} else if (user_win == com_win) {
					System.out.println("무승부 입니다.\n");
				} else {
					System.out.println("최종승리 : 컴퓨터\n");
				}
				game = 0;
				user_win = 0;
				com_win = 0;
			} else {
				System.out.println("잘못된 번호입니다.\n");
			}
			
		}

	} // main end

} // class end
