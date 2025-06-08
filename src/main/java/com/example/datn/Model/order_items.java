package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order_items")
public class order_items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id")
    private orders order;
    @ManyToOne
    @JoinColumn(name = "product_detail_id",referencedColumnName = "id")
    private Products product;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "discount_price")
    private BigDecimal discountPrice;

    @Column(name = "total_price")
    private BigDecimal totalPrice;
}