package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, 
			               HttpServletResponse response) 
			            		   throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); // 웹서버에서 한글 인코딩 처리 방식 지정
		response.setContentType("text/html; charset=UTF-8"); // 브라우저에게 문자 인코딩 방식 알려줌
		
		PrintWriter out = response.getWriter();
		
		String cnt_ = request.getParameter("cnt");
		
		int cnt = 100;
		if(cnt_ != null && !cnt_.equals(""))
			cnt = Integer.parseInt(cnt_);  // 문자열을 숫자로 변경
		
		for(int i=0; i<cnt; i++) {
			out.println((i+1)+": 안녕 Servlet!!!<br />");
		}
	}
}
