package com.naga;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int k=(int)req.getAttribute("k");
//		int k=Integer.parseInt(req.getParameter("result"));
		
		HttpSession session=req.getSession();
		int k=(int) session.getAttribute("result");
		int result =k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is :"+result);
		
	}

}
