package Day01;

import java.util.*;


public class Day01_4 { // c s

	public static void main(String[] args) { // m s

		// ����1 : �Ѹ��� �̸�, 1����, 2����, 3���� �⼮���θ� �Է¹޾� ���
			// �Է� -> ���� -> ���
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸� : ");
		String �̸� = scanner.next();
		System.out.println("1���� : ");
		String ����1 = scanner.next();
		System.out.println("2���� : ");
		String ����2 = scanner.next();
		System.out.println("3���� : ");
		String ����3 = scanner.next();
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("-----------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		//System.out.println(�̸� + "\t" + ����1 + "\t" + ����2 + "\t" + ����3);
		System.out.printf("%s\t %s\t %s\t %s\t %s\n", �̸�, ����1, ����2, ����3, " ");
		System.out.println("-----------------------------------");
		
	} // m e

} // c e
