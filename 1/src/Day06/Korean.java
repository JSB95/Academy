package Day06;

public class Korean {
	
	// 1. �ʵ�
	String nation = "���ѹα�"; // ���� ������ �̸� ����
	String name; // �̸� �������� �ʱ�ȭX[NULL]
	String ssn; // �ֹε�Ϲ�ȣ �������� �ʱ�ȭX[NULL]
	
	// 2. ������
		// ����1 : �������̸� == Ŭ�� �̸�
		// ����2 : �ܺηκ��� ������ �Ű���[�μ�] ����
	
	// �������
	Korean(){
		// ���빰 ����
	}
	
	Korean (String n){
		name = n;
	}
	
	// �ʵ� 2���� ���� ������
	Korean (String n, String s){
		name = n;
		ssn = s;
	}
	
	// �ʵ� 3���� ���� ������
	Korean (String nation, String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		// ���κ��� (���� Ŭ������ ����)
		// �Ű����� (�ܺηκ��� ������ ����)
		// ���κ��� == �Ű����� �̸��� �����ϸ� �浹
			// this. : ���� Ŭ���� ǥ��
	}

}
