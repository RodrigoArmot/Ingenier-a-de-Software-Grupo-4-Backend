package pucp.edu.pe.tikea.tikeabackend.model.infraestructura;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import pucp.edu.pe.tikea.tikeabackend.model.promocion.Promocion;
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Gestor;
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Productor;

@Entity
@Table(name = "Evento")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvento")
    private Integer idEvento;

    @ManyToOne
    @JoinColumn(name = "idEstablecimiento", nullable = false)
    private Establecimiento establecimiento;

    @ManyToOne
    @JoinColumn(name = "idProductor", nullable = false)
    private Productor productor;

    @ManyToOne
    @JoinColumn(name = "idGestor", nullable = false)
    private Gestor gestor;

    @Column(name = "nombreEvento", nullable = false)
    private String nombreEvento;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private CategoriaEvento categoria;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "horaInicio")
    private LocalTime horaInicio;

    @Column(name = "horaFin")
    private LocalTime horaFin;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoEvento estado;

    @Column(name = "aforoTotal")
    private int aforoTotal;

    @Column(name = "activo", insertable = false)
    @Generated(GenerationTime.INSERT)
    @ColumnDefault("1")
    private int activo;

    @OneToMany(mappedBy = "evento")
    private List<Promocion> promociones;

    public boolean estActivo(){
        return this.activo == 1;
    }
}
