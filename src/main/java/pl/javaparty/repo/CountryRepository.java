package pl.javaparty.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javaparty.model.Country;

/**
 * Created by evelan on 11/21/15.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Page<Country> findAll(Pageable pageable);
}
