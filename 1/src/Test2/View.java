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
		while (true) {
			System.out.println("--------------------------------------------- ���� ��Ȳ ǥ --------------------------------------------\n");
			System.out.println("����ð� : " + current_time + "\n");
			System.out.println("��¥\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");
			Controller.print();
			
			// ����Ʈ���� �̾ƿ���
			
			
			System.out.println("1. ����\t2.����");
			System.out.print("���� > ");			int ch = scanner.nextInt();
			
			// �� / ����
			
			if (ch == 1) {
				System.out.print("������ȣ : "); String car_num = scanner.next();
				int result = Controller.chk(car_num);
				if (result == 1) {
					LocalDate date = LocalDate.now();
					LocalTime time = LocalTime.now();
					Controller.entrance(car_num, date, time);
				} else if (result == 2) {
					System.err.println("�ߺ��� ���� ��ȣ�Դϴ�.");
				} else if (result == 3) {
					System.err.println("��Ȯ�� ���� ��ȣ�� �Է����ּ���.");
				} else {
					System.err.println("�߸��� �����Դϴ�.");
				}
			} else if (ch == 2) {
				System.out.print("������ȣ : "); String car_num = scanner.next();
			} else {
				System.err.println("\n�߸��� �����Դϴ�.\n");
			}
			
			
			
			break;
		}

	}

}
