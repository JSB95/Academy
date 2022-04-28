package Day16;

public class Day16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 제네릭
		
		// p.656 비제네릭
		// 예1)
		// 1. Box 객체 생성
		Box box = new Box();
		// 2. 객체 내 메소드 호출 [인수 : String] : Object 가능
		box.setObject("홍길동");
		// 3. 객체 내 메소드 호출 [반환 : Object] : 
		String name = (String) box.getObject();
		
			// 자식객체 -> 부모객체 [자동형변환]
			// 부모객체 -> 자식객체 [강제형변환] (데이터 손실)
		box.setObject(new Apple()); // [인수 : Apple] : Object
		Apple apple = (Apple) box.getObject();
	}

}
