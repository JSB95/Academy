package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean();
		k1.name = "유재석";
		k1.ssn = "123123-1231231";
		System.out.println("(빈생성자) k1 국적 : " + k1.nation);
		System.out.println("(빈생성자) k1 이름 : " + k1.name);
		System.out.println("(빈생성자) k1 주민등록번호 : " + k1.ssn);
		
		Korean k2 = new Korean("박자바","011225-1234567");
		System.out.println("k2 국적 : " + k2.nation);
		System.out.println("k2 이름 : " + k2.name);
		System.out.println("k2 주민등록번호 : " + k2.ssn);
		// 1. 빈 생성자 객체
		Korean 한국인1 = new Korean();
		// 2. 필드 1개 생성자 객체
		Korean 한국인2 = new Korean("유재석"); // 국적이 대한민국이고 이름이 유재석
		// 3. 필드 2개 생성자 객체
		Korean 한국인3 = new Korean("강호동", "123456-1234567"); // 국적이 대한민국, 이름이 강호동, 주민등록번호
		// 4. 필드 3개 생성자 객체
		Korean 힌국인4 = new Korean("일본", "신동엽", "132456-1234567"); // 국적이 일본, 이름이 신동엽, 주민등록번호
	}

}
