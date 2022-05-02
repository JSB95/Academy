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

}
