package appinventario;

public class Empresa {
    // Atributos
    private int    idEmpresa;
    private String nombre;
    private String telefono;
    private String email;
    private String fechaContrato;
    
    // Constructores
    public Empresa () {
        idEmpresa     = 0;
        nombre        = "";
        telefono      = "";
        email         = "";
        fechaContrato = "";
    }
    
    public Empresa ( int id, String nombre, String tel, String email, String fechaContrato ) {
        this.idEmpresa     = id;
        this.nombre        = nombre;
        this.telefono      = tel;
        this.email         = email;
        this.fechaContrato = fechaContrato;
    }
    
    // Getters y setters
    public int getIdEmpresa () {
        return idEmpresa;
    }

    public void setIdEmpresa ( int idEmpresa ) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    public String getTelefono () {
        return telefono;
    }

    public void setTelefono ( String telefono ) {
        this.telefono = telefono;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getFechaContrato () {
        return fechaContrato;
    }

    public void setFechaContrato ( String fechaContrato ) {
        this.fechaContrato = fechaContrato;
    }
}
