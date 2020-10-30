
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_POD_DA_UNIFICAREType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_POD_DA_UNIFICAREType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POSIZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_POD_DA_UNIFICAREType", propOrder = {
    "posizione",
    "pod"
})
public class TIPODDAUNIFICAREType {

    @XmlElement(name = "POSIZIONE", required = true)
    protected String posizione;
    @XmlElement(name = "POD", required = true)
    protected String pod;

    /**
     * Recupera il valore della proprietà posizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSIZIONE() {
        return posizione;
    }

    /**
     * Imposta il valore della proprietà posizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSIZIONE(String value) {
        this.posizione = value;
    }

    /**
     * Recupera il valore della proprietà pod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOD() {
        return pod;
    }

    /**
     * Imposta il valore della proprietà pod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOD(String value) {
        this.pod = value;
    }

}
