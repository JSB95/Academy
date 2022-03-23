package Test_2;

import java.util.*;
import java.text.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd  HH:mm",Locale.KOREA);
		Date date0 = new Date();
		String current_time = format.format(date0);
		
		try {												// ����ó��
			while (true) {									// ���ѷ��� (���� ��Ȳǥ �׻� ���)
				System.out.println("--------------------------------------------- ���� ��Ȳ ǥ --------------------------------------------\n");
				System.out.println("����ð� : " + current_time + "\n");	// ����ð� ǥ��
				System.out.println("��¥\t\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");		// �Ӹ�
				
				Controller.print();						// ��Ȳǥ ���
				
				System.out.println("\n1. ���� 2. ����\n");
				System.out.print("\n���� > ");		int ch = scanner.nextInt();
				// 1 -> ���� 2 -> ���� �б�
				if (ch == 1) {
					System.out.print("\n������ȣ : "); String car_num = scanner.next();	// ������ȣ �Է¹ޱ�
					System.out.println("");
					int result = Controller.validation(car_num); 			// ��ȿ�� �˻� ����
					if (result == 0) {										// ��ȿ�� �˻� ��� ��
						boolean chk = Controller.dupliaction(car_num);		// �ߺ��˻� ����
						if (chk) {											// �ߺ��˻� �����
							Controller.entrance(car_num);					// ���� ����
						} else {											// �ߺ��˻� ��� ���� ��
							System.err.println("\n�ߺ��� ���� ��ȣ�Դϴ�.\n");
						}
					} else if (result == 1) {								// ��ȿ�� �˻� ��� ���� ��
						System.err.println("\n��Ȯ�� ���� ��ȣ�� �Է��ϼ���.\n");
					} else {
						System.err.println("\n�߸��� �����Դϴ�.\n");
					}
				} else if (ch == 2) {	// ����
					System.out.print("���� ��ȣ : ");		String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);			// ��ȿ�� �˻� ����
					if (result == 0) {
						Controller.exit(car_num);	// ��� �� ���� ����
					} else if (result == 1) {
						System.err.println("\n��Ȯ�� ���� ��ȣ�� �Է��ϼ���.\n");
					} else {
						System.err.println("\n�߸��� �����Դϴ�.\n");
					}
				} else {
					System.err.println("\n�߸��� �����Դϴ�.\n");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("\n���� �߻�\n");
		}
	}

}
