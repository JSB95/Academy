package Day08;

public class Day08_4 {

	public static void main(String[] args) {
		// p.267~268 : Setter, Getter �޼ҵ�
			// �ʵ�� private ���Ǵ� ��찡 ����.
			// �ܺο��� �ʵ忡 ������ �� ����.
			// ���� : �ܺο��� �ʵ忡 �������� �����ϰ� �޼ҵ带 ����
			// Setter �޼ҵ� : �ʵ� ������ ����
			// Getter �޼ҵ� : �ʵ� ������ ȣ��
		
		// 1. ��ü ����
		Car myCar = new Car();
		// 2. ��ü �� �޼ҵ� ȣ��(setter �޼ҵ�)
		myCar.setSpeed(-50);
		// 3. ��ü �� �޼ҵ� ȣ��(getter �޼ҵ�)
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		myCar.setSpeed(60);
		if (myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		

	}

}
