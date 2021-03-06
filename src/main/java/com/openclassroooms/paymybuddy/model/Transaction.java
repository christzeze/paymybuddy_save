package com.openclassroooms.paymybuddy.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String designation;
    private double amount;
    private LocalDate date;
    @ManyToOne()
    @JoinColumn(name = "userSender", referencedColumnName = "id")
    private User userSender;
    @ManyToOne()
    @JoinColumn(name = "userReceiver", referencedColumnName = "id")
    private Connection userReceiver;
}
