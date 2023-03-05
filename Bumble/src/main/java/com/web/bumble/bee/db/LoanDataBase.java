package com.web.bumble.bee.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.bumble.bee.model.Brand;
import com.web.bumble.bee.model.Client;
import com.web.bumble.bee.model.Loan;
import com.web.bumble.bee.model.Product;

public class LoanDataBase {
	/*public static boolean addLoan(Loan loan) throws ClassNotFoundException, SQLException {
		
		DbConnector connector = new DbConnectorSQL();
		Connection connection = connector.getConnection();
		String query="{call addLoan(?,?,?,?,?,?)}";
		CallableStatement  ps = connection.prepareCall(query);
		ps.setString(1, loan.getCustomer());
		ps.setInt(2,loan.getProduct());
		ps.setDouble(3, loan.getLoanamount());
		ps.setDouble(4, loan.getUsedamount());
		ps.setInt(5, loan.getInstallment());
		ps.setString(6, loan.getLoanstatus());
		boolean result = ps.executeUpdate() > 0 ;
		ps.close();
		connection.close();
		return result;
	}*/

	public static List<Loan> getAllLoan() throws ClassNotFoundException, SQLException {
		DbConnector connector = new DbConnectorSQL();
		 Connection connection = connector.getConnection();
		 String query = "{call getCustomerLoan()}";
		 CallableStatement st=connection.prepareCall(query);
		 ResultSet rs=st.executeQuery(query);
		
		 //int loanid, Client customer, Product product, double loanamount, double usedamount, int installment,String loanstatus
		 List<Loan>loanlist=new ArrayList();
		 while(rs.next()) {
			 Client customer=new Client();
			 Product product=new Product();
			 Loan loan=new Loan();
			 customer.setEmail(rs.getString("email"));
			 customer.setFname(rs.getString("fname"));
			 customer.setLname(rs.getString("lname"));
			 customer.setDob(rs.getString("dob"));
			 loan.setLoanid(rs.getInt("loanid"));
			 loan.setLoanamount(rs.getDouble("loanamount"));
			 loan.setUsedamount(rs.getDouble("usedamount"));
			 loan.setInstallment(rs.getInt("installment"));
			 loan.setLoanstatus(rs.getString("loanstatus"));
			 loan.setCustomer(customer);
			 loanlist.add(loan);
			 
			
		 }
		 st.close();
		 connection.close();
		 return loanlist;
		
	}
	
	
}
