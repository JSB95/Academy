package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p223~224 : ���ϰ��� ���� �޼ҵ� (void)
		
		// 1. ��ü ���� [������� -> �⺻������]
		Car mycar = new Car();
		
		// 2. �޼ҵ� ȣ�� [�μ� 1�� = 5]
		mycar.setGas(100);
		System.out.println(mycar.gas);
		
		// 3. �޼ҵ� ȣ�� [�μ� x ��ȯ boolean]
		if (mycar.isLeftGas()) {
			System.out.println("����մϴ�.");
			// 4. �޼ҵ� ȣ��
			mycar.run();
		}
		
		if (mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
