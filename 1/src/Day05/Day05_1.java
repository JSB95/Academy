package Day05;

public class Day05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 : 하나의 데이터 저장
		// 배열 : 동일한 자료형 데이터를 특정기준[인덱스]으로 나열
		
		// 1차원 배열 : 길이
			// 형태 : 자료형[] 배열명 = new 자료형[길이];
			// int[] arr = new int[3]; -> int int int
			// * int형 변수 3개를 저장할 수 있는 배열
		// 2차원 배열 : 가로길이 세로길이
			// 형태 : 자료형[][] 배열명 = new 자료형[가로=행][세로=열];
			// int[][] arr2 = new int[4][3];
			// int int int
			// int int int
			// int int int
			// int int int
			// * int형 변수 12개를 저장할 수 있는 배열
		// 3차원 배열 : 가로길이 세로길이 높이길이
			// 형태 : 자료형[][][] 배열명 = new 자료형[가로][세로][높이];
		
		// 다차원 배열 -> 많이 쓰지는 않음 (DB)
		
		// 예제1)
		int[] array = new int[3];									// int : 4byte * 3 = 12byte array
		array[0] = 80;												// 0번 인덱스에 80 데이터 대입
		array[1] = 90;
		array[2] = 100;
		
		int[][] array2 = new int[2][3];								// [가로=행][세로=열] 4byte * 2 * 3 = 24byte
		array2[0][0] = 80;	array2[0][1] = 90;	array2[0][2] = 100;
		array2[1][0] = 40;	array2[1][1] = 50;	array2[1][2] = 60;
		System.out.println("1차원 배열 : " + array);					// 인덱스 없이 배열명만 호출 시
		System.out.println("2차원 배열 : " + array2);					// [메모리]주소값 출력
		
		System.out.println("1차원 배열 길이 : " + array.length);		// 배열의 길이
		System.out.println("2차원 배열 행 길이 : " + array2.length);	// 2차원 배열의 행 길이
		System.out.println("2차원 배열 열 길이 : " + array2[0].length); // 2차원 배열의 열 길이
		
		// 예제2) 반복문을 이용한 0~49까지 첫번째 행에 저장 / 50~99까지 두번째 행에 저장
		int[][] array3 = new int[2][50];							// int : 4byte * 2 * 50 => 400byte
		for (int i = 0; i<100; i++) {
			
			if (i <50) {											// 첫번째 행에 값 넣기
				array3[0][i] = i;									// [0] : 첫번째 행 번호 [i] : i번째 열 번호
			} else { 												// 두번째 행에 값 넣기		
				array3[1][i-50] = i;								// [1] : 두번째 행 번호 [i] : i번째 열 번호
			}
			
		}
		
		for (int i = 0; i<100; i++) {								// 출력 반복문
			if ( i < 50) {
				System.out.printf("%d ",array3[0][i]);				// %d : 정수 %숫자d : 숫자만큼 칸 차지(단, 데이터가 없으면 공백) %f : 실수 %.2f : 소수점 자릿수 
			} else  {
				System.out.printf("%d ",array3[1][i-50]);
			} 
			if (i == 49) {
				System.out.println("");
			}
		}

	} // main end

} // class end
