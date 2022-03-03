package Day03;

import java.util.*;

public class Day03_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		// 문제 6 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격
		
		System.out.println("점수를 입력하세요 : ");
		int score1 = scanner.nextInt();
		if (score1 > 90) { System.out.println("합격"); }
		else { System.out.println("불합격");}
		
		
		// 문제 7 : 점수를 입력받아 점수가 90점 이상이면 A등급, 80점 이상이면 B등급, 70점 이상이면 C등급, 그 외 재시험
		
		System.out.println("점수를 입력하세요 : ");
		int score2 = scanner.nextInt();
		if (score2 > 90) { System.out.println("A");}
		else if (score2 > 80) { System.out.println("B");}
		else if (score2 > 70) { System.out.println("C");}
		else System.out.println("재시험"); 
		*/
		
		// 문제 8 : 로그인 / 아이디가 admin이고 비밀번호가 1234일 경우에는 로그인 성공, 아니면 로그인 실패 출력
		System.out.println("ID : ");
			// char 자료형 [문자 1개 저장]
			// 자료형으로 문자열을 저장할 수 없다.
				// 1. String 클래스 사용하면 문자열 저장 가능
				// 2. char 배열/리스트 사용하면 가능
		String id = scanner.next();
		System.out.println("PASSWORD : ");
		int pw = scanner.nextInt();
			// 객체는 연산 불가 -> 문자는 크다 같다 등등 연산 불가
			// 메소드 사용(함수)
				// 자료형 사용하는 변수는 연산자 사용 가능
				// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
					// 문자열 비교시 .equals
					// 문자열1.equlas(문자열2)
		
		boolean 로그인성공 = false;						// boolean : 1비트 true 혹은 false 저장
		
		if (id.equals("admin")) {						// id는 클래스 객체이기 때문에 == 불가능, 객체 비교시에는 .equals()사용
			
			if (pw == 1234) {							// pw는 자료형 변수이기 때문에 == 가능
				 System.out.println("로그인 성공");
				 로그인성공 = true;						// id, pw모두 동일하면 변수값 변경
			} else {
				System.out.println("비밀번호가 틀렸습니다.");	// 입력한 pw가 동일하지 않으면
			}
			
		} else {  										// 입력한 id가 admin이 아니라면
			System.out.println("아이디가 틀렸습니다.");
		}
		
		if (로그인성공 == false) {							// 로그인성공 변수가 false이면 출력
			System.out.println("로그인 실패");
		}
		
		/* 문제9
		[ 입력 ] : 국어,영어,수학 입력받기
		[ 조건 ]
			평균이 90점 이상이면서 
				국어점수 100점 이면 '국어우수' 출력
				영어점수 100점 이면 '영어우수' 출력
				수학점수 100점 이면 '수학우수' 출력
			평균이 80점 이상이면서 
				국어점수 90점 이면 '국어장려' 출력
				영어점수 90점 이면 '영어정려' 출력
				수학점수 90점 이면 '수학장려' 출력
			그외 재시험 
		 */
		
		System.out.println("국어점수 : "); int korean = scanner.nextInt();
		System.out.println("영어점수 : "); int english = scanner.nextInt();
		System.out.println("수학점수 : "); int math = scanner.nextInt();
		int avg = (korean + english + math)/3;
		if (avg >= 90) {										// 평균 90점 이상이면
			// if 중첩
			if (korean == 100) System.out.println("국어우수");
			if (english == 100) System.out.println("영어우수");
			if (math == 100) System.out.println("수학우수");
		} else if (avg >= 80) {									// 평균 80점 이상이면
			if (korean >= 900) System.out.println("국어장려");
			if (english >= 90) System.out.println("영어장려");
			if (math >= 90) System.out.println("수학장려");
		} else {												// 그 외
			System.out.println("재시험");
		}
			
		

	}

}
