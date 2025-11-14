package pucp.edu.pe.tikea.tikeabackend.DTO.infraestructura;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.CategoriaEvento;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.EstadoEvento;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoRegistroRequest {

    @NotNull
    private Integer idEstablecimiento;

    @NotNull
    private Integer idProductor;

    @NotNull
    private Integer idGestor;

    @NotBlank
    private String nombreEvento;

    private CategoriaEvento categoria;

    @NotNull
    private LocalDate fecha;

    private LocalTime horaInicio;
    private LocalTime horaFin;

    private EstadoEvento estado;

    @Positive
    private int aforoTotal;
}
