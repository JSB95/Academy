package Day07;

public class Day07_4 {
	
	// p.229 : �ܺ�ȣ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ��ü ����
		Car2 myCar = new Car2();
		
		// 2. �õ� �ɱ�
		myCar.keyTurnOn(); // factor X return X
		
		// 3. ����
		myCar.run();	// factor X return X
		
		// 4. ���� �ӵ� Ȯ��
		int speed = myCar.getSpeed();	// factor X return O
		System.out.println("���� �ӵ� : " + speed + "km/h");

	}

}
