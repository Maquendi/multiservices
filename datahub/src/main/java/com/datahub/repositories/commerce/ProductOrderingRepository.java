package com.datahub.repositories.commerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datahub.entities.commerce.ProductOrder;

@Repository
public interface ProductOrderingRepository extends JpaRepository<ProductOrder, String> {}
