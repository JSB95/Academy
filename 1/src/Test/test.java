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
				System.out.println(" **** 학생 목록 ****");
				// 학생들 점수 출력 [ 모든 배열 출력  ]
				System.out.println("-----------------------------------------------------------");
				System.out.println("                        성     적     표");
				System.out.println("-----------------------------------------------------------");
				System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \t %s \t %s\n","번호","이름","국어","영어","수학","총점","평균","석차");
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
				
				System.out.print("\n1. 학생등록 2.학생삭제 : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {  
					System.out.print("번호 : "); int num = scanner.nextInt();
					System.out.print("이름 : "); String name = scanner.next();
					System.out.print("국어 : "); int kor = scanner.nextInt();
					System.out.print("수학 : "); int math = scanner.nextInt();
					System.out.print("영어 : "); int eng = scanner.nextInt();
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
				} // 학생 등록 
				else if( ch== 2 ) { 
					System.out.print("이름 : "); String name = scanner.next();
					int del = 0;
					for (Student temp : studentlist) {
						if (temp != null && temp.name.equals(name)) {
							studentlist[del] = null;
							temp1[del] = 0;
							System.out.println("삭제 완료");
							break;
						} 
						del++;
					}
					
					
				} // 학생 삭제 
				else {  
					System.err.println("잘못된 접근입니다.");
				}
			}
			catch( Exception e ) {    }
			
		}
		
	}

}
