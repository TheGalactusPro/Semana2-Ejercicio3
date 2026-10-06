package descuento;

public class Cupon {
    public String codigo;
    public double porcentajeDescuento;
    String descripcion;
    boolean activo;

    public void MostrarInformacion() {
        System.out.println("Código: " +codigo+ "\nDescuento: " +porcentajeDescuento+ "%\nDescripción: " +descripcion);

        String estado = activo ? "Estado: Activo" : "Estado: Inactivo";
        System.out.println(codigo+ ": " +estado);
    }

    public void activar() {
        activo = true;
    }

    void desactivar() {
        activo = false;
    }

    void MostrarDescuento() {
        System.out.println("Descuento: " +porcentajeDescuento+ "%");
    }

    // Desafío adicional
    void MostrarResumen() {
        System.out.println("Cupón " +codigo+ " - Descuento " + porcentajeDescuento + "%");
    }
}
