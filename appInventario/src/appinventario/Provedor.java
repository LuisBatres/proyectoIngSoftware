package appinventario;

/* @author franc */
public class Provedor {
    // Atributos
    private int    idProvedor;
    private String nombre;
    private String telefono;
    private String email;
    private String fechaContrato;
    
    // Constructores
    public Provedor() {
        idProvedor    = 0;
        nombre        = "";
        telefono      = "";
        email         = "";
        fechaContrato = "";
    }
    
    public Provedor(int id, String nombre, String telefono,
            String email, String fechaContrato) {
        this.idProvedor    = id;
        this.nombre        = nombre;
        this.telefono      = telefono;
        this.email         = email;
        this.fechaContrato = fechaContrato;
    }
    
    // Metodos

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}
