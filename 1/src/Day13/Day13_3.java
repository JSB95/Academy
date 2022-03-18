package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3 {
	
	public static void calendar (int year, int month) {
		
		while (true) {
			// 1. 캘린더 클래스 내 현재 날짜/시간 객체 호출
			Calendar calendar = Calendar.getInstance();
			
			int day = calendar.get(calendar.DAY_OF_MONTH);
			
			// 해당 월의 1일의 요일 찾기
				// 사용자 정의 캘린더 설정
				calendar.set(year, month-1, 1);		// 예) 3월 1일
				// 3월 1일의 요일
				int sweek = calendar.get(calendar.DAY_OF_WEEK);
				// 3월의 마지막일
				int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
				
			// 2. 출력
			System.out.println(" ******************** " + year + "년 " + month + "월" + " ******************** \n");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// 현재 월 1일의 위치 앞에 공백 채우기
			for (int i = 1; i < sweek; i++) { // 만약 3월 1일이 화요일 -> 3, 3보다 작다면 공백 삽입
				System.out.print("\t");
			}
			
			// 1일부터 마지막날짜까지 출력
			for (int i = 1; i <= eday; i++) {
				// i = 일수 출력
				System.out.print(i + "\t");
				// 토요일마다 줄바꿈
				if (sweek % 7 == 0) {		// 7의 배수
					System.out.println();	 
				}
				sweek++;					// 하루씩 요일 증가
			}
			
			
			try {
				// 버튼 [1.◀(이전달)  2.▶(다음달) 3.다시검색]
				System.out.println("\n\n[1. ◀(이전달)  2. ▶(다음달) 3. 다시검색 4. 종료]");
				Scanner scanner = new Scanner(System.in);
				System.out.print("선택 > "); 		int ch = scanner.nextInt();
				
				if (ch == 1) {
					month = month - 1;
					if (month == 0) {			// 이전달로 가다 1월 이저닝면
						year -= 1;				// 연도를 작년도으로
						month = 12;				// 12월로
					}
				} else if (ch == 2) {
					month += 1;
					if (month == 13) {			// 다음달로 가다 12월이 지나면
						year += 1;				// 연도를 내년으로 
						month = 1;				// 1월로
					}
				} else if (ch == 3) {
					System.out.print("연도 : ");		year = scanner.nextInt();
					System.out.print("월 : ");		month = scanner.nextInt();
				} else if (ch == 4) {
					System.out.println("\n종료");
					return;
				} else {
					System.err.println("잘못된 접근입니다.");
				}
			} catch (Exception e) {
				System.err.println("예외 발생");
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("연도 : ");		int year = scanner.nextInt();
		System.out.print("월 : ");		int month = scanner.nextInt();
		calendar(year, month);
		
		
			
		
	}

}
