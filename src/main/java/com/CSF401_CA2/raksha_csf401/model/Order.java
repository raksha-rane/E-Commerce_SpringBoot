package com.CSF401_CA2.raksha_csf401.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "orders") // 'order' is a reserved keyword in many SQL dialects
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    private LocalDate orderDate;
    private double totalAmount;
}
