import java.time.LocalDate;

public class Donacion {

    private int idDonacion;
    private double cantidadDonada;
    private Donante donante;
    private String metodoPago;
    private LocalDate fecha;
    private String causaDonacion;

    public Donacion(int idDonacion, double cantidadDonada, Donante donante, String metodoPago, LocalDate fecha, String causaDonacion){
        this.idDonacion = idDonacion;
        this.cantidadDonada = cantidadDonada;
        this.donante = donante;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.causaDonacion = causaDonacion;
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

    public Donante getDonante() {
        return donante;
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

    public String infoDonacion(){
     return "idDonacion: " + idDonacion + "\n" +
             "Donante: " + donante + "\n" +
             "Metodo de Pago: " + metodoPago + "\n" +
             "Fecha: " + fecha + "\n" +
             "Causa donacion: " +causaDonacion;
    }


}
