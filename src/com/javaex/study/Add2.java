package com.javaex.study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//여러 파라미터가 하나의 밸류로 오기 때문에 
		//html로부터 num을 getParmeterValues로 배열로 전달 받아서 num_에 배열로 저장한다 */

		String[] num_ =request.getParameterValues("num");
		
		int result =0;
		for(int i=0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			//연산은 반복되지만 변수선언은 반복 안됨
			result=result+num;
		}
			
		response.getWriter().printf("result is %d\n", result);
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
