package Day18;

import java.util.ArrayList;

public class Day18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.722
			// ������ ��ü�� �߰�, �˻�, ���� -> �迭
			// �迭 ������ 
				// 1. ��Ư�� �ټ��� ��ü�� ���� �Ұ� [���̸� ũ�� �����ϸ� ��ȿ����]
				// 2. ������ �ε����� ��� �����Ͱ� ���������� ����
			// ��ü���� ȿ�������� �߰�, ����, �˻� -> �÷��� �����ӿ�ũ
			// �÷��� : ����	��	�����ӿ�ũ : ������� �̸� ���س��� ���̺귯��
			// ���� (����) ���� Ŭ���� / �������̽�
		// 1. List �������̽�
			// 1) ArrayList
			// 2) Vector
			// 3) LinkedList
		// 2. Set �������̽�
			// 1) HashSet
			// 2) TreeSet
		// 3. Map �������̽�
			// 1) HashMap
			// 2) HashTable
			// 3) TreeMap
			// 4) Properties
		
		// p.728 : ArrayList Ŭ����
			// �迭�� ���������� ���̰� ����[�ڵ�]
		
		// 1. ����Ʈ Ŭ���� ���� [����Ʈ �ȿ� ������ �׸��� �ڷ��� -> ���׸�]
		ArrayList<String> list = new ArrayList<>();
			// ArrayList<���׸�> ��ü�� = new ArrayList<���׸� = �������� > (����, ���ָ� 10����)
		
		// 2. ����Ʈ��ü��.add (��ü�� = ���׸�Ÿ��), ����Ʈ ��ü �� ��� �߰�
		list.add("java");				// �ε��� : 0
		list.add("jdbc");				// �ε��� : 1
		list.add("servlet/jsp");		// �ε��� : 2
			System.out.println("����Ʈ �� ��� : " + list);
		list.add(2, "database");		// �ε��� 2�� ��� �߰� [�����ε��� 2 -> 3���� �̵�]
			System.out.println("�ε��� �߰� �� ��� : " + list);
		list.add("iBATIS");
		
		// 3. ����Ʈ��ü��.size() : ����Ʈ ��ü �� ��ҵ��� ���� [����]
		System.out.println("����Ʈ ������ : " + list.size());
		// 4. ����Ʈ��ü��.get(index) :����Ʈ ��ü �� Ư�� �ε����� ��� ȣ��
		System.out.println("����Ʈ�� 2�� �ε��� ȣ�� : " + list.get(2));
		// 5. �ݺ��� Ȱ�� [����Ʈ�� �ݺ��� ���� ���]
		// �ε����� �ʿ��� ��
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		// �ε����� �ʿ����� ���� ��
		for (String str : list) {
			System.out.println(" : " + str);
		}
		
		//6. ����Ʈ��ü��.remove(�ε���/��ü)
	}

}
