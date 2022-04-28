package Test2;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm",Locale.KOREA);
	static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd",Locale.KOREA);
	static SimpleDateFormat format3 = new SimpleDateFormat("HH:mm");
	public static void print() {
		for (Car temp : carlist) {
			if (temp.getFee() == 0 && temp.getOuttime().equals("0")) {
				System.out.printf(temp.getDate() + "\t\t" + temp.getCar_num() + "\t\t" + temp.getIntime() + "\t주차 중\t\t정산 전\n");
			} else {
				System.out.printf(temp.getDate() + "\t\t" + temp.getCar_num() + "\t\t" + temp.getIntime() + "\t" + temp.getOuttime() + "\t\t" + temp.getFee() + "\n");
			}
		}
	}
	
	// 유효성 검사
	public static int validation (String car_num) {
		String regex = "^\\d{2,3}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\x20]\\d{4}/*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(car_num);
		if (m.matches()) {			
			return 0;
		} 
		return 1;
	}
	
	// 중복 검사
	public static boolean duplication (String car_num) {
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
	
	// 입차
	public static void entrance(String car_num) {
		Date date0 = new Date();
		String date = format2.format(date0);
		String intime = format2.format(date0);
		String outtime = "0";
		int fee = 0;
		Car car = new Car(car_num, date, intime, outtime, fee);
		carlist.add(car);
	}
	
	// 출차
	public static int exit(String car_num) throws ParseException {
		DecimalFormat decimalFormat = new DecimalFormat("###,###원");
		Date date0 = new Date();
		for (Car temp : carlist) {
			if (temp.getCar_num().equals(car_num)) {
				String outtime = format3.format(date0);
				temp.setOuttime(outtime);
				String datestart = format.format(date0);
				String dateend = "2022-03-23-19-20";
				Date d1 = format.parse(datestart);
				Date d2 = format.parse(dateend);
				long fee = 0;
				long diff = d2.getTime() - d1.getTime();
				long min = diff / (1000 * 60);
				long day = diff / (1000 * 60 * 60 * 24);
				System.out.println("\n차량번호 : " + temp.getCar_num() + "\n주차시간 : " + min + "분");
				min = (long) Math.ceil(min / 10.0) * 10;
				fee = min * 100 - 3000;
				System.out.println("요금 : " + decimalFormat.format(fee));
				temp.setFee((int)fee);
				
			}
		}
		
		
		return 4;
	}
	
	
}
