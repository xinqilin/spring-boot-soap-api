package com.bill.springbootsoapapi.enums;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * @author Bill.Lin 2024/9/23
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {

    GBP,
    EUR,
    PLN;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }
}
