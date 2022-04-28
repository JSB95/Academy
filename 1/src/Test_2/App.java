package Test_2;

import java.util.*;
import java.text.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd  HH:mm",Locale.KOREA);
		Date date0 = new Date();
		String current_time = format.format(date0);
		
		try {												// 예외처리
			while (true) {									// 무한루프 (주차 현황표 항상 출력)
				System.out.println("--------------------------------------------- 주차 현황 표 --------------------------------------------\n");
				System.out.println("현재시간 : " + current_time + "\n");	// 현재시간 표시
				System.out.println("날짜\t\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");		// 머리
				
				Controller.print();						// 현황표 출력
				
				System.out.println("\n1. 입차 2. 출차\n");
				System.out.print("\n선택 > ");		int ch = scanner.nextInt();
				// 1 -> 입차 2 -> 출차 분기
				if (ch == 1) {
					System.out.print("\n차량번호 : "); String car_num = scanner.next();	// 차량번호 입력받기
					System.out.println("");
					int result = Controller.validation(car_num); 			// 유효성 검사 실행
					if (result == 0) {										// 유효성 검사 통과 시
						boolean chk = Controller.dupliaction(car_num);		// 중복검사 실행
						if (chk) {											// 중복검사 통과시
							Controller.entrance(car_num);					// 입차 진행
						} else {											// 중복검사 통과 못할 시
							System.err.println("\n중복된 차량 번호입니다.\n");
						}
					} else if (result == 1) {								// 유효성 검사 통과 못할 시
						System.err.println("\n정확한 차량 번호를 입력하세요.\n");
					} else {
						System.err.println("\n잘못된 접근입니다.\n");
					}
				} else if (ch == 2) {	// 출차
					System.out.print("차량 번호 : ");		String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);			// 유효성 검사 실행
					if (result == 0) {
						Controller.exit(car_num);	// 통과 시 출차 진행
					} else if (result == 1) {
						System.err.println("\n정확한 차량 번호를 입력하세요.\n");
					} else {
						System.err.println("\n잘못된 접근입니다.\n");
					}
				} else {
					System.err.println("\n잘못된 접근입니다.\n");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("\n예외 발생\n");
		}
	}

}
