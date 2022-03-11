package Day08;

public class Day08_4 {

	public static void main(String[] args) {
		// p.267~268 : Setter, Getter 메소드
			// 필드는 private 사용되는 경우가 많다.
			// 외부에서 필드에 접근할 수 없다.
			// 목적 : 외부에서 필드에 직접접근 제한하고 메소드를 통한
			// Setter 메소드 : 필드 데이터 변경
			// Getter 메소드 : 필드 데이터 호출
		
		// 1. 객체 생성
		Car myCar = new Car();
		// 2. 객체 내 메소드 호출(setter 메소드)
		myCar.setSpeed(-50);
		// 3. 객체 내 메소드 호출(getter 메소드)
		System.out.println("현재 속도 : " + myCar.getSpeed());
		myCar.setSpeed(60);
		if (myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
		

	}

}
