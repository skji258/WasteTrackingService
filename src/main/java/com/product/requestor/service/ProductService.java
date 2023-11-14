package com.product.requestor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.requestor.entity.ProductEntity;
import com.product.requestor.repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
    private ProductRepository productRepository;
	public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
