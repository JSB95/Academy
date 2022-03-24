package Day17;

import java.util.Arrays;

public class Day17_3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코스
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		// 코스 클래스 제네릭에 사람 클래스 넣기
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker<>("직장인"));
		personCourse.add(new Student<>("학생"));
		personCourse.add(new High_school_student<>("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		// workerCourse.add(new Person<>("일반인")); -> 부모클래스는 들어갈 수 없다
		workerCourse.add(new Worker<>("직장인"));
		// workerCourse.add(new Student<>("학생")); -> 부모클래스는 같지만 학생 -> 직장인으로 변환 불가능
		// workerCourse.add(new High_school_student<>("고등학생")); -> 위와 같은 이유로 불가능
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		// studentCourse.add(new Person<>("일반인")); 불가능
		// studentCourse.add(new Worker<>("직장인"));
		studentCourse.add(new Student<>("학생"));
		studentCourse.add(new High_school_student<>("고등학생"));
		
		Course<High_school_student> highStudentCourse = new Course<High_school_student>("고등학생과정", 5);
		// highStudentCourse.add(new Person<>("일반인"));
		// highStudentCourse.add(new Worker<>("직장인"));
		// highStudentCourse.add(new Student<>("학생"));
		highStudentCourse.add(new High_school_student<>("고등학생"));
		
		// 출력
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
	
	// 와일드카드 : ? [모둔 쿨랴수 댜웅]
		// 코스 <?> : 모든 제네릭 가능
		// 코스 <? extends 클래스명> : 해당 클래스로부터 상속받은(자식) 제네릭 클래스 가능
		// 코스 <? super 클래스명> : 해당클래스로부터 상속 준 (부모) 제네릭 클래스 가능
	
	
	public static void registerCourse(Course<?> course) {	// ? : 와일드카드, 모든 클래스 대응 / 모든 제네릭 코스가 가등
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	

}
