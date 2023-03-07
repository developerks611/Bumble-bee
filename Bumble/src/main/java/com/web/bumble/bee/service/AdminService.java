package com.web.bumble.bee.service;

import java.sql.SQLException;

import com.web.bumble.bee.db.AdminDataBase;
import com.web.bumble.bee.model.Admin;


public class AdminService {

public Admin loginadmin(Admin admin) throws ClassNotFoundException, SQLException {
	return AdminDataBase.loginadmin(admin);
	
}

	
}
