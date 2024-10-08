package com.ukf;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		String email=request.getParameter("email");
		PrintWriter out=response.getWriter();
		String username=fname+lname;
		if(fname.equals("admin") && password.equals("123")){
//			RequestDispatcher dispatcher= request.getRequestDispatcher("homeservlet");
//			dispatcher.forward(request, response);
//			HttpSession session=request.getSession();
//			session.setAttribute("user",fname);
//			response.sendRedirect("homeservlet");
			Cookie cookie=new Cookie("user",fname);
			response.addCookie(cookie);
			response.sendRedirect("homeservlet");
		}
		else {
			out.println("invalid credential");
		}
	}
}
