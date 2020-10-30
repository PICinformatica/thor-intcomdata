
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_INFO_FLUSSOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_INFO_FLUSSOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CANALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIREZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENTITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ENTITA">
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
@XmlType(name = "T_I_INFO_FLUSSOType", propOrder = {
    "flusso",
    "utente",
    "canale",
    "id",
    "dtflusso",
    "direzione",
    "entita",
    "tipoentita"
})
public class TIINFOFLUSSOType {

    @XmlElement(name = "FLUSSO", required = true)
    protected String flusso;
    @XmlElement(name = "UTENTE", required = true)
    protected String utente;
    @XmlElement(name = "CANALE", required = true)
    protected String canale;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "DT_FLUSSO", required = true)
    protected String dtflusso;
    @XmlElement(name = "DIREZIONE", required = true)
    protected String direzione;
    @XmlElement(name = "ENTITA", required = true)
    protected String entita;
    @XmlElement(name = "TIPO_ENTITA", required = true)
    protected String tipoentita;

    /**
     * Recupera il valore della proprietà flusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLUSSO() {
        return flusso;
    }

    /**
     * Imposta il valore della proprietà flusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLUSSO(String value) {
        this.flusso = value;
    }

    /**
     * Recupera il valore della proprietà utente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTENTE() {
        return utente;
    }

    /**
     * Imposta il valore della proprietà utente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTENTE(String value) {
        this.utente = value;
    }

    /**
     * Recupera il valore della proprietà canale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALE() {
        return canale;
    }

    /**
     * Imposta il valore della proprietà canale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALE(String value) {
        this.canale = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà dtflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTFLUSSO() {
        return dtflusso;
    }

    /**
     * Imposta il valore della proprietà dtflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTFLUSSO(String value) {
        this.dtflusso = value;
    }

    /**
     * Recupera il valore della proprietà direzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIREZIONE() {
        return direzione;
    }

    /**
     * Imposta il valore della proprietà direzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIREZIONE(String value) {
        this.direzione = value;
    }

    /**
     * Recupera il valore della proprietà entita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITA() {
        return entita;
    }

    /**
     * Imposta il valore della proprietà entita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITA(String value) {
        this.entita = value;
    }

    /**
     * Recupera il valore della proprietà tipoentita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOENTITA() {
        return tipoentita;
    }

    /**
     * Imposta il valore della proprietà tipoentita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOENTITA(String value) {
        this.tipoentita = value;
    }

}
