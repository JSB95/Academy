package Day10;

public interface RemoteControl {		// �������̽� ���� / ������ �������̽� ����
	
	// member [p.348]
	
	// 1. constant field : ������ ������
	public int MAX_VOLUME = 10; 		// �������� �ִ� ����
	public int MIN_VOLUME = 0;			// �������� �ּ� ����
	
	// 2. abstract method : ���� O ���� X
		// abstract : �߻� [�������̽������� ����]
	public void turnOn();		// { } ����, ���� X
	public void turnOff();
	public abstract void setVolume(int volume);
	
	// 3. default method : ���� O ���� O
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó��");
		} else {
			System.out.println("���� ����");
		}
	}
	
	// 4. static method : ���� O ���� O [��ü ���� ����]
	static void changeBattery() {
		System.out.println("������ ��ü");
	}

}
