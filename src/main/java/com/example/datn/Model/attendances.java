package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
// Bảng chấm công
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendances")
public class attendances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private employees employee;
    @Column(name = "work_date")
    private Date work_date;
    @Column(name = "check_in")
    private Date check_in;
    @Column(name = "check_out")
    private Date check_out;
    @Column(name = "status")
    private String status;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
}
