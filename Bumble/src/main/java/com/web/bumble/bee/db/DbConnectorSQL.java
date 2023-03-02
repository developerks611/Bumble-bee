package com.web.bumble.bee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectorSQL implements DbConnector {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bumblebee";
	    String userName="root";
		String password="123456";
		return DriverManager.getConnection(url,userName,password);
			
		
	}


}
