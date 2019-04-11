
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
 *         &lt;element name="ConsultarVehiculosEnViajeResult" type="{http://unisolutions.com.ar/}ArrayOfVehiculo" minOccurs="0"/>
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
    "consultarVehiculosEnViajeResult"
})
@XmlRootElement(name = "ConsultarVehiculosEnViajeResponse")
public class ConsultarVehiculosEnViajeResponse {

    @XmlElement(name = "ConsultarVehiculosEnViajeResult")
    protected ArrayOfVehiculo consultarVehiculosEnViajeResult;

    /**
     * Obtiene el valor de la propiedad consultarVehiculosEnViajeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehiculo }
     *     
     */
    public ArrayOfVehiculo getConsultarVehiculosEnViajeResult() {
        return consultarVehiculosEnViajeResult;
    }

    /**
     * Define el valor de la propiedad consultarVehiculosEnViajeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehiculo }
     *     
     */
    public void setConsultarVehiculosEnViajeResult(ArrayOfVehiculo value) {
        this.consultarVehiculosEnViajeResult = value;
    }

}
