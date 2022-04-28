package Day10;

public class tekken implements Gamepad{
	// 게임 클래스에 게임패드 인터페이스 연결
		// 추상메소드 구현
		// 버튼에 대한 기능 구현
	@Override
	public void button_a() {
		// TODO Auto-generated method stub
		System.out.println("공격");
	}
	@Override
	public void button_b() {
		// TODO Auto-generated method stub
		System.out.println("방어");
	}
	@Override
	public void button_c() {
		// TODO Auto-generated method stub
		System.out.println("교체");
	}
}
