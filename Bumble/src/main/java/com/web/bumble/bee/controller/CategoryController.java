package com.web.bumble.bee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bumble.bee.model.Category;
import com.web.bumble.bee.service.CategoryService;

/**
 * Servlet implementation class CategoryController
 */
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
	    if(action.equals("searchcat")) {
			
			searchCategory(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("addcatg")) {
			addCategory(request, response);
			
			
		}
	
		
	}
	
	private void addCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service=new CategoryService();
		Category category=new Category();
		String message= "";
		category.setCategoryname(request.getParameter("catname"));
		try {
			boolean result= service.addCat(category);
			if(result) {
				message="Category Added";
			}
		} catch (ClassNotFoundException | SQLException e) {
			message=e.getMessage();
		}
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("add-category.jsp");
		rd.forward(request, response);
	}
	
	private void searchCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service=new CategoryService();
		Category category=new Category();
		String message= "";
		
		//category.setCategoryid(Integer.parseInt(request.getParameter("categoryid")));
		  category.setCategoryid(133);
		try {
			category=service.searchCategory(category);
			request.setAttribute("category", category);
		} catch (ClassNotFoundException | SQLException e) {
			
			message=e.getMessage();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("navbar.jsp");
		rd.forward(request, response);
	}
}
