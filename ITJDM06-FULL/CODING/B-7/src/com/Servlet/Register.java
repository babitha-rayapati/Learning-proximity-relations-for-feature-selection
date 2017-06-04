package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.Bean;
import com.Implementation.Implementation;
import com.Interface.Interface;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
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


		
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String gender=request.getParameter("gender");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		
		System.out.println("username="+username);
		System.out.println("email="+email);
		System.out.println("password="+password);
		System.out.println("confirmpasword="+confirmpassword);
		System.out.println("gender="+gender);
		System.out.println("mobile="+mobile);
		System.out.println("address="+address);
		
		
		Bean b=new Bean();
		
		b.setUsername(username);
		b.setEmail(email);
		b.setPassword(password);
		b.setConfirmpassword(confirmpassword);
		b.setGender(gender);
		b.setMobile(mobile);
		b.setAddress(address);
		
		Interface i=new Implementation();
		
		int k=i.register(b);
		
		System.out.println("k="+k);
		
		if(k==1)
		{
			response.sendRedirect("login.jsp");
			
		}
		else
		{
			response.sendRedirect("registerfail.jsp");
		}
		
		
		
	}

}
