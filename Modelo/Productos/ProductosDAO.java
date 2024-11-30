/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import Modelo.DAO.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaniTini
 */
public class ProductosDAO extends DAO<ProductoDTO> {

    public ProductosDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(ProductoDTO dto) throws SQLException {
        if (dto == null || !validatePK(dto.getCodigo())) {
            return false;
        }
        String query = "Call tiendaelectronica(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCodigo());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getCategoria());
            stmt.setInt(4, dto.getPrecio());
            stmt.setInt(5, dto.getCantDisponible());
            stmt.setString(6, dto.getProveedor());
            stmt.setDate(7, dto.getFechaPIngresado());

            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ProductoDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call tiendaelectronica(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ProductoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getDate(7)
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ProductoDTO> readAll() throws SQLException {
        String query = "Call tiendaelectronica()";
        List<ProductoDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new ProductoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getString(6),
                            rs.getDate(7)
                    ));
                }
            }
        }
        return list;
    }

    @Override
    public boolean update(ProductoDTO dto) throws SQLException {
        if (dto == null) {
            return false;
        }
        String query = "Call tiendaelectronica(?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getPrecio());
            stmt.setInt(2, dto.getCantDisponible());
            return stmt.executeUpdate() > 0;

        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call tiendaelectronica(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        }
    }
    
    public boolean validatePK(Object id) throws SQLException {
        return read(id) == null;
    }

}
