package com.web.bumble.bee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Loan;
import com.web.bumble.bee.model.Product;
import com.web.bumble.bee.service.LoanService;
import com.web.bumble.bee.service.ProductService;

/**
 * Servlet implementation class LoanController
 */
public class LoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("allloan")) {
			getLoan(request, response);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("addloan")) {
			addLoan(request, response);
			
		}
	}
	private void addLoan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	private void getLoan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message="";
		LoanService service=new LoanService();
		
		
		try {
			List<Loan> loan =service.getAllLoan();
			Loan l=new Loan();
			//l.getCustomer().getEmail();
			//Product p=new Product();
			
			
		 if(loan.isEmpty()) {
				message="Empty Data";
			}
		   
		    request.setAttribute("loanlist", loan);
		  
		    
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			message= e.getMessage();
		}
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("all-loan.jsp");
		rd.forward(request, response);
	}


}
