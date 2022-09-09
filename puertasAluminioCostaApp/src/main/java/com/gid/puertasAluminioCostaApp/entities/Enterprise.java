package com.gid.puertasAluminioCostaApp.entities;

import javax.persistence.*;

@Entity
@Table(name="Enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private int phone;
    @Column(name="nit")
    private String nit;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int telefono) {
        this.phone = telefono;
    }

    public String getNit() {
        return this.nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }

}