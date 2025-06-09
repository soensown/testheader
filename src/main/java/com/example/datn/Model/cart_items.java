package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cart_items")
public class cart_items {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private users user;
    @ManyToOne
    @JoinColumn(name = "product_detail_id",referencedColumnName = "id")
    private product_details product_details;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "created_date")
    private Date created_date;
    @Column(name = "created_by")
    private String created_by;
    @Column(name = "updated_date")
    private Date updated_date;
    @Column(name = "updated_by")
    private String updated_by;
}