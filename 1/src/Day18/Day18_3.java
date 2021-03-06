package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		// p.731~732 : LinkedList 適掘什 
		//				ArrayList 			vs  	LinkedList
		//			  		壕伸						   元滴 
		// 鎧採姥繕託戚   昔畿什奄層生稽 五乞軒尻衣[搭]		辞稽 陥献 五乞軒爽社 尻衣 
		//	紗亀
		//	add[蓄亜]			匙硯	
		//  add[諮脊=掻娃]									匙硯
		//	伊事				匙硯				
		//  肢薦											匙硯
		/*	
		 * 				けけけけけけけけけけ				け			け
		 * 													け
		 * 												け
		 */
		
		
		
		// 1. ArrayList 梓端 識情 [薦革遣 : String]
		ArrayList<String> list1 = new ArrayList<String>();
		// 2. LinkedList 梓端 識情 [薦革遣 : String]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. 獣娃痕呪
		long starttime;
		long endtime;
		
		// 4. ArrayList梓端拭 10000鯵 梓端研 諮脊馬澗汽 杏軒澗 獣娃 端滴
		starttime = System.nanoTime(); // 薄仙獣娃聖 蟹葛舘是稽 窒径
		for (int i = 0; i < 100000; i++) {
			list1.add(0, i + "");
		}
		endtime = System.nanoTime();
		System.out.println("ArrayList 杏鍵 獣娃 : " + (endtime - starttime) + "ns");
		
		// 5. LinkedList梓端拭 10000鯵 梓端研 諮脊馬澗汽 杏軒澗 獣娃 端滴
				starttime = System.nanoTime(); // 薄仙獣娃聖 蟹葛舘是稽 窒径
				for (int i = 0; i < 100000; i++) {
					list2.add(0, i + "");
				}
				endtime = System.nanoTime();
				System.out.println("LinkedList 杏鍵 獣娃 : " + (endtime - starttime) + "ns");
		
		
	}

}