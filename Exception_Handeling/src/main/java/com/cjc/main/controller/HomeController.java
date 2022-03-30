package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Exception.PageNotFound;
import com.cjc.main.Model.Product;
import com.cjc.main.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping(value = "/insert")
	public String saveProduct(@RequestBody Product p) {
		
		hs.saveData(p);
		return "Product Added Successfully";
	}
	@GetMapping(value = "/getproduct/{productname}")
	public Product findByName(@PathVariable String productname) {
		Product p=null;
//		try {
//		
	p=hs.findByName(productname);
	System.out.println(p.getName());
//		} 
//		catch (Exception e) {
//			throw new PageNotFound("Product not Found");
//		}
	return	p;
	}
	
	// Controller Level Exception Handeling
//	@ExceptionHandler(PageNotFound.class)
//	public String productNotfound(PageNotFound e) {
//		return e.getMessage();
//	}
	
	@GetMapping(value = "/getsingle/{id}")
	public Product findByid(@PathVariable int id) {
	
		Product p= hs.getById(id);
		System.out.println(p.getId());
		return p;
	}
	
}
