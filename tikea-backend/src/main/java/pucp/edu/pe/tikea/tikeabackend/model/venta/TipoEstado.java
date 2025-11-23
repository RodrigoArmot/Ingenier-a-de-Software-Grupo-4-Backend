package pucp.edu.pe.tikea.tikeabackend.model.venta;

public enum TipoEstado {
    BLOQUEADO("Bloqueado","La reserva se encuentra bloqueado por algun proeceso, como la devolucion o cambio"),
    LIBERADO("Liberado","La reserva está libre para su utilizacion"),
    CONFIRMADO("Confirmado","La reserva se encuentra confirmado segun las indicaciones establecidas dentro de la reserva");

    private final String descripcion;
    private final String nombre;

    TipoEstado(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
