package Test_2;

import java.text.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
	
	public static ArrayList<Car> carlist = new ArrayList<>();		// 차량 리스트 생성
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm", Locale.KOREA);		// 요금 계산용 포맷
	static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA); 			// 날짜 출력용 포맷
	static SimpleDateFormat format3 = new SimpleDateFormat("HH:mm", Locale.KOREA);					// 입 / 출차시간용 포맷
	
	// 리스트 출력 메소드
	public static void print() {
		for (Car temp : carlist) {
			if (temp.getFee() == 0 && temp.getOuttime().equals("0")) {			// 현재 요금, 출차시간이 0이라면
				System.out.print(temp.getDate() + "\t\t" + temp.getCar_num() + "\t" + temp.getIntime() + "\t주차 중\t\t정산 전\n");		// 주차 중, 정산 전 출력
			} else {
				System.out.printf(temp.getDate() + "\t\t" + temp.getCar_num() + "\t" + temp.getIntime() + "\t" + temp.getOuttime() + "\t\t" + temp.getFee() + "\n"); // 날짜, 차량번호, 입,출차시간, 금액 표시

			}
		}
	} // 출력 메소드 end
	
	// 유효성 검사 메소드
	public static int validation (String car_num) {	// 인수 : 차량번호
		String regex = "^\\d{2,3}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하|차|\\x20]\\d{4}/*$";				// 입력받을때, 처음 2~3자리는 숫자, 가운데 한글 하나, 나머지 4자리 숫자 정규식 생성
		Pattern p = Pattern.compile(regex);			// 패턴화
		Matcher m = p.matcher(car_num);				// 매칭시켜 true / false 반환
		if (m.matches()) {							// 정규식 통과시
			return 0;								// 0 반환
		} else {									// 통과하지 못했으면
			return 1;								// 1 반환
		}
	}	// 유효성 검사 메소드 end
	
	// 중복 검사 메소드
	public static boolean dupliaction (String car_num) {	// 인수 : 차량번호
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {		// 인수와 리스트 안 차량 번호가 같다면
				return false;								// false
			} else {										// 같지 않다면
				return true;								// true
			}
		}
		return true;
	}	// 중복 검사 메소드 end
	
	// 입차 메소드
	public static void entrance(String car_num) {
		Date date0 = new Date();				// 입차시간용
		String date = format2.format(date0);	// 날짜용
		String intime = format2.format(date0);	// 입차시간
		String outtime = "0";					// 입차시 출차시간은 0으로 초기화
		int fee = 0;							// 요금 0으로 초기화
		String date_cal = format.format(date0);	// 시간 계산용
		Car car = new Car(car_num, date, intime, outtime, fee, date_cal);
		carlist.add(car);
	}	// 입차 메소드 end
	
	// 출차 메소드
	public static int exit(String car_num) throws ParseException {		// 정수 변환용 예외 throw
		DecimalFormat decimalFormat = new DecimalFormat("####,###원");		// 요금출력용
		Date date0 = new Date();			// 요금 계산용
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {			// 리스트 안에 주차된 차량번호가 있다면
				String outtime = format3.format(date0);		// 현재 시간만 출차시간에 저장
				temp.setOuttime(outtime);					// 리스트에 저장
				String datestart = temp.getDate_cal();	// 입차시간 계산용 포맷 지정
				String dateend = format.format(date0);				// 출차시간 = 현재시간 포맷 지정
				Date d1 = format.parse(datestart);					// 입차시간 변환
				Date d2 = format.parse(dateend);					// 출차시간 변환
				long fee = 0;										// 요금 초기화
				long diff = d2.getTime() - d1.getTime();			// 주차시간 계산
				long min = diff / (1000 * 60);
				long day = diff / (1000 * 60 * 60 * 24);
				System.out.println("\n차량번호 : " + temp.getCar_num() + "\n주차시간 : " + min + "분");
				min = (long) Math.ceil(min / 10.0) * 10;			// 반올림계산 (31분 주차 -> 40분 주차)
				if (min < 30) {
					fee = 0;				// 30분 무료주차
				} else {
					fee = min * 100 -3000;		// 30분이 넘었다면 1분에 100원씩 계산하고 무료주차 요금 차감
				}
				System.out.println("요금 : " + decimalFormat.format(fee));
				temp.setFee((int) fee);			// 리스트에 저장
			}
		} // for loop end
		return 4;								// 4 반환 (분기용)
	} // 출차 메소드 end
	
	

}	// Controller end
