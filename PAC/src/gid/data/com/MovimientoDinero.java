package gid.data.com;

public class MovimientoDinero {

    private double monto;
    String Concepto;
    String Usuario;

    public MovimientoDinero(double monto, String Concepto, String Usuario) {
        this.monto=monto;
        this.Concepto=Concepto;
        this.Usuario=Usuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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
