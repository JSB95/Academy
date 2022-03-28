package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �÷��� �����ӿ�ũ (�̸� ������� Ŭ����)
			// * �迭�� ������ �����ϱ� ���� ���
			// 1. List �÷��� (�ε����� ����)
				// 1) ArrayList Ŭ����	: �̱۽�����, ������ �߰�/���� ����
				// 2) Vector Ŭ����		: ��Ƽ������ (����ȭ ����)
				// 3) LinkedListŬ����	: �̱۽�����, �߰� ����/������ ������쿡 ���
			// 2. Set �÷��� (�ε����� ���� / ��������� ���� ������ �ڵ����� ��ü�� �ߺ� �Ұ���)
				// 1) HashSet Ŭ����
					// 1. .add( ��ü�� ) : set ��ü�� ��ü(���) �߰� 
					// 2. .size() : set ��ü�� ��ü(���) ���� 
					// 3. .iterator() : set ��ü ��ȸ �޼ҵ� 
						// * Iterator<���׸�> �������̽��� : �������� ��ü ��ȸ �������̽� 
						// * Iterator<���׸�> iterator = set.iterator();
						//		1. iterator.hasnext() : ���� ��ü ���� ���� Ȯ�� 
						//		2. iterator.next() : ���� ��� �������� 
						// or
						// for( �ӽð�ü�� : set��ü�� ) { }
					// 4. .remove( ��ü�� ) : set ��ü�� ��ü ���� 
					// 5. .clear() : set ��ü�� ��ü ��ü ���� 
				
			// 3. Map �÷���
		
		// p.737 
		// 1. HashSet ��ü ����
		HashSet<String> set = new HashSet<>();
		// HashSet : Collection Framework class
			// <Generic> : SetŬ���� �ȿ� ���� �ڷ���
					 // set : ��ü��
							// new : ��ü ���� �� �޸� �Ҵ�
								// HashSet<Generic ���� ����>();
		
		// 2. set��ü �� ��ü �ֱ� [set��ü��.add(��ü��)]
		set.add("java");		System.out.println("Ȯ�� : " + set);
		set.add("ABCD");		System.out.println("Ȯ�� : " + set);
		set.add("Servlet/JSP");		System.out.println("Ȯ�� : " + set);
		set.add("java");		System.out.println("Ȯ�� : " + set);		// ��ü �ߺ� �� �߰� �ȵ�
		set.add("iBATIS");		System.out.println("Ȯ�� : " + set);
		// 3. set��ü �� ��ü �� [set��ü��.size()]
		System.out.println("set ��ü �� : " + set.size());
		// 4. Iterator : ����� ��ü�� �ѹ��� �������� �ݺ��� ���� (��ȸ)
			// * set�÷��ǿ��� ���Ǵ� ���� : �ε����� ���� ������ ��ü�� ȣ���ϴ� ����� ���� ������
		Iterator<String> iterator = set.iterator();		// set��ü�� iterator(��ȸ)
		while (iterator.hasNext()) {					// .hasNext() : ���� ��� ���� ���� Ȯ�� / boolean
			String element = iterator.next();			// .next() : ���� ��� ��������
			System.out.println("\t" + element);
		}
		// for (�ӽ� ��ü�� : �÷���/�迭) : �÷��� �迭 �� ��ҵ��� �ѹ��� �������� �ݺ���
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		// 5. set��ü��.remove(��ü��) : set��ü �� �ش� ��ü�� ����
		set.remove("ABCD");		System.out.println("Ȯ�� : " + set);
		set.remove("iBATIS");	System.out.println("Ȯ�� : " + set);
		
		// 6. set��ü��.clear() : set��ü �� ��� ��ü ����
		set.clear();			System.out.println("Ȯ�� : " + set);
		
		
		

	}

}
