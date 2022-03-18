package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		// p.544 : DecimalForamt class : ���� ���� ��ȯ
		// p.545 : SimpleDateFormat class : ��¥ ���� ��ȯ
		// p.547 : MessageFormat class : ���� ���� ��ȯ
		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0}\n �̸� : {1}\n��ȭ��ȣ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		// DB���� ����� ����
		String sql = "Insert info member values({0}, {1}, {2})";
		Object[] array = { id, name, tel };
		String result2 = MessageFormat.format(sql, array);
		System.out.println(result2);
		
		// JAVA 7 ���� : Date ���� �������� ��¥ API�� �߰�
		LocalDate currDate = LocalDate.now();		// new�� ���� ����, static method now()
		System.out.println("���� ��¥ : " + currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð� : "+ currTime);
		
		// Date : ���� ��¥ / �ð� -> ������ �ȵǰų� �񱳱���� ������� ����
		// LocalDate : ���� ��¥ / LocalTime : ���� �ð�
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println("���� ��¥ / �ð� : " + currdatetime);
		
		// �ð� ���
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("instant1�� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(nanos) : " + instant1.until(instant2, ChronoUnit.NANOS));
	}

}
