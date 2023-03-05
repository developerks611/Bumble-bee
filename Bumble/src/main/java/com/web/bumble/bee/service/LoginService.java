package com.web.bumble.bee.service;

import java.sql.SQLException;
import java.util.List;

import com.web.bumble.bee.db.LoginDataBase;
import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Loan;
import com.web.bumble.bee.model.Login;

public class LoginService {
	
	public boolean addcustomerLogin(Client client,Login login) throws ClassNotFoundException, SQLException {
		
		return LoginDataBase.addcustomerLogin(client, login);
	}
	
	
}
