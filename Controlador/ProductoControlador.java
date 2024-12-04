/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DateBase.DataBase;
import Modelo.Productos222.ProductoMapper;
import Modelo.Productos222.Productos;
import Modelo.Productos222.ProductosDAO;
import Modelo.Productos222.ProductosDTO;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorDTO;
import Vistas.Vista;
import java.util.List;
import java.util.Objects;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.text.View;

/**
 *
 * @author DaniTini
 */
public class ProductoControlador {

    
    private final ProductosDAO dao;
    private final Vista<Productos> vista;
    private final ProductoMapper mapper;
    private final ProveedorDAO proveedorDAO;

    // Constructor completo
    public ProductoControlador(Vista<Productos> vista, ProductoMapper mapper, ProveedorDAO proveedorDAO) {
        this.vista = vista;
        this.mapper = mapper;
        this.proveedorDAO = Objects.requireNonNull(proveedorDAO, "ProveedorDAO no puede ser nulo");
        try {
            this.dao = new ProductosDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    // Constructor por defecto
    public ProductoControlador(Vista vista) {
        this.vista = vista;
        try {
            this.proveedorDAO = new ProveedorDAO(DataBase.getConnection());
            this.mapper = new ProductoMapper(proveedorDAO);
            this.dao = new ProductosDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }

    // Crear producto
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
            readAll(); // Actualizar la vista con los datos nuevos
        } catch (SQLException ex) {
            vista.showError("Error al guardar el producto: " + ex.getMessage());
        }
    }

    // Leer un producto por código
    public void read(int codigo) {
        try {
            ProductosDTO dto = dao.read(codigo);
            Productos producto = mapper.toEnt(dto);
            if (producto != null) {
                vista.show(producto);
            } else {
                vista.showError("Producto no encontrado.");
            }
        } catch (SQLException ex) {
            vista.showError("Error al buscar el producto: " + ex.getMessage());
        }
    }

    // Leer todos los productos
    public void readAll() {
        try {
            List<Productos> productos = dao.readAll()
                    .stream()
                    .map(mapper::toEnt)
                    .toList();
            vista.showAll(productos);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los productos: " + ex.getMessage());
        }
    }

    // Actualizar un producto
    public void update(Productos producto) {
        if (producto == null || !validateRequired(producto)) {
            vista.showError("Faltan datos requeridos.");
            return;
        }
        try {
            if (validatePK(producto.getCodigo())) {
                vista.showError("El producto no está registrado.");
                return;
            }
            dao.update(mapper.toDTO(producto));
            vista.showMessage("Producto actualizado exitosamente.");
            readAll(); // Actualizar la vista con los datos nuevos
        } catch (SQLException ex) {
            vista.showError("Error al actualizar el producto: " + ex.getMessage());
        }
    }

    // Eliminar un producto
    public void delete(Productos producto) {
        if (producto == null) {
            vista.showError("No hay ningún producto cargado actualmente.");
            return;
        }
        try {
            if (validatePK(producto.getCodigo())) {
                vista.showError("El producto no está registrado.");
                return;
            }
            dao.delete(producto.getCodigo());
            vista.showMessage("Producto eliminado exitosamente.");
            readAll(); // Actualizar la vista con los datos nuevos
        } catch (SQLException ex) {
            vista.showError("Error al eliminar el producto: " + ex.getMessage());
        }
    }

    // Leer todos los proveedores y convertirlos al modelo de la vista
    public List<Proveedor> readAllProveedores() {
        try {
            List<ProveedorDTO> dtos = proveedorDAO.readAll();
            return mapToProveedores(dtos);
        } catch (SQLException e) {
            System.err.println("Error al obtener proveedores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Mapeo de DTO a Proveedor
    private List<Proveedor> mapToProveedores(List<ProveedorDTO> dtos) {
        List<Proveedor> proveedores = new ArrayList<>();
        for (ProveedorDTO dto : dtos) {
            // Usa el constructor que omite el ID
            Proveedor proveedor = new Proveedor(
                    dto.getNombre(),
                    dto.getContacto(),
                    dto.getDireccion()
            );
            // Asigna manualmente el ID autoincremental
            proveedor.setId(dto.getId());
            proveedores.add(proveedor);
        }
        return proveedores;
    }

    // Validar campos requeridos
    private boolean validateRequired(Productos producto) {
        return producto.getNombre() != null && !producto.getNombre().trim().isEmpty()
                && producto.getCategoria() != null && !producto.getCategoria().trim().isEmpty()
                && producto.getPrecio() > 0
                && producto.getCantDisponible() >= 0
                && producto.getProveedor() > 0;
    }

    // Validar llave primaria (código)
    private boolean validatePK(int codigo) {
        try {
            return dao.read(codigo) == null;
        } catch (SQLException ex) {
            System.err.println("Error al validar la llave primaria: " + ex.getMessage());
            return false;
        }
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    private ProductosDAO dao;
//    private final Vista vista;
//    private final ProductoMapper mapper;
//
//    public ProductoControlador(Vista vista, ProductoMapper mapper) {
//        this.vista = vista;
//        this.mapper = mapper;
//        try {
//            dao = new ProductosDAO(DataBase.getConnection());
//        } catch (SQLException ex) {
//            vista.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
//        }
//    }
//
//    public ProductoControlador(Vista vista) {
//        this(vista, new ProductoMapper());
//    }
//
//    public void create(Productos producto) {
//        if (producto == null || !validateRequired(producto)) {
//            vista.showError("Faltan datos requeridos");
//            return;
//        }
//        try {
//
//            if (!validatePK(producto.getCodigo())) {
//                vista.showError("El código ingresado ya se encuentra registrado");
//                return;
//            }
//
//            dao.create(mapper.toDTO(producto));
//            vista.showMessage("Datos guardados correctamente");
//        } catch (SQLException ex) {
//            vista.showError("Ocurrió un error al guardar los datos: " + ex.getMessage());
//        }
//    }
//
//    public void read(int codigo) {
//        try {
//            ProductoDTO producto = dao.read(codigo);
//            if (producto != null) {
//                vista.show(producto);
//            } else {
//                vista.showError("Producto no encontrado");
//            }
//        } catch (SQLException ex) {
//            vista.showError("Error al cargar los datos: " + ex.getMessage());
//        }
//    }
//
//    public void readAll() {
//        try {
//            List<ProductoDTO> productoList = dao.readAll().stream()
//                    .filter(Objects::nonNull)
//                    .collect(Collectors.toList());
//            vista.showAll(productoList);
//        } catch (SQLException ex) {
//            vista.showError("Error al cargar los datos: " + ex.getMessage());
//        }
//    }
//
//    public void update(ProductoDTO producto) {
//        if (producto == null || !validateRequired(producto)) {
//            vista.showError("Faltan datos requeridos");
//            return;
//        }
//        try {
//
//            if (validatePK(producto.getCodigo())) {
//                vista.showError("El código ingresado no está registrado");
//                return;
//            }
//            dao.update(producto);
//            vista.showMessage("Producto actualizado correctamente");
//        } catch (SQLException ex) {
//            vista.showError("Error al actualizar los datos: " + ex.getMessage());
//        }
//    }
//
//    public void delete(int codigo) {
//        try {
//
//            if (validatePK(codigo)) {
//                vista.showError("El código ingresado no está registrado");
//                return;
//            }
//            dao.delete(codigo);
//            vista.showMessage("Producto eliminado correctamente");
//        } catch (SQLException ex) {
//            vista.showError("Error al eliminar los datos: " + ex.getMessage());
//        }
//    }
//
//    private boolean validateRequired(Productos producto) {
//        return producto.getCodigo() > 0
//                && producto.getNombre() != null && !producto.getNombre().trim().isEmpty()
//                && producto.getCategoria() != null && !producto.getCategoria().trim().isEmpty()
//                && producto.getPrecio() > 0
//                && producto.getCantDisponible() > 0
//                && producto.getProveedor() != null;
//    }
//
//    private boolean validateRequired(ProductoDTO producto) {
//        return producto.getNombre() != null && !producto.getNombre().trim().isEmpty()
//                && producto.getCategoria() != null && !producto.getCategoria().trim().isEmpty()
//                && producto.getProveedor() != 0
//                && producto.getPrecio() > 0
//                && producto.getCantDisponible() > 0;
//    }
//
//    private boolean validatePK(int codigo) {
//        try {
//            return dao.read(codigo) != null;
//        } catch (SQLException ex) {
//            System.out.println("Error al validar PK: " + ex.getMessage());
//            return false;
//        }
//    }

