/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos222;

import DateBase.DataBase;
import Modelo.Mapper.Mapper;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorDTO;
import Modelo.Proveedores.ProveedorMapper;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author dashs
 */
public class ProductoMapper implements  Mapper<Productos, ProductosDTO>{

   
    private final ProveedorDAO proveedorDAO;

    // Constructor que recibe un ProveedorDAO
    public ProductoMapper(ProveedorDAO proveedorDAO) {
        // Validación de que proveedorDAO no sea nulo
        this.proveedorDAO = Objects.requireNonNull(proveedorDAO, "ProveedorDAO no puede ser nulo");
    }

    public ProductosDTO toDTO(Productos ent) {
        try {
            // Obtener el nombre del proveedor usando el ProveedorDAO
            ProveedorDTO proveedor = proveedorDAO.read(ent.getProveedor());
            String nombreProveedor = (proveedor != null) ? proveedor.getNombre() : "Proveedor no encontrado";
            return new ProductosDTO(
                    ent.getCodigo(),
                    ent.getNombre(),
                    ent.getCategoria(),
                    ent.getPrecio(),
                    ent.getCantDisponible(),
                    ent.getProveedor()
            );
        } catch (SQLException e) {
            // Manejo de excepción más robusto
            System.err.println("Error al obtener el proveedor: " + e.getMessage());
            // Retornar un DTO con un mensaje de error en el nombre del proveedor
            return new ProductosDTO(
                    ent.getCodigo(),
                    ent.getNombre(),
                    ent.getCategoria(),
                    ent.getPrecio(),
                    ent.getCantDisponible(),
                    ent.getProveedor());
        }
    }

    @Override
    public Productos toEnt(ProductosDTO dto) {
        // Validaciones de los datos antes de asignarlos
        if (dto == null) {
            return null;
        }
        Productos producto = new Productos();
        producto.setCodigo(dto.getCodigo());
        producto.setNombre(dto.getNombre());
        producto.setCategoria(dto.getCategoria());
        producto.setPrecio(dto.getPrecio());
        producto.setCantDisponible(dto.getCantDisponible());
        producto.setProveedor(dto.getProveedor()); // Asignar ID del proveedor
        return producto;
    }
}
