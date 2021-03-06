package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
			System.err.println("DB???? ???? : " + e);
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
			ps.setString(5, member.getMaddress());
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
	
	public Member getmember(String id) {
		try {
			String sql = "SELECT * FROM member where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				Member member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));
				return member;
			}
			
		} catch (Exception e) {
			System.err.println("getmember ERROR : " + e);
		}
		
		return null;
	}
	
	public boolean delete (int mnum) {
		try {
			String sql = "DELETE FROM member WHERE mnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("delete ERROR : " + e);
		}
		return false;
	}
	
	public boolean update(int mnum, String email, String address) {
		try {
			String sql = "UPDATE member SET memail = ?, maddress = ? WHERE mnum = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, address);
			ps.setInt(3, mnum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("update ERROR : " + e);
		}
		return false;
	}
	
	public String getmid (int mnum) {
		try {
			String sql = "SELECT mid FROM member WHERE mnum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			System.err.println("getmid ERROR : " + e);
		}
		return null;
	}
	
	public int counttotal (String tname) {
		String sql = "SELECT COUNT(*) FROM " + tname;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
			
		} catch (Exception e) {
			
		}
		return 0;
	}
	
	public Map<String, Integer> datetotal(String tname, String date){
		
		Map<String, Integer> map = new TreeMap<>();
		String sql = "SELECT SUBSTRING_INDEX( " + date + ", ' ', 1), count(*) FROM " + tname + " GROUP BY SUBSTRING_INDEX( + " + date + ", ' ', 1)";
		try {
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
			return map;
			
		} catch (Exception e) {
			System.err.println("DATETOTAL ERROR : " + e);
		}
		return null;
	}
	
	public Map<String, Integer> countcategory(){
		Map<String, Integer> map = new HashMap<>();
		String sql = "SELECT pcategory, count(*) FROM javafx.product GROUP BY pcategory";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getString(1), rs.getInt(2));
			}
			return map;
		} catch (Exception e) {
			System.err.println("COUNTCATEGORY ERROR : " + e);
		}
		return null;
	}
	
	
	
	

}
