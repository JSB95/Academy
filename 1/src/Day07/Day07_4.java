package Day07;

public class Day07_4 {
	
	// p.229 : 외부호출

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 객체 선언
		Car2 myCar = new Car2();
		
		// 2. 시동 걸기
		myCar.keyTurnOn(); // factor X return X
		
		// 3. 실행
		myCar.run();	// factor X return X
		
		// 4. 현재 속도 확인
		int speed = myCar.getSpeed();	// factor X return O
		System.out.println("현재 속도 : " + speed + "km/h");

	}

}
