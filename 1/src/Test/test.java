package Test;

import java.util.*;

public class test {
	
	public static void main(String[] args) {
		
		Student[] studentlist = new Student[100];
		Scanner scanner = new Scanner(System.in);
		int[] rank = new int[100];
		int[] temp1 = new int[100];
		int count;
		
		while (true) {
			try {
				System.out.println(" **** �л� ��� ****");
				// �л��� ���� ��� [ ��� �迭 ���  ]
				System.out.println("-----------------------------------------------------------");
				System.out.println("                        ��     ��     ǥ");
				System.out.println("-----------------------------------------------------------");
				System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \t %s \t %s\n","��ȣ","�̸�","����","����","����","����","���","����");
				int i = 0;
				for (Student temp : studentlist) {
					if (temp != null) {
						int sum = temp.eng + temp.kor + temp.math;
						double avg = sum / 3;	
						for (int j = 0; j < temp1.length; j++) {
							count = 1;
							for (int k = 0; k < temp1.length; k++) {
								if (temp1[j] < temp1[k]) {
									count++;
								}
							}
							rank[j] = count;
						}
						System.out.printf("%d \t %s \t %d \t %d \t %d \t %d \t %.2f \t %d\n",temp.getNum(), temp.name, temp.kor,temp.eng,temp.math,sum,avg, rank[i]);
					} 
					i++;
				}
				
				System.out.print("\n1. �л���� 2.�л����� : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {  
					System.out.print("��ȣ : "); int num = scanner.nextInt();
					System.out.print("�̸� : "); String name = scanner.next();
					System.out.print("���� : "); int kor = scanner.nextInt();
					System.out.print("���� : "); int math = scanner.nextInt();
					System.out.print("���� : "); int eng = scanner.nextInt();
					Student student = new Student(name, kor, math, eng, num);
					boolean null_check = true;
					int j = 0;
					for (Student temp : studentlist) {
						if (temp == null ) {
							studentlist[j] = student;
							temp1[j] =  kor + eng + math;
							break;
						}
						j++;
					}
				} // �л� ��� 
				else if( ch== 2 ) { 
					System.out.print("�̸� : "); String name = scanner.next();
					int del = 0;
					for (Student temp : studentlist) {
						if (temp != null && temp.name.equals(name)) {
							studentlist[del] = null;
							temp1[del] = 0;
							System.out.println("���� �Ϸ�");
							break;
						} 
						del++;
					}
					
					
				} // �л� ���� 
				else {  
					System.err.println("�߸��� �����Դϴ�.");
				}
			}
			catch( Exception e ) {    }
			
		}
		
	}

}
