<%@page import="Dao.Dao"%>
<%@page import="Dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	request.setCharacterEncoding("UTF-8");
    	String id = request.getParameter("id");
    	String password = request.getParameter("password");
    	String name = request.getParameter("name");
    	
    	Member member = new Member(0, id, password, name);
    	
    	Dao dao = new Dao();
    	
    	boolean result = dao.signup(member);
    	
    	if (result){
    		response.sendRedirect("main.jsp");
    	}
    %>
