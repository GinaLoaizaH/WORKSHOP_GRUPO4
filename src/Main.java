import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Donante donante1 = new Donante("Gina", 1070015252, "gina@gmail.com", "Cr 13 19 11");
        Donante donante2 = new Donante("Jhoannys", 1115078877, "jhoa@gmail.com", "Cr 26 11 59");

        Donacion donacion1 = new Donacion(1500000, donante1, "Efectivo", LocalDate.of(2024, 5, 02), "Educacion");
        Donacion donacion2 = new Donacion(2500000, donante2, "Tarjeta", LocalDate.of(2024, 5, 03), "Salud");

        Informe informe1 = new Informe("Cantidad Donaciones", "General", LocalDate.of(2024, 05, 02), Corporacion.getListaDonaciones());
        Recibo recibo1 = new Recibo(donacion1, LocalDate.of(2024,05,3));
        Recibo recibo2 = new Recibo(donacion2, LocalDate.of(2024,05,3));

        System.out.println(donante1.infoDonante());

        System.out.println("***************************");
        System.out.println(donacion1.infoDonacion());
        System.out.println("");

        System.out.println("**************** INFORMES ********************");
        System.out.println(informe1.informeCantidadDonaciones());
        System.out.println("");

        System.out.println("**************** ANALISIS *******************");
        System.out.println(informe1.analisisTendencias());
        System.out.println("");

        System.out.println("**************** INFO GENERAL *******************");
        System.out.println(informe1.informeGeneral());
        System.out.println("");

        System.out.println("******************* RECIBO ******************");
        System.out.println(recibo1.infoRecibo());
        System.out.println("");
        System.out.println(recibo2.infoRecibo());

        System.out.println("");
        System.out.println("*************** BUSCAR POR ID ***************");
        System.out.println(informe1.informePorId(2));
    }
}