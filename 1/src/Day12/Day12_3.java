package Day12;

import java.io.IOException;

public class Day12_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// ���� �˻� ���α׷�
		// [����]
		// 1. �Է¹ޱ� [ System.in.read() ]
		// 2. String �迭�� ���� ������ ���� 
			//		String[] ������� = {	
			//			"�ȴ�! ���̹� ��α�&����Ʈ",
			//			"������ ��Ʈ ���� Ȱ�� ������",
			//			"Tucker�� Go ��� ���α׷���",
			//			"ȥ�� �����ϴ� C ���"
			//};
		// 3. �˻���� , ������� 
			// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
				// '���' �˻� ->  "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"
			// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� 
				// '����' ���� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ� 
		
		String[] booklist = { "�ȴ�! ���̹� ��α�&����Ʈ",
							"������ ��Ʈ ���� Ȱ�� ������",
							"Tucker�� Go ��� ���α׷���",
							"ȥ�� �����ϴ� C ���" };
		
		while (true) {
			System.out.println("1. �˻� 2. ����");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes);
			String ch = new String(bytes, 0, count-2);
			
			if (ch.equals("1")) {
				System.out.println("*** �˻� ***");
				System.out.print("å �̸� : ");
				count = System.in.read(bytes);
				String search = new String(bytes, 0 , count-2);
				for (String temp : booklist) {		// �迭 �� ���ڿ� ������
//					// 1. 
//					if (temp.indexOf(search) != -1) { // �ش� ���ڿ��� ã�� ������ �ε����� �����ϸ�
//							// indexOf �޼ҵ� -1 : ��ȯ�Ǵ� ���� ������ �ܾ ������� -> �˻� X
//						System.out.println(temp);	// ���
//					}
					// 2.
					if (temp.contains(search)) { // ���ڿ�.contains("ã�� ����") : ���ڿ� �� ã�����ڰ� true / false�� ��ȯ
						System.out.println(temp);
					}
				}
			} else if (ch.equals("2")) {
				System.out.println("*** ���� ***");
				System.out.print("������ : ");
				count = System.in.read(bytes);
				String update = new String(bytes,0,count-2);
				
				int i = 0;
				for (String temp : booklist) {
					if (temp.contains(update)) {
						System.out.println("������ȣ : " + i + " / ������ : " + temp);
					}
					i++;
				}
				
				System.out.println("������ȣ ���� : ");
				count = System.in.read(bytes);
				String ch2 = new String(bytes, 0, count-2);
				int index = Integer.parseInt(ch2);
				System.out.println("���� ���� : ");
					count = System.in.read(bytes);
					String oldstr = new String(bytes, 0, count-2);
				System.out.println("���ο� ���� : ");
					count = System.in.read(bytes);
					String newstr = new String(bytes, 0, count-2);
				booklist[index] = booklist[index].replace(oldstr, newstr);
			}
			
		}
		


	}

}
