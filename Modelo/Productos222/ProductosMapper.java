/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos222;

    import Modelo.Mapper.Mapper;
    import Modelo.Proveedores.ProveedorDAO;
    import Modelo.Proveedores.ProveedorDTO;
    import java.sql.SQLException;
    import java.util.Objects;

/**
 *
 * @author munoz
 */
public class ProductosMapper implements Mapper<Productos, ProductosDTO> {

    @Override
    public ProductosDTO toDTO(Productos ent) {
        return new ProductosDTO(
                ent.getCodigo(),
                ent.getNombre(),
                ent.getCategoria(),
                ent.getPrecio(),
                ent.getCantidadDisponible(),
                ent.getProveedorId(),
                ent.getFechaIngreso()
        );
    }

    @Override
    public Productos toEnt(ProductosDTO dto) {
        return new Productos(
                dto.getCodigo(),
                dto.getNombre(),
                dto.getCategoria(),
                dto.getPrecio(),
                dto.getCantidadDisponible(),
                dto.getProveedorId(),
                dto.getFechaIngreso()
        );
    }
}
