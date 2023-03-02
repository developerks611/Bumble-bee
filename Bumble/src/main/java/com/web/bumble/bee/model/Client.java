package com.web.bumble.bee.model;

import java.time.LocalDate;

public class Client extends User {
	
	private int customerid;
	private String fname;
	private String lname;
	private String dob;
	private String adress;
	private String nic;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	
	
}
