package com.commerce.facadeimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.commerce.facade.CommerceProductServiceFacade;
import com.commerce.model.ProductVo;
import com.datahub.repositories.commerce.ProductManagementRepository;
import com.datahub.repositories.commerce.ProductOrderingRepository;

@Component
public class CommerceProductServiceFacadeImpl implements CommerceProductServiceFacade {

	private ProductManagementRepository productManagementRepository;

	private ProductOrderingRepository productOrderingRepository;

	@Autowired
	public CommerceProductServiceFacadeImpl(ProductManagementRepository mgmtRepository,
			ProductOrderingRepository orderingRepository) {
		this.productManagementRepository = mgmtRepository;
		this.productOrderingRepository = orderingRepository;
	}

	@Override
	public Optional<ProductVo> findById(String productId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	
}
