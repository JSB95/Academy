package Day06;

import java.util.Scanner;

public class Day06_3 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// main �޼ҵ� ��� ������ ���
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // Member Ŭ������ ������� ��ü(id, pw, name, phone) 100�� ������ �� �ִ� �迭 ����
		while (true) {
			
			System.out.println("---------- ȸ���� [Ŭ����] ----------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã��");
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
				
				// 4. ������ ��ü�� �����ϴ� �迭�� ����
					// 1. ���� �ε��� ã�� [������ �ƴϸ� ����ȸ���� ����] 
				int i = 0;
				for (Member temp : memberlist) { // memberlist �迭 �� member ��ü �ϳ��� �����ͼ� temp�� ���� �ݺ�
					if (temp == null) { // 2. ���� �ε����� ��ü ����
						memberlist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
						System.out.println("\nȸ������ �Ϸ�");
						break;
					}
					i++;	// �ε��� ����
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
						 System.out.println("\n�α��� ����");
						 loginchk = true;
					 }
				 }
				 
				 // 3. �α��� ���� ����
				if (loginchk == false) {
					System.out.println("ȸ�� ������ �����ϴ�.");
				}
			 }
			
		} // while end

	} // main end

} // class end
