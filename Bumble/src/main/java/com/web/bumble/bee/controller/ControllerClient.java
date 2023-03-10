package com.web.bumble.bee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.bumble.bee.model.*;
import com.web.bumble.bee.service.*;


public class ControllerClient extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equals("addClient")){
		
				addCustomer(request, response);
			
		}
		else if(action.equals("login")) {
			
			
		}
	}
	
	
	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message= "";
		ClientService cs=new ClientService();
		Client client=new Client();
		Login log=new Login();
		Convertor convert=new Convertor();
		LoginService loginservice=new LoginService();
		client.setFname(request.getParameter("fname"));
		client.setLname(request.getParameter("lname"));
		client.setAdress(request.getParameter("adress"));
		client.setDob(request.getParameter("dob"));
		client.setEmail(request.getParameter("email"));
		client.setPassword(request.getParameter("password"));
		client.setNic(request.getParameter("nic"));
		log.setRollid(2);
		try {
			boolean result=cs.addClient(client);
			
			if(result) {
				loginservice.addcustomerLogin(client, log);
				message="Account Created";
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("add-customer.jsp");
		rd.forward(request, response);
	}
	

}
