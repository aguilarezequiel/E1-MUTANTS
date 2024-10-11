package desarrollo.primer_parcial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StatsDTO {
    private int count_mutant_dna;
    private int count_human_dna;
    private double ratio;
}
