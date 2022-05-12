package controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductDao;
import dto.Product;

/**
 * Servlet implementation class productadd
 */
@WebServlet("/admin/productadd")
public class productadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productadd() {
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
		request.setCharacterEncoding("UTF-8");
		
		
		String path = request.getSession().getServletContext().getRealPath("/admin/productimg");
		
		MultipartRequest multipartRequest = new MultipartRequest(request, path, 1024*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
		System.out.println(path);
		String pname = multipartRequest.getParameter("pname");
		int pprice = Integer.parseInt(multipartRequest.getParameter("pprice"));
		float pdiscount = Float.parseFloat(multipartRequest.getParameter("pdiscount"));
		int cno = Integer.parseInt(multipartRequest.getParameter("cno"));
		
		String pimg = multipartRequest.getFilesystemName("pimg");
		
		
		Product product = new Product(0, pname, pprice, pdiscount, 0, pimg, cno);
		
		boolean result = ProductDao.getProductDao().psave(product);
		
		System.out.println(product.toString());
		
		if (result) {
			response.getWriter().print(1);
		} else {
			response.getWriter().print(2);
		}
		
	}

}
