package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_대기명단 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int 대기번호 = 0;
		ArrayList<대기> 대기명단 = new ArrayList<대기>();
		
		while (true) {
			// 리스트내 모든 객체 호출
			for (대기 temp : 대기명단) {
				if (대기명단.indexOf(temp) == 0) {
					System.out.println(temp.대기번호 + "\t" + temp.인원수 + "\t 입장");
				} else {
					System.out.println(temp.대기번호 + "\t" + temp.인원수 + "\t" + 대기명단.indexOf(temp) * 3 + "분");
				}
			}
			
			System.out.println("[고객] 1. 대기추가 2. 대기취소 [관리자] 3. 대기자입장\n");
			int ch = scanner.nextInt();
			
			if (ch == 1) {
				// 1. 입력받은 값을 변수에 저장
				System.out.print("전화번호 : ");		String 전화번호 = scanner.next();
				System.out.print("인원수 : ");		int 인원수 = scanner.nextInt();
				// 2. 3개 변수 -> 1개 객체화
				대기 temp = new 대기(대기번호, 전화번호, 인원수);
				// 3. 대기인원을 리스트에 저장
				대기명단.add(temp);
				대기번호++;
			} else if (ch == 2) {
				System.out.print("대기번호 : ");		int 삭제대기번호 = scanner.nextInt();
				for (대기 temp : 대기명단) {
					if (temp.대기번호 == 삭제대기번호) {
						대기명단.remove(temp);
						break;
					}
				}
			} else if (ch == 3) {
				System.out.println("가장 앞에 있는 대기자를 입장시킵니다.");
				대기명단.remove(0);
			} else {
				
			}
		}
		
	}

}
