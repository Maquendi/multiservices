package com.datahub.repositories.commerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.datahub.entities.commerce.Product;

@Repository
public interface ProductManagementRepository extends JpaRepository<Product, String> {}
