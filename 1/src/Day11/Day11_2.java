package Day11;

public class Day11_2 {
	
	// p.422
		// ��ǻ���� �ϵ���� ������ ������ ���� (���� �Ұ���)
		// ������� �߸��� ���� �Ǵ� �������� �߸��� �ڵ� -> ���� -> ����
		// 1. �Ϲݿ��� : ������[����]���� ���� �˻� -> �����ڿ��� ���� ����ó�� �ȳ�
		// 2. ���࿹�� : ������[����]�Ŀ� ���� �˻� -> �������� ���迡 ���� �Ǵ��ؼ� ����ó��
		// ���� ó��
			// ���� : ������ �߻��ϸ� ���α׷��� ���� (������ ����)
			// ���࿡ ������ �߻��ϸ� ��ü �ڵ尡 ���� (���α׷��� ������� �ʰ�)
	
		/*
		 * 	try{
		 * 	���ܰ� �߻��� �� ���� �ڵ�
		 * 	} catch (���� Ŭ���� ��ü��) {
		 * 	���ܰ� �߻��ϸ� ���� �� �ڵ�
		 * 	}
		 */
	
	public static void main(String[] args) {
		// p.423 NullPointException
		
		try {
			String data = null;
			System.out.println(data.toString()); 		// objectŬ���� �޼ҵ� toString : ��ü ���� ���
			// null �� �޸� �Ҵ��� ���� ������ ��ü ���� ��� �Ұ���
		} catch (NullPointerException e) {
			System.out.println("���� �߻� : " + e);
		}
		
		// p.424 ArrayIndexOutOfBoundsException
		try {
			String[] array = new String[2];				// String 2���� ������ �� �ִ� �迭
			array[0] = "a";
			array[1] = "b";
			array[2] = "c";
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���ܹ߻� : " + e);
		}
		
		// p.426 NumberFormatException
		try {
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1);		// "100" -> 100
			int value2 = Integer.parseInt(data2);		// "a100" -> a�� ������ ǥ�� �Ұ���
					//	 Integer.parseInt(String) : ���ڿ��� ������ ��ȯ
			// ���� : ���ڿ� �� ���������� ���������� ��ȯ�� ����������, ���ڿ��� ���������� ���������� ��ȯ �Ұ���
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("���� �߻� : " + e);
		}
		
		// p.428
		String string_object = "���缮";			// �ڹ� Ŭ���� �� �ϳ� (Object ���)
		Object super_object;		// �ڹ� Ŭ���� �� �ֻ��� Ŭ����
		
		super_object = string_object;			// �ڽ� -> �θ� ����
		string_object = (String) super_object;	// �θ� -> �ڽ� �Ұ���
		
		// ����ó�� �Ǵ�
			// ����� (����� ���忡��) ���õ� �ڵ� -> ����ó��
	}

}
