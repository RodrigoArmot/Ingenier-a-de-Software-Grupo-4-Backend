package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

public enum TipoZona {
    ENUMERADA("Enumerada","La zona posee la capacidad de tener sitios enumerados"),
    LIBRE("Libre","La zona solo es un espacio en donde la cantidad de sitios no esta definida");

    private final String Descripcion;
    private final String Nombre;

    TipoZona(String Nombre, String Descripcion) {
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
