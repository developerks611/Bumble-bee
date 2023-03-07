package com.web.bumble.bee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.bumble.bee.model.Admin;
import com.web.bumble.bee.service.AdminService;

/**
 * Servlet implementation class AdminController
 */
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("adminlogin")) {
			adminlogin(request, response);
			
		}
	}
	
	
	private void adminlogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message="";
		AdminService service=new AdminService();
		Admin admin =new Admin();
		admin.setEmail(request.getParameter("email"));
		admin.setPassword(request.getParameter("password"));
		try {
			admin=service.loginadmin(admin);
			if(admin.getEmail()==null) {
				message="Invalid Login";
				request.setAttribute("message", message);
				RequestDispatcher rd=request.getRequestDispatcher("admin-login.jsp");
				rd.forward(request, response);
			}
			else {
				message=admin.getEmail();
				HttpSession session=request.getSession();
				
				session.setAttribute("user", "admin");
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			message=e.getMessage();
		}
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("add-product.jsp");
		rd.forward(request, response);
	}

}
