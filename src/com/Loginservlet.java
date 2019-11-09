package com;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)  {
		try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String s = request.getParameter("t1");
		String t = request.getParameter("t2");
		out.println("User name is" +s);
		out.println("<br>");
		out.println("User name is" +t);
		}
		catch(Exception ae){
			
		}
	}

}
