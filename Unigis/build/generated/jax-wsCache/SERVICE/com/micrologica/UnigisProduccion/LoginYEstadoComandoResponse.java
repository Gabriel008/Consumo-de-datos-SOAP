
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
 *         &lt;element name="LoginYEstadoComandoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "loginYEstadoComandoResult"
})
@XmlRootElement(name = "LoginYEstadoComandoResponse")
public class LoginYEstadoComandoResponse {

    @XmlElement(name = "LoginYEstadoComandoResult")
    protected boolean loginYEstadoComandoResult;

    /**
     * Obtiene el valor de la propiedad loginYEstadoComandoResult.
     * 
     */
    public boolean isLoginYEstadoComandoResult() {
        return loginYEstadoComandoResult;
    }

    /**
     * Define el valor de la propiedad loginYEstadoComandoResult.
     * 
     */
    public void setLoginYEstadoComandoResult(boolean value) {
        this.loginYEstadoComandoResult = value;
    }

}
