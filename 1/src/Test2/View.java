package Test2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.*;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd  HH:mm",Locale.KOREA);
		Date date0 = new Date();
		
		String current_time = format.format(date0);
		try {
			while (true) {
				System.out.println("--------------------------------------------- ���� ��Ȳ ǥ --------------------------------------------\n");
				System.out.println("����ð� : " + current_time + "\n");
				System.out.println("��¥\t\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");
				Controller.print();
				
				// ����Ʈ���� �̾ƿ���
				
				
				System.out.println("\n1. ����\t2.����");
				System.out.print("\n���� > ");			int ch = scanner.nextInt();
				
				// �� / ����
				
				if (ch == 1) {
					System.out.print("\n������ȣ : "); String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);
					if (result == 0) {
						boolean chk = Controller.duplication(car_num);
						if (chk) {
							Controller.entrance(car_num);
						} else {
							System.err.println("\n�ߺ��� ���� ��ȣ�Դϴ�.\n");
						}
					} else if (result == 1) {
						System.err.println("\n��Ȯ�� ���� ��ȣ�� �Է����ּ���.\n");
					} else {
						System.err.println("\n�߸��� �����Դϴ�.\n");
					}
				} else if (ch == 2) {
					System.out.print("������ȣ : "); String car_num = scanner.next();
					System.out.println("");
					int result = Controller.validation(car_num);
					if (result == 0) {
				
		
						Controller.exit(car_num);
					} else if (result == 1) {
						System.err.println("\n��Ȯ�� ���� ��ȣ�� �Է����ּ���.\n");
					} else {
						System.err.println("\n�߸��� �����Դϴ�.\n");
					}
				} else {
					System.err.println("\n�߸��� �����Դϴ�.\n");
				}
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
