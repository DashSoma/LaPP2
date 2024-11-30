package Modelo.Proveedores;

/**
 * 
 * @author Crisp
 */
public class Proveedor {
//    private static int idIncremental = 1;
    private int idPuesto;
    private String nombre;
    private String contacto;
    private String direccion;

    public int getIdPuesto() {
        return idPuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
   
    protected Proveedor(int idPuesto, String nombre, String contacto, String direccion) {
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    public Proveedor(String nombre, String contacto, String direccion) {
        this.idPuesto =0;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
    }
    
}
