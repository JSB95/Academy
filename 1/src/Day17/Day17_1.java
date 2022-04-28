package Day17;

public class Day17_1 {
	
	
	public static void main(String[] args) {
		
		// p.658
		
		// 1. 객체 생성
		Box<String> box1 = new Box<String>();
		// 클래스에 String 타입 넣기
		box1.set("홍길동");
		String str = box1.get();
		
		// 2. 객체 생성
		Box<Integer> box2 = new Box<Integer>();
		// 클래스에 Integer 타입 넣기	
		box2.set(6);
		int value = box2.get();
		
		// p.659
		
		// 1. 객체 생성하는곳에 제네릭 타입 넣기 [Tv, String]
		Product<Tv, String> product1 = new Product<>();
		// 2. 객체 내 필드에 각 제네릭타입으로 값 넣기
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		// 3. 호출
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel();
		
		// 1. 객체 생성하는 곳에 제네릭 타입 넣기 [Car, String]
		Product<Car, String> product2 = new Product<>();
		// 2. 객체 내 필드에 각 제네릭타입으로 값 넣기
		product2.setKind(new Car());
		product2.setModel("디젤");
		// 3. 호출 [형변환 없음]
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		////
		Product<Integer, Double> product3= new Product<Integer, Double>();
		
		
	
		
	}
	

}
