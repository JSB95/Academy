package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dao.MemberDao;
import dto.Reply;

/**
 * Servlet implementation class replyupdate
 */
@WebServlet("/board/replyupdate")
public class replyupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public replyupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bno = request.getParameter("bno");
		String rcontent = request.getParameter("rcontent_update");
		String mid = (String)request.getSession().getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);
		System.out.println(bno +" + "+ rcontent +" + "+ mid + " + " + mno);
		
		
		Reply reply = new Reply(0, rcontent, null, 0, Integer.parseInt(bno), mno, null);
		System.out.println(reply.toString());
		boolean result = BoardDao.getboardDao().replyupdate(reply);
		
		if (result) {
			response.getWriter().print(1);
		} else {
			response.getWriter().print(2);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
