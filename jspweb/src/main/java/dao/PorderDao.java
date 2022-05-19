package dao;

public class PorderDao extends Dao{
	
	public static PorderDao porderDao = new PorderDao();
	
	public static PorderDao getPorderDao() {
		return porderDao;
	}

}
