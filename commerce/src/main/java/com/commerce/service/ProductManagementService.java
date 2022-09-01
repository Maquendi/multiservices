package com.commerce.service;

import java.util.List;
import java.util.Optional;

import com.datahub.entities.commerce.Product;

public interface ProductManagementService {
   List<Product> getProductList();
   Product createOne(Product newProduct);
   Product updateProduct(String productId, Product product);
   Optional<Product> findOne(String productId);
}
