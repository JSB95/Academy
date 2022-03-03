package Day02;
public class Day02_4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// p.64 ������
		/*
		 * 1. ���
		 * 	1. + (���ϱ�) 2. - (����) 3. * (���ϱ�) 4. / (������ => ��) 5. % (������ => ������) 
		 *
		 * 2. ��
		 * 	> �ʰ� < �̸� >= �̻� <=���� == ���� =! ���� �ʴ�
		 * 
		 * 3. �� [2�� �̻��� �񱳿����� ����]
		 * 	&& �̸鼭 �鼭 �̰� ��� �׸��� and
		 * 	|| �̰ų� �ų� �Ǵ� �ϳ��� or
		 * 	! ����[�ݴ�] true -> false / false -> true
		 * 	
		 * 4. ����
		 * 	= : ������ ���� �������� �̵�
		 * 	+= : ������ ���� ���ʰ��� ���ϱ� �Ŀ� ���� ���� ����
		 *  	������ = ������ + 10
		 *  		1. ������ ȣ��
		 *  		2. ������ 10�� ���Ѵ�
		 *  		3. �ش� ������ ���Ѱ��� ����
		 *  	������ += 10
		 *  		1. ������ ȣ��
		 *  		2. ������ ���� ���� �Ŀ� ������ ����
		 * 
		 * 5. ����
		 * 	1. ++ : 1 ���� 2. -- : 1 ����
		 * 	�������� : ���� �����ϰ� �ٸ� ��ɾ� ó��
		 * 	�������� : ��ɾ ó�� �� ����
		 * 
		 * 6. ���⿬����[���ǿ�����]
		 * 	���ǽ� ? �� :����
		 * 	
		 */
		
		// ��������� ����
		int int1 = 10; int int2 = 20; 							// ���� 10�� 20�� �����ϴ� 2���� ���� ����
		System.out.println("���ϱ� :" + int1 + int2); 			// ���ڿ� + ���� -> ���Ῥ����
		System.out.println("���ϱ� : " + (int1 + int2));			// ���ڿ� + (����1 + ����2)
		System.out.println("���� : " + (int1 - int2)); 		
		System.out.println("���ϱ� : " + (int1 * int2));
		System.out.println("������(��) : " + (int1 / int2));		// �� : 0
		System.out.println("������(������) : " + (int1 % int2));	// ������ : 10
		
		// ���������� ����
		int1 ++; 												// ������ �ڿ� ++ �� ��� �ش� ������ �����Ϳ� +1
		System.out.println("���� : " + int1);
		int1 --;												// ������ �ڿ� -- �� ��� �ش� ������ �����Ϳ� -1
		System.out.println("���� : " + int1);
		System.out.println("�������� : " + ++int1);				// 11 ���
		System.out.println("�������� : " + int1++);				// 11 ���
			// ��ɾ� ó���� ����ó�� �Ұ��� -> ó�� ������ ����
			// ++���� : ���� �����Ŀ� print ����
			// ����++ : print �����Ŀ� ����
		System.out.println("�������� �� : " + int1);				// 12 ���
		
		System.out.println("�������� : " + --int1); 				// 1 ���� �� ��� => 11
		System.out.println("�������� : " + int1--); 				// ��� �Ŀ� 1 ���� => 11
		System.out.println("�������� �� : " + int1);				// 10 ���
		
		// �񱳿����� ����
		System.out.println("�̻� : " + (int1 >= int2));  			// 10 >= 20 ����
		System.out.println("���� : " + (int1 <= int2));  			// 10 <= 20 ��
		System.out.println("�ʰ� : " + (int1 > int2));  			// 10 > 20 ����
		System.out.println("�̸� : " + (int1 < int2));  			// 10 < 20 ��
		System.out.println("���� : " + (int1 == int2));  			// 10 == 20 ����
		System.out.println("���� �ʴ� : " + (int1 != int2));  		// 10 != 20 ��
		
		// �������� ����
			// and && : 2�� �̻��� �񱳿������� ��� true => ����� true �ƴϸ� false
			// or || : 2�� �̻��� �񱳿����ڰ� �ϳ��� true => ����� true �ƴϸ� false
		int int3 = 30; int int4 = 40;
		System.out.println("and : " + (int1 >= int2 && int4 >= int3)); 
			// 10>=20 and 40 >= 30
			// false and true => false
		System.out.println("or : " + (int1 >= int2 || int4 >= int3)); 
			// 10>=20 or 40 >= 30
			// false or true => true
		System.out.println("not ���� : " + !(int1 >= int2 || int4 >= int3)); 
			// ��� true -> ! -> false
		
		// ���Կ����� ����
		int1 = int1 + 10;	System.out.println("����1 : " + int1);
		int1 += 10;			System.out.println("����1 : " + int1);
		System.out.println("����1 : " + (int1 -= 10));
		System.out.println("����1 : " + (int1 /= 10));
		
		// ���ǿ����� ����
		int ���� = 85;
		char ��� = ���� > 90 ? 'A' : 'B';
			// ���ǽ� ? ��(true) : ����(false)
			// ���� ������ 90 �ʰ��ϸ� A ���� �ƴϸ� B ����
		System.out.println("��� : " + ���);
		char ���2 = ���� > 90 ? 'A' : ���� > 80 ? 'B' : 'C';
			// ���ǽ� ? �� : ���� [���ǽ� ? �� : ����]
			// ���� ������ 90 �ʰ��ϸ� A ���� �ƴϸ� ���������� 80 �ʰ��ϸ� B ���� �ƴϸ� C ����
	
								
		
	}

}
