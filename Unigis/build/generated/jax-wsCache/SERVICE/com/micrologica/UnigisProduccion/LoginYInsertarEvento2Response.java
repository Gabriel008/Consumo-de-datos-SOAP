
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
 *         &lt;element name="LoginYInsertarEvento2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "loginYInsertarEvento2Result"
})
@XmlRootElement(name = "LoginYInsertarEvento2Response")
public class LoginYInsertarEvento2Response {

    @XmlElement(name = "LoginYInsertarEvento2Result")
    protected int loginYInsertarEvento2Result;

    /**
     * Obtiene el valor de la propiedad loginYInsertarEvento2Result.
     * 
     */
    public int getLoginYInsertarEvento2Result() {
        return loginYInsertarEvento2Result;
    }

    /**
     * Define el valor de la propiedad loginYInsertarEvento2Result.
     * 
     */
    public void setLoginYInsertarEvento2Result(int value) {
        this.loginYInsertarEvento2Result = value;
    }

}
