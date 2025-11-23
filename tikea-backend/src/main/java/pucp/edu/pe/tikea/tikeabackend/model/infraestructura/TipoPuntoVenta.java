package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

public enum TipoPuntoVenta {
    TAQUILLAFISICA("Taquilla fisica", "Se compra por medio de las taquillas fisicas"),
    WEB("Web", "Se compra por la plataforma web");

    private final String nombre;
    private final String descripcion;

    TipoPuntoVenta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
