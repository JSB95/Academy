package controller.chatting;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChattingDao;
import dto.Chatting;

/**
 * Servlet implementation class chattingview
 */
@WebServlet("/chattingview")
public class chattingview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chattingview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Chatting> chattinglist = ChattingDao.getChattingDao().chattinglist();
		

		
		for (int i = 0; i < chattinglist.size(); i++) {
			
				response.getWriter().print(chattinglist.get(i).getCname() + "," + chattinglist.get(i).getCcontent() + "_");
				System.out.print(chattinglist.get(i).getCname() + "," + chattinglist.get(i).getCcontent() + "_");
			
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
