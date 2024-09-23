package com.bill.springbootsoapapi.model;

import com.bill.springbootsoapapi.enums.Currency;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;


/**
 * @author Bill.Lin 2024/9/23
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
        "name",
        "population",
        "capital",
        "currency"
})
public class Country {

    @XmlElement(required = true)
    private String name;

    @XmlElement(required = true)
    private int population;

    @XmlElement(required = true)
    private String capital;

    @XmlElement(required = true)
    private Currency currency;
}