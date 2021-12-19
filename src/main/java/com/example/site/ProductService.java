package com.example.site;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	
	public List <Product> listTable() {
		List <Product> findAll = productRepo.findAll();
		System.out.println("Product table has " + productRepo.count() + " entries");
		for (Product p : findAll) {
			System.out.println(p);
		}
		return findAll;
	}
	public void addInTable(Product p) {
		productRepo.save(p);
	}
	public void deleteFromTable(Long id) {
		productRepo.deleteById(id);
	}
}