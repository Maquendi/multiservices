package com.commerce.facade;



import java.util.Optional;

import com.commerce.model.ProductVo;

public interface CommerceProductServiceFacade {
   Optional<ProductVo> findById(String productId);
}
