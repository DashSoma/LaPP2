package Modelo.Productos;

import Modelo.Proveedores.Proveedor;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private Proveedor proveedor;
    private LocalDate fechaPIngresado = LocalDate.now();
    private int vTotalInventario;

    public Productos(int codigo, String nombre, String categoria, int precio, int cantDisponible, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
        this.proveedor = proveedor;
    }

    public Productos() {
        this.codigo = 0;
        this.nombre = "";
        this.categoria = "";
        this.fechaPIngresado = LocalDate.now();
        this.precio = 0;
        this.cantDisponible = 0;
        this.proveedor = new Proveedor(); 
        this.vTotalInventario = 0;
    }
    
    

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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

    public LocalDate getFechaPIngresado() {
        return fechaPIngresado;
    }

    public void setFechaPIngresado(LocalDate fechaDespido) {
        this.fechaPIngresado = fechaDespido;
    }

    public int getvTotalInventario() {
        return vTotalInventario;
    }

    public void setvTotalInventario(int vTotalInventario) {
        this.vTotalInventario = vTotalInventario;
    }
    
   

    public static int calcularTotalInventario(ArrayList<Productos> listaProductos) {
        int totalPrecios = 0;

        for (Productos producto : listaProductos) {
            int precio = producto.getPrecio();
            totalPrecios += precio;
        }
        if (totalPrecios == 0) {
            JOptionPane.showMessageDialog(null, "No hay total de inventario que mostrar");
        } else {
            JOptionPane.showMessageDialog(null, "El total de precios es: " + totalPrecios);
        }
        return totalPrecios;
    }

}
