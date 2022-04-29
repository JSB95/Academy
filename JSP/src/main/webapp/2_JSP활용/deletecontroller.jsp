<%@page import="Dto.Member"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%
    	String id = (String) session.getAttribute("loginid");
    	String password = (String) session.getAttribute("loginpassword");

		Dao dao = new Dao();
		boolean result = dao.delete(id, password);
    
    	System.out.println(result);
    	if (result){
    		response.sendRedirect("main.jsp");
    		session.invalidate();
    	}
    	
    %>