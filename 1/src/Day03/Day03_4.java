package Day03;

import java.util.*;

public class Day03_4 { // c s

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		/*
		// ��� : 1. if 2. switch
			// if : ���˻�(true or false) -> ����Ǽ��� ������ ���� ���� ���
				// >= <= > < == !=
			// switch : �����Ͱ˻� -> ����Ǽ��� ������ �ִ� ���
				
			// ����
				// switch(�˻���){
				//		case '��' : ���๮;
				//		case '��' : ���๮;
				//		case '��' : ���๮;
				//		case '��' : ���๮;
				// 		default : ���๮
			// break; : ���� ����� switch Ȥ�� �ݺ��� Ż��[������]
		
		// ��1) ������ 90�̸� A 80���̸� B 70���̸� C �� �� Ż��
		int ���� = 80;
		if (���� == 90) {
			System.out.println("A���");
		} else if (���� == 80) {
			System.out.println("B���");
		} else if (���� == 70) {
			System.out.println("C���");
		} else {
			System.out.println("Ż��");
		}
		
		switch (����) {
			case 90 : System.out.println("A���"); break;
			case 80 : System.out.println("B���"); break;
			case 70 : System.out.println("C���"); break;
			default : System.out.println("Ż��"); break;
		}
		
		// ��2)
		int button = 3;
		switch (button) {
			case 1 : System.out.println("1������ �̵�"); break;
			case 2 : System.out.println("2������ �̵�"); break;
			case 3 : System.out.println("3������ �̵�"); break;
			case 4 : System.out.println("4������ �̵�"); break;
			case 5 : System.out.println("5������ �̵�"); break;
			default : System.out.println("����");
		}
		
		// ��3)
		char grade = 'A';
		switch (grade) {
			case 'A' :
			case 'B' : System.out.println("��� ȸ��"); break;
			case 'C' : 
			case 'D' : System.out.println("�Ϲ� ȸ��"); break;
			default : System.out.println("�մ�");
		}
		
		// ��4)
		String rank = "����";
		switch (rank) { // ���������̱� ������ .equals ��� X
		case "����" : System.out.println("700����"); break;
		case "����" : System.out.println("700����"); break;
		default : System.out.println("300����"); break;
		}
		*/
		
		// ����1 : ����, ����, ���� ������ �Է¹޾� ����� 90�� �̻��̸� A��� 80�� �̻��̸� B��� �������� Ż�� (������ X)
		
		System.out.println("�������� : "); int korean = scanner.nextInt();
		System.out.println("�������� : "); int english = scanner.nextInt();
		System.out.println("�������� : "); int math = scanner.nextInt();
		int avg = (korean + english + math)/3;
		switch (avg/10) { // 1���ڸ� ����
			case 9 : System.out.println("A���"); break;
			case 8 : System.out.println("B���"); break;
			default : System.out.println("Ż��");
		}
	} // m e 

} // c e
