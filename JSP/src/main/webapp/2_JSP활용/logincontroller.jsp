<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    	<%
    		request.setCharacterEncoding("UTF-8");
    		String id = request.getParameter("id");
    		String password = request.getParameter("password");
    		
    		
    		Dao dao = new Dao();
    		boolean result = dao.login(id, password);
    		
    		if (result){
    			response.sendRedirect("main.jsp");
    			session.setAttribute("loginid", id); // session : 서블릿 내장객체, 서버 내 메모리 생성(모든 페이지 내에서 호출 가능) / 브라우저 마다 생성
    			session.setAttribute("loginpassword", password);
    			
    		} else {
    			response.sendRedirect("main.jsp");
    		}
    	%>