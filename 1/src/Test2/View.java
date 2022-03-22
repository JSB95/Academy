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
		while (true) {
			System.out.println("--------------------------------------------- 주차 현황 표 --------------------------------------------\n");
			System.out.println("현재시간 : " + current_time + "\n");
			System.out.println("날짜\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");
			Controller.print();
			
			// 리스트에서 뽑아오기
			
			
			System.out.println("1. 입차\t2.출차");
			System.out.print("선택 > ");			int ch = scanner.nextInt();
			
			// 입 / 출차
			
			if (ch == 1) {
				System.out.print("차량번호 : "); String car_num = scanner.next();
				int result = Controller.chk(car_num);
				if (result == 1) {
					LocalDate date = LocalDate.now();
					LocalTime time = LocalTime.now();
					Controller.entrance(car_num, date, time);
				} else if (result == 2) {
					System.err.println("중복된 차량 번호입니다.");
				} else if (result == 3) {
					System.err.println("정확한 차량 번호를 입력해주세요.");
				} else {
					System.err.println("잘못된 접근입니다.");
				}
			} else if (ch == 2) {
				System.out.print("차량번호 : "); String car_num = scanner.next();
			} else {
				System.err.println("\n잘못된 접근입니다.\n");
			}
			
			
			
			break;
		}

	}

}
