package dao;

import java.util.ArrayList;

import dto.Chatting;

public class ChattingDao extends Dao {
	
	public ChattingDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static ChattingDao chattingDao = new ChattingDao();
	
	public static ChattingDao getChattingDao() {
		return chattingDao;
	}
	
	public boolean cwrite(Chatting chatting) {
		String sql = "INSERT INTO chatting(cname, ccontent) VALUES(?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, chatting.getCname());
			ps.setString(2, chatting.getCcontent());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("cwrite error : " + e);
		}
		
		
		return false;
	}
	
	public ArrayList<Chatting> chattinglist(){
		ArrayList<Chatting> chattinglist = new ArrayList<Chatting>();
		String sql = "SELECT * FROM chatting ORDER BY cno ASC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Chatting chatting = new Chatting(rs.getInt(1), rs.getString(2), rs.getString(3));
				chattinglist.add(chatting);
			}
			return chattinglist;
		} catch (Exception e) {
			System.err.println("chattinglist error : " + e);
		}
		return null;
		
		
	}

}
