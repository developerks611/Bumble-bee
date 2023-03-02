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
import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Convertor;
import com.web.bumble.bee.model.Login;
import com.web.bumble.bee.service.BrandService;
import com.web.bumble.bee.service.CategoryService;
import com.web.bumble.bee.service.ClientService;
import com.web.bumble.bee.service.LoginService;

/**
 * Servlet implementation class BrandController
 */
public class BrandController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("searchbrand")) {
			searchBrand(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("addbrand")) {
			addBrand(request, response);
		}
	}
	
	private void addBrand(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message= "";
		Brand brand=new Brand();
		brand.setBrandname(request.getParameter("brandname"));
		BrandService service=new BrandService();
		try {
			boolean result=service.addBrand(brand);
			if(result) {
				
				message="Brand Added";
			}
		} catch (ClassNotFoundException | SQLException e) {
			message=e.getMessage();
		}
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("add-brand.jsp");
		rd.forward(request, response);
	}
	
	private void searchBrand(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BrandService service=new BrandService();
		Brand brand=new Brand();
		String message= "";
		brand.setBrandid(3);
		//category.setCategoryid(Integer.parseInt(request.getParameter("categoryid")));
	
		try {
			brand=service.searchBrand(brand);
			request.setAttribute("brand", brand);
		} catch (ClassNotFoundException | SQLException e) {
			
			message=e.getMessage();
		}
		
		request.setAttribute("message", message);
		RequestDispatcher rd=request.getRequestDispatcher("navbar.jsp");
		rd.forward(request, response);
	}
	
}
