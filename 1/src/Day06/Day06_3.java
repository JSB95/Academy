package Day06;

import java.util.Scanner;

public class Day06_3 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// main �޼ҵ� ��� ������ ���
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // Member Ŭ������ ������� ��ü(id, pw, name, phone) 100�� ������ �� �ִ� �迭 ����
		while (true) {
			
			System.out.println("---------- ȸ���� [Ŭ����] ----------\n");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã��\n");
			System.out.print("���� > "); int ch = scanner.nextInt();
			
			if (ch == 1) {		// ȸ������
				System.out.println("---------- ȸ������ ������ ----------");
				System.out.print("���̵� : "); 		String id = scanner.next();
				System.out.print("��й�ȣ : ");		String pw = scanner.next();
				System.out.print("�̸� : ");		String name = scanner.next();
				System.out.print("����ó : ");		String phone = scanner.next();
				
				Member member = new Member();	// 2. ��ü ����
				member.id = id; 	// ��ü �� �ʵ� = �Է¹��� ��
				member.pw = pw;
				member.name = name;
				member.phone = phone;
				
				// ���̵� �ߺ�Ȯ��
					// �迭 �� ��ü�� �Է��� ���̵�� ������ ���̵� ã��
				boolean idchk = false;
				for (Member temp : memberlist) { 	// memberlist �迭 �� ��ü���� �ϳ��� temp�� ���� �ݺ�
					if (temp != null && temp.id.equals(id)) { 		// �ش� ��ü �� id�� �Է¹��� id�� ���ٸ�
						System.out.println("\n������� ���̵��Դϴ�.\n");		// �����޼��� ���
						idchk = true;
						break;
					}
				}
				
				// ���̵� �ߺ��� �ƴҰ�� ����
				if (idchk == false) {
					// ������ ��ü�� �����ϴ� �迭�� ����
					// ���� �ε��� ã�� [������ �ƴϸ� ����ȸ���� ����] 
					int i = 0;
					for (Member temp : memberlist) { // memberlist �迭 �� member ��ü �ϳ��� �����ͼ� temp�� ���� �ݺ�
						if (temp == null) { // ���� �ε����� ��ü ����
							memberlist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
							System.out.println("\nȸ������ �Ϸ�\n");
							break;
						}
						i++;	// �ε��� ����
					}
				}
				
			 } else if (ch == 2) {		// �α���
				 // 1. �Է¹ޱ�
				 System.out.println("---------- �α��� ������ ----------");
				 System.out.print("���̵� : "); 	String loginid = scanner.next();
				 System.out.print("��й�ȣ : "); 	String loginpw = scanner.next();
				 
				 // 2. ���� �迭[memberlist] �� �Է¹��� ���� ��
				 boolean loginchk = false; 	// true : �α��� ���� false : �α��� ����
				 for (Member temp : memberlist) {
					 if (temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
						 System.out.println("\n�α��� ����\n");
						 loginchk = true;
					 }
				 }
				 
				 // 3. �α��� ���� ����
				if (loginchk == false) {
					System.out.println("\nȸ�� ������ �����ϴ�.\n");
				}
				
			 } else if (ch == 3) { 		// ���̵� ã��
				 System.out.println("---------- ���̵� ã�� ������ -----------");
				 System.out.print("�̸� : ");		String name = scanner.next();		// �̸��� ����ó�� �Է¹޴´�
				 System.out.print("����ó : ");  	String phone = scanner.next();
				 boolean findid = false;
				 for (Member temp : memberlist) {
					 if (temp != null && temp.name.equals(name) && temp.phone.equals(phone)) { 		// ������ ����� �ִٸ�
						 System.out.println("ȸ�� ���̵� : " + temp.id);								// ���̵� ���
						 findid = true;
						 break;
					 }
				 }
				 if (findid == false) {
					 System.out.println("\n������ ȸ�������� �����ϴ�.\n");
				 }
			 } else if (ch == 4) {		// ��й�ȣ ã��
				 System.out.println("---------- ��й�ȣ ã�� ������ ----------");
				 System.out.print("���̵� : ");		String id = scanner.next();
				 System.out.print("����ó : ");  	String phone = scanner.next();
				 boolean findpw = false;
				 for (Member temp : memberlist) {
					 if (temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						 System.out.println("��й�ȣ : " + temp.pw);
						 findpw = true;
						 break;
					 }
				 }
				 if (findpw == false) {
					 System.out.println("\nȸ�������� �ٸ��ϴ�.\n");
				 }
			 } else {
				 System.err.println("\n�߸��� �����Դϴ�.\n");
			 }
			
		} // while end

	} // main end

} // class end
