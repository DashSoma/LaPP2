package Modelo.Productos;

import java.time.LocalDate;

/**
 *
 * @author Cristian 
 */
public class Productos {
    private int codigo;
    private String nombre;
    private String categoria;
    private int precio;
    private int cantDisponible;
    private String proveedor;
    private LocalDate fechaPIngresado = LocalDate.now();
    
    protected Productos(int codigo, String nombre, String categoria, int precio, int cantDisponible, String proveedor, LocalDate fechaDespido) {
        this.codigo = codigo;
        this.nombre = nombre;       
        this.categoria = categoria;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
        this.proveedor = proveedor;
        this.fechaPIngresado = fechaDespido;
    }

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

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }


    public Productos( String nombre, String categoria, int precio, int cantDisponible, String proveedor) {
        this.codigo = 0;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = 0;
        this.cantDisponible = 0;
        this.proveedor = proveedor;
    }
    
    


    
}
