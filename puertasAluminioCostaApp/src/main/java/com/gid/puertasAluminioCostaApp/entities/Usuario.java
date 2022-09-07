package com.gid.puertasAluminioCostaApp.entities;

public class Usuario {
    private String nombre;
    private String correo;
    private Empresa empresa;
    private String rol;

    public Usuario(String nombre, String correo, Empresa empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
