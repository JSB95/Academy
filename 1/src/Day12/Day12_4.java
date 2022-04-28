package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 차량번호 구분 프로그램
		// 조건
			// 1. 난수 0000~9999 사이 난수 10개 생성
			// 2. 모든 차량 번호를 배열에 저장
			// 3. 마지막자리 번호로 홀/짝 구분
			// 4. 차량 끝자리 홀수
			// 5. 차량 끝자리 짝수 
			// 6. 출력
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] carlist = new String[10];
		
		while (true) {
			
			// 차량번호 출력
			for (String temp : carlist) {
				if (temp != null) {
					System.out.println(temp);
				}
			}
			

			
			// 입차
			System.out.println("1. 차량 입차"); int ch = scanner.nextInt();
			if (ch == 1) {
				int intnum = random.nextInt(10000);
				String strnum = String.format("%04d", intnum);
				
				boolean save = false;
				for (int i = 0; i <= carlist.length; i++) {
					if (carlist[i] == null) {
						carlist[i] = strnum;
						save = true;
						break;
					}
				}
				
				// 홀수 차량번호 
				
				// 짝수 차량 번호
				
				
			}
			
			
			
		}

	}

}
