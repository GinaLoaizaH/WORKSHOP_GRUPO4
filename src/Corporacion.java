import java.util.ArrayList;

public class Corporacion {

    private static ArrayList<Donacion> listaDonaciones = new ArrayList<>();


    public static void agregarDonacion(Donacion donacion) {
        listaDonaciones.add(donacion);
    }

    public static String obtenerInfoDonacion(int id) {
        for (Donacion donacion : listaDonaciones) {
            if (donacion.getIdDonacion() == id) {
            return donacion.infoDonacion();
            }
        }
        return null;
    }

    public static double sumaDonaciones() {
        double total = 0;
        for (Donacion donacion : listaDonaciones) {
            total += donacion.getCantidadDonada();
        }
        return total;
    }

    public static String tendencias() {
        int educacion = 0, vivienda = 0, salud = 0, derechosCiviles = 0;

        for (Donacion donacion : listaDonaciones) {

            if (donacion.getCausaDonacion().equalsIgnoreCase("educacion")) {
                educacion++;
            } else if (donacion.getCausaDonacion().equalsIgnoreCase("vivienda")) {
                vivienda++;
            } else if (donacion.getCausaDonacion().equalsIgnoreCase("salud")) {
                salud++;
            } else if (donacion.getCausaDonacion().equalsIgnoreCase("derechos civiles")) {
                derechosCiviles++;
            }

        }
        return "La cantidad de donaciones para la causa EDUCACION es: " + educacion + "\n" +
                "La cantidad de donaciones para la causa VIVIENDA es: " + vivienda + "\n" +
                "La cantidad de donaciones para la causa SALUD es: " + salud + "\n" +
                "La cantidad de donaciones para la causa DERECHOS CIVILES es: " + derechosCiviles;
    }

    public static String metodosPago() {
        int efectivo = 0, tarjeta = 0, transferencia = 0;
        for (Donacion donacion : listaDonaciones) {
            String metodoPago = donacion.getMetodoPago().toLowerCase();

            switch (metodoPago) {
                case "efectivo":
                    efectivo++;
                    break;

                case "transferencia":
                    transferencia++;
                    break;

                case "tarjeta":
                    tarjeta++;
                    break;

                default:
                    break;
            }
        }
        String mensaje = "";
        if (efectivo > 0) {
            mensaje = "Efectivo" + "\n";
        } if (tarjeta > 0) {
            mensaje += "Tarjeta" + "\n";
        } if (transferencia > 0) {
            mensaje += "Transferencia";
        }
        return mensaje;
    }

    public static String nombresDonantes(){
        String mensaje = "";
        for(Donacion donacion: listaDonaciones){
            mensaje += donacion.getDonante() + "\n";
        }
        return mensaje;
    }

    public static ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }


}
