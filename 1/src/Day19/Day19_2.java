package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);					// 1. 입력객체
		HashSet<Integer> set = new HashSet<Integer>();				// 2. set컬렉션 호출
		
		int count = 0; 	
		while (true) {
			System.out.print("1~45숫자 선택 (중복 불가) > ");
			int num = scanner.nextInt();							// 3. 입력받기
			
			if (num < 1 || num > 45) {
				System.err.println("\n선택 할 수 없는 번호\n");
			} else {
				set.add(num);
				System.out.println("\n확인 : " + set);
			}
			
			if (set.size() == 6) {
				break;
			}
		}

	}

}
