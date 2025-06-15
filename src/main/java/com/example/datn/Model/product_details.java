package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_details")
public class product_details {
    @Id
    @Column(name = "product_detail_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private products products;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private colors colors;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private sizes sizes;

    @Column(name = "quantity")
    private int quantity;
    @Column(name = "description")
    private String description;
}