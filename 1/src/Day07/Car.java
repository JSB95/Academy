package Day07;

public class Car {
	
	// Ŭ���� ����
	
	// field
	int gas; // gas variable
	
	// constructor 
		 // ������ �⺻������
	
	// method
	void setGas(int gas) { 	// gas�� �ܺηκ��� �Է¹޾� factor O / return X
		this.gas = gas;		// ���ο� ���� / ���κ����� �ܺκ����� �̸��� ������ �� �����ϴ� ���.
								// this.�ʵ�� : ����(���� Ŭ����) ����
	}
	
	boolean isLeftGas() {	// ���κ��� gas�� ������ Ȯ�� [0 : ������ ���� false][1: ������ �־� true]
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		while (true) {	// ���ѷ��� ���� : return, break, ����ġ ����
			if (gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ� : " + gas + ")");
				gas--;	// gas���� 1�� ����
			} else {
				System.out.println("����ϴ�. (gas�ܷ� : " + gas + ")");
				return;
			}
		}
	}

}
