package com.bill.springbootsoapapi.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bill.Lin 2024/9/23
 */

@XmlRootElement(name = "CountryRequest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryRequest {

    @XmlElement(name = "name", required = true)
    private String name;

}
