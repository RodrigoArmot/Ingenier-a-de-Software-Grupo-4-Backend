// src/main/java/pucp/edu/pe/tikea/tikeabackend/controler/ReporteController.java
package pucp.edu.pe.tikea.tikeabackend.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pucp.edu.pe.tikea.tikeabackend.DTO.ReporteEventoDTO;
import pucp.edu.pe.tikea.tikeabackend.DTO.ReporteEventoDetalle;
import pucp.edu.pe.tikea.tikeabackend.DTO.ReporteRequestDTO;
import pucp.edu.pe.tikea.tikeabackend.services.ReporteService;

import java.util.List;

@RestController
@RequestMapping("/api/reportes") // Ruta base para todos los reportes

@CrossOrigin(origins = "http://localhost:4200")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;


    @PostMapping("/eventos")
    public ResponseEntity<List<ReporteEventoDTO>> generarReporteDeEventos(
            @RequestBody ReporteRequestDTO requestDTO) {

        List<ReporteEventoDTO> reporte = reporteService.generarReporteEventos(requestDTO);
        return ResponseEntity.ok(reporte);
    }
    @PostMapping("/eventos-por-fecha-realizacion") // Endpoint actualizado
    public ResponseEntity<List<ReporteEventoDetalle>> generarReporteDetalladoDeEventos(
            @RequestBody ReporteRequestDTO requestDTO) {

        // Llama al nuevo método del servicio
        List<ReporteEventoDetalle> reporte = reporteService.generarReporteDetalladoPorFechaEvento(requestDTO);
        return ResponseEntity.ok(reporte);
    }
}