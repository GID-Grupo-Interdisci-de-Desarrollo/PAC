package com.gid.puertasAluminioCostaApp.entities;

import com.gid.puertasAluminioCostaApp.enums.RolNameEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Employee") @NoArgsConstructor @AllArgsConstructor
public class Employee {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter @Setter
    @Column(name = "email", unique = true)
    private String email;

    @Getter @Setter
    @Column(name = "roleNamee")
    private RolNameEnum role;

    @Getter
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());

    @Getter @Setter
    @OneToOne(cascade = CascadeType.DETACH) @JoinColumn(name = "profile")
    private Profile profile;

    @Getter @Setter
    @ManyToOne @JoinColumn(name = "enterprise")
    private Enterprise enterprise;

    public Employee(String email, RolNameEnum role, Date createdAt, Date updatedAt, Profile profile, Enterprise enterprise) {
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
        this.enterprise = enterprise;
    }

}
