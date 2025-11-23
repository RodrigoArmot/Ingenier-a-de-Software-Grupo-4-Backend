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
import pucp.edu.pe.tikea.tikeabackend.model.venta.Reserva;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transaccion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransaccion")
    private Integer idTransaccion;

    @ManyToOne
    @JoinColumn(name = "idMedioDePago", nullable = false)
    private MedioDePago medioDePago;

    @OneToOne
    @JoinColumn(name = "idReserva")
    private Reserva reserva;

    @Column(name = "numeroTransaccion")
    private String numeroTransaccion;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoTransferencia estado;

    @Column(name = "fechaTransaccion", insertable = false, updatable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime fechaTransaccion;

    @Column(name = "resultado")
    private String resultado;

    @Column(name = "ipOrigen")
    private String ipOrigen;

    @Enumerated(EnumType.STRING)
    @Column(name = "moneda")
    private TipoMoneda moneda;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private Integer activo;

    public boolean estActivo() {
        return this.activo == 1;
    }
}
