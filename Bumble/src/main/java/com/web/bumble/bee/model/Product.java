package com.web.bumble.bee.model;

public class Product {
  private int productid;
  private String productname;
  private String prodcutdescription;
  private Double price;
  private int Quantity;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int productid, String productname, String prodcutdescription, Double price, int quantity) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.prodcutdescription = prodcutdescription;
	this.price = price;
	Quantity = quantity;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProdcutdescription() {
	return prodcutdescription;
}
public void setProdcutdescription(String prodcutdescription) {
	this.prodcutdescription = prodcutdescription;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
  
  
}
