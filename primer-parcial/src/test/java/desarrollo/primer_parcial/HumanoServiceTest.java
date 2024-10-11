package desarrollo.primer_parcial;

import desarrollo.primer_parcial.dto.HumanoDTO;
import desarrollo.primer_parcial.services.HumanoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HumanoServiceTest {

    private final HumanoService humanoService = new HumanoService();

    @Test
    public void testIsMutant() throws Exception {
        // Datos de prueba
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "ATGCGA",
                "CAGTGC",
                "TTGTAT",
                "AGAAGG",
                "CCCCTA",
                "TCACTG"
        });

        // Llamada al método que se está probando
        boolean result = humanoService.isMutant(humanoDTO);

        // Verificación de resultados
        assertTrue(result, "El ADN debe ser considerado mutante.");
    }

    @Test
    public void testIsNotMutant() throws Exception {
        // Datos de prueba
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "ATGCGT",
                "CAGTGC",
                "TTGTAT",
                "AGAAGG",
                "CCCTAA",
                "TCACTG"
        });

        // Llamada al método que se está probando
        boolean result = humanoService.isMutant(humanoDTO);

        // Verificación de resultados
        assertFalse(result, "El ADN debe ser considerado no mutante.");
    }
}
