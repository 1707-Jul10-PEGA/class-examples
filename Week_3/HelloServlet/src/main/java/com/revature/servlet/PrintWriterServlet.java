package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintWriterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("inside printwriter doGet");
		
		PrintWriter printWriter = res.getWriter();
		printWriter.write("<h1>Hello World</h1>");
		
	}

}
