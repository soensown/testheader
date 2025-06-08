package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "work_schedules")
public class work_schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private employees employee;
    @Column(name = "work_date")
    private Date work_date;
    @Column(name = "shift_start")
    private LocalDateTime shift_start;
    @Column(name = "shift_end")
    private LocalDateTime shift_end;
    @Column(name = "note")
    private String note;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
}