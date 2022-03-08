package Day06;

public class Korean {
	
	// 1. 필드
	String nation = "대한민국"; // 국가 변수에 미리 대입
	String name; // 이름 변수에는 초기화X[NULL]
	String ssn; // 주민등록번호 변수에는 초기화X[NULL]
	
	// 2. 생성자
		// 조건1 : 생성자이름 == 클랛 이름
		// 조건2 : 외부로부터 들어오는 매개값[인수] 샨얀
	
	// 빈생성자
	Korean(){
		// 내용물 없다
	}
	
	Korean (String n){
		name = n;
	}
	
	// 필드 2개를 갖는 생성자
	Korean (String n, String s){
		name = n;
		ssn = s;
	}
	
	// 필드 3개를 갖는 생성자
	Korean (String nation, String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		// 내부변수 (현재 클래스내 변수)
		// 매개변수 (외부로부터 들어오는 변수)
		// 내부변수 == 매개변수 이름이 동일하면 충돌
			// this. : 현재 클래스 표시
	}

}
