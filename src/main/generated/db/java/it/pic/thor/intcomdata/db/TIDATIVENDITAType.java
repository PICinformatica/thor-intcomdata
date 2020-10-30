
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DATI_VENDITAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DATI_VENDITAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALIQUOTA_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMPOSTE_AGEVOLATE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MERCATO_APPARTENENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_OFFERTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOROSITA_BLOCCANTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRADER_USCENTE">
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
@XmlType(name = "T_I_DATI_VENDITAType", propOrder = {
    "aliquotaiva",
    "imposteagevolate",
    "mercatoappartenenza",
    "cdofferta",
    "morositabloccante",
    "traderuscente"
})
public class TIDATIVENDITAType {

    @XmlElement(name = "ALIQUOTA_IVA", required = true)
    protected String aliquotaiva;
    @XmlElement(name = "IMPOSTE_AGEVOLATE", required = true)
    protected String imposteagevolate;
    @XmlElement(name = "MERCATO_APPARTENENZA", required = true)
    protected String mercatoappartenenza;
    @XmlElement(name = "CD_OFFERTA", required = true)
    protected String cdofferta;
    @XmlElement(name = "MOROSITA_BLOCCANTE", required = true)
    protected String morositabloccante;
    @XmlElement(name = "TRADER_USCENTE", required = true)
    protected String traderuscente;

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
     * Recupera il valore della proprietà imposteagevolate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPOSTEAGEVOLATE() {
        return imposteagevolate;
    }

    /**
     * Imposta il valore della proprietà imposteagevolate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPOSTEAGEVOLATE(String value) {
        this.imposteagevolate = value;
    }

    /**
     * Recupera il valore della proprietà mercatoappartenenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCATOAPPARTENENZA() {
        return mercatoappartenenza;
    }

    /**
     * Imposta il valore della proprietà mercatoappartenenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCATOAPPARTENENZA(String value) {
        this.mercatoappartenenza = value;
    }

    /**
     * Recupera il valore della proprietà cdofferta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDOFFERTA() {
        return cdofferta;
    }

    /**
     * Imposta il valore della proprietà cdofferta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDOFFERTA(String value) {
        this.cdofferta = value;
    }

    /**
     * Recupera il valore della proprietà morositabloccante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOROSITABLOCCANTE() {
        return morositabloccante;
    }

    /**
     * Imposta il valore della proprietà morositabloccante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOROSITABLOCCANTE(String value) {
        this.morositabloccante = value;
    }

    /**
     * Recupera il valore della proprietà traderuscente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRADERUSCENTE() {
        return traderuscente;
    }

    /**
     * Imposta il valore della proprietà traderuscente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRADERUSCENTE(String value) {
        this.traderuscente = value;
    }

}
