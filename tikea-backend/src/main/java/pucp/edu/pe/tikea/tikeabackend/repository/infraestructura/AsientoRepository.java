package pucp.edu.pe.tikea.tikeabackend.repository.infraestructura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.Asiento;

@Repository
public interface AsientoRepository extends JpaRepository<Asiento,Integer> {
}
