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
		System.out.println("---------- ��ǰ ��� ----------");
	}
	
	@Override
	public void cart() {
		// TODO Auto-generated method stub
		System.out.println("---------- ��ٱ��� ----------");
	}
	
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("---------- ���� ��� ----------");
	}
	
	@Override
	public void product_add() {
		// TODO Auto-generated method stub
		System.out.println("---------- ��ǰ �߰� ----------");
	}

}
