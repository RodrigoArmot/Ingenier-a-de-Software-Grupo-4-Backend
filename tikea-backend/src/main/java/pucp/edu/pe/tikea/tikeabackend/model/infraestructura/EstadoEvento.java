package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

public enum EstadoEvento {
    CANCELADO("Cancelado", "Evento cancelado"),
    PENDIENTE_VALIDACION("Pendiente de validacion","La persona responsable de la autorizacion aun lo esta evaluando"),
    FINALIZADO("Finalizado", "Evento finalizado"),
    AGOTADO("Agotado", "Evento con entradas agotadas"),
    RECHAZADO("Rechazado","La persona responsable ha rechazado la accion"),
    PUBLICADO("Publicado", "La persona responsable ha autorizado la accion y el evento ha sido publicado");


    private final String nombre;
    private final String descripcion;

    EstadoEvento(String nombre, String descripcion) {
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
