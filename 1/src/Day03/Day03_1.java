package Day03;

public class Day03_1 { // c s

	@SuppressWarnings("unused")
	public static void main(String[] args) { // m s
		
		
		// 1일차 : 출력, 입력
		// 2일차 : 저장(변수), 계산(연산)
		// 제어문
			// 컴퓨터의 판단력 -> 경우의 수
			// 형태
				// 1. IF (조건) 실행문
				// 2. IF (조건) 실행문[참];	
				//    ELSE 	   실행문[거짓]
				// 3. 실행문이 2줄 이상(;이 2개 이상이면) -> {}
				// 4. 경우의수[조건]가 다수일 때
				//	  IF (조건1) {실행문 [참1]}
				//    ELSE IF (조건2) {실행문 [참2]}
				//    ELSE IF (조건3) {실행문 [참3]}
				//    ELSE IF (조건4) {실행문 [참4]}
				//    ELSE IF (조건5) {실행문 [참5]}
				//    ELSE {실행문 [거짓]}
		
		// 예제1
		if (3>1) System.out.println("예) 3이 1보다 크다");
			// 만약에 3이 1보다 크면 출력, 아니면 출력하지 않는다.
		// 예제2
		if (3>5) System.out.println("예) 3이 5보다 크다");
			// 만약에 3이 5보다 크면 출력, 아니면 출력하지 않는다.
		
		// 예제3
		if (3>1) System.out.println("예) 3이 1보다 크다");
			// 만약에 3이 1보다 크면 출력
		else System.out.println("예) 3이 1보다 작다");
			// 만약이 3이 1보다 크지 않다면 출력
		
		// 예제 4
		if (3>1) { // true 실행문 시작
			System.out.println("true");
			System.out.println("3이 2보다 크다");
		} // true 실행문 끝
		else { // false 실행문 시작
			System.out.println("false");
			System.out.println("3이 2보다 작다");
		} // false 실행문 끝
		
		// 예제 5
		if (3>5) {
			System.out.println("예) 3이 5보다 크다"); // x
		} else if (3>4) {
			System.out.println("예) 3이 4보다 크다"); // x
		} else if (3>3) {
			System.out.println("예) 3이 3보다 크다"); // x
		} else if (3>2) {
			System.out.println("예) 3이 2보다 크다"); // o
		} else {
			System.out.println("false");		  // x
		}
		if(3>5) System.out.println("예) 3이 5보다 크다"); 	// x
		if(3>4) System.out.println("예) 3이 4보다 크다"); 	// x
		if(3>3) System.out.println("예) 3이 3보다 크다"); 	// x
		if(3>2) System.out.println("예) 3이 2보다 크다"); 	// o
		if(3<2) System.out.println("false"); 		 	// x
		
		
	}	// m e

} // c e
