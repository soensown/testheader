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
@Table(name = "warehouse_inventory")
public class warehouse_inventory {
    @EmbeddedId
    private warehouseId id;

    @ManyToOne
    @JoinColumn(name = "product_detail_id",referencedColumnName = "id")
    private product_details product_details;
    @ManyToOne
    @JoinColumn(name = "warehouse_id",referencedColumnName = "id")
    private warehouses warehouses;

    @Column(name ="quantity")
    private Integer quantity;
    @Column(name ="updated_at")
    private Date updated_at;
}
