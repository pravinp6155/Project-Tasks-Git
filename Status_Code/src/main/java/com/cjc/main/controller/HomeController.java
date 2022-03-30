package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.Model.Product;
import com.cjc.main.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<String> saveProduct(@RequestBody Product p) {
		
		hs.saveData(p);
	return new ResponseEntity<String>("Product Added Successfully", HttpStatus.CREATED);
	}
	@GetMapping(value = "/getproduct/{productname}")
	public  ResponseEntity<Product> findByName(@PathVariable String productname) {
		Product p=null;

	p=hs.findByName(productname);
	System.out.println(p.getName());

	return	new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/getsingle/{id}")
	public ResponseEntity<Product> findByid(@PathVariable int id) {
	
		Product p= hs.getById(id);
		System.out.println(p.getId());
		return	new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
	   hs.deleteProduct(id);
		 return new ResponseEntity<String>("Delete Product Successfully",HttpStatus.NO_CONTENT);
	}
	
	@PutMapping(value = "update/{id}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p) {
		Product pro=hs.updatePro(p);
		return new  ResponseEntity<String>("Product Update Successfully",HttpStatus.OK);
	}
}
