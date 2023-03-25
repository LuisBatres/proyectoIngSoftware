package appinventario;

public class Empresa {
    // Atributos
    private String nombre;
    private String giro;
    private String email;
    private String telefono;
    private String domicilio;
    
    // Constructores
    public Empresa () {
        nombre        = "";
        giro          = "";
        email         = "";
        telefono      = "";
        domicilio     = "";
    }
    
    public Empresa ( String nombre, String giro, String email, String tel, String domicilio ) {
        this.nombre        = nombre;
        this.giro          = giro;
        this.email         = email;
        this.telefono      = tel;
        this.domicilio     = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
