package com.web.bumble.bee.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.bumble.bee.model.Brand;
import com.web.bumble.bee.model.Category;
import com.web.bumble.bee.model.Client;

public class CategoryDataBase {

	public static boolean addCat(Category category) throws ClassNotFoundException, SQLException {
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="INSERT INTO category (categoryname) Values (?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, category.getCategoryname());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
		
	}
	
	public static List<Category> getAllCat() throws ClassNotFoundException, SQLException {
		
		 DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT * FROM category";
		 Statement st=connection.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 List<Category>categorylist=new ArrayList();
		 while(rs.next()) {
			 Category category=new Category();
			 category.setCategoryid(rs.getInt("categoryid"));
			 category.setCategoryname(rs.getString("categoryname"));
			 categorylist.add(category);
		 }
		 st.close();
		 connection.close();
		 return categorylist;
	}
	public static Category searchCategory(Category cate) throws ClassNotFoundException, SQLException {
		 DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT * FROM category where categoryid=?";
		 PreparedStatement ps=connection.prepareStatement(query);
		 ps.setInt(1, cate.getCategoryid());
		 ResultSet rs=ps.executeQuery();
		 Category getcategory=new Category();
		 if(rs.next()) {
			 
			 Category datacategory=new Category(rs.getInt("categoryid"),rs.getString("categoryname"));
			 getcategory=datacategory;
		 }

		 return getcategory;
		
		
	}
}
