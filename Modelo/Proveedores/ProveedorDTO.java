/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Proveedores;

/**
 *
 * @author dashs
 */
public class ProveedorDTO {
    private final int idPuesto;
    private final String nombre;
    private final String contacto;
    private final String direccion;

    public int getIdPuesto() {
        return idPuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDireccion() {
        return direccion;
    }
   
    public ProveedorDTO(int idPuesto, String nombre, String contacto, String direccion) {
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
    }

}
