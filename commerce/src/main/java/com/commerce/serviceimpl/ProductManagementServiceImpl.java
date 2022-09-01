package com.commerce.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.commerce.service.ProductManagementService;
import com.datahub.entities.commerce.Product;
import com.datahub.repositories.commerce.ProductManagementRepository;

@Component
public class ProductManagementServiceImpl implements ProductManagementService {

	private ProductManagementRepository productManagementRepository;
	
	public ProductManagementServiceImpl(ProductManagementRepository repository) {
		this.productManagementRepository = repository;
	}
	
	
	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createOne(Product newProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(String productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Product> findOne(String productId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
