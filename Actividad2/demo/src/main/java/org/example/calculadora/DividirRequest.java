//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.21 a las 02:02:52 AM CST 
//

package org.example.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "divisor", "dividendo" })
@XmlRootElement(name = "DividirRequest")
public class DividirRequest {

    @XmlElement(required = true)
    protected String divisor;
    @XmlElement(required = true)
    protected String dividendo;

    /**
     * Obtiene el valor de la propiedad a.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDivisor() {
        return divisor;
    }

    /**
     * Define el valor de la propiedad a.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDivisor(String value) {
        this.divisor = value;
    }

    /**
     * Obtiene el valor de la propiedad b.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDividendo() {
        return dividendo;
    }

    /**
     * Define el valor de la propiedad b.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDividendo(String value) {
        this.dividendo = value;
    }

}
