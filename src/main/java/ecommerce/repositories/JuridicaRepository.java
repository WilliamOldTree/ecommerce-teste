package ecommerce.repositories;

import ecommerce.entities.Juridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuridicaRepository extends JpaRepository<Juridica, Long> {
}
