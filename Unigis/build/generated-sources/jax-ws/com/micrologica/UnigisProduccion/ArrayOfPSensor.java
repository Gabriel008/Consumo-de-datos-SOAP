
package com.micrologica.UnigisProduccion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPSensor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPSensor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pSensor" type="{http://unisolutions.com.ar/}pSensor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPSensor", propOrder = {
    "pSensor"
})
public class ArrayOfPSensor {

    @XmlElement(nillable = true)
    protected List<PSensor> pSensor;

    /**
     * Gets the value of the pSensor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pSensor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPSensor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSensor }
     * 
     * 
     */
    public List<PSensor> getPSensor() {
        if (pSensor == null) {
            pSensor = new ArrayList<PSensor>();
        }
        return this.pSensor;
    }

}
