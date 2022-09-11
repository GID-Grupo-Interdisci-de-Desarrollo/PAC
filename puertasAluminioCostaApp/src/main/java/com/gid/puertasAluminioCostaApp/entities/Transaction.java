package com.gid.puertasAluminioCostaApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Transactions") @NoArgsConstructor @AllArgsConstructor
public class Transaction {

    @Getter
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "concept")
    private String concept;

    @Getter @Setter
    @Column(name = "amount")
    private double amount;

    @Getter @Setter
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @ManyToOne @JoinColumn(name = "employee")
    private Employee employee;

    @Getter @Setter
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "enterprise")
    private Enterprise enterprise;

    public Transaction(String concept, double amount, Date createdAt, Date updatedAt, Employee employee, Enterprise enterprise) {
        this.concept = concept;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.employee = employee;
        this.enterprise = enterprise;
    }

}
