package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "Zona")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
public class Zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idZona")
    private Integer idZona;

    @ManyToOne
    @JoinColumn(name = "idEstablecimiento", nullable = false)
    private Establecimiento establecimiento;

    @Column(name = "nombreZona")
    private String nombreZona;

    @Column(name = "aforo")
    private int aforo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoZona tipo;

    @Column(name = "distribucionAsientos")
    private String distribucionAsientos;

    @Column(name = "restriccionesSeguridad")
    private String restriccionesSeguridad;

    @Column(name = "asientosDisponibles")
    private int asientosDisponibles;

    @Column(name = "asientosOcupados")
    private int asientosOcupados;

    @Column(name = "fechaCreacion", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreacion;

    @Column(name = "fechaUltimaModificacion", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaUltimaModificacion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}
