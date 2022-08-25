package com.gid.puertasAluminioCostaApp.services;

public class Empresa {
    private String Nombre;
    private String Direccion;
    private Integer Telefono;
    private String Nit;

    public Empresa (String Nombre, String Direccion, Integer Telefono, String Nit, String nit) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }
}