package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean();
		k1.name = "���缮";
		k1.ssn = "123123-1231231";
		System.out.println("(�������) k1 ���� : " + k1.nation);
		System.out.println("(�������) k1 �̸� : " + k1.name);
		System.out.println("(�������) k1 �ֹε�Ϲ�ȣ : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�","011225-1234567");
		System.out.println("k2 ���� : " + k2.nation);
		System.out.println("k2 �̸� : " + k2.name);
		System.out.println("k2 �ֹε�Ϲ�ȣ : " + k2.ssn);
		// 1. �� ������ ��ü
		Korean �ѱ���1 = new Korean();
		// 2. �ʵ� 1�� ������ ��ü
		Korean �ѱ���2 = new Korean("���缮"); // ������ ���ѹα��̰� �̸��� ���缮
		// 3. �ʵ� 2�� ������ ��ü
		Korean �ѱ���3 = new Korean("��ȣ��", "123456-1234567"); // ������ ���ѹα�, �̸��� ��ȣ��, �ֹε�Ϲ�ȣ
		// 4. �ʵ� 3�� ������ ��ü
		Korean ������4 = new Korean("�Ϻ�", "�ŵ���", "132456-1234567"); // ������ �Ϻ�, �̸��� �ŵ���, �ֹε�Ϲ�ȣ
	}

}
