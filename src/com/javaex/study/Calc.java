package com.javaex.study;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc")
public class Calc extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();

		String v_ = request.getParameter("v"); //number
		String op = request.getParameter("operator"); //+,-,=
		// 쿼리 스트링으로 요청해서 getParameter로 들어오는 값은 모두 String

		int v = 0;// 계산
		if (!v_.equals("")) v = Integer.parseInt(v_);
		//num이 null일 때 

		// key와 값을 넣고, value라는 키에 v라는 값
 
		if (op.equals("=")) {// 값 저장

			//int x = (Integer) application.getAttribute("value");
			int x = (Integer)session.getAttribute("value");

			int y = v;
			//String operator = (String) application.getAttribute("op");
			String operator = (String) session.getAttribute("op");
			
			int result = 0;
			
			if (operator.equals("+")) 
				result = x+y;
			else
				result = x-y;
			
			response.getWriter().printf("result is %d\n", result);

		} else {
//			application.setAttribute("value", v);
//			application.setAttribute("op", op);
			session.setAttribute("value", v);
			session.setAttribute("op", op);
		}

//		
//		if(x_.equals("")|| y_.equals("")){
//			System.out.println("값을 정확히 입력해주세요");
//		}
//		else {
//			int x =Integer.parseInt(x_);
//			int y =Integer.parseInt(y_);
//			int sum =x+y;
//			System.out.println(sum);

	}
}
