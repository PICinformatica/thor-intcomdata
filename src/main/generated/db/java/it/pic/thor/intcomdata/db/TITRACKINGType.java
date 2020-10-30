
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TRACKINGType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TRACKINGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMMODITY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOCIETA_VENDITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AREA_GESTIONALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SISTEMA_FATTURAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SISTEMA_ORIGINE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SISTEMA_DESTINAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_MITTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_THOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_DISTRIBUTORE">
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
@XmlType(name = "T_I_TRACKINGType", propOrder = {
    "commodity",
    "servizio",
    "cdflusso",
    "societavendita",
    "areagestionale",
    "sistemafatturazione",
    "sistemaorigine",
    "sistemadestinazione",
    "cdpraticamittente",
    "cdpraticathor",
    "cdpraticadistributore"
})
public class TITRACKINGType {

    @XmlElement(name = "COMMODITY", required = true)
    protected String commodity;
    @XmlElement(name = "SERVIZIO", required = true)
    protected String servizio;
    @XmlElement(name = "CD_FLUSSO", required = true)
    protected String cdflusso;
    @XmlElement(name = "SOCIETA_VENDITA", required = true)
    protected String societavendita;
    @XmlElement(name = "AREA_GESTIONALE", required = true)
    protected String areagestionale;
    @XmlElement(name = "SISTEMA_FATTURAZIONE", required = true)
    protected String sistemafatturazione;
    @XmlElement(name = "SISTEMA_ORIGINE", required = true)
    protected String sistemaorigine;
    @XmlElement(name = "SISTEMA_DESTINAZIONE", required = true)
    protected String sistemadestinazione;
    @XmlElement(name = "CD_PRATICA_MITTENTE", required = true)
    protected String cdpraticamittente;
    @XmlElement(name = "CD_PRATICA_THOR", required = true)
    protected String cdpraticathor;
    @XmlElement(name = "CD_PRATICA_DISTRIBUTORE", required = true)
    protected String cdpraticadistributore;

    /**
     * Recupera il valore della proprietà commodity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMODITY() {
        return commodity;
    }

    /**
     * Imposta il valore della proprietà commodity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMODITY(String value) {
        this.commodity = value;
    }

    /**
     * Recupera il valore della proprietà servizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVIZIO() {
        return servizio;
    }

    /**
     * Imposta il valore della proprietà servizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVIZIO(String value) {
        this.servizio = value;
    }

    /**
     * Recupera il valore della proprietà cdflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDFLUSSO() {
        return cdflusso;
    }

    /**
     * Imposta il valore della proprietà cdflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDFLUSSO(String value) {
        this.cdflusso = value;
    }

    /**
     * Recupera il valore della proprietà societavendita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOCIETAVENDITA() {
        return societavendita;
    }

    /**
     * Imposta il valore della proprietà societavendita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOCIETAVENDITA(String value) {
        this.societavendita = value;
    }

    /**
     * Recupera il valore della proprietà areagestionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAGESTIONALE() {
        return areagestionale;
    }

    /**
     * Imposta il valore della proprietà areagestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAGESTIONALE(String value) {
        this.areagestionale = value;
    }

    /**
     * Recupera il valore della proprietà sistemafatturazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAFATTURAZIONE() {
        return sistemafatturazione;
    }

    /**
     * Imposta il valore della proprietà sistemafatturazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAFATTURAZIONE(String value) {
        this.sistemafatturazione = value;
    }

    /**
     * Recupera il valore della proprietà sistemaorigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAORIGINE() {
        return sistemaorigine;
    }

    /**
     * Imposta il valore della proprietà sistemaorigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAORIGINE(String value) {
        this.sistemaorigine = value;
    }

    /**
     * Recupera il valore della proprietà sistemadestinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMADESTINAZIONE() {
        return sistemadestinazione;
    }

    /**
     * Imposta il valore della proprietà sistemadestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMADESTINAZIONE(String value) {
        this.sistemadestinazione = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticamittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICAMITTENTE() {
        return cdpraticamittente;
    }

    /**
     * Imposta il valore della proprietà cdpraticamittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICAMITTENTE(String value) {
        this.cdpraticamittente = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticathor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICATHOR() {
        return cdpraticathor;
    }

    /**
     * Imposta il valore della proprietà cdpraticathor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICATHOR(String value) {
        this.cdpraticathor = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticadistributore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICADISTRIBUTORE() {
        return cdpraticadistributore;
    }

    /**
     * Imposta il valore della proprietà cdpraticadistributore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICADISTRIBUTORE(String value) {
        this.cdpraticadistributore = value;
    }

}
