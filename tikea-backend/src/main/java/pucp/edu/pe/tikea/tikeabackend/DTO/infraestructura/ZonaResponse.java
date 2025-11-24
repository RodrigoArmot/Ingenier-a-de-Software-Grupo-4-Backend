package pucp.edu.pe.tikea.tikeabackend.DTO.infraestructura;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.TipoZona;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZonaResponse {
    private Integer idZona;
    private Integer idEstablecimiento;
    private String nombreZona;
    private int aforo;
    private TipoZona tipo;
    private String distribucionAsientos;
    private String restriccionesSeguridad;
    private int asientosDisponibles;
    private int asientosOcupados;
    private Double precio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimaModificacion;
    private Integer activo;
}
