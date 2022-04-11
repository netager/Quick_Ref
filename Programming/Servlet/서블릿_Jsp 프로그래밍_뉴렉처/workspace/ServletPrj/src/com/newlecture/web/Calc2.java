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
@WebServlet("/calc2")
public class Calc2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext(); // ���� ���ؽ�Ʈ
		HttpSession session = request.getSession(); // ���� ��ü ���� 
		
		response.setCharacterEncoding("UTF-8"); // ���������� ���� ���ڿ��� �ѱ� ���ڵ� ó�� ��� ����
		response.setContentType("text/html; charset=UTF-8"); // ���������� ���� ���ڵ� ��� �˷���

		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		int v = 0;
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		// ���
		if(op.equals("=")) {
			
			//int x = (Integer)application.getAttribute("value");
			int x = (Integer)session.getAttribute("value");
			int y = v;
			//String operator = (String)application.getAttribute("op");
			String operator = (String)session.getAttribute("op");

			int result = 0;
			
			if(operator.equals("+"))
				result = x+y;
			else
				result = x-y;
			
			response.getWriter().printf("Session result is %d\n", result);
			
		}
		// ����
		else {

			//application.setAttribute("value", v);
			// session.setAttribute("value", v);
			//application.setAttribute("op", op);
			// session.setAttribute("op", op);
			
			Cookie ValueCookie = new Cookie("value", String.valueOfv); // ���ڷθ� ���� ����. v�� ������
			Cookie OpCookie = new Cookie("op", op);
		}
		
	}

}
