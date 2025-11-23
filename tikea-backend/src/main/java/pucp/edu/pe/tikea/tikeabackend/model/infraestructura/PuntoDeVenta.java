package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Entity
@Table(name = "PuntoDeVenta")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
public class PuntoDeVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPuntoDeVenta")
    private Integer idPuntoDeVenta;

    @Column(name = "nombrePuntoVenta")
    private String nombrePuntoVenta;

    @Column(name = "direccion")
    private String direccion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoEstadoAproDes estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoPuntoVenta tipo;

    @Column(name = "fechaInicioOperacion")
    private LocalDateTime fechaInicioOperacion;

    @Column(name = "fechaFinOperacion")
    private LocalDateTime fechaFinOperacion;

    @Column(name = "fechaCreacion", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreacion;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}