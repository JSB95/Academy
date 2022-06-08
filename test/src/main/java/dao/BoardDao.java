package dao;

import java.util.ArrayList;

import dto.BoardDto;

public class BoardDao extends Dao{
	
	public BoardDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getBoardDao() {
		return boardDao;
	}
	
	public boolean write(BoardDto boardDto) {
		String sql = "INSERT INTO board(btitle, bcontent, bwrite, bpassword) VALUES (?, ?, ?,?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, boardDto.getBtitle());
			ps.setString(2, boardDto.getBcontent());
			ps.setString(3, boardDto.getBwrite());
			ps.setString(4, boardDto.getBpassword());
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			System.out.println("board write ERROR : " + e);
		}
		return false;
	}
	
	public ArrayList<BoardDto> getboardlist(){
		
		ArrayList<BoardDto> boardlist = new ArrayList<>();
		
		String sql = "SELECT * FROM board ORDER BY bno";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BoardDto boardDto = new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				boardlist.add(boardDto);
			}
			return boardlist;
		} catch (Exception e) {
			System.out.println("getboardlist ERROR : " + e);
		}
		return null;
	}
	
	public BoardDto getboard(int bno) {
		String sql = "SELECT * FROM board WHERE bno = " + bno;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				BoardDto boardDto = new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				return boardDto;
			}
			
		} catch (Exception e) {
			System.out.println("getboard ERROR : " + e);
		}
		
		return null;
	}
	
	public boolean update(BoardDto boardDto) {
		String sql = "UPDATE board SET btitle=?, bcontent=?, bwrite=? WHERE bno=?";
		System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, boardDto.getBtitle());
			ps.setString(2, boardDto.getBcontent());
			ps.setString(3, boardDto.getBwrite());
			ps.setInt(4, boardDto.getBno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("board update error : " + e);
		}
		return false;
	}
	
	public int delete(int bno , String pw) {
		String sql = "SELECT bpassword FROM board WHERE bno = " + bno;

		try {
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				if (rs.getString(1).equals(pw)) {
					sql = "DELETE FROM board WHERE bpassword = '" + pw + "'";
					ps = con.prepareStatement(sql);
					ps.executeUpdate();
					return 0;
				}
			}
			return 1;
		} catch (Exception e) {
			System.out.println("delete error : " + e);
		}
		return 2;
	}
	
}
