package Test_2;

import java.text.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
	
	public static ArrayList<Car> carlist = new ArrayList<>();		// ���� ����Ʈ ����
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm", Locale.KOREA);		// ��� ���� ����
	static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA); 			// ��¥ ��¿� ����
	static SimpleDateFormat format3 = new SimpleDateFormat("HH:mm", Locale.KOREA);					// �� / �����ð��� ����
	
	// ����Ʈ ��� �޼ҵ�
	public static void print() {
		for (Car temp : carlist) {
			if (temp.getFee() == 0 && temp.getOuttime().equals("0")) {			// ���� ���, �����ð��� 0�̶��
				System.out.print(temp.getDate() + "\t\t" + temp.getCar_num() + "\t" + temp.getIntime() + "\t���� ��\t\t���� ��\n");		// ���� ��, ���� �� ���
			} else {
				System.out.printf(temp.getDate() + "\t\t" + temp.getCar_num() + "\t" + temp.getIntime() + "\t" + temp.getOuttime() + "\t\t" + temp.getFee() + "\n"); // ��¥, ������ȣ, ��,�����ð�, �ݾ� ǥ��

			}
		}
	} // ��� �޼ҵ� end
	
	// ��ȿ�� �˻� �޼ҵ�
	public static int validation (String car_num) {	// �μ� : ������ȣ
		String regex = "^\\d{2,3}[��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|ȣ|��|��|\\x20]\\d{4}/*$";				// �Է¹�����, ó�� 2~3�ڸ��� ����, ��� �ѱ� �ϳ�, ������ 4�ڸ� ���� ���Խ� ����
		Pattern p = Pattern.compile(regex);			// ����ȭ
		Matcher m = p.matcher(car_num);				// ��Ī���� true / false ��ȯ
		if (m.matches()) {							// ���Խ� �����
			return 0;								// 0 ��ȯ
		} else {									// ������� ��������
			return 1;								// 1 ��ȯ
		}
	}	// ��ȿ�� �˻� �޼ҵ� end
	
	// �ߺ� �˻� �޼ҵ�
	public static boolean dupliaction (String car_num) {	// �μ� : ������ȣ
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {		// �μ��� ����Ʈ �� ���� ��ȣ�� ���ٸ�
				return false;								// false
			} else {										// ���� �ʴٸ�
				return true;								// true
			}
		}
		return true;
	}	// �ߺ� �˻� �޼ҵ� end
	
	// ���� �޼ҵ�
	public static void entrance(String car_num) {
		Date date0 = new Date();				// �����ð���
		String date = format2.format(date0);	// ��¥��
		String intime = format2.format(date0);	// �����ð�
		String outtime = "0";					// ������ �����ð��� 0���� �ʱ�ȭ
		int fee = 0;							// ��� 0���� �ʱ�ȭ
		String date_cal = format.format(date0);	// �ð� ����
		Car car = new Car(car_num, date, intime, outtime, fee, date_cal);
		carlist.add(car);
	}	// ���� �޼ҵ� end
	
	// ���� �޼ҵ�
	public static int exit(String car_num) throws ParseException {		// ���� ��ȯ�� ���� throw
		DecimalFormat decimalFormat = new DecimalFormat("####,###��");		// �����¿�
		Date date0 = new Date();			// ��� ����
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {			// ����Ʈ �ȿ� ������ ������ȣ�� �ִٸ�
				String outtime = format3.format(date0);		// ���� �ð��� �����ð��� ����
				temp.setOuttime(outtime);					// ����Ʈ�� ����
				String datestart = temp.getDate_cal();	// �����ð� ���� ���� ����
				String dateend = format.format(date0);				// �����ð� = ����ð� ���� ����
				Date d1 = format.parse(datestart);					// �����ð� ��ȯ
				Date d2 = format.parse(dateend);					// �����ð� ��ȯ
				long fee = 0;										// ��� �ʱ�ȭ
				long diff = d2.getTime() - d1.getTime();			// �����ð� ���
				long min = diff / (1000 * 60);
				long day = diff / (1000 * 60 * 60 * 24);
				System.out.println("\n������ȣ : " + temp.getCar_num() + "\n�����ð� : " + min + "��");
				min = (long) Math.ceil(min / 10.0) * 10;			// �ݿø���� (31�� ���� -> 40�� ����)
				if (min < 30) {
					fee = 0;				// 30�� ��������
				} else {
					fee = min * 100 -3000;		// 30���� �Ѿ��ٸ� 1�п� 100���� ����ϰ� �������� ��� ����
				}
				System.out.println("��� : " + decimalFormat.format(fee));
				temp.setFee((int) fee);			// ����Ʈ�� ����
			}
		} // for loop end
		return 4;								// 4 ��ȯ (�б��)
	} // ���� �޼ҵ� end
	
	

}	// Controller end
