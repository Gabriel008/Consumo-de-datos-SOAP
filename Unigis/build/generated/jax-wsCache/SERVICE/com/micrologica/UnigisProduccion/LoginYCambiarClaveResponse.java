
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
 *         &lt;element name="LoginYCambiarClaveResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "loginYCambiarClaveResult"
})
@XmlRootElement(name = "LoginYCambiarClaveResponse")
public class LoginYCambiarClaveResponse {

    @XmlElement(name = "LoginYCambiarClaveResult")
    protected boolean loginYCambiarClaveResult;

    /**
     * Obtiene el valor de la propiedad loginYCambiarClaveResult.
     * 
     */
    public boolean isLoginYCambiarClaveResult() {
        return loginYCambiarClaveResult;
    }

    /**
     * Define el valor de la propiedad loginYCambiarClaveResult.
     * 
     */
    public void setLoginYCambiarClaveResult(boolean value) {
        this.loginYCambiarClaveResult = value;
    }

}
