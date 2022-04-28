package Day01;

public class Day01_2 { // c s
	
	public static void main(String[] args) { // m s
		// 1. 출력
			// 1. print() : 출력만
			// 2. printf() : 출력에 꾸미기
			// 3. println() : 출력하고 줄바꿈
				// 형식문자
					// %s : 문자 들어가는 자리
					// %d : 정수 들어가는 자리
					// %f : 실수 들어가는 자리	
						// \n : 줄바꿈
						// \t : 간격 삽입
		// 1. System : 시스템 클래스 [입출력 관련 만들어진 코드 제공]
		// 2. out : 출력 스트림
		// 3. print() : 출력 함수
		// 4. ; : 한줄 코드 끝알림	
		// * 시스템 클래스 내 out 이라는 출력스트림을 통해 print 함수를 사용해서 console에 원하는대로 출력할 수 있다.
	System.out.print("asdf"); // ; : 코드 단위 종료
	System.out.print("java 1일차"); // 문자처리 ""
	System.out.print(123); // 숫자는 "" X
		// * 미리 만들어진 단어[예약어]를 제외하는 모든 문자는 ""처리
	System.out.println("자바는 객체지향이다.");
	System.out.println("jdk8");
	System.out.println(123);
	// 형식출력
	System.out.printf("%s","asdf");
	System.out.printf("java %d일차",1);
	System.out.printf("%d", 123);
	// 예제 1
	System.out.println("\n\t\t[[출석부]]");
	System.out.println("-----------------------------------");
	System.out.println("이름\t1교시\t2교시\t3교시\t비고");
	System.out.println("강호동\t출석\t결석\t출석");
	System.out.println("유재석\t출석\t결석\t출석");
	System.out.println("-----------------------------------");
	// 예제 2
	System.out.println("\n\t\t[[출석부]]");
	System.out.println("-----------------------------------");
	System.out.printf("%s \t %d%s \t %d%s \t %d%s \t %s","이름",1,"교시",2,"교시",3,"교시","비고");
	System.out.printf("\n%s \t %s \t %s \t %s","강호동","출석","결석","출석");
	System.out.printf("\n%s \t %s \t %s \t %s","유재석","출석","결석","출석");
	System.out.println("\n-----------------------------------");
	
	// 문제 1 : 고양이
	System.out.println("\t \\    /\\");
	System.out.println("\t  )  ( ')");
	System.out.println("\t (   / )");
	System.out.println("\t  \\(__)|\n\n");
	// 문제 2 : 강아지
	System.out.println("\t|\\_/|");
	System.out.println("\t|q p|   /}");
	System.out.println("\t( 0 )\"\"\"\\");
	System.out.println("\t|\"^\"`    |");
	System.out.println("\t||_/=\\\\__|");
	} // m e
} // c e
