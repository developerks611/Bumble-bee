package com.web.bumble.bee.model;

public class Loan {
 private int loanid;
 private Client customer;
 private Product product;
 private double loanamount;
 private double usedamount;
 private int installment;
 private String loanstatus;
public Loan() {
	super();
	// TODO Auto-generated constructor stub
}
public Loan(int loanid, Client customer, Product product, double loanamount, double usedamount, int installment,
		String loanstatus) {
	super();
	this.loanid = loanid;
	this.customer = customer;
	this.product = product;
	this.loanamount = loanamount;
	this.usedamount = usedamount;
	this.installment = installment;
	this.loanstatus = loanstatus;
}
public int getLoanid() {
	return loanid;
}
public void setLoanid(int loanid) {
	this.loanid = loanid;
}
public Client getCustomer() {
	return customer;
}
public void setCustomer(Client customer) {
	this.customer = customer;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public double getLoanamount() {
	return loanamount;
}
public void setLoanamount(double loanamount) {
	this.loanamount = loanamount;
}
public double getUsedamount() {
	return usedamount;
}
public void setUsedamount(double usedamount) {
	this.usedamount = usedamount;
}
public int getInstallment() {
	return installment;
}
public void setInstallment(int installment) {
	this.installment = installment;
}
public String getLoanstatus() {
	return loanstatus;
}
public void setLoanstatus(String loanstatus) {
	this.loanstatus = loanstatus;
}

// /loanid,customerid,productid,loanamount,usedamount,installment,loanstatus
}
