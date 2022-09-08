package com.gid.puertasAluminioCostaApp.entities;

public class User {
    private String name;
    private String email;
    private Enterprise enterprise;
    private String rol;

    public User(String name, String email, Enterprise enterprise, String rol) {
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.rol = rol;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEmpresa() {
        return this.enterprise;
    }

    public void setEmpresa(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
