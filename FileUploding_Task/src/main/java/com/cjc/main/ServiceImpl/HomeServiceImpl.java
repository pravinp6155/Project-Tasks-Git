package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Model.Document;
import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.Service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	public List<Document> savedoc(Document d) {
		
		System.out.println("service data:-"+d);
		hr.save(d);
		List<Document> l1=hr.findAll();
		return l1;
	}

	public List<Document> getDoc() {
		List<Document> l1=hr.findAll();
		return l1;
	}
	
}
