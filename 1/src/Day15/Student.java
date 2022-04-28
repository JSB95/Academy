package Day15;

public class Student extends People{
	
	// field
	String name;
	
	// constructor
	public Student(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	// method
	@Override 		// 부모클래스 내 동일한 메소드 명 / 인수
	public void name_call() {
		System.out.println("자식클래스에서 실행");
		System.out.println(this.name);
		System.out.println(super.name);
	}

}
