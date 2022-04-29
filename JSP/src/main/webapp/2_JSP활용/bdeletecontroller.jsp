<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    
    	int bno = Integer.parseInt(request.getParameter("bno"));
    
    	Dao dao = new Dao();
    	boolean result = dao.bdelete(bno);
    	System.out.println(result);
    	if (result){
    		response.sendRedirect("main.jsp");
    	}
    	
    %>