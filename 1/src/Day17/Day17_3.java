package Day17;

import java.util.Arrays;

public class Day17_3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڽ�
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		// �ڽ� Ŭ���� ���׸��� ��� Ŭ���� �ֱ�
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker<>("������"));
		personCourse.add(new Student<>("�л�"));
		personCourse.add(new High_school_student<>("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���",5);
		// workerCourse.add(new Person<>("�Ϲ���")); -> �θ�Ŭ������ �� �� ����
		workerCourse.add(new Worker<>("������"));
		// workerCourse.add(new Student<>("�л�")); -> �θ�Ŭ������ ������ �л� -> ���������� ��ȯ �Ұ���
		// workerCourse.add(new High_school_student<>("����л�")); -> ���� ���� ������ �Ұ���
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		// studentCourse.add(new Person<>("�Ϲ���")); �Ұ���
		// studentCourse.add(new Worker<>("������"));
		studentCourse.add(new Student<>("�л�"));
		studentCourse.add(new High_school_student<>("����л�"));
		
		Course<High_school_student> highStudentCourse = new Course<High_school_student>("����л�����", 5);
		// highStudentCourse.add(new Person<>("�Ϲ���"));
		// highStudentCourse.add(new Worker<>("������"));
		// highStudentCourse.add(new Student<>("�л�"));
		highStudentCourse.add(new High_school_student<>("����л�"));
		
		// ���
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		System.out.println("");
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		System.out.println("");
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
	}
	
	// ���ϵ�ī�� : ? [��� �𷪼� ����]
		// �ڽ� <?> : ��� ���׸� ����
		// �ڽ� <? extends Ŭ������> : �ش� Ŭ�����κ��� ��ӹ���(�ڽ�) ���׸� Ŭ���� ����
		// �ڽ� <? super Ŭ������> : �ش�Ŭ�����κ��� ��� �� (�θ�) ���׸� Ŭ���� ����
	
	
	public static void registerCourse(Course<?> course) {	// ? : ���ϵ�ī��, ��� Ŭ���� ���� / ��� ���׸� �ڽ��� ����
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������ : " + Arrays.toString(course.getStudents()));
	}
	
	

}
