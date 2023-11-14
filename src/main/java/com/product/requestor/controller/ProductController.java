package com.product.requestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.requestor.entity.ProductEntity;
import com.product.requestor.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	 @GetMapping
	 public List<ProductEntity> getAllProducts() {
	   return productService.getAllProducts();
	 }

}
