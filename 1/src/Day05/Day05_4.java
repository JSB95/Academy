package Day05;

import java.util.*;

public class Day05_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [][] memberlist = new String [100][3];
		String [][] boardlist = new String [100][3];
		boardlist[0][0] = "�ڼ���"; boardlist[0][1] = "�뿩����"; 
		
		
		while (true) {
			
			System.out.println("------------�����뿩-------------");
			System.out.println("1. ȸ������  2.�α���");
			System.out.println("����> "); int ���� = scanner.nextInt();
			
			if(����==1) {
				System.out.println("------------ȸ������--------");
				System.out.println("���̵�: "); String id = scanner.next();
				System.out.println("��й�ȣ: "); String pw = scanner.next();
				System.out.println("�̸�: "); String name = scanner.next();
				
				
				//���̵� �ߺ�
				boolean ���̵�üũ =true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id)) {
						System.err.println("�ߺ��� ���̵� �����մϴ�.");
						���̵�üũ=false;
						break;
					}//// if
				} /////for
				
				///���̵� ����
				if(���̵�üũ) {
					for(int i=0; i<memberlist.length; i++) {
						if(memberlist[i][0]==null) {
							memberlist[i][0]=id;
							memberlist[i][1]=pw;
							memberlist[i][2]=name;
							System.err.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break;
						} ///if
					}////for
				}///if
				
			}////if ����1
			else if(����==2) {
				System.out.println("--------�α���������---------");
				System.out.println("���̵�: "); String id = scanner.next();
				System.out.println("��й�ȣ: "); String pw= scanner.next();
				
				boolean �α���Ȯ�� = false;
				for(int j =0; j<memberlist.length; j++) {
					if(memberlist[j][0] != null && memberlist[j][0].equals(id) & memberlist[j][1].equals(pw)) {
						memberlist[j][0]=id;
						memberlist[j][1]=pw;
						�α���Ȯ��=true;
						System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
						if(�α���Ȯ�� = false) System.out.println("�α��ο� �����Ͽ����ϴ�.");
						if (id.equals("admin")) {
							while (true) {
								System.out.println("1. ������� 2. ������� 3. �������� 4. �α׾ƿ�");
								
								int login_ch = scanner.nextInt();
								
								if (login_ch == 1) {
									System.out.println("������: "); String ������� = scanner.next();
									for(int i=0; i<boardlist.length; i++) {
										if(boardlist[i][0] == null) {
											boardlist[i][0]= �������;
											System.out.println(�������);
											boardlist[i][1]="�뿩����";
											System.out.println("��ϿϷ�");
											break;
										} else if (boardlist[i][0].equals(�������)) {
											System.err.println("�ߺ��� �������Դϴ�.");
											break;
										}
									}
								} else if (login_ch == 2) {
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null) {
											if (boardlist[i][2] == null) {
												System.out.printf("%d\t%s\t%s\t%s\n", i+1, boardlist[i][0], boardlist[i][1], " ");
											} else {
												System.out.printf("%d\t%s\t%s\t%s\n", i+1, boardlist[i][0], boardlist[i][1], boardlist[i][2]);
											}
											
										}
									}
								} else if (login_ch == 3) {
									System.out.println("������ : ");
									String book_del = scanner.next();
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null && boardlist[i][0].equals(book_del)) {
											boardlist[i][0] = null;
											boardlist[i][1] = null;
											boardlist[i][2] = null;
										}
									}
								} else if (login_ch == 4) {
									System.out.println("�α׾ƿ� �Ϸ�");
									break;
								} else {
									System.err.println("�߸��� �����Դϴ�.");
								}
							}
							
						} else {
							while (true) {
								System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
								System.out.println("���� > ");
								int login_ch = scanner.nextInt();
								if (login_ch == 1) {
									System.out.println("������ : "); 
									String book_search = scanner.next();
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null && boardlist[i][0].equals(book_search)) {
											System.out.println((i+1) + "\t" + boardlist[i][0] + "\t" + boardlist[i][1] + "\t" + boardlist[i][2]);
										} else {
											System.err.println("�˻��� �׸��� �����ϴ�.");
											break;
										}
									}
								} else if (login_ch == 2) {
									System.out.println("��ȣ\t������\t�����뿩����\t�뿩��");
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null) {
											if (boardlist[i][2] == null) {
												System.out.printf("%d\t%s\t%s\t%s\n", i+1, boardlist[i][0], boardlist[i][1], " ");
											} else {
												System.out.printf("%d\t%s\t%s\t%s\n", i+1, boardlist[i][0], boardlist[i][1], boardlist[i][2]);
											}
											
										}
									}
								} else if (login_ch == 3) {
									System.out.println("������ : ");
									String book_lend = scanner.next();
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null && boardlist[i][0].equals(book_lend) && boardlist[i][1].equals("�뿩����")) {
											System.out.println("�����뿩 �Ϸ�");
											boardlist[i][1] = "�����뿩�Ұ�";
											boardlist[i][2] = id;
										}
									}
								} else if (login_ch == 4) {
									System.out.println("�ݳ��� ������ : ");
									String book_return = scanner.next();
									for (int i = 0; i < boardlist.length; i++) {
										if (boardlist[i][0] != null && boardlist[i][0].equals(book_return) && boardlist[i][2].equals(id)) {
											boardlist[i][1] = "�뿩����";
											boardlist[i][2] = null;
											System.out.println("�����ݳ��Ϸ�");
										}
									}
								} else if (login_ch == 5) {
									System.out.println("�α׾ƿ� �Ϸ�");
									break;
								} else {
									System.err.println("�߸��� �����Դϴ�.");
								}
							}
						}
					}
				}// for
			} /// else if
			else {System.out.println("�˼����� ��ȣ�Դϴ�.");}
			// 1. �������� ����
			
			// 3. �α��� �� �޴�

			
			
		}


	}

}
