package Day10;

public class Parent {
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("부모 빈생성자 실행");
	}
	
	public Parent(String nation) {
		// TODO Auto-generated constructor stub
		this.nation = nation;
		System.out.println("부모 [1개인수] 생성자 실행");
	}
	
	

}
