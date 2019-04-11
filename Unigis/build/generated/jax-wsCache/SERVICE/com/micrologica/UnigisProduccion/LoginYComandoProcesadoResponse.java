
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
 *         &lt;element name="LoginYComandoProcesadoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "loginYComandoProcesadoResult"
})
@XmlRootElement(name = "LoginYComandoProcesadoResponse")
public class LoginYComandoProcesadoResponse {

    @XmlElement(name = "LoginYComandoProcesadoResult")
    protected boolean loginYComandoProcesadoResult;

    /**
     * Obtiene el valor de la propiedad loginYComandoProcesadoResult.
     * 
     */
    public boolean isLoginYComandoProcesadoResult() {
        return loginYComandoProcesadoResult;
    }

    /**
     * Define el valor de la propiedad loginYComandoProcesadoResult.
     * 
     */
    public void setLoginYComandoProcesadoResult(boolean value) {
        this.loginYComandoProcesadoResult = value;
    }

}
