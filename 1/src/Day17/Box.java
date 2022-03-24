package Day17;

public class Box<T> {
			// <Generic Type>
			// <아무거나 : 자료형 이름>
	// field
	private T t;
	
	// method
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	

}
