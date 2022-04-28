package Day10.example;

public class Store implements Kiosk {
	
	// field
	public String address;
	
	// constructor
	
	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	// method
	
	@Override
	public void product_list() {
		// TODO Auto-generated method stub
		System.out.println("---------- 제품 목록 ----------");
	}
	
	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("---------- 장바구니 ----------");
	}
	
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("---------- 결제 목록 ----------");
	}
	
	@Override
	public void product_add() {
		// TODO Auto-generated method stub
		System.out.println("---------- 상품 추가 ----------");
	}

}
