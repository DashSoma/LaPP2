/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import DateBase.DataBase;
import Modelo.Mapper.Mapper;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorDTO;
import Modelo.Proveedores.ProveedorMapper;
import java.sql.SQLException;
import java.time.LocalDate;

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
                ent.getProveedor() != null ? ent.getProveedor().getId() : 0  
        );
    }

    @Override
    public Productos toEnt(ProductoDTO dto) {
     Proveedor proveedor = new ProveedorMapper().toEnt(new ProveedorDTO(
            dto.getProveedor(),   
            "", 
            "", 
            ""
    ));
 
    return new Productos(
            dto.getCodigo(),
            dto.getNombre(),
            dto.getCategoria(),
            (int) dto.getPrecio(),
            dto.getCantDisponible(),
            proveedor,  
            LocalDate.now(),        
            0  
    );
    }
}
