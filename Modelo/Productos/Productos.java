package Modelo.Productos;

import java.time.LocalDate;
import java.time.Period;

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

    public int getPrecio() {
        return precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public LocalDate getFechaPIngresado() {
        return fechaPIngresado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El Nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("El Categoria no puede ser nulo");
        }
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        if (proveedor == null) {
            throw new IllegalArgumentException("El proveedor no puede ser nulo");
        }
        this.proveedor = proveedor;
    }

    public void setFechaPIngresado(LocalDate fechaPIngresado) {
        if (fechaPIngresado == null) {
            throw new IllegalArgumentException("La fecha no puede ser nulo");
        }
        this.fechaPIngresado = fechaPIngresado;
    }

    public static int calculateFecha(LocalDate birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    
    
    public Productos(String nombre, String categoria, int precio, int cantDisponible, String proveedor) {
        this.codigo = 0;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = 0;
        this.cantDisponible = 0;
        this.proveedor = proveedor;
    }

   

}
