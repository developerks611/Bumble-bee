package com.web.bumble.bee.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Login;

public class LoginDataBase {
	
	public static boolean addcustomerLogin(Client client,Login lg) throws ClassNotFoundException, SQLException {
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="call addLogin (?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, lg.getRollid());
		ps.setString(2, client.getEmail());
		ps.setString(3, client.getPassword());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}
}
