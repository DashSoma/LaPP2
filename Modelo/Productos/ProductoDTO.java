/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import java.time.LocalDate;


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
    private final LocalDate fechaPIngresado = LocalDate.now();

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

    public LocalDate getFechaPIngresado() {
        return fechaPIngresado;
    }

    
    
    
}
