import java.util.Date;

public class Recibo {
    private Donacion idDonacion;
    private Date fechaEmision;
    private int numReciboFiscal;

    public Recibo( Donacion idDonacion, Date fechaEmision, int numReciboFiscal) {
        this.donacion = donacion;
        this.fechaEmision = fechaEmision;
        this.numReciboFiscal = numReciboFiscal;
    }

    public Donacion getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Donacion idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getNumReciboFiscal() {
        return numReciboFiscal;
    }

    public void setNumReciboFiscal(int numReciboFiscal) {
        this.numReciboFiscal = numReciboFiscal;
    }
}
