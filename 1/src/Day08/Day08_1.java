package Day08;

public class Day08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.238 : static
			// ��������
			// �������� ������ = ���α׷� ���������� ���Ǵ� �޸�
		
		// Ŭ���� �� �ʵ�, �޼ҵ�(���) ���ٹ��
			// 1. ��ü ���� -> ��ü.���
		Calculator calculator = new Calculator();
		System.out.println("��ü�� �̿��� ������� : " + calculator.pi);
			// (static ����϶�) 1. Ŭ������.���
				// Ŭ���� �ε��ǰ� �޼ҵ� ������ static ������ �޸� �Ҵ�
		System.out.println("��ü ���� ������� : " + calculator.pi);
		
		double result = 10 * 10 * calculator.pi;
								// Ŭ������.����������
		int result2 = calculator.plus(10, 5);
		int result3 = calculator.minus(10, 5);
		
		System.out.println("result1 = " + result);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	}

}