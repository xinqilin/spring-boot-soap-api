package com.bill.springbootsoapapi.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

/**
 * @author Bill.Lin 2024/9/23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "country"
})
@XmlRootElement(name = "getCountryResponse", namespace = "http://www.baeldung.com/springsoap/gen")
public class GetCountryResponse {

    @XmlElement(required = true)
    private Country country;
}