package Day09;

public class CellPhone {
	
	// field
	String model;
	String color;
	
	// constructor
	
	// method
	
	// factor X , return X
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	// factor O, return X
	void sendvoice(String message) {
		System.out.println("�ڱ� : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	// factor X, return X
	void hangUP() {
		System.out.println("��ȭ�� �����ϴ�.");
	}

}
