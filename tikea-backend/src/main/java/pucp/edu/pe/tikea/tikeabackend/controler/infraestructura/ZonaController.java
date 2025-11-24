package pucp.edu.pe.tikea.tikeabackend.controler.infraestructura;


import org.springframework.web.bind.annotation.*;
import pucp.edu.pe.tikea.tikeabackend.DTO.infraestructura.ZonaRequest;
import pucp.edu.pe.tikea.tikeabackend.DTO.infraestructura.ZonaResponse;
import pucp.edu.pe.tikea.tikeabackend.services.infraestructura.ZonaService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zonas")
public class ZonaController {

    private final ZonaService zonaService;

    public ZonaController(ZonaService zonaService) {
        this.zonaService = zonaService;
    }
    @PostMapping
    public ZonaResponse crearZona(@RequestBody ZonaRequest dto) {
        return zonaService.crearZona(dto);
    }

    @GetMapping
    public List<ZonaResponse> listarZonas() {
        return zonaService.listarZonas();
    }

    @GetMapping("/establecimiento/{idEstablecimiento}/activas")
    public List<ZonaResponse> listarActivasPorEstablecimiento(
            @PathVariable Integer idEstablecimiento) {
        return zonaService.listarZonasActivasPorEstablecimiento(idEstablecimiento);
    }

}
