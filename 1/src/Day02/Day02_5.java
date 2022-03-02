package Day02;

import java.util.*;

public class Day02_5 {

	public static void main(String[] args) {
		
		
		// 문제 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");	
		int 정수 = scanner.nextInt();
		String 결과1 = ((정수 % 7)>=1) ? "7의 배수가 아닙니다." : "7의 배수입니다.";
		
		System.out.println("결과는 : " + 결과1);
		
		// 문제 4
		
		System.out.println("정수 입력 : ");
		int 정수2 = scanner.nextInt();
		String 결과2 = ((정수2 % 2) > 0) ? "홀수입니다" : "짝수입니다.";
		System.out.println(결과2); 
		
		// 문제 5
		
		System.out.println("정수 입력 : ");
		int 정수3 = scanner.nextInt();
		System.out.println("입력한 정수는 7의배수 이면서 짝수 판단 : " + (정수3 % 7 ==0 && 정수3 % 2 == 0) );
		
		// 문제 6
		
		System.out.println("첫번째 정수 입력 : ");	
		int 정수4 = scanner.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int 정수5 = scanner.nextInt();
		String 결과5 = (정수4>정수5) ? "첫번째 수가 더 큽니다" : "두번째 수가 더 큽니다.";
		System.out.println(결과5); 
		
		// 문제 7
		double pi = 3.14;
		System.out.println("반지름 입력 : ");	
		int 반지름 = scanner.nextInt();
		System.out.println("원의 넓이는 : " + 반지름 * 반지름 * pi);
		
		// 문제 8
		System.out.println("첫번째 실수 입력 : ");	
		double 실수1 = scanner.nextDouble();
		System.out.println("두번째 실수 입력 : ");
		double 실수2 = scanner.nextDouble();
		System.out.println("앞실수의 값이 뒤 실수의 값의 " + (float)(실수1/실수2)*100 + "%입니다.");
			// %f : 실수 표현
				// %.숫자f : 소수점 숫자 자리만큼 표현
		
		// 문제 9
		System.out.println("윗변의 값 입력 : ");
		int 윗변 = scanner.nextInt();
		System.out.println("밑변의 값 입력 : ");
		int 밑변 = scanner.nextInt();
		System.out.println("높이 입력 : ");
		int 높이 = scanner.nextInt();
		System.out.println("사다리꼴의 넓이는 : " + ((윗변+밑변) * 높이)/2 + "입니다.");
		
		
		// 문제 10
		System.out.println("키를 입력하세요 : ");
		double 키 = scanner.nextDouble();
		System.out.println("표준체중은 : " + (float)(키-100)*0.9 + "kg입니다.");
		
		// 문제 11
		System.out.println("키를 입력하세요 : ");
		float 키2 = scanner.nextFloat();
		System.out.println("몸무게를 입력하세요 : ");
		float 몸무게 = scanner.nextFloat();
		System.out.println("BMI : " + (몸무게 / ((키2 / 100) * (키2 / 100))) + "입니다."); 
		
		// 문제 12
		System.out.println("inch : ");
		float inch = scanner.nextFloat();
		System.out.println("변환값 : " + inch * 2.54 + "cm입니다.");
		
		// 문제 13
		System.out.println("중간고사 점수 : ");
		float mid = scanner.nextFloat();
		System.out.println("기말고사 점수 : ");
		float Final = scanner.nextFloat();
		System.out.println("수행평가 점수 : ");
		float 수행 = scanner.nextFloat();
		System.out.println("점수는 : " + String.format("%.2f",((mid * 0.3) + (Final * 0.3) + (수행 * 0.4))) + "점 입니다.");
		
		// 문제 14
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.printf("x의 값 : %d, y의 값 : %d",x,y);
		
		// 문제 15
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		String 나이대 = age > 40 ? "중년" : age > 20 ? "성인" : "학생";
		System.out.println(나이대);
				
		// 확인문제
		/* 1. 3번
		 * 2. 31
		 * 3. 나
		 * 4. #1 : pencils/students #2 : pencils%students
		 * 5. #1 : (value/100) * 100
		 * 6. #1 : (double)((lengthTop + lengthBottom) * height)/2;
		 * 7. true, false
		 * 8. 
		 */
		
	}
}
