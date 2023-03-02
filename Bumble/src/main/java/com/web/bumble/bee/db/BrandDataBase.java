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
import com.web.bumble.bee.model.Login;

public class BrandDataBase {
	public static boolean addBrand(Brand brand) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="INSERT INTO brand (brandid,brandname) Values (?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, brand.getBrandid());
		ps.setString(2, brand.getBrandname());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	
	public static List<Brand> getAllBrand() throws ClassNotFoundException, SQLException {
		
		 DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT * FROM brand";
		 Statement st=connection.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 List<Brand>brandlist=new ArrayList();
		 while(rs.next()) {
			 Brand brand=new Brand();
			 brand.setBrandid(rs.getInt("brandid"));
			 brand.setBrandname(rs.getString("brandname"));
			 brandlist.add(brand);
		 }
		 st.close();
		 connection.close();
		 return brandlist;
	}
	
	public static Brand searchBrand(Brand brand) throws ClassNotFoundException, SQLException {
		 DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "SELECT * FROM brand where brandid=?";
		 PreparedStatement ps=connection.prepareStatement(query);
		 ps.setInt(1, brand.getBrandid());
		 ResultSet rs=ps.executeQuery();
		 Brand branddata=new Brand();
		 if(rs.next()) {
			 Brand brandreturn=new Brand(rs.getInt("brandid"),rs.getString("brandname"));
			 branddata=brandreturn;
		 }
		 
		 connection.close();
		 return branddata;
		
		
	}
	
	
}
