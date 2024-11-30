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

    
    private final int codigo = 0;
    private final String nombre = null;
    private final String categoria = null;
    private final int precio = 0;
    private final int cantDisponible = 0;
    private final String proveedor = null;
    private final Date fechaPIngresado = null;

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
    }
    
    
}
