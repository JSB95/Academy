package Day10;

public interface Gamepad {
	
	// constant
	// abstract
	public void button_a();		// public (abstract)
	public void button_b();
	public void button_c();
	// default
	default void Gamepad_end() {
		System.out.println("게임패드 종료");
	}
	default void charge() {
		System.out.println("충전중");
	}
	// static

}
