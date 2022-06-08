package dao;

import dto.MemberDto;

public class MemberDao extends Dao{
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static MemberDao memberDao = new MemberDao();
	
	public static MemberDao getmemberDao() {
		return memberDao;
	}
	
	public boolean signup(MemberDto memberDto) {
		String sql = "INSERT INTO MEMBER(mid,mpassword) VALUES(?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, memberDto.getMid());
			ps.setString(2, memberDto.getMpassword());
			ps.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			System.out.println("signup error : "+ e);
		}
		return false;
	}
	
	public int login(String mid, String mpassword) {
		String sql = "SELECT * FROM member WHERE mid = '" + mid + "'AND mpassword = '" + mpassword + "'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return 1;
			}
			return 2;
		} catch (Exception e) {
			System.out.println("login ERROR : " + e);
		}
		return 3;
	}

}
