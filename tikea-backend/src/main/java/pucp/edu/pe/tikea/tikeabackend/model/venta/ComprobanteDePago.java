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

import java.time.LocalDateTime;

@Entity
@Table(name = "ComprobanteDePago")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamicInsert
public class ComprobanteDePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComprobante")
    private Integer idComprobante;

    @OneToOne
    @JoinColumn(name = "idTransaccion", nullable = false, unique = true)
    private Transaccion transaccion;

    @Column(name = "numeroComprobante", nullable = false, unique = true)
    private String numeroComprobante;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoComprobante")
    private TipoComprobante tipoComprobante;

    @Column(name = "serie")
    private String serie;

    @Column(name = "fechaEmision")
    private LocalDateTime fechaEmision;

    @Column(name = "montoTotal")
    private Double montoTotal;

    @Column(name = "montoBruto")
    private Double montoBruto;

    @Column(name = "descuentosAplicados")
    private Double descuentosAplicados;

    @Column(name = "canjesAplicados")
    private Double canjesAplicados;

    @Column(name = "TotalDeReembolsos")
    private Double TotalDeReembolsos;

    @Column(name = "IngresosNetoEfectivo")
    private Double IngresosNetoEfectivo;

    @Column(name = "validacionSunat")
    private String validacionSunat;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private TipoTransferencia estado;

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