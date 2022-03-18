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
			// Date 클래스 (java.util) : 시스템 날짜, 시간
		Date date = new Date();
		System.out.println("현재 날짜 / 시간 : " + date);
		System.out.println("객체 정보 메소드 : " + date.toString());
		
			// SimpleDateFormat 클래스 : 날짜 / 시간 포맷 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("날짜 형식 변경 : " + sdf.format(date));		// 날짜에 형식 적용 , 반환값은 문자(String)
		
		// p.540
			// Calendar 클래스 : 운영체제 시간대의 날짜/시간에 대한 정보
		Calendar now = Calendar.getInstance();		// Calendar 클래스 내 객체 호출
			// 이미 Calendar 클래스 내 객체 존재 -> new 사용하지 않음 
		System.out.println("연도 : " + now.get(Calendar.YEAR));
		System.out.println("월 : " + now.get(Calendar.MONTH + 1));
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
		
		// 요일 [숫자] 한글 변환
		int week = now.get(Calendar.DAY_OF_WEEK);
		String 요일 = null;
		switch (week) {
			case 1 : 요일 = "일요일"; break;
			case 2 : 요일 = "월요일"; break;
			case 3 : 요일 = "화요일"; break;
			case 4 : 요일 = "수요일"; break;
			case 5 : 요일 = "목요일"; break;
			case 6 : 요일 = "금요일"; break;
			case 7 : 요일 = "토요일"; break;
		}
		System.out.println("요일 : " + 요일);
		// 오전 오후
		System.out.println("오전 / 오후 : " + now.get(Calendar.AM_PM)); // 0 : 오전  / 1 : 오후
		// 한글 변환
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if (ampm == 0) {
			오전오후 = "오전";
		} else {
			오전오후 = "오후";
		}
		System.out.println("오전 / 오후 : " + 오전오후);
		
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
		ZonedDateTime 협정시 = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시 : " + 협정시 );
		ZonedDateTime 서울시간 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간 : " + 서울시간);
		ZonedDateTime 뉴욕시간= ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간 : " + 뉴욕시간);
	}

}
