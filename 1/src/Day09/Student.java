package Day09;

public class Student extends People { // ����Ŭ���� extends ����Ŭ����
	
	// field
	public int student_num;
	
	// constructor
	public Student (String name, String ssn, int student_num) {
		// �θ� Ŭ���� �� ��� �ʵ� �ʱ�ȭ [�� �ֱ�]
		// 1. �ʵ忡 ����
			// this.name = name;
			// this.ssn = ssn;
		// 2. �����ڿ� ����
		super(name,ssn); // -> �ظ��ϸ� �̹��
		this.student_num = student_num;
	}
	

}
