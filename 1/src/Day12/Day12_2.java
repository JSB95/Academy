package Day12;

public class Day12_2 {
	
	// String method
	
	public static void main(String[] args) {
		// p.501 equals() : ���ڿ� ��
		// �⺻ �ڷ��� ����ϴ� ������ ������ ��� ���� [==]
		// String Ŭ���� ����ϴ� ��ü�� ������ �̿� �Ұ��� [equlas ==]
		// 1. ���ڿ� ����
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		// 2. ���ڿ� ��
		
		if (strVar1 == strVar2) {
			System.out.println("���� String��ü�� ����");
		} else {
			System.out.println("�ٸ� String��ü�� ����");
		}
		
		
		
		// p.502 .getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���"; // ���� 1����Ʈ �ѱ� 2����Ʈ
		// ���ڿ� -> ����Ʈ�� ��ȯ
		byte[] bytes1 = str.getBytes();
		System.out.println("���� 1����Ʈ �ѱ� 2����Ʈ : " + bytes1.length);
		// ����Ʈ�� -> ���ڿ� ��ȯ
		String str1 = new String(bytes1);
		System.out.println("����Ʈ�� -> ���ڿ� " + str1);
		// ���ڵ� Ÿ��
		try {
			// 1. EUC-KR
			byte[] bytes2 = str.getBytes("EUC-KR");	 // �Ϲݿ���
			System.out.println("EUC-KR ���� : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("����Ʈ�� -> ���ڿ� : " + str2);
			// 2. UTF-8
			byte[] bytes3 = str.getBytes("UTF-8");	 // �Ϲݿ���
			System.out.println("UTF-8 ���� : " + bytes3.length);
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("����Ʈ�� -> ���ڿ� : " + str2);
		} catch (Exception e) {
			
		}
	
	}

}
