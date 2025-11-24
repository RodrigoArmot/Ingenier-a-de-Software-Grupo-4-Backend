package pucp.edu.pe.tikea.tikeabackend.repository.infraestructura;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.Zona;

import java.util.List;

@Repository
public interface ZonaRepository extends JpaRepository<Zona, Integer> {
    List<Zona> findByEstablecimiento_IdEstablecimientoAndActivo(Integer idEstablecimiento, Integer activo);
}
