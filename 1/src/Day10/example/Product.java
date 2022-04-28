package Day10.example;

public class Product {
	
	// field
	private String product_name;
	private int product_stock, product_price;
	
	// constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String product_name, int product_stock, int product_price) {
		super();
		this.product_name = product_name;
		this.product_stock = product_stock;
		this.product_price = product_price;
	}
	
	// method
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

}
