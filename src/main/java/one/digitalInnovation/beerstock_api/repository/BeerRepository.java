package one.digitalInnovation.beerstock_api.repository;

import one.digitalInnovation.beerstock_api.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
