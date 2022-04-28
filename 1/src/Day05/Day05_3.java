package Day05;

import java.util.Scanner;

public class Day05_3 {
	
	public static void main(String[] args) {
	

	// p.181 확인문제
		// 1.
		// 2.
		// 3. 2 (객체 비교시 equals 메소드 사용)
		// 4. 2 (길이가 없을 경우 값 추가 불가능)
		// 5. 3 (boolean 초기값은 false)
		// 6. 3(행의 수)/5(3행의 열 수)
		// 7.
			int max = 0;
			int[] array = { 1, 5, 3, 8, 2 };
			for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];	// 만약에 max 보다 i번째 인덱스의 값이 더 크다면 max의 i번째 값 대입
				}
			}
			System.out.println("max : " + max);
		// 8.
			
			int [][] array2 = { { 95, 86 }, { 83, 92, 96 },{ 78, 83, 93, 87, 88 } };
			int sum = 0, count = 0; double avg = 0.0;
			for (int row = 0; row < array2.length; row++) { // 행은 0부터 배열의 행 길이 [3]미만까지 1씩 증가
				for (int column = 0; column < array2[row].length; column++) { // 열은 0부터 배열의 열길이 [2, 3, 5] 미만까지 1씩 증가
					sum += array2[row][column];
				}
				count += array2[row].length;
			}
			avg = (double)sum / count;
			System.out.println("sum : " + sum);
			System.out.println("avg : " + avg);
			
		// 9.
			boolean run = true;
			int studentNum = 0;
			int scores[] = null;
			Scanner scanner = new Scanner(System.in);
			
			while (run) {
				System.out.println("==================================================");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("==================================================");
				
				int selectNo = scanner.nextInt();
				
				if (selectNo == 1) {	// 학생 수 입력받기
					System.out.println("학생수> "); studentNum = scanner.nextInt();		// 입력받은 학생 수 만큼 배열길이 변경
					scores = new int[studentNum];
				} else if (selectNo == 2) { // 학생 점수 입력받기
					for (int i = 0; i < scores.length; i++) {							
						System.out.printf("scores[%d] : \n", i);
						scores[i] = scanner.nextInt();									// 입력받아 i번째 인덱스에 저장
					}
				} else if (selectNo == 3) {	// 학생 점수 출력하기
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d] : %d \n", i,scores[i]);
					}
				} else if (selectNo == 4) {
					
				} else if (selectNo == 5) {
					run = false;
				}
			}
			
	}
}

