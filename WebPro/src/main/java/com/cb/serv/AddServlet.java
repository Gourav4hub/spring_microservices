package com.cb.serv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int x = Integer.parseInt(req.getParameter("fnum"));
		int y = Integer.parseInt(req.getParameter("snum"));
		
		int z = x + y;
		
		resp.getWriter().write("Result : " + z);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int x = Integer.parseInt(req.getParameter("fnum"));
		int y = Integer.parseInt(req.getParameter("snum"));
		
		int z = x * y;
		
		resp.getWriter().write("Result : " + z);
	}
}
