
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_RECESSOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_RECESSOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECESSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONTESTATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TEMPISTICA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BLOCCANTE">
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
@XmlType(name = "T_I_RECESSOType", propOrder = {
    "recesso",
    "contestato",
    "tempistica",
    "bloccante"
})
public class TIRECESSOType {

    @XmlElement(name = "RECESSO", required = true)
    protected String recesso;
    @XmlElement(name = "CONTESTATO", required = true)
    protected String contestato;
    @XmlElement(name = "TEMPISTICA", required = true)
    protected String tempistica;
    @XmlElement(name = "BLOCCANTE", required = true)
    protected String bloccante;

    /**
     * Recupera il valore della proprietà recesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECESSO() {
        return recesso;
    }

    /**
     * Imposta il valore della proprietà recesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECESSO(String value) {
        this.recesso = value;
    }

    /**
     * Recupera il valore della proprietà contestato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTESTATO() {
        return contestato;
    }

    /**
     * Imposta il valore della proprietà contestato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTESTATO(String value) {
        this.contestato = value;
    }

    /**
     * Recupera il valore della proprietà tempistica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPISTICA() {
        return tempistica;
    }

    /**
     * Imposta il valore della proprietà tempistica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPISTICA(String value) {
        this.tempistica = value;
    }

    /**
     * Recupera il valore della proprietà bloccante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCCANTE() {
        return bloccante;
    }

    /**
     * Imposta il valore della proprietà bloccante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCCANTE(String value) {
        this.bloccante = value;
    }

}
