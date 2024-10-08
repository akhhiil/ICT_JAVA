package com.ukf;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/homeservlet")
public class HomeServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
//		String fname=req.getParameter("fname");
//		PrintWriter out=res.getWriter();
//		out.println("WELCOME"+ " "+fname);
		
//		HttpSession session=req.getSession();
//		String fname=(String) session.getAttribute("user");
		PrintWriter out=res.getWriter();
		String fname;
		Cookie cookies[]=req.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("user")){
				fname=cookie.getValue();
				out.println("Welcome"+" "+fname);
			}
		}
	}
}
