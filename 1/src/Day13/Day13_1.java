package Day13;

import java.util.Random;

public class Day13_1 {
	
	public static void main(String[] args) {
		
		// p.534 Math 클래스 (java.lang 패키지) 수학 관련 메소드 
		System.out.println("절댓값 : " + Math.abs(-5));
		System.out.println("절댓값 : " + Math.abs(-3.14));
		
		System.out.println("올림값 : " + Math.ceil(5.3));		// 소수점 첫째자리에서 올림
		System.out.println("올림값 : " + Math.ceil(-5.3));
		
		System.out.println("내림값 : " + Math.floor(5.3));
		System.out.println("내림값 : " + Math.floor(-5.3));
		
		System.out.println("최댓값 : " + Math.max(5, -9));
		System.out.println("최댓값 : " + Math.max(5.3, 2.5));
		
		System.out.println("최솟값 : " + Math.min(5, -9));
		System.out.println("최솟값 : " + Math.min(5.3, 2.5));
		
		Random random = new Random();
		
		System.out.println("난수 : " + Math.random());
		
		System.out.println("반올림 실수값 : " + Math.rint(5.3)); // 반올림 -> 5
		System.out.println("반올림 실수값 : " + Math.rint(5.7)); // 반올림  -> 6
		// round : 소수점 첫째자리에서 반올림
		System.out.println("반올림 정수값 : " + Math.round(5.3));
		System.out.println("반올림 정수값 : " + Math.round(5.7));
		// 특정 소수점 자리에서 반올림
		double value = 12.3456;				// 소수점 셋째자리에서 반올림 하려면
		double temp = value * 100;			// 100을 곱한뒤 소수점 첫째자리에서 반올림
		long temp2 = Math.round(temp);		// 1234.56 -> 1235
		double v16 = temp2 / 100;			// 12.35 (long / int, int는 기본 정수형)
		double v16_1 = temp2 / 100.0;		// temp2 / 100.0 -> long / double, double이 기본 실수형
		System.out.println("v16 : " + v16);
		System.out.println("v16_1 : " + v16_1);
		
		// p.536 주사위 (1~6)
		System.out.println("0 ~ 1 사이의 실수형 : " + Math.random());		 
		System.out.println(Math.random() * 6);		// 0 ~ 1 * 6 => 0 ~ 6
		System.out.println(Math.random() * 6 + 1);	// 1 ~ 7
		
		// 첫번째 방법
		int num = (int)(Math.random() * 6) + 1;		// (기본자료형) 값 / 변수 = 강제 형변환 , double -> int 형변환시 소수점 절상
		System.out.println("난수1 : " + num);
		
		// 두번째 방법
		System.out.println("난수2 : " + (random.nextInt(6) +1));
		
	}

}
