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
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
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
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardDto boardDto = new BoardDto(bno, btitle, bcontent, bwrite, null, bpassword);
		System.out.println(boardDto.toString());
		boolean result = BoardDao.getBoardDao().update(boardDto);
		
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
