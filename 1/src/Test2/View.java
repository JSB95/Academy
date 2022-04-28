package Test2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.*;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd  HH:mm",Locale.KOREA);
		Date date0 = new Date();
		
		String current_time = format.format(date0);
		try {
			while (true) {
				System.out.println("--------------------------------------------- 주차 현황 표 --------------------------------------------\n");
				System.out.println("현재시간 : " + current_time + "\n");
				System.out.println("날짜\t\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");
				Controller.print();
				
				// 리스트에서 뽑아오기
				
				
				System.out.println("\n1. 입차\t2.출차");
				System.out.print("\n선택 > ");			int ch = scanner.nextInt();
				
				// 입 / 출차
				
				if (ch == 1) {
					System.out.print("\n차량번호 : "); String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);
					if (result == 0) {
						boolean chk = Controller.duplication(car_num);
						if (chk) {
							Controller.entrance(car_num);
						} else {
							System.err.println("\n중복된 차량 번호입니다.\n");
						}
					} else if (result == 1) {
						System.err.println("\n정확한 차량 번호를 입력해주세요.\n");
					} else {
						System.err.println("\n잘못된 접근입니다.\n");
					}
				} else if (ch == 2) {
					System.out.print("차량번호 : "); String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);
					if (result == 0) {
				
		
						Controller.exit(car_num);
					} else if (result == 1) {
						System.err.println("\n정확한 차량 번호를 입력해주세요.\n");
					} else {
						System.err.println("\n잘못된 접근입니다.\n");
					}
				} else {
					System.err.println("\n잘못된 접근입니다.\n");
				}
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
