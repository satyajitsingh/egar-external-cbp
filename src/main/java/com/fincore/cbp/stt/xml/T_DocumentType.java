//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.05 at 09:15:23 AM GMT 
//


package com.fincore.cbp.stt.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="T_DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="IdentityCard"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "T_DocumentType")
@XmlEnum
public enum T_DocumentType {

    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("IdentityCard")
    IDENTITY_CARD("IdentityCard"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    T_DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static T_DocumentType fromValue(String v) {
        for (T_DocumentType c: T_DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
