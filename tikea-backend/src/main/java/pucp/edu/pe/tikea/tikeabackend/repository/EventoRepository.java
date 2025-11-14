package pucp.edu.pe.tikea.tikeabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pucp.edu.pe.tikea.tikeabackend.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
// Importamos el DTO correcto
import pucp.edu.pe.tikea.tikeabackend.DTO.ReporteEventoDetalle;
import pucp.edu.pe.tikea.tikeabackend.model.Evento;

import java.time.LocalDate;
import java.util.List;
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    @Query("SELECT new pucp.edu.pe.tikea.tikeabackend.DTO.ReporteEventoDetalle( " +
            "e.nombreEvento, " +    // Nombre del Evento
            "e.fecha, " +             // 1. Fecha
            "e.aforoTotal, " +        // 2. Aforo
            "COUNT(t.idTicketEspecifico), " + // 3. Tickets Vendidos
            "SUM(t.precioCompra), " + // 4. Ganancias Esperadas
            "SUM(t.precioCompra - COALESCE(t.descuentoAplicado, 0.0)) " + // 5. Ganancias Reales
            ") " +
            "FROM Evento e " +
            // LEFT JOIN VITAL para incluir eventos con 0 ventas
            "LEFT JOIN TicketEspecifico t ON t.evento = e " +
            "WHERE e.fecha BETWEEN :fechaInicio AND :fechaFin " + // Filtro por fecha de EVENTO
            // Agrupamos por los detalles del evento
            "GROUP BY e.idEvento, e.nombreEvento, e.fecha, e.aforoTotal " +
            "ORDER BY e.fecha") // Ordenamos por fecha
    List<ReporteEventoDetalle> generarReporteDetalladoPorFechaEvento(
            @Param("fechaInicio") LocalDate fechaInicio,
            @Param("fechaFin") LocalDate fechaFin
    );
}
