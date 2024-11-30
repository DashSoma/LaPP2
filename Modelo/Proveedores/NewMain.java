/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo.Proveedores;

import java.util.List;

/**
 *
 * @author dashs
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProveedorDAO dao = new ProveedorDAO(connection); // Proporciona una conexión válida
    try {
        List<Proveedor> resultados = dao.search("texto");
        for (Proveedor p : resultados) {
            System.out.println(p.getNombre());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
}
