package appinventario;

public class Producto {
    
    //Atributos
    private int idProd;
    private String codigo;
    private String nombre;
    private String marca;
    private float precioCompra;
    private float precioVenta;
    private int existencias;

    //Constructor por default
    public Producto(){
        idProd = 0;
        codigo = "";
        nombre = "";
        marca = "";
        precioCompra = 0;
        precioVenta = 0;
        existencias = 0;
    }
    
    //Constructor
    public Producto(int idProd, String codigo, String nombre, String marca, float precioCompra, float precioVenta, int existencias) {
        this.idProd = idProd;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", existencias=" + existencias + '}';
    }
}
