package Day16;

public class Day16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���׸�
		
		// p.656 �����׸�
		// ��1)
		// 1. Box ��ü ����
		Box box = new Box();
		// 2. ��ü �� �޼ҵ� ȣ�� [�μ� : String] : Object ����
		box.setObject("ȫ�浿");
		// 3. ��ü �� �޼ҵ� ȣ�� [��ȯ : Object] : 
		String name = (String) box.getObject();
		
			// �ڽİ�ü -> �θ�ü [�ڵ�����ȯ]
			// �θ�ü -> �ڽİ�ü [��������ȯ] (������ �ս�)
		box.setObject(new Apple()); // [�μ� : Apple] : Object
		Apple apple = (Apple) box.getObject();
	}

}
