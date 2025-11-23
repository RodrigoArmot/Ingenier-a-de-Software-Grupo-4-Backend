package pucp.edu.pe.tikea.tikeabackend.model.venta;

public enum TipoMedioDePago {
    VISAMASTERCARD("Visa - Mastercard","El medio de pago es compatible con visa o mastercard"),
    YAPEPLIN("Yape - Plin","El medio de pago es compatible con yape o plin"),
    EFECTIVO("Efectivo","El medio de pago es de forma fisica");

    private final String descripcion;
    private final String nombre;

    TipoMedioDePago(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
