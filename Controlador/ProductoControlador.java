/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DateBase.DataBase;
import Modelo.Clientes.ClienteDAO;
import Modelo.Clientes.ClientesMapper;
import Modelo.Productos.ProductoDTO;
import Modelo.Productos.ProductoMapper;
import Modelo.Productos.ProductosDAO;
import Vistas.Vista;
import java.util.List;
import java.util.Objects;
import java.sql.SQLException;
import java.util.stream.Collectors;

/**
 *
 * @author DaniTini
 */
public class ProductoControlador {

    private ProductosDAO dao;
    private final Vista vista;
    private ProductoMapper mapper;

    public ProductoControlador(Vista vista, ProductoMapper mapper) {
        this.vista = vista;
        this.mapper = mapper;
        try {
            dao = new ProductosDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }

    public ProductoControlador(Vista vista) {
        this.vista = vista;
        mapper = new ProductoMapper();
        try {
            dao = new ProductosDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }

    public void create(ProductoDTO producto) {
        if (producto == null || !validateRequired(producto)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validatePK(producto.getCodigo())) {
                vista.showError("La cédula ingresada ya se encuentra registrada");
                return;
            }
            dao.create(mapper.toDTO(producto));
            vista.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            vista.showError("Ocurrió un error al guardar los datos: " + ex.getMessage());
        }
    }

    public void read(int codigo) {
        try {
            ProductoDTO producto = dao.read(codigo);
            if (producto != null) {
                vista.show(producto);
            } else {
                vista.showError("Producto no encontrado");
            }
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    public void readAll() {
        try {
            List<ProductoDTO> productoList = dao.readAll().stream()
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            vista.showAll(productoList);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }

    public void update(ProductoDTO producto) {
        if (producto == null || !validateRequired(producto)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validatePK(producto.getCodigo())) {
                vista.showError("El código ingresado no está registrado");
                return;
            }
            dao.update(producto);
            vista.showMessage("Producto actualizado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al actualizar los datos: " + ex.getMessage());
        }
    }

    public void delete(int codigo) {
        try {
            if (validatePK(codigo)) {
                vista.showError("El código ingresado no está registrado");
                return;
            }
            dao.delete(codigo);
            vista.showMessage("Producto eliminado correctamente");
        } catch (SQLException ex) {
            vista.showError("Error al eliminar los datos: " + ex.getMessage());
        }
    }

    private boolean validateRequired(ProductoDTO producto) {
        return producto.getNombre() != null && !producto.getNombre().trim().isEmpty()
                && producto.getCategoria() != null && !producto.getCategoria().trim().isEmpty()
                && producto.getProveedor() != null && !producto.getProveedor().trim().isEmpty()
                && producto.getPrecio() > 0
                && producto.getCantDisponible() > 0;
    }

    private boolean validatePK(int codigo) {
        try {
            ProductoDTO producto = dao.read(codigo);
            return producto == null;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

}
