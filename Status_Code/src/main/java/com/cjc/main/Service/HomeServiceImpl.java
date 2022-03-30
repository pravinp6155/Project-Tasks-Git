package com.cjc.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Exception.PageNotFound;
import com.cjc.main.Model.Product;
import com.cjc.main.Repository.HomeRepository;
@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Product p) {
		hr.save(p);
		
	}

	@Override
	public Product findByName(String productname) {
		Product pro=null;
		try {
	 pro=  hr.findByName(productname);
	 System.out.println(pro.getName());
		
		}
		catch (Exception e) {
			throw new PageNotFound("Product Not Available");
		}
	return pro;
	}

	@Override
	public Product getById(int id) {
		
	Product p=null;
		try {
	 p=	hr.findById(id).get();
	 System.out.println(p.getId());
		}catch (Exception e) {
			throw new PageNotFound("Id Not Found");
		}
		return p;
	}

	@Override
	public void deleteProduct(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public Product updatePro(Product p) {
		return 	hr.save(p);
	
	}

}
