package com.evoting.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.evoting.service.Query;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
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
		// TODO Auto-generated method stub
		int i=0;
		Query register = new Query();
		String cName = request.getParameter("cName");
		String cAddress = request.getParameter("cAddress");
		String cWebsite = request.getParameter("cWebsite");
		String cEmail = request.getParameter("cEmail");
		String voterDetails = request.getParameter("voterDetails");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cPass");
		i=register.doRegistration(cName,cAddress,cWebsite,cEmail,voterDetails,pass,cpass);
		if(i > 0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("Register.jsp");
		}
	}

}
