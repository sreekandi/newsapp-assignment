package com.capgemini.newsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/todaysnews"} , loadOnStartup = 1 )
public class NewsApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewsApplicationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String path =request.getParameter("paper");
		
		if(path.equals("toi"))
		{
			response.sendRedirect("https://timesofindia.indiatimes.com");
		}
		if(path.equals("et"))
		{
			response.sendRedirect("https://economictimes.indiatimes.com");
		}
		if(path.equals("mt"))
		{
			response.sendRedirect("https://maharashtratimes.indiatimes.com");
		}
		if(path.equals("dna"))
		{
			response.sendRedirect("https://www.dnaindia.com");
		}
	}

	
	

}
