package Day15;

public class Day15_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.591 ����ȭ
			// ��Ƽ������ ��� �� ����ȭ ���� [���Ͻ�����]
			// ������ ������ ������ �޼ҵ� ȣ��
			// ���ôٹ������� �ϳ��� �޼ҵ� ȣ��
		
		// 1. ���� ��ü ����
		Calculator calculator = new Calculator();
		
		// 2. user1 ��ü ����
		User1 user1 = new User1();
		// ���� ��ü�� user1 ����
		user1.setCalculator(calculator);
		user1.start();
		
		// 3. user2 ��ü ����
		User2 user2 = new User2();
		// ���� ��ü�� user2 ����
		user2.setCalculator(calculator);
		user2.start();

	}

}
