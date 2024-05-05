import java.time.LocalDate;
import java.util.Random;

public class Recibo {
    private Donacion idDonacion;
    private LocalDate fechaEmision;
    private int numReciboFiscal;

    // Recibo fiscal generado de forma aleatoria
    Random numeroFiscal = new Random();

    public Recibo(Donacion idDonacion, LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
        this.numReciboFiscal = 100 + numeroFiscal.nextInt(300);
        setIdDonacion(idDonacion);
    }

    public void setIdDonacion(Donacion idDonacion) {
        this.idDonacion = idDonacion;
    }
    public Donacion getIdDonacion() {
        return idDonacion;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getNumReciboFiscal() {
        return numReciboFiscal;
    }

    public void setNumReciboFiscal(int numReciboFiscal) {
        this.numReciboFiscal = numReciboFiscal;
    }

    // Metodo que retorna la información del recibo
    public String infoRecibo() {
        return "Recibo de ID Donacion: " + idDonacion.getIdDonacion() + "\n" +
                "Con fecha de emision: " + fechaEmision + "\n" +
                "Numero de recibo fiscal: " + numReciboFiscal + "\n" +
                "Por valor de: " + idDonacion.getCantidadDonada();
    }

}
