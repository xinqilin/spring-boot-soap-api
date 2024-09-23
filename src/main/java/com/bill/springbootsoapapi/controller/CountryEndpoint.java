package com.bill.springbootsoapapi.controller;

import com.bill.springbootsoapapi.dao.CountryDao;
import com.bill.springbootsoapapi.model.GetCountryRequest;
import com.bill.springbootsoapapi.model.GetCountryResponse;
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
    public @ResponsePayload GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        log.info("request: {}", request);
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryDao.findCountry(request.getName()));

        log.info("response: {}", response);
        return response;
    }

    //    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
//    @ResponsePayload
//    public String getCountry(@RequestPayload  request) {
//        log.info("request: {}", request);
//        CountryRequest countryRequest = convertXmlToCountryRequest(request);
//        return countryDao.findCountry(countryRequest.getName())
//                .map(Country::capital)
//                .orElse("Country not found");
//    }

//    private CountryRequest convertXmlToCountryRequest(String xmlRequest) {
//        try {
//            JAXBContext context = JAXBContext.newInstance(CountryRequest.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            return (CountryRequest) unmarshaller.unmarshal(new StringReader(xmlRequest));
//        } catch (JAXBException e) {
//            log.error("Error converting XML to CountryRequest", e);
//            throw new RuntimeException("Error converting XML to CountryRequest", e);
//        }
//    }
}
