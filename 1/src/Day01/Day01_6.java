package Day01;

import java.util.*;

public class Day01_6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ۼ��� : ");
		String name = scanner.next();
		System.out.println("���� : ");
		String asd = scanner.next();
		System.out.println("��¥ : ");
		String day = scanner.next();

		System.out.println("*------------�湮��-------------*");
		System.out.println("|����|�ۼ���|����\t\t|��¥  |");
		System.out.println("| 1 |" + name + "|" + asd + "\t|" + day + "|");
		System.out.println("*------------------------------*");
	}

}
