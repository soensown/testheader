package com.example.datn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class roles {
    @Id
    private String id;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_code")
    private String roleCode;
    @Column(name = "description")
    private String description;
    @Column(name = "use_yn")
    private boolean use_yn;
}
