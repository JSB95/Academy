package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		// p.731~732 : LinkedList 클래스 
		//				ArrayList 			vs  	LinkedList
		//			  		배열						   링크 
		// 내부구조차이   인덱스기준으로 메모리연결[통]		서로 다른 메모리주소 연결 
		//	속도
		//	add[추가]			빠름	
		//  add[삽입=중간]									빠름
		//	검색				빠름				
		//  삭제											빠름
		/*	
		 * 				ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ				ㅁ			ㅁ
		 * 													ㅁ
		 * 												ㅁ
		 */
		
		
		
		// 1. ArrayList 객체 선언 [제네릭 : String]
		ArrayList<String> list1 = new ArrayList<String>();
		// 2. LinkedList 객체 선언 [제네릭 : String]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. 시간변수
		long starttime;
		long endtime;
		
		// 4. ArrayList객체에 10000개 객체를 삽입하는데 걸리는 시간 체크
		starttime = System.nanoTime(); // 현재시간을 나노단위로 출력
		for (int i = 0; i < 100000; i++) {
			list1.add(0, i + "");
		}
		endtime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endtime - starttime) + "ns");
		
		// 5. LinkedList객체에 10000개 객체를 삽입하는데 걸리는 시간 체크
				starttime = System.nanoTime(); // 현재시간을 나노단위로 출력
				for (int i = 0; i < 100000; i++) {
					list2.add(0, i + "");
				}
				endtime = System.nanoTime();
				System.out.println("LinkedList 걸린 시간 : " + (endtime - starttime) + "ns");
		
		
	}

}