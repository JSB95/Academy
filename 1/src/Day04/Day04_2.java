package Day04;

import java.util.*;

public class Day04_2 { // class start

	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub

		/* 자판기  프로그램
			 1. 메뉴판 [콜라 300 / 환타 200 / 사이다 100 / 결제]
			 메뉴판에서 제품을 선택하면 장바구니에 넣기
			 재고가 부족하면 알림 (재고부족)
			 2. 초기 재고 [제품당 10개씩]
			 3. 결제 시 금액 입력받아 결제액 만큼 차감 후 잔돈 출력. 투입한 금액보다 구매액이 크면 결제 취소 [금액부족] 
		*/
		
		// 공통변수 [모든 {} 내에서 사용하는 변수들]
		
		Scanner scanner = new Scanner(System.in);											// 1. 입력객체
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;									// 2. 재고변수
		int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;									// 3. 장바구니
		
		
		
		while(true) {																		// 프로그램 시작
			System.out.println("-------------------메뉴----------------------");
			System.out.println("1. 콜라[300] 2. 환타[200] 3. 사이다[100] 4. 결제");
			System.out.println(">>>>>> 선택"); 
			int choice = scanner.nextInt();													// 메뉴 선택
			
			if (choice == 1) {																// 콜라 선택
				if (콜라재고 == 0) {															// 콜라 재고가 없다면
					System.err.println("재고가 없습니다. 재고 준비중");							
				} else {																	// 콜라 재고가 있다면
					System.out.println("[콜라를 담았습니다.]");
					콜라구매수++;																// 콜라구매수 추가
					콜라재고--;																// 콜라 재고 감소
				}
			} else if (choice == 2) {
				if (환타재고 == 0) {
					System.err.println("재고가 없습니다. 재고 준비중");
				} else {
					System.out.println("[환타를 담았습니다.]");
					환타구매수++;
					환타재고--;
				}
			} else if (choice == 3) {
				if (사이다재고 == 0) {
					System.err.println("재고가 없습니다. 재고 준비중");
				} else {
					System.out.println("[사이다를 담았습니다.]");
					사이다구매수++;
					사이다재고--;
				}
			} else if (choice == 4) {
				System.out.println("----------------결제 제품 목록-------------------");
				System.out.println("제품명\t수량\t금액");
				if(콜라구매수 != 0) {
					System.out.println("콜라\t" + 콜라구매수 + "\t" + (콜라구매수 * 300));
				}
				if(환타구매수 != 0) {
					System.out.println("환타\t" + 환타구매수 + "\t" + (환타구매수 * 200));
				}
				if(사이다구매수 != 0) {
					System.out.println("사이다\t" + 사이다구매수 + "\t" + (사이다구매수 * 100));
				}
				int 결제액 = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수 * 100);
				System.out.println("제품 총 결제액 : " + 결제액);
				System.out.println("---------------------------------------------");
				System.out.println("1. 결제 2. 취소");
				int choice2 = scanner.nextInt();
				
				if (choice2 == 1) {															// 1. 결제
					System.out.println("결제액을 입력하세요 : ");
					int 금액 = scanner.nextInt();												// 금액 입력받기
					while(true) {															// 무한루프 [종료조건 : 결제액보다 금액이 크면]
						if (결제액 > 금액) {													// 금액이 결제액보다 적으면 결제불가 -> 금액 재입력
							System.err.println("결제액이 부족합니다. 다시 입력하세요 : ");
							금액 = scanner.nextInt();
						} else {															// 금액이 결제액보다 많으면 결제 성공
							System.out.println("결제 성공");
							콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0;							// 장바구니 초기화
							System.out.println("잔돈 출력 : " + (금액 - 결제액));					// 잔돈 출력
							break;															// 루프 종료
						}
					}
				} else if (choice2 == 2) {													// 2. 취소
					System.out.println("구매 목록 모두 지우기");
					콜라재고 += 콜라구매수; 환타재고 += 환타구매수; 사이다재고 += 사이다구매수;				// 구매수를 재고로 옮기기
					콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0;									// 구매수 초기화
				} else {
					System.err.println("알 수 없는 번호입니다.");
				}																			// 결제 end
			} else {
				System.err.println("알 수 없는 번호입니다.");
			}
		}																					// while end
		
	} // main end

} // class end
