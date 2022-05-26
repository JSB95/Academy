package controller.product;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;

import dao.CartDao;
import dao.MemberDao;
import dao.ProductDao;
import dto.Cart;
import dto.Stock;

/**
 * Servlet implementation class savecart
 */
@WebServlet("/product/savecart")
public class savecart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public savecart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String data = request.getParameter("json");
		
		int pno = Integer.parseInt(request.getParameter("pno"));
		
		
		
		try {
			
			JSONArray jsonArray = new org.json.JSONArray(data);
			int error = -1;
			int i = 0;
			
			for (i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				
				int amount = Integer.parseInt(jsonObject.getString("amount").toString());
		
				
				System.out.println(jsonObject.getString("totalprice").toString());
				int totalprice = Integer.parseInt(jsonObject.getString("totalprice").toString());
				System.out.println(totalprice);
				int sno = 0;
				ArrayList<Stock> list = ProductDao.getProductDao().getStock(pno);
				for (Stock s : list) {
					if (s.getSsize().equals(jsonObject.get("size").toString()) && s.getScolor().equals(jsonObject.get("color").toString())) {
						sno = s.getSno();
					}
				}
				
				String mid = (String)request.getSession().getAttribute("login");
				int mno = MemberDao.getmemberDao().getmno(mid);
				
				Cart cart = new Cart(0, amount, totalprice, sno, mno);
				
				boolean result = CartDao.getCartDao().savecart(cart);
				System.out.println("json->dto : "+ cart.toString());
				if (result == false) {
					error = i;
				} 
			}
			
			if (error == -1) {
				response.getWriter().print(-1);
			} else {
				response.getWriter().print(i);
			}
			
			
			
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
