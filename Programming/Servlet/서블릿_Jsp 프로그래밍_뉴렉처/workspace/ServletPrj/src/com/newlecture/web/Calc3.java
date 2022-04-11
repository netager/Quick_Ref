package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext(); // 서블릿 컨텍스트
		HttpSession session = request.getSession(); // 세션 객체 생성 
		Cookie[] cookies = request.getCookies();
		
		response.setCharacterEncoding("UTF-8"); // 웹서버에서 응답 문자열의 한글 인코딩 처리 방식 지정
		response.setContentType("text/html; charset=UTF-8"); // 브라우저에게 문자 인코딩 방식 알려줌

		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		int v = 0;
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		// 계산
		if(op.equals("=")) {
			
			//int x = (Integer)application.getAttribute("value");
			//int x = (Integer)session.getAttribute("value");
			int x = 0;
			for(Cookie c : cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}	
				
			int y = v;
			//String operator = (String)application.getAttribute("op");
			//String operator = (String)session.getAttribute("op");
			
			String operator = " ";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}	

			int result = 0;
			
			if(operator.equals("+"))
				result = x+y;
			else
				result = x-y;
			
			response.getWriter().printf("Result is %d\n", result);
			
		}
		// 저장
		else {

			//application.setAttribute("value", v);
			// session.setAttribute("value", v);
			//application.setAttribute("op", op);
			// session.setAttribute("op", op);
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v)); // 문자로만 저장 가능. v는 정수형. URL로 사용 가능한 문자만 사용
			Cookie opCookie = new Cookie("op", op);
			
			//valueCookie.setPath("/"); // 모든 경로에서 해당 쿠키 사용
			//opCookie.setPath("/");
			//valueCookie.setPath("/add"); // /add 경로에서 해당 쿠키 사용
			//opCookie.setPath("/add");
			valueCookie.setPath("/calc2"); // /calc2  경로에서 해당 쿠키 사용
			valueCookie.setMaxAge(24*60*60); // 앞으로 24*60*60초 까지 살아 있음. 만료시간(초), 24*60*60 = 1일
			opCookie.setPath("/calc2");

			response.addCookie(valueCookie);   // 브라우저로 쿠키 보내기
			response.addCookie(opCookie);
			
			response.sendRedirect("calc2.html");
		}
		
	}

}
