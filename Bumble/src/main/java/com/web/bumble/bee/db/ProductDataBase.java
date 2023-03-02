package com.web.bumble.bee.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.web.bumble.bee.model.Brand;
import com.web.bumble.bee.model.Category;
import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Login;
import com.web.bumble.bee.model.Product;

public class ProductDataBase {
	public static boolean addProduct(Product product,Brand brand,Category category) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="INSERT INTO product "
				+ "(brandid,productname,productprice,productdescription,quantity,categoryid)"
				+ " Values (?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, brand.getBrandid());
		ps.setString(2, product.getProductname());
		ps.setDouble(3, product.getPrice());
		ps.setString(4, product.getProdcutdescription());
		ps.setInt(5, product.getQuantity());
		ps.setInt(6, category.getCategoryid());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
		
	}



	public static List<Product> getAllProduct() throws ClassNotFoundException, SQLException {
		DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT productid,productname,productprice,productdescription,quantity FROM product";
		 Statement st=connection.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 List<Product>productlist=new ArrayList();
		 while(rs.next()) {
			 Product product=
			 new Product(rs.getInt("productid"),rs.getString("productname"),rs.getString("productdescription"),rs.getDouble("productprice"),rs.getInt("quantity"));
			 
			 
			 productlist.add(product);
			
		 }
		 st.close();
		 connection.close();
		 return productlist;
		
	}
	
	public static List<Category>getCategoryID() throws ClassNotFoundException, SQLException{
		
		DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT categoryid FROM product";
		 Statement st=connection.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 List<Category>productlist=new ArrayList();
		 while(rs.next()) {
			 Category cat=new Category();
			 cat.setCategoryid(rs.getInt("categoryid"));
			 productlist.add(cat);
			
		 }
		 st.close();
		 connection.close();
		 return productlist;
		
	}
	
	public static boolean deleteDriver(Product id) throws ClassNotFoundException, SQLException {
	 	DbConnector connector =new DbConnectorSQL();
		Connection connection = connector.getConnection();
		
		String query = "DELETE FROM product WHERE productid=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1,id.getProductid() );
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	 
 }
}
