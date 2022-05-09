package controller.board;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;


/**
 * Servlet implementation class delete
 */
@WebServlet("/board/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getboardDao().getboard(bno);
		String bfile = board.getBfile();
		
		boolean result = BoardDao.getboardDao().delete(bno);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		if (result) {
			String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload/" + bfile);
			File file = new File(uploadpath);
			file.delete();
			
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 되었습니다.');");
			out.println("location.href='boardlist.jsp';");	// js [ location.href = "경로" ]
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('해당 게시물이 삭제 실패[관리자에게 문의] .');");
			out.println("history.back();");	// js [ history.back() : 이전 페이지로 가기 메소드 ] 
			out.println("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
