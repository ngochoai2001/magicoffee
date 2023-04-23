package com.example.demo.order.model;

import com.example.demo.product.model.Product;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItem {

    //product, soluong, size, topping

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String size;

    private String topping;


}