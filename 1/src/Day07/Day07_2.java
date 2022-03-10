package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p223~224 : 리턴값이 없는 메소드 (void)
		
		// 1. 객체 선언 [빈생성자 -> 기본생성자]
		Car mycar = new Car();
		
		// 2. 메소드 호출 [인수 1개 = 5]
		mycar.setGas(100);
		System.out.println(mycar.gas);
		
		// 3. 메소드 호출 [인수 x 반환 boolean]
		if (mycar.isLeftGas()) {
			System.out.println("출발합니다.");
			// 4. 메소드 호출
			mycar.run();
		}
		
		if (mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
