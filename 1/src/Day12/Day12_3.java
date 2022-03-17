package Day12;

import java.io.IOException;

public class Day12_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// 도서 검색 프로그램
		// [조건]
		// 1. 입력받기 [ System.in.read() ]
		// 2. String 배열내 여러 도서가 저장 
			//		String[] 도서목록 = {	
			//			"된다! 네이버 블로그&포스트",
			//			"스프링 부트 실전 활용 마스터",
			//			"Tucker의 Go 언어 프로그래밍",
			//			"혼자 공부하는 C 언어"
			//};
		// 3. 검색기능 , 수정기능 
			// 검색기능 : 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력 
				// '언어' 검색 ->  "Tucker의 Go 언어 프로그래밍" / "혼자 공부하는 C 언어"
			// 수정기능 : 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택 
				// '수정' 수정 -> 선택된 도서명의 수정할 문자와 새로운 문자 입력받아 ->  수정 완료 
		
		String[] booklist = { "된다! 네이버 블로그&포스트",
							"스프링 부트 실전 활용 마스터",
							"Tucker의 Go 언어 프로그래밍",
							"혼자 공부하는 C 언어" };
		
		while (true) {
			System.out.println("1. 검색 2. 수정");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes);
			String ch = new String(bytes, 0, count-2);
			
			if (ch.equals("1")) {
				System.out.println("*** 검색 ***");
				System.out.print("책 이름 : ");
				count = System.in.read(bytes);
				String search = new String(bytes, 0 , count-2);
				for (String temp : booklist) {		// 배열 내 문자열 꺼내기
//					// 1. 
//					if (temp.indexOf(search) != -1) { // 해당 문자열내 찾을 문자의 인덱스가 존재하면
//							// indexOf 메소드 -1 : 반환되는 경우는 동일한 단어가 없을경우 -> 검색 X
//						System.out.println(temp);	// 출력
//					}
					// 2.
					if (temp.contains(search)) { // 문자열.contains("찾을 문자") : 문자열 내 찾을문자가 true / false로 반환
						System.out.println(temp);
					}
				}
			} else if (ch.equals("2")) {
				System.out.println("*** 수정 ***");
				System.out.print("도서명 : ");
				count = System.in.read(bytes);
				String update = new String(bytes,0,count-2);
				
				int i = 0;
				for (String temp : booklist) {
					if (temp.contains(update)) {
						System.out.println("도서번호 : " + i + " / 도서명 : " + temp);
					}
					i++;
				}
				
				System.out.println("도서번호 선택 : ");
				count = System.in.read(bytes);
				String ch2 = new String(bytes, 0, count-2);
				int index = Integer.parseInt(ch2);
				System.out.println("기존 문자 : ");
					count = System.in.read(bytes);
					String oldstr = new String(bytes, 0, count-2);
				System.out.println("새로운 문자 : ");
					count = System.in.read(bytes);
					String newstr = new String(bytes, 0, count-2);
				booklist[index] = booklist[index].replace(oldstr, newstr);
			}
			
		}
		


	}

}
