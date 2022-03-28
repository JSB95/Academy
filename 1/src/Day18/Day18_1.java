package Day18;

import java.util.ArrayList;

public class Day18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p.722
			// 여러개 객체를 추가, 검색, 삭제 -> 배열
			// 배열 문제점 
				// 1. 불특정 다수의 객체를 저장 불가 [길이를 크게 설정하면 비효율적]
				// 2. 삭제시 인덱스가 비어 데이터가 연속적이지 못함
			// 객체들을 효율적으로 추가, 삭제, 검색 -> 컬렉션 프레임워크
			// 컬렉션 : 수집	ㅡ	프레임워크 : 사용방법을 미리 정해놓은 라이브러리
			// 저장 (수집) 관련 클래스 / 인터페이스
		// 1. List 인터페이스
			// 1) ArrayList
			// 2) Vector
			// 3) LinkedList
		// 2. Set 인터페이스
			// 1) HashSet
			// 2) TreeSet
		// 3. Map 인터페이스
			// 1) HashMap
			// 2) HashTable
			// 3) TreeMap
			// 4) Properties
		
		// p.728 : ArrayList 클래스
			// 배열과 유사하지만 길이가 가변[자동]
		
		// 1. 리스트 클래스 선언 [리스트 안에 저장할 항목의 자료형 -> 제네릭]
		ArrayList<String> list = new ArrayList<>();
			// ArrayList<제네릭> 객체명 = new ArrayList<제네릭 = 생략가능 > (길이, 안주면 10으로)
		
		// 2. 리스트객체명.add (객체명 = 제네릭타입), 리스트 객체 내 요소 추가
		list.add("java");				// 인덱스 : 0
		list.add("jdbc");				// 인덱스 : 1
		list.add("servlet/jsp");		// 인덱스 : 2
			System.out.println("리스트 내 요소 : " + list);
		list.add(2, "database");		// 인덱스 2에 요소 추가 [기존인덱스 2 -> 3으로 이동]
			System.out.println("인덱스 추가 후 요소 : " + list);
		list.add("iBATIS");
		
		// 3. 리스트객체명.size() : 리스트 객체 내 요소들의 개수 [길이]
		System.out.println("리스트 사이즈 : " + list.size());
		// 4. 리스트객체명.get(index) :리스트 객체 내 특정 인덱스의 요소 호출
		System.out.println("리스트내 2번 인덱스 호출 : " + list.get(2));
		// 5. 반복문 활용 [리스트와 반복문 같이 사용]
		// 인덱스가 필요할 때
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		// 인덱스가 필요하지 않을 때
		for (String str : list) {
			System.out.println(" : " + str);
		}
		
		//6. 리스트객체명.remove(인덱스/객체)
	}

}
