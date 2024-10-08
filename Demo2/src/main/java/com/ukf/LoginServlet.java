package com.ukf;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		out.println(username);
		out.println(password);
	}
}
