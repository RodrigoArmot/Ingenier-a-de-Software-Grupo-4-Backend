package pucp.edu.pe.tikea.tikeabackend.model.venta;

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
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.TipoEstadoAproDes;

import java.time.LocalDateTime;

@Entity
@Table(name = "MedioDePago")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
public class MedioDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedioDePago")
    private Integer idMedioDePago;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoPago")
    private TipoMedioDePago tipoPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoEstadoAproDes estado;

    @Column(name = "comision")
    private Double comision;

    @Column(name = "pasarelaIntegracion")
    private String pasarelaIntegracion;

    @Column(name = "validacionSunat")
    private Boolean validacionSunat;

    @Column(name = "fechaCreacion", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreacion;

    @Column(name = "fechaUltimaCreacion", insertable = false, updatable = false)
    @Generated(GenerationTime.ALWAYS)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaUltimaCreacion;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}
