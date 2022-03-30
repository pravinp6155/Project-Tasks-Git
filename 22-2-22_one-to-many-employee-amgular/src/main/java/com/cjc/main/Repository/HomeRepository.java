package com.cjc.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer> {

}
