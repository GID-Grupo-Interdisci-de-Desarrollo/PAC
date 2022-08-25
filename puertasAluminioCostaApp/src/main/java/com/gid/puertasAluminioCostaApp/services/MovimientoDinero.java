package com.gid.puertasAluminioCostaApp.services;

public class MovimientoDinero {

    private double Monto;
    String Concepto;
    String Usuario;

    public MovimientoDinero(double Monto, String Concepto, String Usuario) {
        this.Monto = Monto;
        this.Concepto = Concepto;
        this.Usuario = Usuario;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        this.Monto = monto;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
}
