
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanb
 */


public class Pedido {
    private Cliente cliente;
    private ArrayList<DetallePedido> detalles;
    private Date fecha;

    // Constructor
    public Pedido(Cliente cliente, ArrayList<DetallePedido> detalles, Date fecha) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    // Métodos accesadores
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método para mostrar la información del pedido
    public void mostrarPedido() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalles del pedido:");
        for (DetallePedido detalle : detalles) {
            detalle.mostrarDetalle();
        }
        System.out.println("Total del pedido: " + FormateadorMoneda.formatearMoneda(obtenerTotal()));
    }

    // Obtener el total del pedido
    public double obtenerTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.obtenerTotal();
        }
        return total;
    }
}

