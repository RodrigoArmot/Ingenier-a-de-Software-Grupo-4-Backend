package pucp.edu.pe.tikea.tikeabackend.model.solicitud;

public enum TipoOperacionCambio {
    DEVOLUCION("Devolucion","La operacion determianda será para devolucion"),
    COBRO("Cobro","La operacion determianda será para cobro de la diferencia");

    private final String descripcion;
    private final String nombre;

    TipoOperacionCambio(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
