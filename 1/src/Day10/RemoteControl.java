package Day10;

public interface RemoteControl {		// 인터페이스 선언 / 리모컨 인터페이스 생성
	
	// member [p.348]
	
	// 1. constant field : 고정된 데이터
	public int MAX_VOLUME = 10; 		// 리모컨의 최대 소음
	public int MIN_VOLUME = 0;			// 리모컨의 최소 소음
	
	// 2. abstract method : 선언 O 구현 X
		// abstract : 추상 [인터페이스에서는 생략]
	public void turnOn();		// { } 생략, 구현 X
	public void turnOff();
	public abstract void setVolume(int volume);
	
	// 3. default method : 선언 O 구현 O
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	// 4. static method : 선언 O 구현 O [객체 없이 가능]
	static void changeBattery() {
		System.out.println("건전지 교체");
	}

}
