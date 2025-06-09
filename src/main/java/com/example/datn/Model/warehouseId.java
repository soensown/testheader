package com.example.datn.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class warehouseId implements Serializable {
    @Column(name = "product_detail_id", insertable = false, updatable = false)
    private Integer productId;
    @Column(name = "warehouse_id", insertable = false, updatable = false)
    private Integer warehouseId;
}
