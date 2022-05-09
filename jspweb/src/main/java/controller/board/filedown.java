package controller.board;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class filedown
 */
@WebServlet("/board/filedown")
public class filedown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filedown() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String bfile = request.getParameter("bfile");
		
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload/"+bfile);
		
		// 프로젝트 경로
		// String uploadpath = "C:\Users\504\git\Academy\jspweb .... "
		
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(bfile, "UTF-8"));
		
		File file = new File(uploadpath);
		
		BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file));
		
		byte[] bytes = new byte[(int)file.length()];
		fin.read(bytes);
		
		BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
		bos.write(bytes);
		
		fin.close();
		bos.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
