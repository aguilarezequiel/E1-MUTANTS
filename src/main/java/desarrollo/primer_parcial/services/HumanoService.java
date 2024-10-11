package desarrollo.primer_parcial.services;

import desarrollo.primer_parcial.dto.HumanoDTO;
import desarrollo.primer_parcial.dto.StatsDTO;
import desarrollo.primer_parcial.entities.Humano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import desarrollo.primer_parcial.repositories.HumanoRepository;

import java.util.List;

@Service
public class HumanoService {

    @Autowired
    private HumanoRepository humanoRepository;

    private int countMutantDna = 0;
    private int countHumanDna = 0;

    public boolean isMutant(HumanoDTO humanoDTO) throws Exception {
        Humano humano = new Humano();
        humano.setAdn(humanoDTO.getDna());
        boolean isMutant = humano.isMutant();

        // Guardamos en la base de datos si es mutante o no
        humanoRepository.save(humano);

        // Actualizamos contadores
        if (isMutant) {
            countMutantDna++;
        } else {
            countHumanDna++;
        }
        return isMutant;
    }

    public List<Humano> getAllHumans() {
        return humanoRepository.findAll();
    }

    public StatsDTO getStats() {
        double ratio = countHumanDna > 0 ? (double) countMutantDna / ((double) countMutantDna + countHumanDna): 0;
        return new StatsDTO(countMutantDna, countHumanDna, ratio);
    }
}
