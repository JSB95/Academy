package Day07;

public class Day07_1 {	// class start

	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub
		// �޼ҵ� ȣ�� ���
			// 1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			// 2. ��ü��.�޼ҵ��()
				// ex) scanner.next();
				// . : ���� ������ (�ʵ峪 �޼ҵ� ȣ���)
		
		// 1. ��ü ����
		Calculator myCalc = new Calculator();
		// Ŭ������ ��ü��[�̸�] = �޸��Ҵ� ������();
		
		// 2. �޼ҵ� ȣ�� [�μ� ����]
		myCalc.powerOn();
		
		// 3. �޼ҵ� ȣ�� [�μ� ����]
		int result = myCalc.plus(5, 6);		// �޼ҵ忡 5�� 6�� �����Ŀ� 11�̶�� ������� �޾Ƽ� ������ ����
		System.out.println("result : " + result);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();

	}	// main end

}	// class end
