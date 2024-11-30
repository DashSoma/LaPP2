/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import Modelo.Mapper.Mapper;
import Utils.UtilDate;

/**
 *
 * @author La comadre Dash
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
                ent.getProveedor(),
                UtilDate.toSqlDate(ent.getFechaPIngresado())
        );
    }

    @Override
public Productos toEnt(ProductoDTO dto) {
    try {
        return new Productos(
                dto.getCodigo(),
                dto.getNombre(),
                dto.getCategoria(),
                dto.getPrecio(),
                dto.getCantDisponible(),
                dto.getProveedor(),
                UtilDate.toLocalDate(dto.getFechaPIngresado())
        );
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


}
