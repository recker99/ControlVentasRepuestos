import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ivanb
 */
public class Venta {
    private Cliente cliente;
    private ArrayList<DetallePedido> detalles;
    private Date fecha;

    // Formato de fecha para mostrar
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    // Constructor
    public Venta(Cliente cliente, ArrayList<DetallePedido> detalles, Date fecha) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    // Métodos accesadores
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetallePedido> detalles) {
        if (detalles != null && !detalles.isEmpty()) {
            this.detalles = detalles;
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        }
    }

    // Método para mostrar la información de la venta
    public void mostrarVenta() {
        System.out.println("Fecha: " + sdf.format(fecha));
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalles de la venta:");
        for (DetallePedido detalle : detalles) {
            detalle.mostrarDetalle();
        }
        System.out.println("Total de la venta: " + FormateadorMoneda.formatearMoneda(obtenerTotal()));
    }

    // Obtener el total de la venta
    public double obtenerTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.obtenerTotal(); // Asegúrate de que obtenerTotal() esté implementado en DetallePedido
        }
        return total;
    }

    // Método para agregar un detalle
    public void agregarDetalle(DetallePedido detalle) {
        if (detalle != null) {
            detalles.add(detalle);
        }
    }

    // Método para eliminar un detalle
    public void eliminarDetalle(DetallePedido detalle) {
        detalles.remove(detalle);
    }
}
