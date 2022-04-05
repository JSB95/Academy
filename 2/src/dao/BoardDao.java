package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static BoardDao boardDao = new BoardDao();
	
	public BoardDao() {				// 생성자에서 연동하는 이유 : 객체 생성 시 바로 connect
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
		} catch (Exception e) {
			System.err.println("BoardDao ERROR : " + e);
		}
	}
	
	public ObservableList<Reply> replylist(int bnum){
		
		ObservableList<Reply> replylist = FXCollections.observableArrayList();
		try {
			
			String sql = "SELECT * FROM reply WHERE bnum = ? ORDER BY rnum DESC";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			rs = ps.executeQuery();
			while (rs.next()) {
				Reply reply = new Reply(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				replylist.add(reply);
			}
			return replylist;
		} catch (Exception e) {
			System.err.println("replylist ERROR : " + e);
		}
		return null;
	}
	
	public ObservableList<Board> list(){
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			String sql = "SELECT * FROM board ORDER BY bnum DESC";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {
			System.err.println("Observablelist ERROR : " + e);
		}
		
		return null;
	}
	
	public boolean write (Board board) {
		try {
			String sql = "INSERT INTO board(btitle, bcontent, bwrite) VALUES(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("write ERROR : " + e);
		}
		return false;
	}
	
	
	public boolean delete(int bnum) {
		try {
			String sql = "DELETE FROM board WHERE bnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("delete ERROR : " + e);
		}
		return false;
	}
	
	public boolean update(int bnum, String title, String content) {
		
		try {
			String sql = "UPDATE board SET btitle = ?, bcontent = ? WHERE bnum = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("update ERROR : " + e);
		}
		return false;
	}
	
	public boolean rwrite(Reply reply) {
		try {
			String sql = "INSERT INTO reply(rcontent, rwrite, bnum) VALUES (?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, reply.getRcontent());
			ps.setString(2, reply.getRwrite());
			ps.setInt(3, reply.getBnum());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("rwrite ERROR : " + e);
		}
		return false;
	}

}
