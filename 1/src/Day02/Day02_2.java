package Day02;

public class Day02_2 { // c s

	@SuppressWarnings("unused")
	public static void main(String[] args) { // m s
		
		//; : ���� ���� ����
		// ������ ���� ���� ����� �� ����. [�̸��� �ߺ��Ǹ� ����(���кҰ�)]
		
		// p.40 byte : 1����Ʈ +- 128
		byte var1 = -128;	System.out.println(var1);
		byte var2 = -30;	System.out.println(var2);
		byte var3 = 0;		System.out.println(var3);
		byte var4 = 30;		System.out.println(var4);
		byte var5 = 127;	System.out.println(var5);
		//byte var6 = 128;	System.out.println(var6);	
			// ���� �߻� : 128 �̻��� ������ �� ����.
		byte var7 = 'j';	System.out.println(var7);
			// ���� -> ����
		
		// p.43 char : 2����Ʈ [1����] - �����ڵ�(2����Ʈ:���� �����) vs �ƽ�Ű�ڵ�
		char c1 = 'a';		System.out.println(c1);
		char c2 = 97; 		System.out.println(c2); // 10���� ǥ�� : 0~9
			// ���� -> ���� ��ȯ
		char c3 = '\u0041'; System.out.println(c3); // 16���� ǥ��
		char c4 = '��'; 		System.out.println(c4);
		char c5 = 44032; 	System.out.println(c5);
		char c6 = '\uac00';	System.out.println(c6);
		
		// ���� [��ǻ�Ͱ� 2������ ����ϸ� ǥ�������� ���� ������ �پ缺�� ���� �ٸ� ������ ���]
			// 2���� : 0, 1	/ ����(2���ڵ�) / �뷮(1��Ʈ)
			// 8���� : 0 ~ 7
			// 10���� : 0 ~ 9
			// 16���� : 0 ~ 9 A B C D E F
		
		// p.44 short : 2����Ʈ ���� +-3������
		short num1 = 30000;	System.out.println(num1);
		//short num2 = 40000; System.out.println(num2); ���� �߻�
		
		
		// p.45 int : 4����Ʈ ���� +-20������ (�⺻)
		int num2 = 10;		System.out.println(num2); // 10����
		int num3 = 012;		System.out.println(num3); // 8������ �տ� 0 ���̱�
		int num4 = 0x4;		System.out.println(num4); // 16������ �տ� 0x���̱�
		
		// p.46 long : 8����Ʈ ���� +-20�� �̻� [������ �ڿ� L]
		long num5 = 10000000000L;	System.out.println(num5);
					// int�� -> long��
		
		// p.47 float [������ �ڿ� f] : 4����Ʈ - �Ҽ��� ���� 9�ڸ� / double [�Ǽ� �⺻ Ÿ��] : 8����Ʈ - �Ҽ��� ���� 17�ڸ�
		double num6 = 3.14; System.out.println(num6);
		float num7 = 3.14f; System.out.println(num7);
		
		double num8 = 0.123456789123465789111111111; System.out.println(num8);
		float num9 = 0.12345678912345678911111111f;  System.out.println(num9);
		
		// p.48 boolean : 1��Ʈ [true or false]
			// ����ġ : on, off
		boolean bol = true;	System.out.println(bol);
		
		// p.49 Ÿ�� ��ȯ
			// * ũ�� ���� : byte -> short -> int -> long -> float -> double [�ڵ� ����ȯ ����]
			// 1. �ڵ� ����ȯ : ���� ���ڿ��� ū ���ڷ� �̵� ����, ū ���ڿ��� ���� ���ڷ� �̵� �Ұ�
		byte ����Ʈ = 10;
		int ��Ʈ = ����Ʈ; // �ڵ� ����ȯ O
			// 2. ���� ����ȯ : ū ���ڿ��� ���� ���ڷ� �̵� ���� ��, ������ �ս� ���� (�������ڷ�)������
		short ��Ʈ = (short)��Ʈ; // int�� ������ short�� ��ȯ�ϴµ�, ������ �ս�
		
		/* p.60 ��������
		 * ������ ���ڷ� ������ �� ����, �����[�̸� ������� ���] �Ұ�
		 * �⺻�ڷ��� ����� �޸𸮴� ���� -> �޸� �Ҵ� / new X
		 * Ŭ������ ����� �޸𸮴� ��ü -> �޸� �Ҵ� / new O
		 * �ڷ��� ����� �ڷ��� ��ȯ 	byte + byte = int
		 * 						int + byte = int
		 * 						int + float = int
		 * 						int + double = int
		 */
		
	} // m e

} // c e
