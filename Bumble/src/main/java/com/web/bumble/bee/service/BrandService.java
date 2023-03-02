package com.web.bumble.bee.service;

import java.sql.SQLException;
import java.util.List;

import com.web.bumble.bee.db.BrandDataBase;
import com.web.bumble.bee.model.Brand;

public class BrandService {
	public boolean addBrand(Brand brand) throws ClassNotFoundException, SQLException {
		
		return BrandDataBase.addBrand(brand);
		
	}
	
	public List<Brand> getAllBrand() throws ClassNotFoundException, SQLException{
		
		
		return BrandDataBase.getAllBrand();
	}
	
	public Brand searchBrand(Brand brand) throws ClassNotFoundException, SQLException {
		
		return BrandDataBase.searchBrand(brand);
	}
}
