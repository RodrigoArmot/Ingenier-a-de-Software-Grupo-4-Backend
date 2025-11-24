package pucp.edu.pe.tikea.tikeabackend.repository.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.TicketEspecifico;
import pucp.edu.pe.tikea.tikeabackend.model.infraestructura.TipoEstadoTicket;

import java.util.List;

@Repository
public interface TicketSpecificoRepository extends JpaRepository<TicketEspecifico, Integer> {
    List<TicketEspecifico> findByActivo(Integer activo);

    List<TicketEspecifico> findByCliente_IdUsuarioAndActivo(Integer idCliente, Integer activo);

    List<TicketEspecifico> findByZona_IdZonaAndActivo(Integer idZona, Integer activo);

    List<TicketEspecifico> findByEvento_IdEventoAndActivo(Integer idEvento, Integer activo);

    List<TicketEspecifico> findByEvento_IdEventoAndZona_IdZonaAndActivo(Integer idEvento, Integer idZona, Integer activo);

    List<TicketEspecifico> findByEstadoAndActivo(TipoEstadoTicket estado, Integer activo);
}
