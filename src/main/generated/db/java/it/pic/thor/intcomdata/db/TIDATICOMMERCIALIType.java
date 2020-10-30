
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DATI_COMMERCIALIType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DATI_COMMERCIALIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USO_ENERGIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_CONTRATTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SETTORE_MERCEOLOGICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRATTAMENTO_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OPZIONE_TARIFFARIA">
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
@XmlType(name = "T_I_DATI_COMMERCIALIType", propOrder = {
    "usoenergia",
    "tipocontratto",
    "settoremerceologico",
    "trattamentoiva",
    "opzionetariffaria"
})
public class TIDATICOMMERCIALIType {

    @XmlElement(name = "USO_ENERGIA", required = true)
    protected String usoenergia;
    @XmlElement(name = "TIPO_CONTRATTO", required = true)
    protected String tipocontratto;
    @XmlElement(name = "SETTORE_MERCEOLOGICO", required = true)
    protected String settoremerceologico;
    @XmlElement(name = "TRATTAMENTO_IVA", required = true)
    protected String trattamentoiva;
    @XmlElement(name = "OPZIONE_TARIFFARIA", required = true)
    protected String opzionetariffaria;

    /**
     * Recupera il valore della proprietà usoenergia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSOENERGIA() {
        return usoenergia;
    }

    /**
     * Imposta il valore della proprietà usoenergia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSOENERGIA(String value) {
        this.usoenergia = value;
    }

    /**
     * Recupera il valore della proprietà tipocontratto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCONTRATTO() {
        return tipocontratto;
    }

    /**
     * Imposta il valore della proprietà tipocontratto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCONTRATTO(String value) {
        this.tipocontratto = value;
    }

    /**
     * Recupera il valore della proprietà settoremerceologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTOREMERCEOLOGICO() {
        return settoremerceologico;
    }

    /**
     * Imposta il valore della proprietà settoremerceologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTOREMERCEOLOGICO(String value) {
        this.settoremerceologico = value;
    }

    /**
     * Recupera il valore della proprietà trattamentoiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRATTAMENTOIVA() {
        return trattamentoiva;
    }

    /**
     * Imposta il valore della proprietà trattamentoiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRATTAMENTOIVA(String value) {
        this.trattamentoiva = value;
    }

    /**
     * Recupera il valore della proprietà opzionetariffaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPZIONETARIFFARIA() {
        return opzionetariffaria;
    }

    /**
     * Imposta il valore della proprietà opzionetariffaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPZIONETARIFFARIA(String value) {
        this.opzionetariffaria = value;
    }

}
