package com.ms.goldprice.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.goldprice.repository.Product;
import com.ms.goldprice.repository.ProductRepository;

@RestController
public class GoldPriceController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public String welcome() {
		
		Product product = new Product();
		product.setCountry("India");
		product.setDescription("24Crt Gold");
		product.setName("Chennai Gold");
		product.setPrice(38000d);
		product.setValueDate(new Timestamp(System.currentTimeMillis()));
		productRepository.save(product);
		
		Product product2 = new Product();
		product2.setCountry("India");
		product2.setDescription("24Crt Gold");
		product2.setName("UAE Gold");
		product2.setPrice(37000d);
		product2.setValueDate(new Timestamp(System.currentTimeMillis()));
		productRepository.save(product2);
		
		return " Welcome to Gold Price App";
		
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Product> getProduct() {
		return productRepository.findAll();
	}
}
