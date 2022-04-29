<%@page import="Dao.Dao"%>
<%@page import="Dto.Board"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	request.setCharacterEncoding("UTF-8");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = (String) session.getAttribute("loginid");
    	
    	Date now = new Date();
    	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    	String date = sf.format(now);
    	Board board = new Board(0, title, content, writer, date);
    	Dao dao = new Dao();
    	boolean result = dao.write(board);
    	if (result){
    		response.sendRedirect("main.jsp");
    	}
    	
    %>
