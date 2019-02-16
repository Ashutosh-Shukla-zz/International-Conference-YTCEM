package com.icetta.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;



/**
 * Servlet implementation class RegistrationLoginServlet
 */
@WebServlet("/RegistrationLoginServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
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
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String abstractNo = request.getParameter("abstractno");
		String paperTitle = request.getParameter("papertitle");
		String instituteName = request.getParameter("institutename");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RegistrationLogin registrationLogin = new RegistrationLogin(firstName, lastName, abstractNo, paperTitle, instituteName, address, city, country, email, password);
		RegistrationLoginDao dao = new RegistrationLoginDao();
		boolean insert=dao.insertUser(registrationLogin);
		if(insert){
			System.out.println("inserted");
			response.sendRedirect("/InternationalConf/Login.jsp");
		}
		else{
			response.sendRedirect("/InternationalConf/RegistrationLogin.jsp");

		}
		
		
	}
	
	
	}
	

