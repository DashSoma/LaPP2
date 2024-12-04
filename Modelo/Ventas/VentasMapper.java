/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Ventas;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class VentasMapper {
    
    private final VentasDAO ventasDAO;

    // Constructor que recibe un ProveedorDAO
    public VentasMapper(VentasDAO ventasDAO) {
        // Validación de que proveedorDAO no sea nulo
        this.ventasDAO = Objects.requireNonNull(ventasDAO, "ProveedorDAO no puede ser nulo");
    }

    public VentasDTO toDTO(Ventas ent) {
        try {
            // Obtener el nombre del proveedor usando el ProveedorDAO
            VentasDTO proveedor = ventasDAO.read(ent.getCedulaEmpleado());
            String nombreProveedor = (proveedor != null) ? proveedor.getNombre() : "Proveedor no encontrado";
            return new VentasDTO(
                    ent.getIdPlanilla(),
                    ent.getFechaRecibo(),
                    ent.getCedulaEmpleado(),
                    ent.getNomEmpleado(),
                    ent.getCodigoProducto(),
                    ent.getNombreProducto(),
                    ent.getPrecioProducto(),
                    ent.getCantVendidos(),
                    ent.getSubTotal(),
                    ent.getImpuestos(),
                    ent.getTotal()
            );
        } catch (SQLException e) {
            // Manejo de excepción más robusto
            System.err.println("Error al obtener el proveedor: " + e.getMessage());
            // Retornar un DTO con los datos sin cambios, ya que el proveedor no pudo ser recuperado
            return new VentasDTO(
                    ent.getIdPlanilla(),
                    ent.getFechaRecibo(),
                    ent.getCedulaEmpleado(),
                    ent.getNomEmpleado(),
                    ent.getCodigoProducto(),
                    ent.getNombreProducto(),
                    ent.getPrecioProducto(),
                    ent.getCantVendidos(),
                    ent.getSubTotal(),
                    ent.getImpuestos(),
                    ent.getTotal()
            );
        }
    }

    public Ventas toEnt(VentasDTO dto) {
        if (dto == null) {
            return null;
        }
        Ventas ventas = new Ventas();
        ventas.setIdPlanilla(dto.getIdPlanilla());
        ventas.setFechaRecibo(dto.getFechaRecibo());
        ventas.setCedulaEmpleado(dto.getCedulaEmpleado());
        ventas.setNomEmpleado(dto.getNomEmpleado());
        ventas.setCodigoProducto(dto.getCodigoProducto());
        ventas.setNombreProducto(dto.getNombreProducto());
        ventas.setPrecioProducto(dto.getPrecioProducto());
        ventas.setCantVendidos(dto.getCantVendidos());
        ventas.setSubTotal(dto.getSubTotal());
        ventas.setImpuestos(dto.getImpuestos());
        ventas.setTotal(dto.getTotal());
        return ventas;
    }
    
}
