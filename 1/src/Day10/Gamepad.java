package Day10;

public interface Gamepad {
	
	// constant
	// abstract
	public void button_a();		// public (abstract)
	public void button_b();
	public void button_c();
	// default
	default void Gamepad_end() {
		System.out.println("�����е� ����");
	}
	default void charge() {
		System.out.println("������");
	}
	// static

}
