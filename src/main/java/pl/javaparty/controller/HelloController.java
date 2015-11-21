package pl.javaparty.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javaparty.model.Country;
import pl.javaparty.service.CountryService;

import java.util.List;

/**
 * Created by evelan on 11/21/15.
 */
@Controller
@Log4j
public class HelloController {

    @Autowired
    CountryService countryService;

    @RequestMapping("/")
    public String index(Model model) {
        log.info("*******index*******");

        Country country = new Country();

        country.setName("Polska");
        country.setPopulation((long) 38000000);

//        countryService.save(country);

        Pageable pageable = new PageRequest(0, 2, new Sort("population"));
        Page<Country> countries = countryService.findAll(pageable);
        model.addAttribute("countries", countries);

        return "index";
    }

}
