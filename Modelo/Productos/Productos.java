package Modelo.Productos;

import java.time.LocalDate;
import javax.swing.JOptionPane;

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
    
    public Productos(int codigo, String nombre, String categoria, int precio, int cantDisponible, String proveedor, LocalDate fechaDespido) {
        this.codigo = codigo;
        this.nombre = nombre;       
        this.categoria = categoria;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
        this.proveedor = proveedor;
        this.fechaPIngresado = fechaDespido;
    }
    
    /**
     * Constructor por defecto que inicializa los atributos con valores predeterminados.
     */
    public Productos() {
        this.codigo = 0;
        this.nombre = "";
        this.categoria = "";
        this.fechaPIngresado = LocalDate.now();
        this.precio = 0;
        this.cantDisponible = 0;
        this.proveedor = "";
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFechaPIngresado() {
        return fechaPIngresado;
    }

    public void setFechaPIngresado(LocalDate fechaDespido) {
        this.fechaPIngresado = fechaDespido;
    }

    
}
