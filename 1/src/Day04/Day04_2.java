package Day04;

import java.util.*;

public class Day04_2 { // class start

	public static void main(String[] args) { // main start
		// TODO Auto-generated method stub

		/* ���Ǳ�  ���α׷�
			 1. �޴��� [�ݶ� 300 / ȯŸ 200 / ���̴� 100 / ����]
			 �޴��ǿ��� ��ǰ�� �����ϸ� ��ٱ��Ͽ� �ֱ�
			 ��� �����ϸ� �˸� (������)
			 2. �ʱ� ��� [��ǰ�� 10����]
			 3. ���� �� �ݾ� �Է¹޾� ������ ��ŭ ���� �� �ܵ� ���. ������ �ݾ׺��� ���ž��� ũ�� ���� ��� [�ݾ׺���] 
		*/
		
		// ���뺯�� [��� {} ������ ����ϴ� ������]
		
		Scanner scanner = new Scanner(System.in);											// 1. �Է°�ü
		int �ݶ���� = 10; int ȯŸ��� = 10; int ���̴���� = 10;									// 2. �����
		int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;									// 3. ��ٱ���
		
		
		
		while(true) {																		// ���α׷� ����
			System.out.println("-------------------�޴�----------------------");
			System.out.println("1. �ݶ�[300] 2. ȯŸ[200] 3. ���̴�[100] 4. ����");
			System.out.println(">>>>>> ����"); 
			int choice = scanner.nextInt();													// �޴� ����
			
			if (choice == 1) {																// �ݶ� ����
				if (�ݶ���� == 0) {															// �ݶ� ��� ���ٸ�
					System.err.println("��� �����ϴ�. ��� �غ���");							
				} else {																	// �ݶ� ��� �ִٸ�
					System.out.println("[�ݶ� ��ҽ��ϴ�.]");
					�ݶ󱸸ż�++;																// �ݶ󱸸ż� �߰�
					�ݶ����--;																// �ݶ� ��� ����
				}
			} else if (choice == 2) {
				if (ȯŸ��� == 0) {
					System.err.println("��� �����ϴ�. ��� �غ���");
				} else {
					System.out.println("[ȯŸ�� ��ҽ��ϴ�.]");
					ȯŸ���ż�++;
					ȯŸ���--;
				}
			} else if (choice == 3) {
				if (���̴���� == 0) {
					System.err.println("��� �����ϴ�. ��� �غ���");
				} else {
					System.out.println("[���̴ٸ� ��ҽ��ϴ�.]");
					���̴ٱ��ż�++;
					���̴����--;
				}
			} else if (choice == 4) {
				System.out.println("----------------���� ��ǰ ���-------------------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if(�ݶ󱸸ż� != 0) {
					System.out.println("�ݶ�\t" + �ݶ󱸸ż� + "\t" + (�ݶ󱸸ż� * 300));
				}
				if(ȯŸ���ż� != 0) {
					System.out.println("ȯŸ\t" + ȯŸ���ż� + "\t" + (ȯŸ���ż� * 200));
				}
				if(���̴ٱ��ż� != 0) {
					System.out.println("���̴�\t" + ���̴ٱ��ż� + "\t" + (���̴ٱ��ż� * 100));
				}
				int ������ = (�ݶ󱸸ż� * 300) + (ȯŸ���ż� * 200) + (���̴ٱ��ż� * 100);
				System.out.println("��ǰ �� ������ : " + ������);
				System.out.println("---------------------------------------------");
				System.out.println("1. ���� 2. ���");
				int choice2 = scanner.nextInt();
				
				if (choice2 == 1) {															// 1. ����
					System.out.println("�������� �Է��ϼ��� : ");
					int �ݾ� = scanner.nextInt();												// �ݾ� �Է¹ޱ�
					while(true) {															// ���ѷ��� [�������� : �����׺��� �ݾ��� ũ��]
						if (������ > �ݾ�) {													// �ݾ��� �����׺��� ������ �����Ұ� -> �ݾ� ���Է�
							System.err.println("�������� �����մϴ�. �ٽ� �Է��ϼ��� : ");
							�ݾ� = scanner.nextInt();
						} else {															// �ݾ��� �����׺��� ������ ���� ����
							System.out.println("���� ����");
							�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż� = 0;							// ��ٱ��� �ʱ�ȭ
							System.out.println("�ܵ� ��� : " + (�ݾ� - ������));					// �ܵ� ���
							break;															// ���� ����
						}
					}
				} else if (choice2 == 2) {													// 2. ���
					System.out.println("���� ��� ��� �����");
					�ݶ���� += �ݶ󱸸ż�; ȯŸ��� += ȯŸ���ż�; ���̴���� += ���̴ٱ��ż�;				// ���ż��� ���� �ű��
					�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż� = 0;									// ���ż� �ʱ�ȭ
				} else {
					System.err.println("�� �� ���� ��ȣ�Դϴ�.");
				}																			// ���� end
			} else {
				System.err.println("�� �� ���� ��ȣ�Դϴ�.");
			}
		}																					// while end
		
	} // main end

} // class end
