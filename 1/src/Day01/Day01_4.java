package Day01;

import java.util.*;


public class Day01_4 { // c s

	public static void main(String[] args) { // m s

		// 예제1 : 한명의 이름, 1교시, 2교시, 3교시 출석여부를 입력받아 출력
			// 입력 -> 저장 -> 출력
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String 이름 = scanner.next();
		System.out.println("1교시 : ");
		String 교시1 = scanner.next();
		System.out.println("2교시 : ");
		String 교시2 = scanner.next();
		System.out.println("3교시 : ");
		String 교시3 = scanner.next();
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("-----------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		//System.out.println(이름 + "\t" + 교시1 + "\t" + 교시2 + "\t" + 교시3);
		System.out.printf("%s\t %s\t %s\t %s\t %s\n", 이름, 교시1, 교시2, 교시3, " ");
		System.out.println("-----------------------------------");
		
	} // m e

} // c e
