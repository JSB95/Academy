package dao;

public class WishlistDao extends Dao{
	
	public WishlistDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static WishlistDao wishlistDao = new WishlistDao();
	
	public static WishlistDao getWishlistDao() {
		return wishlistDao;
	}
	
	public boolean wishlistsave(int pno, int mno) {
		String sql = "INSERT INTO wishlist(pno, mno) VALUES(" + pno + "," + mno + ")";
		
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("wishlistsave error : " + e);
		}
		return false;
	}

}
