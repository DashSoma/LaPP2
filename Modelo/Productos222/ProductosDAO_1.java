/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos222;

/**
 *
 * @author munoz
 */

import Modelo.DAO.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO extends DAO<ProductosDTO>{
        public ProductosDAO(Connection connection) {
        super(connection);
    }

     @Override
    public boolean create(ProductosDTO dto) throws SQLException {
        String query = "CALL ProductoCreate(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCodigo());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getCategoria());
            stmt.setDouble(4, dto.getPrecio());
            stmt.setInt(5, dto.getCantidadDisponible());
            stmt.setInt(6, dto.getProveedorId());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ProductosDTO read(Object id) throws SQLException {
        String query = "CALL ProductoRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(id.toString()));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ProductosDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4),
                            rs.getInt(5),
                            rs.getInt(6),
                            rs.getDate(7).toLocalDate()
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ProductosDTO> readAll() throws SQLException {
        String query = "CALL ProductoReadAll()";
        List<ProductosDTO> productos = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                productos.add(new ProductosDTO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDate(7).toLocalDate()
                ));
            }
        }
        return productos;
    }

    @Override
    public boolean update(ProductosDTO dto) throws SQLException {
        String query = "CALL ProductoUpdate(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCodigo());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getCategoria());
            stmt.setDouble(4, dto.getPrecio());
            stmt.setInt(5, dto.getCantidadDisponible());
            stmt.setInt(6, dto.getProveedorId());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "CALL ProductoDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(id.toString()));
            return stmt.executeUpdate() > 0;
        }
    }
}
