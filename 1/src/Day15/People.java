package Day15;

public class People extends Occupation {
	
	// field
	String name;
	
	// constructor
	public People(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// method
	public void name_call() {
		System.out.println("�θ�Ŭ�������� ����");
		System.out.println(this.name);
	}

}
