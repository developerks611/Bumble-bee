package com.web.bumble.bee.service;

import java.sql.SQLException;

import com.web.bumble.bee.db.ClentDatabase;
import com.web.bumble.bee.model.Client;

public class ClientService {
	public boolean addClient(Client client) throws ClassNotFoundException, SQLException {
		return ClentDatabase.addClient(client);
		
		
	}
}
