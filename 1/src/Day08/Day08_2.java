package Day08;

public class Day08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.245 : final
			// 최종적인 필드
			// 고정값 만들기
			// 사용하는 방법 : 1. 필드 선언시 2. 생성자에서
		
		// 1. 객체 생성
		Person p1 = new Person("123123-123123","계백");
		// 2. 객체 내 필드 수정
//		p1.nation = "USA"; // final 필드면 수정 불가능
//		p1.ssn = "456456-456456";
		p1.name = "유재석";

	}

}
