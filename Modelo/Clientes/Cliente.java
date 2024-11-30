/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Clientes;

/**
 *
 * @author La comadre Dash
 */
public class Cliente {

    private int cedula;
    private String nombreCompleto;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private int numeroCompras;

    public int getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setCedula(int cedula) {
        if (cedula <= 0) {
            throw new IllegalArgumentException("La cédula debe ser un número positivo.");
        }
        this.cedula = cedula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre completo no puede estar vacío.");
        }
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío.");
        }
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo electrónico no puede estar vacío.");
        }
        this.correoElectronico = correoElectronico;
    }

    public void setNumeroCompras(int numeroCompras) {
        if (numeroCompras < 0) {
            throw new IllegalArgumentException("El número de compras no puede ser negativo.");
        }
        this.numeroCompras = numeroCompras;
    }

    public Cliente(int cedula, String nombreCompleto, String direccion, String telefono, String correoElectronico, int numeroCompras) {
        setCedula(cedula);
        setNombreCompleto(nombreCompleto);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
        setNumeroCompras(numeroCompras);
    }

    public Cliente() {

    }

}
