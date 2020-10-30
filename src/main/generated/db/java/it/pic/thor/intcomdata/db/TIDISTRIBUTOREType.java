
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DISTRIBUTOREType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DISTRIBUTOREType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COD_AUTHORITY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RAGIONE_SOCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARTITA_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COD_CONTRATTO_DISP">
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
@XmlType(name = "T_I_DISTRIBUTOREType", propOrder = {
    "codauthority",
    "ragionesociale",
    "partitaiva",
    "codcontrattodisp"
})
public class TIDISTRIBUTOREType {

    @XmlElement(name = "COD_AUTHORITY", required = true)
    protected String codauthority;
    @XmlElement(name = "RAGIONE_SOCIALE", required = true)
    protected String ragionesociale;
    @XmlElement(name = "PARTITA_IVA", required = true)
    protected String partitaiva;
    @XmlElement(name = "COD_CONTRATTO_DISP", required = true)
    protected String codcontrattodisp;

    /**
     * Recupera il valore della proprietà codauthority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAUTHORITY() {
        return codauthority;
    }

    /**
     * Imposta il valore della proprietà codauthority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAUTHORITY(String value) {
        this.codauthority = value;
    }

    /**
     * Recupera il valore della proprietà ragionesociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAGIONESOCIALE() {
        return ragionesociale;
    }

    /**
     * Imposta il valore della proprietà ragionesociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAGIONESOCIALE(String value) {
        this.ragionesociale = value;
    }

    /**
     * Recupera il valore della proprietà partitaiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTITAIVA() {
        return partitaiva;
    }

    /**
     * Imposta il valore della proprietà partitaiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTITAIVA(String value) {
        this.partitaiva = value;
    }

    /**
     * Recupera il valore della proprietà codcontrattodisp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCONTRATTODISP() {
        return codcontrattodisp;
    }

    /**
     * Imposta il valore della proprietà codcontrattodisp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCONTRATTODISP(String value) {
        this.codcontrattodisp = value;
    }

}
