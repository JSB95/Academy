package Day17;

public class Course <T>{
			// <���׸� �̸�> : �ܺηκ��� ������ �ڷ���
	
	// field
	private String name;	// ������ : ���ڿ�
	private T[] students; 	// �л���� : �ܺηκ��� ������ �ڷ���[�Ű�] -> ����
	
	public Course(String name, int capacity) {
		// TODO Auto-generated constructor stub
		this.name = name;
		students = (T[]) (new Object[capacity]);
					// 1. new Object[�ο���] : �ο��� ��ŭ Object �迭 ����
					// 2. Object�迭�� T[]�迭�� ���� ����ȯ -> ObjectŬ������ �ֻ���[�θ�] Ŭ�����̱� ������ ����
	}
	
	// method
		// ������ ȣ��
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
