package pucp.edu.pe.tikea.tikeabackend.model.usuarios;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import pucp.edu.pe.tikea.tikeabackend.model.Usuario;

import java.time.LocalDateTime;

@Entity
@Table(name = "Productor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
public class Productor extends Usuario {
    @ManyToOne
    @JoinColumn(name = "idGestor")
    private Gestor gestor;
    private String razonSocial;
    private String RUC;
    private String direccionFisica;
    @Column(name = "TipoEstadoProductor")
    private TipoEstadoProductor estadoProductor;
    @Column(name = "documentacionAdjunta")
    @Lob
    private byte[] documentacionFisica;
    private int localesRegistrados;
    private int eventosRegistrados;
    private int promocionesCreadas;
    @CreationTimestamp
    private LocalDateTime fechaVerificacion;
}
