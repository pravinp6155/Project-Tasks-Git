package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface Homeservice {

	void saveData(Employee e);

	List<Employee> getData();

	void deleteData(int id);

	void updateData(Employee e);

	Employee getSingle(int id);

}
