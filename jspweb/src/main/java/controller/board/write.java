package controller.board;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dao.MemberDao;
import dto.Board;

/**
 * Servlet implementation class write
 */
@WebServlet("/write")
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload");
		// MultipartRequest (요청방식, 파일저장경로, 파일최대용량 허용범위, 인코딩 타입, 동일한 파일명이 있을 경우 자동 이름 변환)
		MultipartRequest multi = new MultipartRequest(request, uploadpath, 1024*1024*10, "UTF-8", new DefaultFileRenamePolicy());
		
		request.setCharacterEncoding("UTF-8");
		String btitle = multi.getParameter("btitle");
		String bcontent = multi.getParameter("bcontent");
		String bfile = multi.getFilesystemName("bfile");
		HttpSession session = request.getSession();
		String mid = (String)session.getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		Board board = new Board(0, btitle, bcontent, mno, bfile, 0, null, null);
		
		boolean result = BoardDao.getboardDao().write(board);
		
		
		if (result) {
			response.sendRedirect("/jspweb/board/boardlist.jsp");
		} else {
			response.sendRedirect("/jspweb/board/boardwrite.jsp");
		}
	}

}
