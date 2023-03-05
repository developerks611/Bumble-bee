package com.web.bumble.bee.service;

import java.sql.SQLException;
import java.util.List;

import com.web.bumble.bee.db.LoanDataBase;
import com.web.bumble.bee.model.Loan;

public class LoanService {

public List<Loan> getAllLoan() throws ClassNotFoundException, SQLException{
	return LoanDataBase.getAllLoan();
	}
}
