package dao;

public class ProductDao extends Dao {
	
	public ProductDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static ProductDao productDao = new ProductDao();
	
	public static ProductDao getProductDao() {
		return productDao;
	}

}
