package com.gid.puertasAluminioCostaApp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    @Column(name = "mount")
    private double mount;
    @Column(name = "concept")
    private String concept;
    @Column(name = "employe")
    private String employee;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public double getMount() {
        return this.mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    public String getConcept() {
        return this.concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getEmployee() {
        return this.employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
