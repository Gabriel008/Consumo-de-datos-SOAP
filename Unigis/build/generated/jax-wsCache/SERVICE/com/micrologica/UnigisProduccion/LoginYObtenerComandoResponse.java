
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
 *         &lt;element name="LoginYObtenerComandoResult" type="{http://unisolutions.com.ar/}Comando" minOccurs="0"/>
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
    "loginYObtenerComandoResult"
})
@XmlRootElement(name = "LoginYObtenerComandoResponse")
public class LoginYObtenerComandoResponse {

    @XmlElement(name = "LoginYObtenerComandoResult")
    protected Comando loginYObtenerComandoResult;

    /**
     * Obtiene el valor de la propiedad loginYObtenerComandoResult.
     * 
     * @return
     *     possible object is
     *     {@link Comando }
     *     
     */
    public Comando getLoginYObtenerComandoResult() {
        return loginYObtenerComandoResult;
    }

    /**
     * Define el valor de la propiedad loginYObtenerComandoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Comando }
     *     
     */
    public void setLoginYObtenerComandoResult(Comando value) {
        this.loginYObtenerComandoResult = value;
    }

}
