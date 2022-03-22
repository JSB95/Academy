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
	
	// ��ȿ�� �˻�
	public static int chk (String car_num) {
		String regex = "^\\d{2,3}[��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|��|ȣ|��\\x20]\\d{4}/*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(car_num);
		if (m.matches() ) {					// ��ȿ�� �˻� ��� -> 1
			return 1;
		} else {
			return 2;						// ��ȿ�� �˻� ��� X -> 2
		}
	}
	
	public static void entrance(String car_num, LocalDate date, LocalTime intime) {
		Car temp = new Car(car_num, date, intime);
		carlist.add(temp);
	}
	
	
}
