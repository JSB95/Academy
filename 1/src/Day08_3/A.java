package Day08_3;

public class A {
	// 전범위 클래스 선언 A
		// field
		A a1 = new A(true);				// 현재 클래스내에서 public 호출 가능
		A a2 = new A(1);				// 현재 클래스내에서 default 호출 가능
		A a3 = new A("String");			// 현재 클래스내에서 private 호출 가능
		
		public int field1;
		int field2;
		private int field3;
		// constructor
		public A (boolean b) {			// 모든 범위
			field1 = 1;
			field2 = 2;
			field3 = 3;
			
			method1();
			method2();
			method3();
		} 		
		A (int b) {}					// 현 패키지 내
		private A (String s) {}			// 현 클래스 내	
		
		// method
		public void method1() {}
		void method2() {}
		private void method3() {}
		

}
