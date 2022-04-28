package Day01;

import java.util.*;

public class Day01_6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("작성자 : ");
		String name = scanner.next();
		System.out.println("내용 : ");
		String asd = scanner.next();
		System.out.println("날짜 : ");
		String day = scanner.next();

		System.out.println("*------------방문록-------------*");
		System.out.println("|순번|작성자|내용\t\t|날짜  |");
		System.out.println("| 1 |" + name + "|" + asd + "\t|" + day + "|");
		System.out.println("*------------------------------*");
	}

}
