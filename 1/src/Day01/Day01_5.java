package Day01;

import java.util.*;

public class Day01_5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̵� : ");
		String ID = scanner.next();
		System.out.println("��й�ȣ : ");
		String PW = scanner.next();
		System.out.println("���� : ");
		String NAME = scanner.next();
		System.out.println("�̸��� : ");
		String EMAIL = scanner.next();
		
		System.out.println(">>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.printf("%s\t%s\t%s\t%s",ID,PW,NAME,EMAIL);
		
	}

}
