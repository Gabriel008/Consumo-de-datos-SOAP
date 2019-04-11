
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
 *         &lt;element name="LoginYInsertarEventoResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "loginYInsertarEventoResult"
})
@XmlRootElement(name = "LoginYInsertarEventoResponse")
public class LoginYInsertarEventoResponse {

    @XmlElement(name = "LoginYInsertarEventoResult")
    protected int loginYInsertarEventoResult;

    /**
     * Obtiene el valor de la propiedad loginYInsertarEventoResult.
     * 
     */
    public int getLoginYInsertarEventoResult() {
        return loginYInsertarEventoResult;
    }

    /**
     * Define el valor de la propiedad loginYInsertarEventoResult.
     * 
     */
    public void setLoginYInsertarEventoResult(int value) {
        this.loginYInsertarEventoResult = value;
    }

}
