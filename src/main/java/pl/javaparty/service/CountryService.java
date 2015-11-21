package pl.javaparty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.javaparty.model.Country;
import pl.javaparty.repo.CountryRepository;

import java.util.List;

/**
 * Created by evelan on 11/21/15.
 */
@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Page<Country> findAll(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

    public void save(Country entity) {
        countryRepository.saveAndFlush(entity);
    }


}
