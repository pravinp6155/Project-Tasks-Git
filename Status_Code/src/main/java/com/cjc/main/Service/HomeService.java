package com.cjc.main.Service;

import com.cjc.main.Model.Product;

public interface HomeService {

	void saveData(Product p);

	Product findByName(String productname);

	Product getById(int id);

	void deleteProduct(int id);

	Product updatePro(Product p);

	


}
