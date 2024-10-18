package com.CSF401_CA2.raksha_csf401.repository;

import com.CSF401_CA2.raksha_csf401.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);
}
