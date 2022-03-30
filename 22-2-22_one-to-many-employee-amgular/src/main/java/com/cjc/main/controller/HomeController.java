package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.Homeservice;

@RestController
public class HomeController {
	
	
	@Autowired
	Homeservice hs;
	
	@PostMapping(value = "/insert")
	public String regData(@RequestBody() Employee e ) {
		hs.saveData(e);
		
		return "Data insert Successfully";
	}
	
	@GetMapping(value = "/getAll")
	public List<Employee> getData() {
		List<Employee> emp =hs.getData();
		
		return emp;
	}
	
	@GetMapping(value = "/getSingle/{id}")
	public Employee getSingle(@PathVariable("id") int id) {
		Employee emp1 =hs.getSingle(id);
		
		return emp1;
	}
	
	@DeleteMapping(value = "/delete/{uid}")
	public String deleteData(@PathVariable("uid") int id) {
		hs.deleteData(id);
		return "Delete Data Successfully";
	}
	
	@PutMapping(value = "/update")
	public  String updateData(@RequestBody() Employee e) {
		hs.updateData(e);
		
		return "Data update Successfully";
	}
	
	

}
