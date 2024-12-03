/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import DateBase.DataBase;
import Modelo.Mapper.Mapper;
import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorMapper;
import java.sql.SQLException;

/**
 *
 * @author dashs
 */
public class ProductoMapper implements Mapper<Producto, ProductoDTO> {

    @Override
    public ProductoDTO toDTO(Producto ent) {
        return new ProductoDTO(
                ent.getCodigo(),
                ent.getNombre(),
                ent.getCategoria(),
                ent.getPrecio(),
                ent.getCantDisponible(),
                ent.getProveedor().getId()
        );

    }

    @Override
    public Producto toEnt(ProductoDTO dto) {
        try {
            return new Producto(
                    dto.getCodigo(),
                    dto.getNombre(),
                    dto.getCategoria(),
                    dto.getPrecio(),
                    dto.getCantDisponible(),
                    new ProveedorMapper().toEnt(new ProveedorDAO(DateBase.DataBase.getConnection()).read(dto.getProveedor()))
            );
        } catch (SQLException ex) {
            throw new RuntimeException("Error while mapping RentalContractDTO to RentalContract", ex);
        }
    }

}
