package appinventario;

public class Producto {
    
    //Atributos
    private String codigo;
    private String nombre;
    private String marca;
    private float  precioCompra;
    private float  precioVenta;
    private int    existencias;

    //Constructor por default
    public Producto (){
        codigo       = "";
        nombre       = "";
        marca        = "";
        precioCompra = 0;
        precioVenta  = 0;
        existencias  = 0;
    }
    
    //Constructor
    public Producto ( String codigo, String nombre, String marca, float precioCompra, float precioVenta, int existencias ) {
        this.codigo       = codigo;
        this.nombre       = nombre;
        this.marca        = marca;
        this.precioCompra = precioCompra;
        this.precioVenta  = precioVenta;
        this.existencias  = existencias;
    }

    public String getCodigo () {
        return codigo;
    }

    public void setCodigo ( String codigo ) {
        this.codigo = codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca ( String marca ) {
        this.marca = marca;
    }

    public float getPrecioCompra () {
        return precioCompra;
    }

    public void setPrecioCompra ( float precioCompra ) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta () {
        return precioVenta;
    }

    public void setPrecioVenta ( float precioVenta ) {
        this.precioVenta = precioVenta;
    }

    public int getExistencias () {
        return existencias;
    }

    public void setExistencias ( int existencias ) {
        this.existencias = existencias;
    }
}
