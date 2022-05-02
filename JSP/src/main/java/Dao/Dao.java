package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.Board;
import Dto.Member;






public class Dao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Dao() {
		// TODO Auto-generated constructor stub
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest?serverTimezone=UTC", "root", "1234");
			System.out.println("Connection");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("MemberDao ERROR" + e);
		}
	}
	
	public boolean signup(Member member) {
		String sql = "INSERT INTO member(mid, mpassword, mname) VALUES(?, ?, ?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMid());
			ps.setString(2, member.getMpassword());
			ps.setString(3, member.getMname());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("signup ERROR : " + e);
		}
		
		return false;
	}
	
	public boolean login(String id, String password) {
		
		try {
			
			String sql = "SELECT * FROM member WHERE mid=? AND mpassword=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			System.err.println("login ERROR" + e);
		}
		return false;
	} 
	
	public boolean delete(String id, String password) {
		try {
			String sql1 = "SELECT * FROM member WHERE mid =? and mpassword=?";	// 회원검사
			String sql2 = "DELETE FROM member WHERE mid=? and mpassword=?";		// 회원삭제
			ps = con.prepareStatement(sql1);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setString(1, id);
				ps2.setString(2, password);
				ps2.executeUpdate();
				return true;
			}
		} catch (Exception e) {
			System.err.println("quit ERROR : " + e);
		}
		return false;
	}
	
	public boolean write(Board board) {
		String sql = "INSERT INTO board(btitle, bcontent, bwriter, bdate) VALUES(?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwriter());
			ps.setString(4, board.getBdate());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("write ERROR : " + e);
		}
		return false;
	}
	
	public ArrayList<Board> list(){
		ArrayList<Board> boardlist = new ArrayList<Board>();
		String sql = "SELECT * FROM board ORDER BY bno DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("list ERROR" + e);
		}
		return null;
	}
	
	public Board get(int bno) {
		String sql = "SELECT * FROM board WHERE bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			if (rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				return board;
			}
		} catch (Exception e) {
			System.err.println("Board get ERROR : " + e);
		}
		return null;
	}
	
	public boolean bdelete(int bno) {
		String sql = "DELETE FROM board WHERE bno=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("bdelete ERROR" + e);
		}
		return false;
	}
	

}
