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
		ServletContext application = request.getServletContext(); // ���� ���ؽ�Ʈ
		HttpSession session = request.getSession(); // ���� ��ü ���� 
		Cookie[] cookies = request.getCookies();
		
		response.setCharacterEncoding("UTF-8"); // ���������� ���� ���ڿ��� �ѱ� ���ڵ� ó�� ��� ����
		response.setContentType("text/html; charset=UTF-8"); // ���������� ���� ���ڵ� ��� �˷���

		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		int v = 0;
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		// ���
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
		// ����
		else {

			//application.setAttribute("value", v);
			// session.setAttribute("value", v);
			//application.setAttribute("op", op);
			// session.setAttribute("op", op);
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v)); // ���ڷθ� ���� ����. v�� ������. URL�� ��� ������ ���ڸ� ���
			Cookie opCookie = new Cookie("op", op);
			
			//valueCookie.setPath("/"); // ��� ��ο��� �ش� ��Ű ���
			//opCookie.setPath("/");
			//valueCookie.setPath("/add"); // /add ��ο��� �ش� ��Ű ���
			//opCookie.setPath("/add");
			valueCookie.setPath("/calc2"); // /calc2  ��ο��� �ش� ��Ű ���
			valueCookie.setMaxAge(24*60*60); // ������ 24*60*60�� ���� ��� ����. ����ð�(��), 24*60*60 = 1��
			opCookie.setPath("/calc2");

			response.addCookie(valueCookie);   // �������� ��Ű ������
			response.addCookie(opCookie);
			
			response.sendRedirect("calc2.html");
		}
		
	}

}
