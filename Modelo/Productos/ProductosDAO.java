/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Productos;

import DateBase.DataBase;
import Modelo.DAO.DAO;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
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
        if (dto == null || !validateFk(dto.getProveedor())) {
            return false;
        }
        String query = "CALL ProductoCreate(?,?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCodigo());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getCategoria());
            stmt.setDouble(4, dto.getPrecio()); 
            stmt.setInt(5, dto.getCantDisponible());
            stmt.setInt(6, dto.getProveedor());
            return stmt.executeUpdate() == 1;
        }
    }

    @Override
    public ProductoDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "CALL ProductoRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ProductoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4), 
                            rs.getInt(5),
                            rs.getInt(6)
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ProductoDTO> readAll() throws SQLException {
        String query = "CALL ProductoReadAll(?)";
        List<ProductoDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new ProductoDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4),
                            rs.getInt(5),
                            rs.getInt(6)
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
        String query = "Call ProductoUpdate(?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setDouble(1, dto.getPrecio());
            stmt.setInt(2, dto.getCantDisponible());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || !(id instanceof Integer)) {
            return false;
        }

        String query = "CALL ProductoDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (Integer) id); // Cast to Integer
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validateFk(Object id) throws SQLException {
        return new ProveedorDAO(DataBase.getConnection()).read(id) != null;
    }
}
