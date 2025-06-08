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
@Table(name = "shop_menus")
public class shop_menus {
    @Id
    private String id;
    @Column(name = "upper_menu_id")
    private String upperMenuId;
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "link_uri")
    private String linkUri;
    @Column(name = "display_order")
    private int displayOrder;
    @Column(name = "use_yn")
    private String useYn;
    @Column(name = "lev")
    private Integer lev;
    @Column(name = "description")
    private String description;
}