package Day03;

import java.util.*;

public class Day03_7 { // c s

	public static void main(String[] args) { // m s
		// TODO Auto-generated method stub
		/* 확인문제
		 * 
		 * 1. if, switch / for, while, do-while
		 * 
		 * 2. 2번
		 * 	break; : 가장 가까운 { } 탈출 (switch, for, while)
		 * 
		 * 3.	int sum = 0;
		 * 		for (int i = 0; i <= 100; i += 3) {
		 * 				sum += i;
		 * 	 	}
		 * 
		 * 4. 
		 * 
		 * 5. 4x + 5y = 60 [해 : x와 y에 들어갈 수 있는 값 찾기]
		 * 	for (int x = 1 ; x <=10; x++) { // x는 1부터 10까지 1씩 증가 실행 반복처리
		 * 		for(int y = 1; y <=10; y++) {
		 * 			if ((4*x) + (5*y) == 60) {
		 * 				System.out.println(x + " " + y);
		 *  		}
		 * 		}
		 * 	}		
		 * 
		 * 6. 
		 * 	for (int i = 1; i <= 5; i++) { // i는 1부터 5까지 1씩 증가하면서 실행 반복처리
		 * 		for (int s = 1; s <= i; i++) {
		 * 			System.out.println("*");
		 * 		}
		 * 		System.out.println(); // 줄바꿈 처리
		 *  }
		 */
		// 7.
		Scanner scanner = new Scanner(System.in);
		boolean run = true;												// 실행 여부 변수 / true = 실행
		int balance = 0;												// 예금액[통장 안에 있는 금액] 변수		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > "); 
			int choice = scanner.nextInt();
			
			if (choice == 1) {											// 만약 입력값이 1이면
				System.out.print("예금액 : "); 							
				int 예금액 = scanner.nextInt();
				balance += 예금액;										// 입력받은 금액을 통장에 추가
			}
			
			else if (choice == 2) {										// 만약 입력값이 2이면
				System.out.print("출금액 : "); 
				int 출금액 = scanner.nextInt();
				if (출금액 > balance) {
					System.out.println("잔액이 부족합니다.");
				} else balance -= 출금액;									// 입력받은 금액을 통장에서 빼기
			}
			
			else if (choice == 3) {										// 만약 입력값이 3이면
				System.out.println("잔고 : " + balance);
			}
			
			else if (choice == 4) {										// 만약 입력값이 4이면
				break;													// 프로그램 종료
			} else {
				System.out.println("알 수 없는 번호입니다.");
			}
		}
		
		System.out.println("프로그램 종료");

	} // m e

} // c e
