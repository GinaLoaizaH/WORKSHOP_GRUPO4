import java.util.ArrayList;

public class Donaciones {

    private ArrayList<Donacion> listaDonaciones;

    public Donaciones(){
        listaDonaciones = new ArrayList<>();
    }

    public void agregarDonacion(Donacion donacion){
        listaDonaciones.add(donacion);
    }

    public Donacion obtenerInfoDonacion(int id){
        for(Donacion donacion : listaDonaciones){
            if(donacion.getIdDonacion() == id);
            return donacion;
        }
        return null;
    }

}
