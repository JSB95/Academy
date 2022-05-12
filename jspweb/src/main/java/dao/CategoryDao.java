package dao;

public class CategoryDao extends Dao{
	
	public CategoryDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static CategoryDao categoryDao = new CategoryDao();
	
	public static CategoryDao getCategoryDao() {
		return categoryDao;
	}
	
	
	

}
