package pucp.edu.pe.tikea.tikeabackend.repository.venta;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pucp.edu.pe.tikea.tikeabackend.model.venta.Reserva;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

    List<Reserva> findByCliente_IdUsuario(Integer idUsuario);
    List<Reserva> findByActivo(Integer activo);
    List<Reserva> findByTaquillero_IdUsuario(Integer idUsuario);
}
