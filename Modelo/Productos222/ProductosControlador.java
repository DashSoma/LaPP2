/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos222;

/**
 *
 * @author munoz
 */

import controlador.*;
import BaseDatos.DataBase;
import Modelo.Productos222.ProductosDAO;
import Modelo.Productos222.ProductosMapper;
import Modelo.Proveedores.ProveedorDAO;
import clases.Productos;
import vista.Vista;
import java.sql.SQLException;
import java.util.Objects;


public class ProductosControlador {
    private ProductosDAO dao;
    private final Vista<Productos> vista;
    private final ProductosMapper mapper;
    private final ProveedorDAO proveedorDAO; 


    public ProductosControlador(Vista<Productos> vista, ProductosMapper mapper, ProveedorDAO proveedorDAO) {
        this.vista = vista;
        this.mapper = mapper;
        this.proveedorDAO = Objects.requireNonNull(proveedorDAO, "ProveedorDAO no puede ser nulo");
        try {
            this.dao = new ProductosDAO(DataBase.getConnection()); 
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
        }
    }

 
    public ProductosControlador(Vista<Productos> vista) {
        this.vista = vista;
        try {
            this.proveedorDAO = new ProveedorDAO(DataBase.getConnection()); // Crear ProveedorDAO
            this.mapper = new ProductosMapper(proveedorDAO); // Crear ProductosMapper con ProveedorDAO
            this.dao = new ProductosDAO(DataBase.getConnection()); // Crear ProductosDAO
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
            throw new RuntimeException(ex); // Lanzar excepción si falla la inicialización
        }
    }

    // Métodos del controlador (create, read, update, delete, validate, etc.)
    public void create(Productos producto) {
        if (producto == null || !validateRequired(producto)) {
            vista.showError("Faltan datos requeridos.");
            return;
        }
        try {
            if (!validatePK(producto.getCodigo())) {
                vista.showError("El código del producto ya está registrado.");
                return;
            }
            dao.create(mapper.toDTO(producto));
            vista.showMessage("Producto agregado exitosamente.");
            dao.readAll(); // Actualizar la tabla en la vista
        } catch (SQLException ex) {
            vista.showError("Error al guardar el producto: " + ex.getMessage());
        }
    }

    // Otros métodos: read, readAll, update, delete...

    private boolean validateRequired(Productos producto) {
        return producto.getNombre() != null && !producto.getNombre().trim().isEmpty()
                && producto.getCategoria() != null && !producto.getCategoria().trim().isEmpty()
                && producto.getPrecio() > 0
                && producto.getCantDisponible() >= 0;
               
    }

    private boolean validatePK(int codigo) {
        try {
            return dao.read(codigo) == null; 
        } catch (SQLException ex) {
            System.err.println("Error validando PK: " + ex.getMessage());
            return false;
        }
    }
}
