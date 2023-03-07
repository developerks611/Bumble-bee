package com.web.bumble.bee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bumble.bee.model.Brand;
import com.web.bumble.bee.model.Category;
import com.web.bumble.bee.service.BrandService;
import com.web.bumble.bee.service.CategoryService;

/**
 * Servlet implementation class CategoryController
 */
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
	   
	   if(action.equals("viewallcat")) {
	    	
	    	viewAllcat(request, response);
	    }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("addcatg")) {
			addCategory(request, response);
			
			
		}
		else if(action.equals("categorysearch")) {
				
				searchCategory(request, response);
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
		
		category.setCategoryid(Integer.parseInt(request.getParameter("cid")));
		 
		try {
			category=service.searchCategory(category);
			if(category==null) {
				
			}
			
			request.setAttribute("category", category);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			message=e.getMessage();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("view-one-category.jsp");
		rd.forward(request, response);
	}
	
	private void viewAllcat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryService service=new CategoryService();
		String message= "";
		try {
			List<Category>catlist=service.getAllCat();
			if(catlist.isEmpty()) {
				message="Empty category List";
				
			}
			request.setAttribute("catlist", catlist);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("view-cat.jsp");
		rd.forward(request, response);
		
	}
}
