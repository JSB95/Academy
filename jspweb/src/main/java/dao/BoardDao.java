package dao;

import java.util.ArrayList;

import dto.Board;
import dto.Reply;

public class BoardDao extends Dao{
	public BoardDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getboardDao() {
		return boardDao;
	}
	
	// 1. 게시물 쓰기 메소드 	[ 인수 : 작성된 데이터들 = dto  ]
	public boolean write( Board board ) { 
		String sql = "INSERT INTO board(btitle, bcontent, mno, bfile) VALUES(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setInt(3, board.getMno());
			ps.setString(4, board.getBfile());
			System.out.println(board);
			ps.executeUpdate();	
			return true;
			
		} catch (Exception e) {
			System.err.println("board write error : " + e);
		}
		return false;
	}
	// 2. 모든 게시물 출력 메소드 [ 인수 : x  // 추후기능 = 검색 : 조건 ]
	public ArrayList<Board> getboardlist() {
		
		ArrayList<Board> boardlist = new ArrayList<>();
		String sql = "SELECT * FROM board WHERE mno ORDER BY bno DESC ";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), null);
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {
			System.err.println("getboardlist error : " + e);
		}
		return null; 
	}
	
	public ArrayList<Board> getboardlist2(int mno){
		ArrayList<Board> boardlist = new ArrayList<Board>();
		String sql = "SELECT * FROM board WHERE mno='" + mno + "'ORDER BY bno DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), null);
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {
			System.err.println("getboardlist2 error : " + e);
		}
		return null;
	}
	// 3. 개별 게시물 출력 메소드 [ 인수 : 게시물번호 ]
	public Board getboard(int bno) {
		String sql = "SELECT * FROM board WHERE bno='" + bno + "'";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7), null);
				return board;
			}
		} catch (Exception e) {
			System.err.println("getboard error : " + e);
		}
		return null; 
	}
	// 4. 게시물 수정 메소드 	[ 인수 : 수정할 게시물번호  / 수정된 내용 ]
	public boolean update( Board board ) { 
		String sql = "UPDATE board SET btitle=?, bcontent=?, bfile=? WHERE bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBfile());
			ps.setInt(4, board.getBno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("board update error : " + e);
		}
		return false; 
	}
	// 5. 게시물 삭제 메소드 	[ 인수 : 삭제할 게시물번호 
	public boolean delete( int bno ) {
		String sql = "DELETE FROM board WHERE bno=" + bno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("delete error : " + e);
		}
		return false; 
	}
	// 6. 게시물 조회 증가 메소드 	[ 인수 : 증가할 게시물번호 ]
	public boolean increview( int bno ) { 
		String sql = "UPDATE board SET bview = bview + 1 WHERE bno=" + bno;
		try {
			 ps = con.prepareStatement(sql);
			 ps.executeUpdate();
			 System.out.println("조회수 증가");
			 return true;
		} catch (Exception e) {
			System.err.println("increview error + " + e);
		}
		return false; 
	}
	// 7. 댓글 작성 메소드 		[ 인수 : 작성된 데이터들 = dto ]
	public boolean replywrite(Reply reply) {
		String sql = "INSERT INTO reply(rcontent, rindex, bno, mno) VALUES(?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reply.getRcontent());
			ps.setInt(2, reply.getRindex());
			ps.setInt(3, reply.getBno());
			ps.setInt(4, reply.getMno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("replywrite error :" + e);
		}
		return false; 
	}
	// 8. 댓글 출력 메소드 		[ 인수 : x ]
	public ArrayList<Reply> replylist(int bno) {
		ArrayList<Reply> replylist = new ArrayList<Reply>();
		String sql = "SELECT * FROM reply WHERE bno = " + bno + " AND rindex = 0";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Reply reply = new Reply(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), null);
				replylist.add(reply);
			}
			return replylist;
		} catch (Exception e) {
			System.err.println("replylist error : " + e);
		}
		return null; 
	}
	public ArrayList<Reply> rereplylist(int bno, int rno) {
		ArrayList<Reply> rereplylist = new ArrayList<Reply>();
		String sql = "SELECT * FROM reply WHERE bno = " + bno + " AND rindex = " + rno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Reply reply = new Reply(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), null);
				rereplylist.add(reply);
			}
			return rereplylist;
		} catch (Exception e) {
			System.err.println("rereplylist error : " + e);
		}
		return null; 
	}
	// 9. 댓글 수정 메소드 		[ 인수 : 수정할 댓글 번호 ]
	public boolean replyupdate() { return false; }
	// 10. 댓글 삭제 메소드 		[ 인수 : 삭제할 댓글 번호 ] 
	public boolean replydelete() { return false; }
	public boolean filedelete(int bno) {
		String sql = "UPDATE board SET bfile = null WHERE bno=" + bno;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.err.println("filedelete error :" + e);
		}
		return false;
	}
}
