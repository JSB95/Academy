package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.MemberDao;
import dao.ProductDao;
import dto.Order;

/**
 * Servlet implementation class saveorder
 */
@WebServlet("/product/saveorder")
public class saveorder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveorder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mid = (String)request.getSession().getAttribute("login");
		int mno = MemberDao.getmemberDao().getmno(mid);
		String json = request.getParameter("orderjson");
		try {
			JSONObject jo = new JSONObject(json);
			String ordername = jo.getString("ordername");
			String orderphone = jo.getString("orderphone");
			String orderaddress = jo.getString("orderaddress");
			int ordertotalpay = jo.getInt("ordertotalpay");
			String orderrequest = jo.getString("orderrequest");
			
			Order order = new Order(0, null, ordername, orderphone, orderaddress, ordertotalpay, 0, orderrequest, 0, mno);
			System.out.println(order);
			
			ProductDao.getProductDao().saveorder( order );
		} catch (Exception e) {
			e.printStackTrace();
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
