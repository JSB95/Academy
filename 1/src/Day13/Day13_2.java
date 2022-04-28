package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.539 
			// Date Ŭ���� (java.util) : �ý��� ��¥, �ð�
		Date date = new Date();
		System.out.println("���� ��¥ / �ð� : " + date);
		System.out.println("��ü ���� �޼ҵ� : " + date.toString());
		
			// SimpleDateFormat Ŭ���� : ��¥ / �ð� ���� ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println("��¥ ���� ���� : " + sdf.format(date));		// ��¥�� ���� ���� , ��ȯ���� ����(String)
		
		// p.540
			// Calendar Ŭ���� : �ü�� �ð����� ��¥/�ð��� ���� ����
		Calendar now = Calendar.getInstance();		// Calendar Ŭ���� �� ��ü ȣ��
			// �̹� Calendar Ŭ���� �� ��ü ���� -> new ������� ���� 
		System.out.println("���� : " + now.get(Calendar.YEAR));
		System.out.println("�� : " + now.get(Calendar.MONTH + 1));
		System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK));
		
		// ���� [����] �ѱ� ��ȯ
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null;
		switch (week) {
			case 1 : ���� = "�Ͽ���"; break;
			case 2 : ���� = "������"; break;
			case 3 : ���� = "ȭ����"; break;
			case 4 : ���� = "������"; break;
			case 5 : ���� = "�����"; break;
			case 6 : ���� = "�ݿ���"; break;
			case 7 : ���� = "�����"; break;
		}
		System.out.println("���� : " + ����);
		// ���� ����
		System.out.println("���� / ���� : " + now.get(Calendar.AM_PM)); // 0 : ����  / 1 : ����
		// �ѱ� ��ȯ
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if (ampm == 0) {
			�������� = "����";
		} else {
			�������� = "����";
		}
		System.out.println("���� / ���� : " + ��������);
		
		System.out.println("�� : " + now.get(Calendar.HOUR));
		System.out.println("�� : " + now.get(Calendar.MINUTE));
		System.out.println("�� : " + now.get(Calendar.SECOND));
		
		ZonedDateTime ������ = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("������ : " + ������ );
		ZonedDateTime ����ð� = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� �ð� : " + ����ð�);
		ZonedDateTime ����ð�= ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð� : " + ����ð�);
	}

}
