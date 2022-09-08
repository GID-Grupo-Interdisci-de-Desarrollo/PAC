package com.gid.puertasAluminioCostaApp.entities;

public class Enterprise {
    private String name;
    private String address;
    private int phone;
    private String nit;

    public Enterprise() {
        this.name = name;
        this.address = address;
        this.nit = nit;
        this.phone = phone;
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

    public int getTelefono() {
        return this.phone;
    }

    public void setTelefono(int telefono) {
        this.phone = telefono;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void getNit(int i) {
    }

}