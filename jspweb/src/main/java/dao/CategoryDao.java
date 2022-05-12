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
	
	public String getcname(int cno) {
		String sql = "SELECT cname FROM category WHERE cno=" + cno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			System.err.println("getcname error : " + e);
		}
		return null;
	}
	
	
	

}
