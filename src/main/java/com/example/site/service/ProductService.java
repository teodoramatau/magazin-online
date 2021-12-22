package com.example.site.service;

import java.util.List;

import com.example.site.model.Product;
import com.example.site.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
	
	public List <Product> listTable() {
		return productRepo.findAll();
	}

	public void addOrUpdate(Product p) {
		productRepo.save(p);
	}

	public Product getProduct(Long id) {
		return productRepo.findById(id).orElse(null);
	}

	public void deleteFromTable(Long id) {
		productRepo.deleteById(id);
	}
}