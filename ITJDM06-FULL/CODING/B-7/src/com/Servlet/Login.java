package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.Bean;
import com.Implementation.Implementation;
import com.Interface.Interface;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(false);
		
		response.setContentType("text/html");
		
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		session.setAttribute("username", username);
		System.out.println("username="+username);
		System.out.println("password="+password);
		
		
		
		Bean b=new Bean();
		b.setUsername(username);
		b.setPassword(password);
		
		Interface i=new Implementation();
		 boolean m=i.login(b);
		 System.out.println("m="+m);
		
		 
		 if(m==true)
		 {
			 response.sendRedirect("fileupload.jsp");
		 }
		 else
		 {
		 response.sendRedirect("missmatch.jsp");
		 }
		
	}
}
