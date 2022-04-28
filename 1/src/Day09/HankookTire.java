package Day09;

public class HankookTire extends Tire{
	
	// field
	// constructor
	public HankookTire (String location, int maxRoatation) {
		super(location, maxRoatation);
		// super (factor1, factor2) 슈퍼클래스 내 [인수 2개] 생성자 호출
	}
	
	// method
	@Override 	// 슈퍼클래스 내 메소드를 재정의 (수정)
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRaotation++;
		if (accumulatedRaotation < maxRotation) {
			System.out.println(location + "한국타이어 수명" + (maxRotation-accumulatedRaotation));
			return true;
		} else {
			System.out.println("*** " + location + " 한국타이어 펑크 ***");
			return false;
		}
	}
	
	

}
