
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
 *         &lt;element name="AntiguaClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NuevaClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "antiguaClave",
    "nuevaClave"
})
@XmlRootElement(name = "CambiarClave")
public class CambiarClave {

    @XmlElement(name = "AntiguaClave")
    protected String antiguaClave;
    @XmlElement(name = "NuevaClave")
    protected String nuevaClave;

    /**
     * Obtiene el valor de la propiedad antiguaClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiguaClave() {
        return antiguaClave;
    }

    /**
     * Define el valor de la propiedad antiguaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiguaClave(String value) {
        this.antiguaClave = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaClave() {
        return nuevaClave;
    }

    /**
     * Define el valor de la propiedad nuevaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaClave(String value) {
        this.nuevaClave = value;
    }

}
