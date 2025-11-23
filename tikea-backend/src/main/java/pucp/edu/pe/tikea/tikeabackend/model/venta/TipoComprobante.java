package pucp.edu.pe.tikea.tikeabackend.model.venta;

public enum TipoComprobante {
    BOLETA("Boleta","El tipo de comprobante de pago será una boleta"),
    FACTURA("Factura","El tipo de comprobante de pago será una factura");

    private final String descripcion;
    private final String nombre;

    TipoComprobante(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
