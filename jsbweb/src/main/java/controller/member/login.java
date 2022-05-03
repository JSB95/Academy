package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		
		int result = MemberDao.getmemberDao().login(mid, mpassword);
		
		if (result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("login", mid);
			response.sendRedirect("/jspweb/main.jsp");
		} else if (result == 2) {
			response.sendRedirect("/jspweb/member/login.jsp?result=2");
		} else {
			response.sendRedirect("jspweb/error.jsp");
		}
		doGet(request, response);
	}

}
