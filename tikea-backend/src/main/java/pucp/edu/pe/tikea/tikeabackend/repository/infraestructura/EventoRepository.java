package pucp.edu.pe.tikea.tikeabackend.repository.infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.Evento;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.CategoriaEvento;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.EstadoEvento;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.Establecimiento;
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Productor;
import pucp.edu.pe.tikea.tikeabackend.model.usuarios.Gestor;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

    // Buscar un Evento por nombre (case-insensitive)
    Optional<Evento> findByNombreEventoIgnoreCase(String nombreEvento);

    // Buscar Eventos por Establecimiento
    List<Evento> findByEstablecimiento(Establecimiento establecimiento);

    // Buscar Eventos por Productor
    List<Evento> findByProductor(Productor productor);

    // Buscar Eventos por Gestor
    List<Evento> findByGestor(Gestor gestor);

    // Buscar Eventos por categoría
    List<Evento> findByCategoria(CategoriaEvento categoria);

    // Buscar Eventos por estado
    List<Evento> findByEstado(EstadoEvento estado);

    // Buscar Eventos por fecha
    List<Evento> findByFecha(LocalDate fecha);

    // Buscar Eventos entre fechas
    List<Evento> findByFechaBetween(LocalDate fechaInicio, LocalDate fechaFin);

    // Buscar Eventos activos
    List<Evento> findByActivo(Integer activo);

    // Buscar Eventos activos de un Establecimiento
    List<Evento> findByActivoAndEstablecimiento(Integer activo, Establecimiento establecimiento);

    // Buscar Eventos activos de un Productor
    List<Evento> findByActivoAndProductor(Integer activo, Productor productor);

    // Buscar Eventos activos de un Gestor
    List<Evento> findByActivoAndGestor(Integer activo, Gestor gestor);

    // Buscar Eventos por estado y activos
    List<Evento> findByEstadoAndActivo(EstadoEvento estado, Integer activo);

    // Buscar Eventos por categoría y activos
    List<Evento> findByCategoriaAndActivo(CategoriaEvento categoria, Integer activo);

    // Contar Eventos por Establecimiento
    long countByEstablecimiento(Establecimiento establecimiento);

    // Contar Eventos por Productor
    long countByProductor(Productor productor);

    // Contar Eventos activos
    long countByActivo(Integer activo);
}
