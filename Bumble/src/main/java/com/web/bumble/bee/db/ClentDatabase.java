package com.web.bumble.bee.db;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.bumble.bee.model.*;

public class ClentDatabase {
public static boolean addClient(Client customer) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="{call insertCustomer(?,?,?,?,?,?)}";
		CallableStatement ps = connection.prepareCall(query);//(fname,lname,dob,adress,nic,email)
		ps.setString(1, customer.getFname());
		ps.setString(2, customer.getLname());
		ps.setString(3, customer.getDob());
		ps.setString(4, customer.getAdress());
		ps.setString(5, customer.getNic());
		ps.setString(6, customer.getEmail());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
	

}
