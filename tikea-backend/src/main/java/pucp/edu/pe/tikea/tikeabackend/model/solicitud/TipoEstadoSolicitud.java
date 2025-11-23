package pucp.edu.pe.tikea.tikeabackend.model.solicitud;

public enum TipoEstadoSolicitud {
    PENDIENTE("Pendiente","La solicitud está en proceso de decision"),
    APROBADA("Aprobada","La solicitud está aprobado"),
    RECHAZADA("Rechazada","La solicitud está rechazada");

    private final String descripcion;
    private final String nombre;

    TipoEstadoSolicitud(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
