package com.bill.springbootsoapapi.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

/**
 * @author Bill.Lin 2024/9/23
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(name = "getCountryRequest", namespace = "http://www.baeldung.com/springsoap/gen")
public class GetCountryRequest {

    @XmlElement(required = true, namespace = "http://www.baeldung.com/springsoap/gen", name = "name")
    private String name;
}
