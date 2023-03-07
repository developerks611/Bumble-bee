package com.web.bumble.bee.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.bumble.bee.model.Admin;
import com.web.bumble.bee.model.Brand;

public class AdminDataBase {
	//call admin(?,?)
	
	public static Admin loginadmin(Admin admin) throws ClassNotFoundException, SQLException {
		 DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "call admin(?,?)";
		 CallableStatement ps=connection.prepareCall(query);
		 ps.setString(1, admin.getEmail());
		 ps.setString(2, admin.getPassword());
		 ResultSet rs=ps.executeQuery();
		 Admin admindata=new Admin();
		 if(rs.next()) {
			 Admin adminselec=new Admin(rs.getString("email"),rs.getString("password"));
			admindata=adminselec;
		 }
		 
		 connection.close();
		 return admindata;
	}
	
}
