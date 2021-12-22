package com.example.site.repository;

import com.example.site.model.OrderedProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductsRepository extends JpaRepository<OrderedProducts, Long> {

}
