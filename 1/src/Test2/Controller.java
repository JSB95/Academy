package Test2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	
	public static void print() {
		for (int i = 0; i <carlist.size(); i++) {
			System.out.println(carlist.get(i));
			if (i % 5 == 1) {
				System.out.println();
			}
		}
	}
	
	// 유효성 검사
	public static int chk (String car_num) {
		String regex = "^\\d{2,3}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\x20]\\d{4}/*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(car_num);
		if (m.matches() ) {					// 유효성 검사 통과 -> 1
			return 1;
		} else {
			return 2;						// 유효성 검사 통과 X -> 2
		}
	}
	
	public static void entrance(String car_num, LocalDate date, LocalTime intime) {
		Car temp = new Car(car_num, date, intime);
		carlist.add(temp);
	}
	
	
}
