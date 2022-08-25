package gid.data.com;

public class Empleado {
    private String Nombre;
    private String Correo;
    private String Empresa;
    private String Rol;

    public Empleado (String Nombre,String Correo,String Empresa, String Rol) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Empresa = Empresa;
        this.Rol = Rol;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}
