/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import java.time.LocalDate;
import java.sql.Date;


/**
 *
 * @author DaniTini
 */
public class ProductoDTO {

    
    private final int codigo;
    private final String nombre;
    private final String categoria ;
    private final int precio;
    private final int cantDisponible;
    private final String proveedor;
    private final Date fechaPIngresado;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public String getProveedor() {
        return proveedor;
    }

    public Date getFechaPIngresado() {
        return fechaPIngresado;
    }

    public ProductoDTO(int codigo, String nombre, String categoria, int precio, int cantDisponible, String proveedor, Date fechaPIngresado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
        this.proveedor = proveedor;
        this.fechaPIngresado = fechaPIngresado;
    }

    

    
    
    
}
