/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanb
 */
public class Repuesto {
    private int codigo;
    private String marca;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Repuesto(int codigo, String marca, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos accesadores y mutadores
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para listar atributos
    public void listarAtributos() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + FormateadorMoneda.formatearMoneda(precio));
        System.out.println("Cantidad: " + cantidad);
    }
}
