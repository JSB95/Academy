package Day09;

public class Car {
	
	// field
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	// class_name object_name = new constructor(타이어위치, 타이어 수명)
	
	// constructor
	
	// method
	int run() {	// 모든 타이어 객체가 1회씩 회전
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll() == false) { // 앞왼쪽 : 1
			stop(); return 1; // 회전 -> false : 펑크 / true : 수명 남음
		}
		if (frontRightTire.roll() == false) { // 앞오른쪽 : 2
			stop(); return 2;
		}
		if (backLeftTire.roll() == false) { // 뒤왼쪽 : 3
			stop(); return 3;
		}
		if (backRightTire.roll() == false) { // 뒤오른쪽 : 4
			stop(); return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	

}
