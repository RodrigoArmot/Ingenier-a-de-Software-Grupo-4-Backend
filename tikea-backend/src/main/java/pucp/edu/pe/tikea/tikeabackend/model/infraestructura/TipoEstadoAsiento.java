package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

public enum TipoEstadoAsiento {

    DISPONIBLE("Enumerada","El asiento se encuentra libre para poder se comprado"),
    OCUPADO("Ocupado","El asiento ya esta comprado no se puede usar para una nueva compra"),
    BLOQUEADO("Bloqueado","El asiento no esta disponible, está en medio de un proceso de compra o no esta habilitado por motivos externos a ventas");

    private final String Descripcion;
    private final String Nombre;

    TipoEstadoAsiento(String Nombre, String Descripcion) {
        this.Descripcion = Descripcion;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }
}
