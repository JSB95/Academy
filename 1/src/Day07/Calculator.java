package Day07;

public class Calculator {

	// Ŭ���� ����
	
	// 1. �ʵ�
	// 2. ������
		// ������ ������ ������ �⺻�����ڰ� �ڵ� �߰� ��.
	
	// 3. �޼ҵ�
	void powerOn() {	// �μ�, ��ȯ�� ����
		System.out.println("������ �մϴ�.");
	}
	
	// ����Ÿ�� : void
		// void : �����(����)�� �������� ���� (return �������� ��, ����� �߰��� ���� �Լ� ����)
	// powerOn : �޼ҵ� �̸�
	// (�Ű�����[�μ�]) : �Լ��� ������ �����͵� 
	// { �����ڵ� } : �Լ� ����� 
	
	int plus(int x, int y) {	// �μ�, ��ȯ�� �ִ�
		int result = x + y;
		return result;	// �Լ��� ȣ���ߴ� ������ �̵�
	}
	
	// ����Ÿ�� : int
		// �Լ��� ����Ǹ鼭 int�� �����Ͱ� ��ȯ��
	// plus : �޼ҵ� �̸�
	// (int x, int y) : �Լ� ȣ�� �� �Լ��� ������ x�� y�� int������ ����
	// { �����ڵ� } 
		// return ��ȯ�� : ���� Ÿ�԰� ��ȯ�� Ÿ���� ���ƾ� �Ѵ�.
	
	double divide(int x, int y) { // �μ�, ��ȯ�� �ִ�.
		double result = (double)x / (double)y;	// (�ڷ���)������ : ���� ����ȯ 
		return result;
	}
	
	// ����Ÿ�� : double
	// divide : �޼ҵ��
	// (int x, int y) : factor
	// { ���� �ڵ� } 
	
	void powerOff() { 		// factor X, return X
		System.out.println("������ ���ϴ�.");
	}
}
