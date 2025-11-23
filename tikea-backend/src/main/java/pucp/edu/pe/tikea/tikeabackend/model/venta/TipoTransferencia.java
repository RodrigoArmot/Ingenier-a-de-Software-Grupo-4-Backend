package pucp.edu.pe.tikea.tikeabackend.model.venta;

public enum TipoTransferencia {
    APROBADA("Aprobada","La transferencia esta aprobada para su finalizacion"),
    DENEGADA("Denegada","La transferencia no esta aprobada por decicion de la pasarela de pago"),
    PENDIENTE("Pendiente","La transferencia esta en proceso");

    private final String descripcion;
    private final String nombre;

    TipoTransferencia(String nombre,String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {return descripcion;}

    public String getNombre() {return nombre;}
}
