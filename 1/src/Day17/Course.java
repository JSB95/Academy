package Day17;

public class Course <T>{
			// <제네릭 이름> : 외부로부터 들어오는 자료형
	
	// field
	private String name;	// 과정명 : 문자열
	private T[] students; 	// 학생배욜 : 외부로부터 들어오는 자료형[매개] -> 미정
	
	public Course(String name, int capacity) {
		// TODO Auto-generated constructor stub
		this.name = name;
		students = (T[]) (new Object[capacity]);
					// 1. new Object[인원수] : 인원수 만큼 Object 배열 선언
					// 2. Object배열을 T[]배열로 강제 형변환 -> Object클래스는 최상위[부모] 클래스이기 때문에 가능
	}
	
	// method
		// 과정명 호출
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
		
	}

}
