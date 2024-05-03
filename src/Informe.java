import java.time.LocalDate;
import java.util.ArrayList;


public class Informe {
    private String nombre;
    private String tipoInforme;
    private LocalDate fechaInforme;
    private ArrayList<Donacion> listaDonaciones;

    public Informe(String nombre, String tipoInforme, LocalDate fechaInforme, ArrayList<Donacion> listaDonaciones) {
        this.nombre = nombre;
        this.tipoInforme = tipoInforme;
        this.fechaInforme = fechaInforme;
        this.listaDonaciones = listaDonaciones;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public LocalDate getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(LocalDate fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String analisisTendencias() {
        return "Informe de análisis de tendencias" + "\n" +
                Corporacion.tendencias();
    }

    public String informeCantidadDonaciones() {
        return "La cantidad de donaciones realizadas a la fecha: " + fechaInforme + "\n" +
                "es de: " + listaDonaciones.size() + "\n" +
                "que suma un total : " + Corporacion.sumaDonaciones();
    }

    public String informeGeneral() {
        return "Informe general" + "\n" +
                "El total de las donaciones realizadas fueron: " + listaDonaciones.size() + "\n" +
                "Que se donaron por causa especifica de la siguiente manera: " + "\n" +
                Corporacion.tendencias() + "\n" +
                "Con los siguientes metodos de pago: " + "\n" +
                Corporacion.metodosPago() + "\n" +
                "Los donantes fueron: " + "\n" +
                Corporacion.nombresDonantes() +
                "Para un total en donaciones de: " + Corporacion.sumaDonaciones();

    }

    public String informePorId(int id){
        return "El informe por id proporcionado es: " + "\n" +
                Corporacion.obtenerInfoDonacion(id);
    }

}
