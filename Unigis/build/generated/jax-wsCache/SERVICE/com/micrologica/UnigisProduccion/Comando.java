
package com.micrologica.UnigisProduccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Comando complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Comando">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EQUIPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMERO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comando", propOrder = {
    "cmd",
    "unidad",
    "equipo",
    "numero"
})
public class Comando {

    @XmlElement(name = "CMD")
    protected String cmd;
    @XmlElement(name = "UNIDAD")
    protected String unidad;
    @XmlElement(name = "EQUIPO")
    protected String equipo;
    @XmlElement(name = "NUMERO")
    protected int numero;

    /**
     * Obtiene el valor de la propiedad cmd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMD() {
        return cmd;
    }

    /**
     * Define el valor de la propiedad cmd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMD(String value) {
        this.cmd = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDAD() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDAD(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad equipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUIPO() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUIPO(String value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNUMERO() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNUMERO(int value) {
        this.numero = value;
    }

}
