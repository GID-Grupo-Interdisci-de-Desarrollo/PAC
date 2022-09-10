package com.gid.puertasAluminioCostaApp.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Profile") @NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Profile {

    @Getter
    @Id @Column(name = "id") @NonNull
    private long id;

    @Getter @Setter
    @Column(name = "image")
    private String image;

    @Getter @Setter
    @Column(name = "phone")
    private String phone;

    @Getter
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    public Profile(String image, String phone, Date createdAt, Date updatedAt) {
        this.image = image;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
