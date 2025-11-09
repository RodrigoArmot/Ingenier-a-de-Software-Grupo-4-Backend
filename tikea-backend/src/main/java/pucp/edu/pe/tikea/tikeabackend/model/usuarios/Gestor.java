package pucp.edu.pe.tikea.tikeabackend.model.usuarios;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import pucp.edu.pe.tikea.tikeabackend.model.Usuario;

import java.time.LocalDateTime;

@Entity
@Table(name = "Gestor")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
public class Gestor extends Usuario {
    @Column(name = "areaGestion")
    private TipoArea areaGestion;
}
