package com.web.bumble.bee.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.web.bumble.bee.db.ProductDataBase;
import com.web.bumble.bee.model.Brand;
import com.web.bumble.bee.model.Category;
import com.web.bumble.bee.model.Product;

public class ProductService {
	public boolean addProduct(Product product,Brand brand,Category category) throws ClassNotFoundException, SQLException {
		return ProductDataBase.addProduct(product, brand, category);
		
	}
	

	public List<Product> gettAllProduct() throws ClassNotFoundException, SQLException{
		return ProductDataBase.getAllProduct();
	}
	
	public boolean deleteProduct(Product id) throws ClassNotFoundException, SQLException {
		
		return ProductDataBase.deleteProduct(id);
	}
	public Product searchProduct(Product id) throws ClassNotFoundException, SQLException {
		
		return ProductDataBase.searchProduct(id);
	}
}
