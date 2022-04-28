package Day09;

public class Tire {
	
	// field
	
	public int maxRotation;				// 최대 회전수(회전 가능수)
	public int accumulatedRaotation;	// 누적 회전수
	public String location;				// 타이어 위치
	
	// constructor
	public Tire (String loaction, int maxRotation) { // 타이어 위치, 최대 회전수
		this.location = loaction;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {		// 타이어 회전 구현
		accumulatedRaotation++;	// 누적회전수(타이어회전) 1증가
		if (accumulatedRaotation < maxRotation) {	// 누적회전수가 최대 회전수보다 작으면 (수명남음)
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRaotation) + "회");
			return true;
		} else { // 아니면 (수명이 없으면)
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
