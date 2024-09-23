package com.bill.springbootsoapapi.dao;

import com.bill.springbootsoapapi.enums.Currency;
import com.bill.springbootsoapapi.model.Country;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bill.Lin 2024/9/23
 */
@Component
public class CountryDao {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country harryPotterI = new Country();
        harryPotterI.setCapital("巴黎");
        harryPotterI.setName("法國");
        harryPotterI.setCurrency(Currency.EUR);
        harryPotterI.setPopulation(198555);

        countries.put(harryPotterI.getName(), harryPotterI);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }


}
