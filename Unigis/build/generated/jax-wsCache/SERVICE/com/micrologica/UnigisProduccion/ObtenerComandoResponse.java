
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
 *         &lt;element name="ObtenerComandoResult" type="{http://unisolutions.com.ar/}Comando" minOccurs="0"/>
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
    "obtenerComandoResult"
})
@XmlRootElement(name = "ObtenerComandoResponse")
public class ObtenerComandoResponse {

    @XmlElement(name = "ObtenerComandoResult")
    protected Comando obtenerComandoResult;

    /**
     * Obtiene el valor de la propiedad obtenerComandoResult.
     * 
     * @return
     *     possible object is
     *     {@link Comando }
     *     
     */
    public Comando getObtenerComandoResult() {
        return obtenerComandoResult;
    }

    /**
     * Define el valor de la propiedad obtenerComandoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Comando }
     *     
     */
    public void setObtenerComandoResult(Comando value) {
        this.obtenerComandoResult = value;
    }

}
