
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_ANNULLAMENTOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_ANNULLAMENTOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DT_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOTIVAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
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
@XmlType(name = "T_I_ANNULLAMENTOType", propOrder = {
    "dtrichiesta",
    "motivazione",
    "causale"
})
public class TIANNULLAMENTOType {

    @XmlElement(name = "DT_RICHIESTA", required = true)
    protected String dtrichiesta;
    @XmlElement(name = "MOTIVAZIONE", required = true)
    protected String motivazione;
    @XmlElement(name = "CAUSALE", required = true)
    protected String causale;

    /**
     * Recupera il valore della proprietà dtrichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTRICHIESTA() {
        return dtrichiesta;
    }

    /**
     * Imposta il valore della proprietà dtrichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTRICHIESTA(String value) {
        this.dtrichiesta = value;
    }

    /**
     * Recupera il valore della proprietà motivazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVAZIONE() {
        return motivazione;
    }

    /**
     * Imposta il valore della proprietà motivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVAZIONE(String value) {
        this.motivazione = value;
    }

    /**
     * Recupera il valore della proprietà causale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSALE() {
        return causale;
    }

    /**
     * Imposta il valore della proprietà causale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSALE(String value) {
        this.causale = value;
    }

}
