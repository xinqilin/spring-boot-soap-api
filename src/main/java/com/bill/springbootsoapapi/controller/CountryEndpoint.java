package com.bill.springbootsoapapi.controller;

import com.bill.springbootsoapapi.dao.CountryDao;
import com.bill.springbootsoapapi.model.Country;
import com.bill.springbootsoapapi.model.CountryRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Bill.Lin 2024/9/23
 */
@Log4j2
@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private final CountryDao countryDao;

    public CountryEndpoint(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public String getCountry(@RequestPayload CountryRequest request) {
        log.info("request: {}", request);
        return countryDao.findCountry(request.getName())
                .map(Country::capital)
                .orElse("Country not found");
    }
}
