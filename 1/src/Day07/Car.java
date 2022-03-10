package Day07;

public class Car {
	
	// 클래스 선언
	
	// field
	int gas; // gas variable
	
	// constructor 
		 // 없으면 기본생성자
	
	// method
	void setGas(int gas) { 	// gas를 외부로부터 입력받아 factor O / return X
		this.gas = gas;		// 내부에 저장 / 내부변수와 외부변수가 이름이 동일할 때 구별하는 방법.
								// this.필드명 : 내부(현재 클래스) 변수
	}
	
	boolean isLeftGas() {	// 내부변수 gas에 데이터 확인 [0 : 가스가 없어 false][1: 가스가 있어 true]
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while (true) {	// 무한루프 종료 : return, break, 스위치 제어
			if (gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas--;	// gas변수 1씩 차감
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return;
			}
		}
	}

}
