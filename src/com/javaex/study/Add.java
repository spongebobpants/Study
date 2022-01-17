package com.javaex.study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String x_=request.getParameter("x");
		String y_=request.getParameter("y");
		//쿼리 스트링으로 요청해서 getParameter로 들어오는 값은 모두 String
		
		int x=0;
		int y=0;
		
		if(!x_.equals("")) x=Integer.parseInt(x_);
		if(!y_.equals("")) y=Integer.parseInt(y_);
		
		int result = x+y;
		response.getWriter().printf("result is %d\n", result);
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
