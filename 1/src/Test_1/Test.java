package Test_1;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Student[] studentlist = new Student[100];
		int[] rank = new int[100];
		int[] score = new int[100];
		int count = 1;
		try {
			while (true) {
				System.out.println("------------------------------------------------------------");
				System.out.println("                        ��      ��     ǥ");
				System.out.println("------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("------------------------------------------------------------");
				int i = 0;

				for (Student temp : studentlist) {
					if (temp != null) {
						int sum = temp.kor + temp.eng + temp.math;
						double avg = sum / 3.00;
						for (int j = 0; j < score.length; j++) {
							count = 1;
							for (int k = 0; k < score.length; k++) {
								if (score[j] < score[k]) {
									count++;
								}
							}
							rank[j] = count;
						}
						
						
						
						
						
						
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",i+1,temp.name, temp.kor, temp.eng, temp.math, sum, avg, rank[i]);
					}
					i++;
				}
				
				
				
				
				
				System.out.println("\n�޴� : 1. �л����� ��� 2. �л����� ����\n");
				System.out.print("���� > "); int choice = scanner.nextInt();
				
				if (choice == 1) {
					System.out.print("�̸� : "); 			String name = scanner.next();
					System.out.print("�������� : ");		int kor = scanner.nextInt();
					System.out.print("�������� : ");		int eng = scanner.nextInt();
					System.out.print("�������� : ");		int math = scanner.nextInt();
					
					
					
	
				
					Student student = new Student(name, kor, eng, math, count);
					
					int a = 0;
					for (Student temp : studentlist) {
						if (temp == null) {
							studentlist[a] = student;
							score[a] = kor + eng + math;
							break;
						}
						a++;
					}
	
					
				} else if (choice == 2) {
					System.out.print("�̸� : ");		String name = scanner.next();
					int del = 0;
					for (Student temp : studentlist) {
						if (temp != null && temp.name.equals(name)) {
							studentlist[del] = null;
							score[del] = 0;
							System.err.println("���� �Ϸ�");
							break;
						}
						del++;
					}
					
				} else {
					System.err.println("�߸��� �����Դϴ�.");
				}
			}
		
		} catch (Exception e) {
			System.err.println("���� �߻�");
		}
		
	}
}
