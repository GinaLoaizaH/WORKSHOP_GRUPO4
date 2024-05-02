public class Informe {
    private String nombre;
    private String tipoInforme;
    private Date fechaInforme;

    public Informe(String nombre, String tipoInforme, Date fechaInforme) {
        this.nombre = nombre;
        this.tipoInforme = tipoInforme;
        this.fechaInforme = fechaInforme;
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

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String analisisTendencias() {
        return "Informe de análisis de tendencias";
    }

    public String informeCantidadDonaciones() {
        return "Informe de cantidad de donaciones";
    }

    public String informeGeneral() {
        return "Informe general";
    }

}
