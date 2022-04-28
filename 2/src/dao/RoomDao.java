package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Room;
import dto.Roomlive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RoomDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static RoomDao roomDao = new RoomDao();
	
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC","root","1234");
		} catch (Exception e) {
			System.err.println("RoomDao ERROR : " + e);
		}
	}
	
	public boolean roomadd (Room room) {
		try {
			String sql = "INSERT INTO room(roname, roip) VALUES(?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, room.getRoname());
			ps.setString(2, room.getRoip());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("ROOMADD ERROR : " + e);
		}
		return false;
	}
	
	public int getroomnum() {
		try {
			String sql = "SELECT max(ronum) FROM room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.err.println("GETROOMNUM ERROR : " + e);
		}
		return 0;
	}
	
	public ObservableList<Room> roomlist(){
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		
		try {
			
			String sql = "SELECT * FROM room ORDER BY ronum DESC";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String sql2 = "SELECT COUNT(*) FROM roomlive WHERE ronum = " + rs.getInt(1);
				ps = con.prepareStatement(sql2);
				ResultSet rs2 = ps.executeQuery();
				int count = 0;
				if (rs2.next()) {
					count = rs2.getInt(1);
				}
				Room room = new Room(rs.getInt(1), rs.getString(2), rs.getString(3), count);
				roomlist.add(room);
			}
			return roomlist;
			
		} catch (Exception e) {
			System.err.println("ROOMLIST ERROR : " + e);
		}
		return null;
	}
	
	public boolean addroomlive(Roomlive roomlive) {
		String sql = "INSERT INTO roomlive(ronum, mid) VALUES(?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, roomlive.getRonum());
			ps.setString(2, roomlive.getMid());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("ADDROOMLIVE ERROR : " + e);
		}
		return false;
	}
	
	public ArrayList<Roomlive> getRoomlivelist(int ronum){
		
		ArrayList<Roomlive> roomlivelist = new ArrayList<>();
		
		try {
			
			String sql = "SELECT * FROM roomlive WHERE ronum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Roomlive roomlive = new Roomlive(rs.getInt(1), rs.getInt(2), rs.getString(3));
				roomlivelist.add(roomlive);
			}
			
			return roomlivelist;
			
		} catch (Exception e) {
			System.err.println("GETROOMLIVELIST ERROR : " + e);
		}
		return null;
		
	}
	
	public boolean roomlivedelete(String mid) {
		
		try {
			String sql = "DELETE FROM roomlive WHERE mid = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.err.println("ROOLIVEDELETE ERROR : " + e);
		}
		
		return false;
	}
	
	public boolean roomdelete (int ronum) {
		String sql = "SELECT * FROM roomlive where ronum =? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
			if (rs.next()) {
				return false;
			} else {
				String sql2 = "DELETE FROM room WHERE ronum = ?";
				ps = con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true;
			}
		} catch (Exception e) {
			System.err.println("ROOMDELETE ERROR : " + e);
		}
		return false;
	}
	
	
}
