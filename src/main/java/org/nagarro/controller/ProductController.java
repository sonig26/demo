package org.nagarro.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.nagarro.models.ProductDetails;
import org.nagarro.repository.ProductRepository;
import org.nagarro.service.ProductService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productDetails")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@RequestMapping("/add")
	public void add(@RequestBody ProductDetails product) {
		productservice.addProduct(product);

	}

	@RequestMapping("/product/{productId}")
	public Optional<ProductDetails> productList(@PathVariable Integer productId) {

		return productservice.listAllProducts(productId);

	}

	@DeleteMapping("/delete/{productId}")
	public void deleteProductById(@PathVariable Integer productId) {
		productservice.deleteProductDetailsById(productId);
	}
}
