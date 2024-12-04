/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos222;

import java.time.LocalDate;

/**
 *
 * @author munoz
 */
public class ProductosDTO {
   private int codigo;
    private String nombre;
    private String categoria;
    private double precio; 
    private int cantDisponible;
    private int proveedor; 
    private LocalDate fechaPIngresado;

  

    public ProductosDTO(int codigo, String nombre, String categoria, double precio, int cantDisponible, int proveedor, LocalDate fechaPIngresado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
        this.proveedor = proveedor;
        this.fechaPIngresado = fechaPIngresado;
    }

    ProductosDTO(int codigo, String nombre, String categoria, double precio, int cantDisponible, int proveedor, String nombreProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }
    
    
    public LocalDate getFechaPIngresado() {
        return fechaPIngresado;
    }

    int getCantidadDisponible() {
        return cantDisponible;
    }

    int getProveedorId() {
         return proveedor;
    }

    LocalDate getFechaIngreso() {
       return fechaPIngresado;
    }
}
