package com.gid.puertasAluminioCostaApp.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="document")
    private String document;
    @Column(name="phone")
    private int phone;
    @Column(name="address")
    private String address;
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}