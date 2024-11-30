/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import DateBase.DataBase;
import Modelo.Mapper.Mapper;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
import Utils.UtilDate;
import java.sql.SQLException;

/**
 *
 * @author dashs
 */
public class ProductoMapper implements Mapper<Productos, ProductoDTO> {

    @Override
    public ProductoDTO toDTO(Productos ent) {
        return new ProductoDTO(
                ent.getCodigo(),
                ent.getNombre(),
                ent.getCategoria(),
                ent.getPrecio(),
                ent.getCantDisponible(),
                ent.getProveedor().getId(),
                UtilDate.toSqlDate(ent.getFechaPIngresado())
        );
    }

    @Override
    public Productos toEnt(ProductoDTO dto) {
        try{
        return new Producto(
                dto.getCodigo(),
                dto.getNombre(),
                dto.getCategoria(),
                dto.getPrecio(),
                dto.getCantDisponible(),
                new Proveedor().toEnt(new ProveedorDAO(DataBase.DataBase.getConnection()).read(dto.getProveedor())),
                UtilDate.toLocalDate(dto.getFechaPIngresado())
        );
        }catch (SQLException ex) {
            throw new RuntimeException("Error while mapping RentalContractDTO to RentalContract", ex);
        }
    }
    
}
