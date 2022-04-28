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
		
		// p.544 : DecimalForamt class : 숫자 형식 변환
		// p.545 : SimpleDateFormat class : 날짜 형식 변환
		// p.547 : MessageFormat class : 문자 형식 변환
		
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0}\n 이름 : {1}\n전화번호 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		// DB에서 사용할 예정
		String sql = "Insert info member values({0}, {1}, {2})";
		Object[] array = { id, name, tel };
		String result2 = MessageFormat.format(sql, array);
		System.out.println(result2);
		
		// JAVA 7 이전 : Date 이후 여러가지 날짜 API가 추가
		LocalDate currDate = LocalDate.now();		// new를 쓰지 않음, static method now()
		System.out.println("현재 날짜 : " + currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : "+ currTime);
		
		// Date : 현재 날짜 / 시간 -> 조작이 안되거나 비교기능이 충분하지 않음
		// LocalDate : 현재 날짜 / LocalTime : 현재 시간
		
		LocalDateTime currdatetime = LocalDateTime.now();
		System.out.println("현재 날짜 / 시간 : " + currdatetime);
		
		// 시간 계산
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		if (instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		} else if (instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		} else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos) : " + instant1.until(instant2, ChronoUnit.NANOS));
	}

}
