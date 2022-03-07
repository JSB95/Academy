package Day05;

import java.util.Scanner;

public class Day05_2 { // class start
	
	// ȸ���� �湮�� ���α׷� [2���� �迭]
		// 1. �ʱ�޴� [1. ȸ������ 2. �α���]
			// 1. ȸ������ [���̵�, ��й�ȣ, �α���]
			// 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α��� ó��]
		// 2. �α��ν� �޴� [1. �湮�� ���� 2. �湮�� ���� 3. �α׾ƿ�]
			// 1. �湮�� ���� [����, ����, �ۼ���(�α��ε� ���̵�)]
			// 2. �α׾ƿ� [�ʱ�޴��� ���ư���]

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �������� ����
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		// ȸ�� �迭 (100��)
		String[][] memberlist = new String[100][3]; // 100�� 3�� => [1�� = ���̵�][2�� = ��й�ȣ][3�� = �̸�]
		
		// �湮�� �迭(100��)
		String[][] boardlist = new String[100][3]; // 100�� 3�� => [1�� = ����][2�� = ����][3�� = �ۼ���]
		
		while(true) { // ���ѷ��� �������� : ����
			
			System.out.println("--------------------------------");
			System.out.println("---------- ȸ���� �湮�� ----------");
			System.out.println("--------------------------------");
			System.out.print("1. ȸ������ 2. �α��� ���� : ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("----------- ȸ������ --------------");
				System.out.print("MEMBER ID : ");		String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); String pw = scanner.next();
				System.out.print("MEMBER NAME : "); 	String name = scanner.next();
				
				// ���̵� �ߺ�üũ
				boolean idchk = true;
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("�ߺ��� ���̵��Դϴ�.");
						idchk = false;
						break;
					}
				}
				
				// ȸ�� ����
				if (idchk) {
					for (int i = 0; i < memberlist.length; i++) {
						if (memberlist[i][0] == null) { // i��°�࿡ id�� ������(�����)
							memberlist[i][0] = id;		// id����
							memberlist[i][1] = pw;		// pw ����
							memberlist[i][2] = name;	// name ����
							System.out.println("ȸ������ �Ϸ�");
							break;
						}
					}
				}			
			} else if (ch == 2) {
				System.out.println("----------- �α��� --------------");
				System.out.print("MEMBER ID : ");		String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); String pw = scanner.next();
				boolean loginchk = false; // �α��� ���� �ʱⰪ
				
				// �迭 �� �����Ͱ� �Է¹��� ���� ��ġ�ϸ� �α���ó��
				for (int i = 0; i < memberlist.length; i++) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) { // null�� ��ü�� �ƴϱ� ������ equals �Ұ���, ������ ���
						System.out.println("�α��� ����");
						loginchk = true; // �α��� ������
						while(true) {
							System.out.println("----------- �湮�� --------------");
							
							// ��� �湮�� ���
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							for (int j = 0; j < boardlist.length; j++) {
								if (boardlist[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s \n",j+1,boardlist[j][2],boardlist[j][0],boardlist[j][1]);
								}
							}
								
							System.out.println("1. �ۼ� 2. �α׾ƿ� ���� : "); 
							int ch2 = scanner.nextInt();
							
							if (ch2 == 1) {
								System.out.println("----------- �ۼ� --------------");
								System.out.println("���� : "); String title = scanner.next();
								System.out.println("���� : "); String content = scanner.next();
								
								// �迭 �� ���� ã�Ƽ� ����
								for (int j = 0; j < boardlist.length; j++) {
									if (boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // �α��ν� ���� ���̵� ����
										System.out.println("�ۼ� �Ϸ�");
										break;
									}
								}
							} else if (ch2 == 2) {
								System.err.println("�α׾ƿ� �Ǿ����ϴ�.");
								break;	
							} else {
								System.err.println("�߸��� �����Դϴ�.");
							}
						}
					}
				}
				if (loginchk == false) {
					System.err.println("ȸ�� ������ ���ų� �ٸ��ϴ�.");
				}
			} else {
				System.err.println("�߸��� �����Դϴ�.");
			}
			
		} // while end

	} // main end

} // class end
