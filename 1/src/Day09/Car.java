package Day09;

public class Car {
	
	// field
	
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���",3);
	Tire backRightTire = new Tire("�ڿ�����",4);
	// class_name object_name = new constructor(Ÿ�̾���ġ, Ÿ�̾� ����)
	
	// constructor
	
	// method
	int run() {	// ��� Ÿ�̾� ��ü�� 1ȸ�� ȸ��
		System.out.println("�ڵ����� �޸��ϴ�.");
		if (frontLeftTire.roll() == false) { // �տ��� : 1
			stop(); return 1; // ȸ�� -> false : ��ũ / true : ���� ����
		}
		if (frontRightTire.roll() == false) { // �տ����� : 2
			stop(); return 2;
		}
		if (backLeftTire.roll() == false) { // �ڿ��� : 3
			stop(); return 3;
		}
		if (backRightTire.roll() == false) { // �ڿ����� : 4
			stop(); return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	

}
