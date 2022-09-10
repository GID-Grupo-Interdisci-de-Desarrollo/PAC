package com.gid.puertasAluminioCostaApp.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @Column(unique = true)
    private String id;
    @Column(name = "image")
    private String image;
    @Column(name = "phone")
    private String phone;
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
