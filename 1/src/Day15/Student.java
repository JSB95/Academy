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
	@Override 		// �θ�Ŭ���� �� ������ �޼ҵ� �� / �μ�
	public void name_call() {
		System.out.println("�ڽ�Ŭ�������� ����");
		System.out.println(this.name);
		System.out.println(super.name);
	}

}
