package com.ajithsolomon.crm.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -164119849854334935L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int ID;

    @Column(name = "First_name")
    private String firstName;

    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "membership")
    private Character membership;

    @Column(name = "phone")
    private String phone;
}
