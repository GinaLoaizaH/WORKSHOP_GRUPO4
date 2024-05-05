import java.time.LocalDate;

public class Donacion {

    private static int contadorId = 0;
    private int idDonacion;
    private double cantidadDonada;
    private Donante donante;
    private String metodoPago;
    private LocalDate fecha;
    private String causaDonacion;


    public Donacion(double cantidadDonada, Donante donante, String metodoPago, LocalDate fecha, String causaDonacion){
        this.idDonacion = ++contadorId;
        this.cantidadDonada = cantidadDonada;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.causaDonacion = causaDonacion;
        setDonante(donante);

        Corporacion.agregarDonacion(this);
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public int getIdDonacion() {
        return idDonacion;
    }


    public double getCantidadDonada() {
        return cantidadDonada;
    }

    public void setCantidadDonada(double cantidadDonada) {
        this.cantidadDonada = cantidadDonada;
    }

    public String getDonante() {
        return donante.getNombre();
    }


    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCausaDonacion() {
        return causaDonacion;
    }

    public void setCausaDonacion(String causaDonacion) {
        this.causaDonacion = causaDonacion;
    }

    // Metodo para mostrar toda la información de la donación
    public String infoDonacion(){
     return  "************************************" + "\n" +
             "idDonacion: " + idDonacion + "\n" +
             "Donante: " + donante.getNombre() + "\n" +
             "Metodo de Pago: " + metodoPago + "\n" +
             "Fecha: " + fecha + "\n" +
             "Causa donacion: " + causaDonacion + "\n";
    }


}
