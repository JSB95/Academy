package dao;

public class MemberDao extends Dao{
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static MemberDao memberDao = new MemberDao();
	
	public static MemberDao getmemberDao() {
		return memberDao;
	}
	
	// 아이디 중복체크
	public boolean idcheck(String mid) {
		
		String sql = "SELECT * FROM member WHERE mid=" + mid;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("idcheck error : " + e);
		}
		return false;
	}

}
