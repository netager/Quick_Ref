package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, 
			               HttpServletResponse response) 
			            		   throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); // 웹서버에서 한글 인코딩 처리 방식 지정
		response.setContentType("text/html; charset=UTF-8"); // 브라우저에게 문자 인코딩 방식 알려줌
		
		PrintWriter out = response.getWriter();
		
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
	    out.println("계산 결과는 : "+ (x+y));

	}
}
