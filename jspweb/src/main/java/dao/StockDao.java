package dao;

public class StockDao extends Dao {
	public StockDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static StockDao stockDao = new StockDao();
	
	public static StockDao getStockDao() {
		return stockDao;
	}
}
