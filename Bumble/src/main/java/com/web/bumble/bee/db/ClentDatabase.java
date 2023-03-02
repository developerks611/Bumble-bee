package com.web.bumble.bee.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.bumble.bee.model.*;

public class ClentDatabase {
public static boolean addClient(Client client) throws ClassNotFoundException, SQLException {
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="INSERT INTO client (fname,lname,dob,adress,nic,email) Values (?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, client.getFname());
		ps.setString(2, client.getLname());
		ps.setString(3,client.getDob());
		ps.setString(4, client.getAdress());
		ps.setString(5, client.getNic());
		ps.setString(6, client.getEmail());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
		
	}

}
