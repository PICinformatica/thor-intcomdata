
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TRIBUTIType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TRIBUTIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCISE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDIZIONALE_COMUNALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDIZIONALE_PROVINCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALIQUOTA_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALTRE_INFORMAZIONI">
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
@XmlType(name = "T_I_TRIBUTIType", propOrder = {
    "accise",
    "addizionalecomunale",
    "addizionaleprovinciale",
    "aliquotaiva",
    "altreinformazioni"
})
public class TITRIBUTIType {

    @XmlElement(name = "ACCISE", required = true)
    protected String accise;
    @XmlElement(name = "ADDIZIONALE_COMUNALE", required = true)
    protected String addizionalecomunale;
    @XmlElement(name = "ADDIZIONALE_PROVINCIALE", required = true)
    protected String addizionaleprovinciale;
    @XmlElement(name = "ALIQUOTA_IVA", required = true)
    protected String aliquotaiva;
    @XmlElement(name = "ALTRE_INFORMAZIONI", required = true)
    protected String altreinformazioni;

    /**
     * Recupera il valore della proprietà accise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCISE() {
        return accise;
    }

    /**
     * Imposta il valore della proprietà accise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCISE(String value) {
        this.accise = value;
    }

    /**
     * Recupera il valore della proprietà addizionalecomunale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIZIONALECOMUNALE() {
        return addizionalecomunale;
    }

    /**
     * Imposta il valore della proprietà addizionalecomunale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIZIONALECOMUNALE(String value) {
        this.addizionalecomunale = value;
    }

    /**
     * Recupera il valore della proprietà addizionaleprovinciale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIZIONALEPROVINCIALE() {
        return addizionaleprovinciale;
    }

    /**
     * Imposta il valore della proprietà addizionaleprovinciale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIZIONALEPROVINCIALE(String value) {
        this.addizionaleprovinciale = value;
    }

    /**
     * Recupera il valore della proprietà aliquotaiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIQUOTAIVA() {
        return aliquotaiva;
    }

    /**
     * Imposta il valore della proprietà aliquotaiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIQUOTAIVA(String value) {
        this.aliquotaiva = value;
    }

    /**
     * Recupera il valore della proprietà altreinformazioni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALTREINFORMAZIONI() {
        return altreinformazioni;
    }

    /**
     * Imposta il valore della proprietà altreinformazioni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALTREINFORMAZIONI(String value) {
        this.altreinformazioni = value;
    }

}
