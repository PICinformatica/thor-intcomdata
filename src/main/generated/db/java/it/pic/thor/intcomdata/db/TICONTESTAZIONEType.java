
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_CONTESTAZIONEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_CONTESTAZIONEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOGGETTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OGGETTO">
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
@XmlType(name = "T_I_CONTESTAZIONEType", propOrder = {
    "soggetto",
    "oggetto"
})
public class TICONTESTAZIONEType {

    @XmlElement(name = "SOGGETTO", required = true)
    protected String soggetto;
    @XmlElement(name = "OGGETTO", required = true)
    protected String oggetto;

    /**
     * Recupera il valore della proprietà soggetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOGGETTO() {
        return soggetto;
    }

    /**
     * Imposta il valore della proprietà soggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOGGETTO(String value) {
        this.soggetto = value;
    }

    /**
     * Recupera il valore della proprietà oggetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGGETTO() {
        return oggetto;
    }

    /**
     * Imposta il valore della proprietà oggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGGETTO(String value) {
        this.oggetto = value;
    }

}
