package Day02;

import java.util.*;

public class Day02_5 {

	public static void main(String[] args) {
		
		
		// ���� 3
		
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("���� �Է� : ");	
		int ���� = scanner.nextInt();
		String ���1 = ((���� % 7)>=1) ? "7�� ����� �ƴմϴ�." : "7�� ����Դϴ�.";
		
		System.out.println("����� : " + ���1);
		
		// ���� 4
		
		System.out.println("���� �Է� : ");
		int ����2 = scanner.nextInt();
		String ���2 = ((����2 % 2) > 0) ? "Ȧ���Դϴ�" : "¦���Դϴ�.";
		System.out.println(���2); 
		
		// ���� 5
		
		System.out.println("���� �Է� : ");
		int ����3 = scanner.nextInt();
		System.out.println("�Է��� ������ 7�ǹ�� �̸鼭 ¦�� �Ǵ� : " + (����3 % 7 ==0 && ����3 % 2 == 0) );
		
		// ���� 6
		
		System.out.println("ù��° ���� �Է� : ");	
		int ����4 = scanner.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int ����5 = scanner.nextInt();
		String ���5 = (����4>����5) ? "ù��° ���� �� Ů�ϴ�" : "�ι�° ���� �� Ů�ϴ�.";
		System.out.println(���5); 
		
		// ���� 7
		double pi = 3.14;
		System.out.println("������ �Է� : ");	
		int ������ = scanner.nextInt();
		System.out.println("���� ���̴� : " + ������ * ������ * pi);
		
		// ���� 8
		System.out.println("ù��° �Ǽ� �Է� : ");	
		double �Ǽ�1 = scanner.nextDouble();
		System.out.println("�ι�° �Ǽ� �Է� : ");
		double �Ǽ�2 = scanner.nextDouble();
		System.out.println("�սǼ��� ���� �� �Ǽ��� ���� " + (float)(�Ǽ�1/�Ǽ�2)*100 + "%�Դϴ�.");
			// %f : �Ǽ� ǥ��
				// %.����f : �Ҽ��� ���� �ڸ���ŭ ǥ��
		
		// ���� 9
		System.out.println("������ �� �Է� : ");
		int ���� = scanner.nextInt();
		System.out.println("�غ��� �� �Է� : ");
		int �غ� = scanner.nextInt();
		System.out.println("���� �Է� : ");
		int ���� = scanner.nextInt();
		System.out.println("��ٸ����� ���̴� : " + ((����+�غ�) * ����)/2 + "�Դϴ�.");
		
		
		// ���� 10
		System.out.println("Ű�� �Է��ϼ��� : ");
		double Ű = scanner.nextDouble();
		System.out.println("ǥ��ü���� : " + (float)(Ű-100)*0.9 + "kg�Դϴ�.");
		
		// ���� 11
		System.out.println("Ű�� �Է��ϼ��� : ");
		float Ű2 = scanner.nextFloat();
		System.out.println("�����Ը� �Է��ϼ��� : ");
		float ������ = scanner.nextFloat();
		System.out.println("BMI : " + (������ / ((Ű2 / 100) * (Ű2 / 100))) + "�Դϴ�."); 
		
		// ���� 12
		System.out.println("inch : ");
		float inch = scanner.nextFloat();
		System.out.println("��ȯ�� : " + inch * 2.54 + "cm�Դϴ�.");
		
		// ���� 13
		System.out.println("�߰���� ���� : ");
		float mid = scanner.nextFloat();
		System.out.println("�⸻��� ���� : ");
		float Final = scanner.nextFloat();
		System.out.println("������ ���� : ");
		float ���� = scanner.nextFloat();
		System.out.println("������ : " + String.format("%.2f",((mid * 0.3) + (Final * 0.3) + (���� * 0.4))) + "�� �Դϴ�.");
		
		// ���� 14
		int x = 10;
		int y = x-- + 5 + --x;
		System.out.printf("x�� �� : %d, y�� �� : %d",x,y);
			// 1. x-- + 5 -> �������� ���� -> 10 + 5
			// 2. x-- -> x ���� (x=9)
			// 3. 15 + --x -> ���� ���� (x=8)
			// 4. 15 + 8 = 23
		
		// ���� 15
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();
		String ���̴� = age > 40 ? "�߳�" : age > 20 ? "����" : "�л�";
		System.out.println(���̴�);
				
	
		//���� 15
		System.out.println("ù��° ���� : ");
		int int1 = scanner.nextInt();
		System.out.println("�ι�° ���� : ");
		int int2 = scanner.nextInt();
		System.out.println("����° ���� : ");
		int int3 = scanner.nextInt();
		
		int ù° = (int1 > int2 & int2 > int3) ? int3 : (int1 > int3 & int3> int2) ? int2 : (int2 > int1 & int1 > int3) ? int3 : (int2 > int3 & int3 > int1) ? int1 : (int3 > int1 & int1 > int2) ? int2 : (int3 > int2 & int2 > int1) ? int1 : null;
		int ��° = (ù°==int1 && int2>int3 || ù°==int2 && int1>int3) ? int3 : (ù°==int1 && int3>int2 || ù°==int3 && int1>int2) ? int2 :int1;
		int ��° = (ù°==int1 && ��°==int2 || ù°==int2 && ��°==int1) ? int3 : (ù°==int2 && ��°==int3 || ù°==int3 && ��°==int2) ? int1 :int2;
		System.out.printf("%d\n%d\n%d",ù°,��°,��°);*/
		
		// ���� 16
		System.out.println("ù��° ���� : ");
		int int1 = scanner.nextInt();
		System.out.println("�ι�° ���� : ");
		int int2 = scanner.nextInt();
		System.out.println("����° ���� : ");
		int int3 = scanner.nextInt();
		System.out.println("�׹�° ���� : ");
		int int4 = scanner.nextInt();
		int first =(int1 < int2 && int2 < int3 && int3 < int4) || (int1 < int3 && int3 < int2 && int2 < int4) ? int4 : (int1 < int2 && int2 < int4 && int4 < int3 || int1 < int4 && int4 < int2 && int2 < int3) ? int3 : (int1 < int3 && int3 < int4 && int4 < int2) || (int1 < int4 && int4 < int3 && int3 < int2) ? int2 : int1;
		int second = (first = int2 && int1 < int3 && int3 < int4) || (first = int2 && int1 < int4 && int4 < int3) || (first = int3 && int1 < int2 & int2 < int4 ) || (first = int3 && int1 < int4 && int4 < int2) || (first = int1 && int2 < int3 && int3 < int4) || (first = int1 && int2 < int4 && int4 <int3) || (first=int3 && int2 <int1 && int1 <int4) || (first=int3 && int2 < int4 && int4 <int1) ||  (first = int4 && int2 < int1 && int1 <int3) || (first=int4 && int2 < int3 && int3 < int1) ? int2 : 
		int third = 
		int fourth = 
		
		// Ȯ�ι���
		/* 1. 3��
		 * 2. 31
		 * 3. ��
		 * 4. #1 : pencils/students #2 : pencils%students
		 * 5. #1 : value-(value % 100)
		 * 6. #1 : (double)((lengthTop + lengthBottom) * height)/2;
		 * 7. true, false
		 * 8. ArithmeticException e
		 */
		
	}
}
