package org.nagarro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.nagarro.models.ProductDetails;
import org.nagarro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productrepository;

	public void addProduct(ProductDetails product1) {
		productrepository.save(product1);

	}

	public Optional<ProductDetails> listAllProducts(int productId) {
		return productrepository.findById(productId);

	}

	public void deleteProductDetailsById(Integer productId) {
		productrepository.deleteById(productId);
	}

}
