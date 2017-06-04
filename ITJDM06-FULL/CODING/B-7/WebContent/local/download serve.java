package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Download_File
 */
@WebServlet("/Amazon_download")
public class Amazon_download extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Amazon_download() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		String filepath="D:\\Workspace\\ITJCC02\\WebContent\\aupload\\OriginalFile\\";
		
		String filename=request.getParameter("filename");
		
		System.out.println(filename);

		  response.setContentType("APPLICATION/OCTET-STREAM");   
		  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
		  
		  java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filepath+filename);  
		            
		  int i;   
		  while ((i=fileInputStream.read()) != -1) {  
		    out.write(i);   
		  }   
		  fileInputStream.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
