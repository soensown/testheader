package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "salaries")
public class salaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private employees employee;
    @Column(name = "month")
    private String month;
    @Column(name = "basic_salary")
    private BigDecimal basicSalary;
    @Column(name = "bonus")
    private BigDecimal bonus;
    @Column(name = "deductions")
    private BigDecimal deductions;
    @Column(name = "net_salary", insertable = false, updatable = false)
    private BigDecimal netSalary;
    @Column(name = "status")
    private String status;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
}