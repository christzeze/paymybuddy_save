package com.openclassroooms.paymybuddy.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String iban;
    private String sold;
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    @OneToOne
    @JoinColumn(name = "connectionId", referencedColumnName = "id")
    private Connection connection;
}
