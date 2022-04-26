package ecommerce.repositories;

import ecommerce.entities.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FisicaRepository extends JpaRepository<Fisica, Long> {
}
