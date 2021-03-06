package controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dto.Category;

/**
 * Servlet implementation class getcategory
 */
@WebServlet("/admin/getcategory")
public class getcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getcategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		ArrayList<Category> arrayList = ProductDao.getProductDao().getcategorylist();
		PrintWriter out = response.getWriter();
		String html = "";
		String type = request.getParameter("type");
		
		if (type != null && type.equals("option")) {
			for (Category temp : arrayList) {
				html += "<option value=\"" + temp.getCno() + "\">" + temp.getCname() + "</option>";
			}
		} else {
			int i = 1;
			for (Category temp : arrayList) {
				html += "<input type=\"radio\" name=\"cno\" value=\""+temp.getCno()+"\">"+temp.getCname();
				if( i % 6 == 0 ) html += "<br>"; // 만약에 카테고리가 개수 6배수마다 줄바꿈처리 

				i++;
			}
		}
		
		
		out.print(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
