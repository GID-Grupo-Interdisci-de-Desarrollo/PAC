package com.gid.puertasAluminioCostaApp.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Enterprises") @NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Enterprise {

    @Getter
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(unique = true, nullable = false) @NonNull
    private long id;

    @Getter @Setter
    @Column(name="name")
    private String name;

    @Getter @Setter
    @Column(name="document")
    private String document;

    @Getter @Setter
    @Column(name="phone")
    private String phone;

    @Getter @Setter
    @Column(name="address")
    private String address;

    @Getter
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    public Enterprise(String name, String document, String phone, String address, Date createdAt, Date updatedAt) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}