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
    public void testIsMutant_dnaMutant1() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "AAAA", // Secuencia horizontal de A's
                "CCCC", // Secuencia horizontal de C's
                "TCAG",
                "GGTC"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertTrue(result, "El ADN debe ser considerado mutante.");
    }

    @Test
    public void testIsNotMutant_dnaNoMutant1() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "AAAT",
                "AACC",
                "AAAC",
                "CGGG"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertFalse(result, "El ADN debe ser considerado no mutante.");
    }

    @Test
    public void testIsMutant_dnaMutant2() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "TGAC",
                "AGCC",
                "TGAC",
                "GGTC"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertTrue(result, "El ADN debe ser considerado mutante.");
    }

    @Test
    public void testIsNotMutant_dnaNoMutant2() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "AAAA",
                "AAAA",
                "AAAA",
                "AAAA"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertFalse(result, "El ADN debe ser considerado no mutante.");
    }

    @Test
    public void testIsNotMutant_dnaNoMutant3() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "TGAC",
                "ATCC",
                "TAAG",
                "GGTC"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertFalse(result, "El ADN debe ser considerado no mutante.");
    }

    @Test
    public void testIsMutant_dnaMutant3() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "TCGGTGATA",
                "TGATCCTTT",
                "TACGAGTGA",
                "AAATGTACT",
                "ACGAGTGCT",
                "AGACACTAG",
                "GAACTCCAA",
                "ACTACGACC",
                "TGAGTATCC"
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertTrue(result, "El ADN debe ser considerado mutante.");
    }

    @Test
    public void testIsMutant_dnaMutant4() throws Exception {
        HumanoDTO humanoDTO = new HumanoDTO();
        humanoDTO.setDna(new String[] {
                "TTTTTTTTT", // Secuencia horizontal de T's
                "TTTTTTTTT",
                "TTTTTTTTT",
                "TTTTTTTTT",
                "CCGACCATG",
                "GGCACTCCA",
                "AGGACACTA",
                "CAAAGGCAT",
                "GCAGTCCCC" // Secuencia vertical de C's
        });

        boolean result = humanoService.isMutant(humanoDTO);
        assertTrue(result, "El ADN debe ser considerado mutante.");
    }
}
