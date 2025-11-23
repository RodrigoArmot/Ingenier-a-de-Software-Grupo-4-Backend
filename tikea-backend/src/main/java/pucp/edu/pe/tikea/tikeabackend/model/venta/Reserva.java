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
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Cliente;
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Taquillero;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reserva")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReserva")
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idTaquillero")
    private Taquillero taquillero;

    @Column(name = "fechaHoraCreacion", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaHoraCreacion;

    @Column(name = "fechaHoraExpiracion")
    private LocalDateTime fechaHoraExpiracion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoEstado estado;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}
