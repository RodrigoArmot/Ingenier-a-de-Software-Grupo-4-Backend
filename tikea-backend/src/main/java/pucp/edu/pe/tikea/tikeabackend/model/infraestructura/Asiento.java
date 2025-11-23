package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "Asiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
public class Asiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsiento")
    private Integer idAsiento;

    @ManyToOne
    @JoinColumn(name = "idZona", nullable = false)
    private Zona zona;

    @Column(name = "columnaAsiento")
    private String columnaAsiento;

    @Column(name = "filaAsiento")
    private String filaAsiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoEstadoAsiento estado;

    @Column(name = "costo")
    private Double costo;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}
