package com.commerce.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.commerce.service.ProductOrderingService;
import com.datahub.entities.commerce.ProductOrder;
import com.datahub.repositories.commerce.ProductOrderingRepository;

@Component
public class ProductOrderingServiceImpl implements ProductOrderingService{

	private ProductOrderingRepository orderingRepository;
	
	public ProductOrderingServiceImpl(ProductOrderingRepository repository) {
		this.orderingRepository = repository;
	}
	
	@Override
	public List<ProductOrder> getOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductOrder> getOrdersByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOrder createOrder(ProductOrder productOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ProductOrder> findOne(String orderId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ProductOrder updateOrder(String orderId, ProductOrder productOrder) {
		// TODO Auto-generated method stub
		return null;
	}

}
