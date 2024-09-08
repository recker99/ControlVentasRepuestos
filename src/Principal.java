import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ivanb
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "Av. Siempre Viva 123", "555-1234");

        // Crear repuestos
        Repuesto repuesto1 = new Repuesto(101, "Bosch", "Filtro de aceite", 150000.0, 5);
        Repuesto repuesto2 = new Repuesto(102, "Bosch", "Bujías", 75000.0, 10);

        // Crear detalles de pedido
        DetallePedido detalle1 = new DetallePedido(repuesto1, 2);
        DetallePedido detalle2 = new DetallePedido(repuesto2, 3);

        // Crear una lista de detalles y añadir los detalles
        ArrayList<DetallePedido> detalles = new ArrayList<>();
        detalles.add(detalle1);
        detalles.add(detalle2);

        // Crear una venta con los detalles y la fecha actual
        Date fecha = new Date(); // Usar la fecha actual
        Venta venta = new Venta(cliente, detalles, fecha);

        // Mostrar toda la información de la venta
        venta.mostrarVenta();
    }
}
