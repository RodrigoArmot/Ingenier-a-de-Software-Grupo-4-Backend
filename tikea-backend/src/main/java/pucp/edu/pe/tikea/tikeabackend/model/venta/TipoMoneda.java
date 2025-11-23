package pucp.edu.pe.tikea.tikeabackend.model.venta;

public enum TipoMoneda {
    SOL("Sol","La moneda que se va a usar será el Sol peruano"),
    DOLAR("Dolar","La moneda que se va a usar será el Dolar estadounidense");

    private final String descripcion;
    private final String nombre;

    TipoMoneda(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
