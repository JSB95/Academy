package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Member;

public class MemberDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static MemberDao memberDao = new MemberDao();
	
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", "root", "1234");
		} catch (Exception e) {
			System.err.println("DB연동 실패 : " + e);
		}
	}
	
	public boolean idcheck (String id) {
		
		String sql = "select * from member where mid=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			System.err.println("idcheck ERROR : " + e);
		}
		return false;
	}
	
	public boolean signup (Member member) {
		
		String sql = "INSERT INTO member(mpoint, mid, mpassword, memail, maddress, msince) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, member.getMpoint());
			ps.setString(2, member.getMid());
			ps.setString(3, member.getMpassword());
			ps.setString(4, member.getMemail());
			ps.setString(5, member.getMadderss());
			ps.setString(6, member.getMsince());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("signup ERROR : " + e);
		}
		
		
		
		
		
		
		return false;
	}
	
	public boolean login (String id, String password) {
		
		String sql = "SELECT * FROM member WHERE mid=? and mpassword=?";
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}	
		} catch (Exception e) {
			System.err.println("login ERROR : " + e);
		}
		return false;
	}
	
	public String findid (String email) {
		
		String sql = "SELECT * FROM member WHERE memail = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				String id = rs.getString("mid");
				return id;
			}
			
		} catch (Exception e) {
			System.err.println("findid ERROR : " + e);
		}
		return null;
	}
	
	public String findpassword (String id, String email) {
		
		String sql = "SELECT * FROM member WHERE mid = ? and memail = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				String pw = rs.getString("mpassword");
				return pw;
			}
			
		} catch (Exception e) {
			System.err.println("findpw ERROR : " + e);
		}
		return null;
	}
	
	

}
