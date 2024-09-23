package com.bill.springbootsoapapi.dao;

import com.bill.springbootsoapapi.model.Country;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Bill.Lin 2024/9/23
 */
@Component
public class CountryDao {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        countries.put("Spain", new Country("Spain", 46704314, "Madrid"));
        countries.put("Poland", new Country("Poland", 38186860, "Warsaw"));
        countries.put("United Kingdom", new Country("United Kingdom", 63705000, "London"));
    }

    public Optional<Country> findCountry(String name) {
        return Optional.ofNullable(countries.get(name));
    }


}
