package com.openclassroooms.paymybuddy.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastName;
    @ManyToOne()
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User userId;
}
