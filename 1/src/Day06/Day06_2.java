package Day06;

public class Day06_2 {

	public static void main(String[] args) {
		
		// 1. Ŭ���� ���� �� -> ��ü ����
		Car myCar = new Car();
			// 1. Car : ���ǵ� Ŭ������
			// 2. myCar : ��ü�̸�
			// 3. new : �޸� �Ҵ� ������
			// 4. Car() : ������
		
		// 2. ��ü �� �ʵ� ȣ�� [. : ���� ������(��ü �� ����� ����)]
		System.out.println("����ȸ�� : " + myCar.company);
			// myCar ��ü �� �ʵ� ����
			// ��ü��.����̸�
		System.out.println("�𵨸� : " + myCar.model);
			// myCar.model : model �ʵ� ȣ��
		System.out.println("���� : " + myCar.color);
			// myCar.color : color �ʵ� ȣ��
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
			// myCar.maxSpeed : maxSpeed �ʵ� ȣ��
		System.out.println("����ӵ� : " + myCar.speed);
			// myCar.spped : speed �ʵ� ȣ��
		
		// 3. ��ü �� �ʵ尪 ����
		myCar.speed = 60;
			// myCar ��ü �� speed �ʵ带 ȣ���Ͽ� 60�̶�� ������ ����
		System.out.println("������ �ӵ� : " + myCar.speed);
		
		// ���ο� �ڵ��� ��ü ����
		Car car = new Car();
		System.out.println("2�� �ڵ��� �ӵ� : " + car.speed);

	}

}
