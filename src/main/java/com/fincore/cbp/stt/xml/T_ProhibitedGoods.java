//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.05 at 09:15:23 AM GMT 
//


package com.fincore.cbp.stt.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_ProhibitedGoods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ProhibitedGoods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}GoodsExist"/>
 *         &lt;element ref="{}GoodsDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ProhibitedGoods", propOrder = {
    "goodsExist",
    "goodsDetails"
})
public class T_ProhibitedGoods {

    @XmlElement(name = "GoodsExist")
    protected boolean goodsExist;
    @XmlElement(name = "GoodsDetails", required = true)
    protected String goodsDetails;

    /**
     * Gets the value of the goodsExist property.
     * 
     */
    public boolean isGoodsExist() {
        return goodsExist;
    }

    /**
     * Sets the value of the goodsExist property.
     * 
     */
    public void setGoodsExist(boolean value) {
        this.goodsExist = value;
    }

    /**
     * Gets the value of the goodsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDetails() {
        return goodsDetails;
    }

    /**
     * Sets the value of the goodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsDetails(String value) {
        this.goodsDetails = value;
    }

}