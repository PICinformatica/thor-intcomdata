
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_BONUSType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_BONUSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BONUS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_INIZIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_FINE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MESE_RINNOVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA">
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
@XmlType(name = "T_I_BONUSType", propOrder = {
    "bonus",
    "datainizio",
    "datafine",
    "meserinnovo",
    "tipologia"
})
public class TIBONUSType {

    @XmlElement(name = "BONUS", required = true)
    protected String bonus;
    @XmlElement(name = "DATA_INIZIO", required = true)
    protected String datainizio;
    @XmlElement(name = "DATA_FINE", required = true)
    protected String datafine;
    @XmlElement(name = "MESE_RINNOVO", required = true)
    protected String meserinnovo;
    @XmlElement(name = "TIPOLOGIA", required = true)
    protected String tipologia;

    /**
     * Recupera il valore della proprietà bonus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBONUS() {
        return bonus;
    }

    /**
     * Imposta il valore della proprietà bonus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBONUS(String value) {
        this.bonus = value;
    }

    /**
     * Recupera il valore della proprietà datainizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINIZIO() {
        return datainizio;
    }

    /**
     * Imposta il valore della proprietà datainizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINIZIO(String value) {
        this.datainizio = value;
    }

    /**
     * Recupera il valore della proprietà datafine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAFINE() {
        return datafine;
    }

    /**
     * Imposta il valore della proprietà datafine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAFINE(String value) {
        this.datafine = value;
    }

    /**
     * Recupera il valore della proprietà meserinnovo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESERINNOVO() {
        return meserinnovo;
    }

    /**
     * Imposta il valore della proprietà meserinnovo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESERINNOVO(String value) {
        this.meserinnovo = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIA() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIA(String value) {
        this.tipologia = value;
    }

}
