/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanb
 */
public class DetallePedido {
    private Repuesto repuesto;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public DetallePedido(Repuesto repuesto, int cantidad) {
        this.repuesto = repuesto;
        this.cantidad = cantidad;
        this.precioUnitario = repuesto.getPrecio();
    }

    // Métodos accesadores y mutadores
    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Calcular total del detalle
    public double obtenerTotal() {
        return cantidad * precioUnitario;
    }

    // Método para mostrar detalles del pedido
    public void mostrarDetalle() {
        System.out.println("Repuesto: " + repuesto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + FormateadorMoneda.formatearMoneda(precioUnitario));
        System.out.println("Total: " + FormateadorMoneda.formatearMoneda(obtenerTotal()));
    }
}



