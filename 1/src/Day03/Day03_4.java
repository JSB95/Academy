package Day03;

import java.util.*;

public class Day03_4 { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		/*
		// 제어문 : 1. if 2. switch
			// if : 논리검사(true or false) -> 경우의수가 정해져 있지 않은 경우
				// >= <= > < == !=
			// switch : 데이터검사 -> 경우의수가 정해져 있는 경우
				
			// 형태
				// switch(검사대상){
				//		case '값' : 실행문;
				//		case '값' : 실행문;
				//		case '값' : 실행문;
				//		case '값' : 실행문;
				// 		default : 실행문
			// break; : 가장 가까운 switch 혹은 반복문 탈출[나가기]
		
		// 예1) 점수가 90이면 A 80점이면 B 70점이면 C 그 외 탈락
		int 점수 = 80;
		if (점수 == 90) {
			System.out.println("A등급");
		} else if (점수 == 80) {
			System.out.println("B등급");
		} else if (점수 == 70) {
			System.out.println("C등급");
		} else {
			System.out.println("탈락");
		}
		
		switch (점수) {
			case 90 : System.out.println("A등급"); break;
			case 80 : System.out.println("B등급"); break;
			case 70 : System.out.println("C등급"); break;
			default : System.out.println("탈락"); break;
		}
		
		// 예2)
		int button = 3;
		switch (button) {
			case 1 : System.out.println("1층으로 이동"); break;
			case 2 : System.out.println("2층으로 이동"); break;
			case 3 : System.out.println("3층으로 이동"); break;
			case 4 : System.out.println("4층으로 이동"); break;
			case 5 : System.out.println("5층으로 이동"); break;
			default : System.out.println("정지");
		}
		
		// 예3)
		char grade = 'A';
		switch (grade) {
			case 'A' :
			case 'B' : System.out.println("우수 회원"); break;
			case 'C' : 
			case 'D' : System.out.println("일반 회원"); break;
			default : System.out.println("손님");
		}
		
		// 예4)
		String rank = "과장";
		switch (rank) { // 선택조건이기 때문에 .equals 사용 X
		case "부장" : System.out.println("700만원"); break;
		case "과장" : System.out.println("700만원"); break;
		default : System.out.println("300만원"); break;
		}
		*/
		
		// 문제1 : 국어, 영어, 수학 점수를 입력받아 평균이 90점 이상이면 A등급 80점 이상이면 B등급 나머지는 탈락 (논리연산 X)
		
		System.out.println("국어점수 : "); int korean = scanner.nextInt();
		System.out.println("영어점수 : "); int english = scanner.nextInt();
		System.out.println("수학점수 : "); int math = scanner.nextInt();
		int avg = (korean + english + math)/3;
		switch (avg/10) { // 1의자리 제외
			case 9 : System.out.println("A등급"); break;
			case 8 : System.out.println("B등급"); break;
			default : System.out.println("탈락");
		}
	} // m e 

} // c e
