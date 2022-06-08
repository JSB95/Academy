package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.BoardDto;

/**
 * Servlet implementation class boardwrite
 */
@WebServlet("/boardwrite")
public class boardwrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boardwrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bpassword = request.getParameter("bpassword");
		String bwrite = request.getParameter("bwrite");
		
		BoardDto boardDto = new BoardDto(0, btitle, bcontent, bwrite, null, bpassword);
		
		boolean result = BoardDao.getBoardDao().write(boardDto);
		
		if (result) {
			response.getWriter().print(result);
		} else {
			response.getWriter().print(result);
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
