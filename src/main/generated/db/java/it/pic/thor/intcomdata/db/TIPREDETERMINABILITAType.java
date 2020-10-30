
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_PREDETERMINABILITAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_PREDETERMINABILITAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TESTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_FASCIA_DISTANZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUOTA_POTENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QUOTA_DISTANZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ONERI_AMMINISTRATIVI">
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
@XmlType(name = "T_I_PREDETERMINABILITAType", propOrder = {
    "testo",
    "cdfasciadistanza",
    "quotapotenza",
    "quotadistanza",
    "oneriamministrativi"
})
public class TIPREDETERMINABILITAType {

    @XmlElement(name = "TESTO", required = true)
    protected String testo;
    @XmlElement(name = "CD_FASCIA_DISTANZA", required = true)
    protected String cdfasciadistanza;
    @XmlElement(name = "QUOTA_POTENZA", required = true)
    protected String quotapotenza;
    @XmlElement(name = "QUOTA_DISTANZA", required = true)
    protected String quotadistanza;
    @XmlElement(name = "ONERI_AMMINISTRATIVI", required = true)
    protected String oneriamministrativi;

    /**
     * Recupera il valore della proprietà testo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTO() {
        return testo;
    }

    /**
     * Imposta il valore della proprietà testo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTO(String value) {
        this.testo = value;
    }

    /**
     * Recupera il valore della proprietà cdfasciadistanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDFASCIADISTANZA() {
        return cdfasciadistanza;
    }

    /**
     * Imposta il valore della proprietà cdfasciadistanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDFASCIADISTANZA(String value) {
        this.cdfasciadistanza = value;
    }

    /**
     * Recupera il valore della proprietà quotapotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUOTAPOTENZA() {
        return quotapotenza;
    }

    /**
     * Imposta il valore della proprietà quotapotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUOTAPOTENZA(String value) {
        this.quotapotenza = value;
    }

    /**
     * Recupera il valore della proprietà quotadistanza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUOTADISTANZA() {
        return quotadistanza;
    }

    /**
     * Imposta il valore della proprietà quotadistanza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUOTADISTANZA(String value) {
        this.quotadistanza = value;
    }

    /**
     * Recupera il valore della proprietà oneriamministrativi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONERIAMMINISTRATIVI() {
        return oneriamministrativi;
    }

    /**
     * Imposta il valore della proprietà oneriamministrativi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONERIAMMINISTRATIVI(String value) {
        this.oneriamministrativi = value;
    }

}
