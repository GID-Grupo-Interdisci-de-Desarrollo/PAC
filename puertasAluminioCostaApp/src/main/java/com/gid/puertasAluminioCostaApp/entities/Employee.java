package com.gid.puertasAluminioCostaApp.entities;

import com.gid.puertasAluminioCostaApp.enums.RolNameEnum;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "roleNamee")
    private RolNameEnum role;
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());
    @OneToOne
    @JoinColumn(name = "profile")

    private Profile profile;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    private Enterprise enterprise;

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RolNameEnum getRole() {
        return role;
    }

    public void setRole(RolNameEnum role) {
        this.role = role;
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

}
