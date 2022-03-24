package Day17;

public class Day17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.661~662
		// 1. box 객체 생성 [제네릭 : Integer]
		Box<Integer> box1 = new Box<>();
		// 2. 메소드 호출 후 결과값을 객체에 대입
		box1 = Util.<Integer>boxing(100);
		// 3. 확인
		System.out.println("확인 : " + box1.get());
		
		// p.662~663
		// 1. p1객체를 선언하는데 생성자에 정수 1과 문자열 '사과' 넣기 -> 제네릭 <정수,문자열>
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		// 2. p2객체 선언
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		boolean result1 = Util.compare(p1, p2);
		
		if (result1) {
			System.out.println("동등한 객체");
		} else {
			System.out.println("동등하지 않은 객체");
		}
		
		Pair<String, String>p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String>p4 = new Pair<String, String>("user2", "홍길동");
		
		boolean result2 = Util.compare(p3, p4);
		
		if (result2) {
			System.out.println("동등한 객체");
		} else {
			System.out.println("동등하지 않은 객체");
		}

	}

}
