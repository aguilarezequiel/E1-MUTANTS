package desarrollo.primer_parcial.controllers;

import desarrollo.primer_parcial.dto.HumanoDTO;
import desarrollo.primer_parcial.dto.StatsDTO; // Importa la clase StatsDTO
import desarrollo.primer_parcial.entities.Humano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import desarrollo.primer_parcial.services.HumanoService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/humano/mutant")
public class HumanoController {

    @Autowired
    private HumanoService humanoService;

    @PostMapping("")
    public ResponseEntity<String> checkMutant(@RequestBody HumanoDTO humanoDTO) {
        try {
            boolean isMutant = humanoService.isMutant(humanoDTO);
            return isMutant
                    ? ResponseEntity.status(HttpStatus.OK).body("Mutant detected.")
                    : ResponseEntity.status(HttpStatus.FORBIDDEN).body("Not a mutant.");
        } catch (IllegalArgumentException e) {
            // Devuelve un 400 si ocurre una excepción de validación
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            // En caso de errores inesperados, devuelve un 500
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Humano>> getAllHumans() {
        List<Humano> humanos = humanoService.getAllHumans();
        return ResponseEntity.status(HttpStatus.OK).body(humanos);
    }

    @GetMapping("/stats") // Nuevo endpoint para estadísticas
    public ResponseEntity<StatsDTO> getStats() {
        StatsDTO stats = humanoService.getStats();
        return ResponseEntity.status(HttpStatus.OK).body(stats);
    }
}
