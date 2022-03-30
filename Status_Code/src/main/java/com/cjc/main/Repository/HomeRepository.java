package com.cjc.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Product;
@Repository
public interface HomeRepository  extends JpaRepository<Product, Integer> {

	Product findByName(String p);

}
