
package com.micrologica.UnigisProduccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginYInsertarEventosResult" type="{http://unisolutions.com.ar/}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginYInsertarEventosResult"
})
@XmlRootElement(name = "LoginYInsertarEventosResponse")
public class LoginYInsertarEventosResponse {

    @XmlElement(name = "LoginYInsertarEventosResult")
    protected ArrayOfInt loginYInsertarEventosResult;

    /**
     * Obtiene el valor de la propiedad loginYInsertarEventosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLoginYInsertarEventosResult() {
        return loginYInsertarEventosResult;
    }

    /**
     * Define el valor de la propiedad loginYInsertarEventosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLoginYInsertarEventosResult(ArrayOfInt value) {
        this.loginYInsertarEventosResult = value;
    }

}
