 package com.cjc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.model.Employee;
@Service
public class HomeserviceImpl implements Homeservice {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Employee e) {
		hr.save(e);
	}

	@Override
	public List<Employee> getData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public void updateData(Employee e) {
		hr.save(e);
		
	}

	@Override
	public Employee getSingle(int id) {
	Employee emp1=	hr.findById(id).get();
		return emp1;
	}
	
	

}
