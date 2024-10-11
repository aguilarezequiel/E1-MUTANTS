package desarrollo.primer_parcial.entities;

import desarrollo.primer_parcial.utils.MutantChecker;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Humano")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Humano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "adn", columnDefinition = "TEXT")
    private String adnStr;

    @Column(name = "isMutant")
    private boolean isMutant;

    public void setAdn(String[] adnStrArray) {
        this.adnStr = String.join("", adnStrArray); // Mejor forma de convertir array a String
    }

    public String[] getAdn() {
        int n = (int) Math.sqrt(adnStr.length());
        String[] adnArray = new String[n];
        for (int i = 0; i < n; i++) {
            adnArray[i] = adnStr.substring(i * n, (i + 1) * n);
        }
        return adnArray;
    }

    public boolean isMutant() {
        String[] adn = getAdn();
        MutantChecker mutantChecker = new MutantChecker();
        return mutantChecker.isMutant(adn);
    }

}
