/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DateBase.DataBase;
import Modelo.Proveedores.Proveedor;
import Modelo.Proveedores.ProveedorDAO;
import Modelo.Proveedores.ProveedorDTO;
import Modelo.Proveedores.ProveedorMapper;
import Vistas.Vista;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author La comadre dashs
 */
public class ProveedorControlador {

    private ProveedorDAO dao;
    private final Vista vista;
    private final ProveedorMapper mapper;

    public ProveedorControlador(Vista vista, ProveedorMapper mapper) {
        this.vista = vista;
        this.mapper = mapper;
    }
    public ProveedorControlador(Vista vista) {
        this.vista = vista;
        mapper=new ProveedorMapper();
        try {
            dao=new ProveedorDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            vista.showError("Error al conectar con la Base de Datos");
        }
    }
    
    public void create(Proveedor proveedor){
        if(proveedor==null || !validateRequired(proveedor)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (!validatePK(proveedor.getId())){
                vista.showError("La cedula ingresada ya se encuentra registrada");
                return;
            }
            dao.create(mapper.toDTO(proveedor));
            vista.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            vista.showError("Ocurrio un error al guardar los datos: "+ ex.getMessage());
        }
    

    }
    
    public void read(){
        
    }
    
    public void readAll(){
        try {
            List<ProveedorDTO> dtoList = dao.readAll();
            List<Proveedor> proveedorList = dtoList.stream()
                    .map(mapper::toEnt)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            vista.showAll(proveedorList);
        } catch (SQLException ex) {
            vista.showError("Error al cargar los datos: "+ ex.getMessage());
        }
    }
    
    public void update(Proveedor proveedor){
        if(proveedor==null || !validateRequired(proveedor)) {
            vista.showError("Faltan datos requeridos");
            return;
        }
        try {
            if (validatePK(proveedor.getId())){
                vista.showError("La cedula ingresada no se encuentra registrada");
                return;
            }
            dao.update(mapper.toDTO(proveedor));
        } catch (SQLException ex) {
            vista.showError("Ocurrio un error al actualizar los datos: "+ ex.getMessage());
        }
    }
    
    public void delete(Proveedor proveedor){
//        if(proveedor==null || !validateRequired(proveedor)) {
//            vista.showError("No hay ningun cliente cargado actualmente");
//            return;
//        }
//        try {
//            if (validatePK(proveedor.getId())){
//                vista.showError("La cedula ingresada no ya se encuentra registrada");
//                return;
//            }
//            dao.delete(proveedor.getId());
//        } catch (SQLException ex) {
//            vista.showError("Ocurrio un error al eliminar los datos: "+ ex.getMessage());
//        }
if (proveedor == null || proveedor.getId() <= 0) {
        vista.showError("ID inválido para eliminar.");
        return;
    }
    try {
        dao.delete(proveedor.getId()); // Llama al DAO para eliminar
        vista.showMessage("Proveedor eliminado correctamente.");
    } catch (SQLException ex) {
        vista.showError("Error al eliminar el proveedor: " + ex.getMessage());
    }
    }
    
//    public boolean validateRequired(Proveedor proveedor) {
//        return proveedor.getNombre() != null && !proveedor.getNombre().trim().isEmpty()
//                && proveedor.getContacto() != null && !proveedor.getContacto().trim().isEmpty()
//                && proveedor.getDireccion() != null && !proveedor.getDireccion().trim().isEmpty();
//    }
    
    public boolean validateRequired(Proveedor proveedor) {
    return proveedor.getNombre() != null && !proveedor.getNombre().trim().isEmpty()
            && proveedor.getContacto() != null && !proveedor.getContacto().trim().isEmpty()
            && proveedor.getDireccion() != null && !proveedor.getDireccion().trim().isEmpty();
}


    public boolean validatePK(int id) {
        try {
            return dao.validatePk(id);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void readFiltered(String filter) {
    try {
        List<Proveedor> filteredList = dao.search(filter); // Implementa la búsqueda en el DAO
        vista.showAll(filteredList); // Envía los resultados a la vista
    } catch (SQLException ex) {
        vista.showError("Error al filtrar datos: " + ex.getMessage());
    }
}
    
}
