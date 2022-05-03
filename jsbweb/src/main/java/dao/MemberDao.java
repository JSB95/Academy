package dao;

import dto.Member;

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
		
		String sql = "SELECT * FROM member WHERE mid='" + mid + "'";
		
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
	
	// 이메일 중복체크
	public boolean emailcheck(String memail) {
		
		String sql = "SELECT * FROM member WHERE memail ='" + memail + "'";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("emailcheck error: " + e);
		}
		return false;
	}
	
	public boolean signup(Member member) {
		
		String sql = "INSERT INTO member(mid, mpassword, mname, mphone, memail, maddress) VALUE(?, ?, ?, ?, ?, ?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.setString(4, member.getMphone());
			ps.setString(5, member.getMemail());
			ps.setString(6, member.getMaddress());
			
			ps.executeUpdate();
			
			return true;
			
		} catch (Exception e) {
			System.err.println("signup error : " + e);
		}
		return false;
	}
	
	public int login(String mid, String mpassword) {
		String sql = "SELECT * FROM member WHERE mid = '"+mid+"'AND mpassword = '" + mpassword + "'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return 1;
			}
			return 2;
		} catch (Exception e) {
			System.err.println("long error : " + e);
		}
		return 3;
	}

}
