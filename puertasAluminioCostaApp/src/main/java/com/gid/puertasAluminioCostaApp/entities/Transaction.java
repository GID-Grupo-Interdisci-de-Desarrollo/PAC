package com.gid.puertasAluminioCostaApp.entities;

import com.gid.puertasAluminioCostaApp.entities.Employee;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name = "concept")
    private String concept;
    @Column(name = "amount")
    private double mount;
    @Column(name = "createdAt")
    private Date createdAt = new Date(System.currentTimeMillis());
    @Column(name = "updatedAt")
    private Date updatedAt = new Date(System.currentTimeMillis());
    @ManyToOne
    @JoinColumn(name = "employe")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    private Enterprise enterprise;

    public long getId() {
        return id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
