package com.CSF401_CA2.raksha_csf401.repository;

import com.CSF401_CA2.raksha_csf401.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
