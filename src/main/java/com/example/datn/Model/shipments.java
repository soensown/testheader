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
@Table(name = "shipments")
public class shipments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id")
    private orders order;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private Users users;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "shipping_method")
    private String shippingMethod;
    @Column(name = "tracking_number")
    private String trackingNumber;
    @Column(name = "shipment_status")
    private String shipmentStatus;
    @Column(name = "shipped_date")
    private String shippedDate;
    @Column(name = "delivered_date")
    private String deliveredDate;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}