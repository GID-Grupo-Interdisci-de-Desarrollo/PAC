package com.gid.puertasAluminioCostaApp.entities;

public class Transaction {

    private double mount;
    String concept;
    String employee;

    public Transaction(double mount, String concept, String employee) {
        this.mount = mount;
        this.concept = concept;
        this.employee = employee;
    }

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
