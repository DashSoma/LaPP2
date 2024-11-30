/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorDTO;
import java.util.List;

/**
 *
 * @author dashs
 */
public class ProveedorControlador {

    private final ProveedorDAO proveedorDAO;

    public ProveedorControladorConnection connection) {
        this.proveedorDAO = new ProveedorDAO(connection);
    }

    public boolean crearProveedor(int id, String nombre, String contacto, String direccion) {
        ProveedorDTO proveedor = new ProveedorDTO(id, nombre, contacto, direccion);
        try {
            return proveedorDAO.create(proveedor);
        } catch (SQLException e) {
            System.err.println("Error al crear el proveedor: " + e.getMessage());
            return false;
        }
    }

    public ProveedorDTO obtenerProveedor(int id) {
        try {
            return proveedorDAO.read(id);
        } catch (SQLException e) {
            System.err.println("Error al obtener el proveedor: " + e.getMessage());
            return null;
        }
    }

    public List<ProveedorDTO> obtenerTodosLosProveedores() {
        try {
            return proveedorDAO.readAll();
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de proveedores: " + e.getMessage());
            return null;
        }
    }

    public boolean actualizarContactoProveedor(int id, String nuevoContacto) {
        try {
            ProveedorDTO proveedor = proveedorDAO.read(id);
            if (proveedor != null) {
                proveedor.setContacto(nuevoContacto);
                return proveedorDAO.update(proveedor);
            }
            System.err.println("Proveedor no encontrado.");
            return false;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el proveedor: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarProveedor(int id) {
        try {
            return proveedorDAO.delete(id);
        } catch (SQLException e) {
            System.err.println("Error al eliminar el proveedor: " + e.getMessage());
            return false;
        }
    }

}
