import java.util.ArrayList;

public class Corporacion {

    private static ArrayList<Donacion> listaDonaciones = new ArrayList<>();

    // Metodo para agregar donación automaticamente y no tener que instanciarlo
    public static void agregarDonacion(Donacion donacion) {
        listaDonaciones.add(donacion);
    }

    // Busca la donación por ID y retorna toda la información
    public static String obtenerInfoDonacion(int id) {
        for (Donacion donacion : listaDonaciones) {
            if (donacion.getIdDonacion() == id) {
            return donacion.infoDonacion();
            }
        }
        return null;
    }

    // Muestra la información de todas las donaciones realizadas
    public static String infoDonaciones() {
        String totalInfoDonaciones = "";
        for (Donacion donacion : listaDonaciones) {
            totalInfoDonaciones += donacion.infoDonacion();
        }
        return totalInfoDonaciones;
    }

    // Suma la cantidad de donaciones realizadas
    public static double sumaDonaciones() {
        double total = 0;
        for (Donacion donacion : listaDonaciones) {
            total += donacion.getCantidadDonada();
        }
        return total;
    }

    // Muestra por tipo de causa benefica la cantidad de veces que donaron
    public static String tendencias() {
        int educacion = 0, vivienda = 0, salud = 0, derechosCiviles = 0;

        for (Donacion donacion : listaDonaciones) {
            // Condición que ignora las diferencia entre mayuscula o miniscula
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
        // Devuelve la cantidad por causa benéfica
        return "La cantidad de donaciones para la causa EDUCACION es: " + educacion + "\n" +
                "La cantidad de donaciones para la causa VIVIENDA es: " + vivienda + "\n" +
                "La cantidad de donaciones para la causa SALUD es: " + salud + "\n" +
                "La cantidad de donaciones para la causa DERECHOS CIVILES es: " + derechosCiviles;
    }

    // Muestra los metodos de pago realizados
    public static String metodosPago() {
        int efectivo = 0, tarjeta = 0, transferencia = 0;
        for (Donacion donacion : listaDonaciones) {
            String metodoPago = donacion.getMetodoPago().toLowerCase();

            // Suma la cantidad de veces que se pagó con los diferentes medios de pago
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

        /* Si efectivo, tarjeta o transferencia es > 0 entonces que retorne
        el mensaje correspondiente a los metodos de pago utilizados */

        String mensaje = "";
        if (efectivo > 0) {
            mensaje = "- Efectivo" + "\n";
        } if (tarjeta > 0) {
            mensaje += "- Tarjeta" + "\n";
        } if (transferencia > 0) {
            mensaje += "- Transferencia";
        }
        return mensaje;
    }

    // Muestra los nombres de todas las personas que realizaron una donación
    public static String nombresDonantes(){
        String mensaje = "";
        for(Donacion donacion: listaDonaciones){
            mensaje += "- " + donacion.getDonante() + "\n";
        }
        return mensaje;
    }

    // Trae la información de todas las donaciones realizadas
    public static ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }


}
