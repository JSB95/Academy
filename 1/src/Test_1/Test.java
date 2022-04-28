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
				System.out.println("                        성      적     표");
				System.out.println("------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
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
				
				
				
				
				
				System.out.println("\n메뉴 : 1. 학생점수 등록 2. 학생점수 삭제\n");
				System.out.print("선택 > "); int choice = scanner.nextInt();
				
				if (choice == 1) {
					System.out.print("이름 : "); 			String name = scanner.next();
					System.out.print("국어점수 : ");		int kor = scanner.nextInt();
					System.out.print("영어점수 : ");		int eng = scanner.nextInt();
					System.out.print("수학점수 : ");		int math = scanner.nextInt();
					
					
					
	
				
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
					System.out.print("이름 : ");		String name = scanner.next();
					int del = 0;
					for (Student temp : studentlist) {
						if (temp != null && temp.name.equals(name)) {
							studentlist[del] = null;
							score[del] = 0;
							System.err.println("삭제 완료");
							break;
						}
						del++;
					}
					
				} else {
					System.err.println("잘못된 접근입니다.");
				}
			}
		
		} catch (Exception e) {
			System.err.println("예외 발생");
		}
		
	}
}
