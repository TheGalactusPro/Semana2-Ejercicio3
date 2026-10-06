package descuento;

public class MainCupon {
    public static void main(String[] args) {
        Cupon c1 = new Cupon();
        Cupon c2 = new Cupon();
        Cupon c3 = new Cupon();

        c1.codigo = "VERANO20";
        c1.porcentajeDescuento = 20;
        c1.descripcion = "Descuento de verano";
        c1.activo = true;

        c2.codigo = "BIENVENIDA15";
        c2.porcentajeDescuento = 15;
        c2.descripcion = "Descuento para nuevos clientes";
        c2.activo = false;

        c3.codigo = "ESPECIAL50";
        c3.porcentajeDescuento = 50;
        c3.descripcion = "Descuento en productos seleccionados";
        c3.activo = true;

        System.out.println("Cupón 1");
        c1.MostrarInformacion();

        System.out.println("\nCupón 2");
        c2.MostrarInformacion();

        System.out.println("\nCupón 3");
        c3.MostrarInformacion();

        // Métodos de activación y desactivación

        System.out.println("------------------------------------------");

        c2.activar();
        c1.desactivar();

        System.out.println("\nCupón 1");
        c1.MostrarInformacion();

        System.out.println("\nCupón 2");
        c2.MostrarInformacion();

        System.out.println("------------------------------------------");

        System.out.println("Mostrar descuento por defecto");

        System.out.println("\nDescuento cupón 1");
        c1.MostrarDescuento();

        System.out.println("\nResumen");
        c1.MostrarResumen();
        c2.MostrarResumen();
        c3.MostrarResumen();
    }
}
