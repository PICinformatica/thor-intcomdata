
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TRIBUTI_GASType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TRIBUTI_GASType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADDIZIONALE_REGIONALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACCISE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ALTRE_INFORMAZIONI">
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
@XmlType(name = "T_I_TRIBUTI_GASType", propOrder = {
    "addizionaleregionale",
    "accise",
    "altreinformazioni"
})
public class TITRIBUTIGASType {

    @XmlElement(name = "ADDIZIONALE_REGIONALE", required = true)
    protected String addizionaleregionale;
    @XmlElement(name = "ACCISE", required = true)
    protected String accise;
    @XmlElement(name = "ALTRE_INFORMAZIONI", required = true)
    protected String altreinformazioni;

    /**
     * Recupera il valore della proprietà addizionaleregionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDIZIONALEREGIONALE() {
        return addizionaleregionale;
    }

    /**
     * Imposta il valore della proprietà addizionaleregionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDIZIONALEREGIONALE(String value) {
        this.addizionaleregionale = value;
    }

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
