package com.commerce.service;

import java.util.List;
import java.util.Optional;

import com.datahub.entities.commerce.ProductOrder;

public interface ProductOrderingService {
  List<ProductOrder> getOrderList();
  List<ProductOrder> getOrdersByUserId(String userId);
  ProductOrder createOrder(ProductOrder productOrder);
  Optional<ProductOrder> findOne(String orderId);
  ProductOrder updateOrder(String orderId, ProductOrder productOrder);
}
