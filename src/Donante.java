public class Donante {
    private String nombre;
    private long documento;
    private String correo;
    private String direccion;

    public Donante(String nombre, long documento, String correo, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.direccion = direccion;

    }
    public String getNombre() {
        return nombre;
    }
    public long getDocumento() {
        return documento;
    }
    public String getCorreo() {
        return correo;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDocumento(long documento) {
        this.documento = documento;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String infoDonante() {
        return "Nombre: " + nombre + "\n" +
        "Documento: " + documento + "\n" +
        "Correo: " + correo + "\n" +
        "Dirección: " + direccion;
    }
}
