package desarrollo.primer_parcial.repositories;

import desarrollo.primer_parcial.entities.Humano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanoRepository extends JpaRepository<Humano, Long> {
}
