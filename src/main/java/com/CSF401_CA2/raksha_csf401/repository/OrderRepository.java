package com.CSF401_CA2.raksha_csf401.repository;

import com.CSF401_CA2.raksha_csf401.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
