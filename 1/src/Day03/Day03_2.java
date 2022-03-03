package Day03;

import java.util.*;

public class Day03_2 { // c s

	public static void main(String[] args) { // m s
		
		// 입력 객체 = {} 당 1번 선언
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// 문제1 : 2개의 정수를 입력받아서 더 큰 수 출력
		
		System.out.println("정수1 입력");
		int int1_1 = scanner.nextInt();
			// int형 변수 선언하고 입력받은 값을 정수로 가져와서 대입
		System.out.println("정수2 입력");
		int int1_2 = scanner.nextInt();
		
		// 문제1_제어
		if (int1_1 > int1_2 ) {							// 만약에 입력받은 정수1 변수가 정수2보다 크면 실행 아니면 다음 조건
			System.out.println("더 큰수 : " + int1_1);	
		} else if (int1_2 > int1_1){					// [다음조건] 정수1 변수가 정수2보다 작으면 실행 아니면 그 외
			System.out.println("더 큰수 : " + int1_2);
		} else {										// 나머지 [그 외] 실행
			System.out.println("같다");
		}

		// 문제2 : 3개의 정수를 입력받아서 가장 큰 수 출력
		
		System.out.println("정수1 입력");
		int int2_1 = scanner.nextInt();
		System.out.println("정수2 입력");
		int int2_2 = scanner.nextInt();
		System.out.println("정수3 입력");
		int int2_3 = scanner.nextInt();
		int max = int2_1; 				// 가장 큰 수를 저장하는 임시저장, max에 첫번째 값 넣어두기
		if (max < int2_2) {
			max = int2_2;
		} 								// 만약에 max보다 정수2가 더 크면 max 교체
		if (max < int2_3) {
			max = int2_3;
		} 								// 만약에 max보다 정수3이 더 크면 max 교체
		System.out.println("가장 큰 수 : " + max);
		
		// 문제3 : 4개의 정수를 입력받아서 가장 큰 수 출력
		System.out.println("정수1 입력");
		int int3_1 = scanner.nextInt();
		System.out.println("정수2 입력");
		int int3_2 = scanner.nextInt();
		System.out.println("정수3 입력");
		int int3_3 = scanner.nextInt();
		System.out.println("정수4 입력");
		int int3_4 = scanner.nextInt();
		
		int max2 = int3_1;
		if(max2 < int3_2) { max = int3_2; }
		if(max2 < int3_3) { max = int3_3; }
		if(max2 < int3_4) { max = int3_4; }
		System.out.println("가장 큰 수 : " + max2);
		
		// 문제 4 : 3개의 정수를 입력받아서 오름차순
		System.out.println("정수1 입력");
		int int4_1 = scanner.nextInt();
		System.out.println("정수2 입력");
		int int4_2 = scanner.nextInt();
		System.out.println("정수3 입력");
		int int4_3 = scanner.nextInt();
		
		if (int4_1 > int4_2) {			// > : 오름차순, < : 내림차순
			// 교체 [스왑 = 두개 변수에 데이터 교환방법]
			int temp = int4_1;			// 임시변수 = 변수1
			int4_1 = int4_2;			// 변수1 = 변수2
			int4_2 = temp;				// 변수2 = 임시변수
		}
		if (int4_1 > int4_3) { int temp = int4_1; int4_1 = int4_3; int4_3 = temp;
		}
		if (int4_2 > int4_3) { int temp = int4_2; int4_2 = int4_3; int4_3 = temp;
		}
		System.out.printf("입력한 값 오름차순 : %d %d %d", int4_1, int4_2, int4_3); 
		
		// 문제 5 : 4개의 정수를 입력받아서 내림차순
		System.out.println("정수1 입력");
		int int5_1 = scanner.nextInt();
		System.out.println("정수2 입력");
		int int5_2 = scanner.nextInt();
		System.out.println("정수3 입력");
		int int5_3 = scanner.nextInt();
		System.out.println("정수4 입력");
		int int5_4 = scanner.nextInt();
		
		if(int5_1 < int5_2) { int temp = int5_1; int5_1 = int5_2; int5_2 = temp;
		}
		if(int5_1 < int5_3) { int temp = int5_1; int5_1 = int5_3; int5_3 = temp;
		}
		if(int5_1 < int5_4) { int temp = int5_1; int5_1 = int5_4; int5_4 = temp;
		}
		if(int5_2 < int5_3) { int temp = int5_2; int5_2 = int5_3; int5_3 = temp;
		}
		if(int5_2 < int5_4) { int temp = int5_2; int5_2 = int5_4; int5_4 = temp;
		}
		if(int5_3 < int5_4) { int temp = int5_3; int5_3 = int5_4; int5_4 = temp;
		}
		System.out.printf("입력한 값 내림차순 : %d %d %d %d", int5_1, int5_2, int5_3, int5_4);
		
	} // m e

} // c e
