package com.web.bumble.bee.model;

public class Brand {
	private int brandid;
	private	String brandname;
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandid, String brandname) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
	}

	public int getBrandid() {
		return brandid;
	}

	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
}
