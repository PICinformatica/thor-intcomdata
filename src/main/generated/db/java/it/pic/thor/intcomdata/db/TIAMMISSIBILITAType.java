
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_AMMISSIBILITAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_AMMISSIBILITAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOTIVAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_AMMISSIBILITA">
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
@XmlType(name = "T_I_AMMISSIBILITAType", propOrder = {
    "esito",
    "causale",
    "motivazione",
    "dtammissibilita"
})
public class TIAMMISSIBILITAType {

    @XmlElement(name = "ESITO", required = true)
    protected String esito;
    @XmlElement(name = "CAUSALE", required = true)
    protected String causale;
    @XmlElement(name = "MOTIVAZIONE", required = true)
    protected String motivazione;
    @XmlElement(name = "DT_AMMISSIBILITA", required = true)
    protected String dtammissibilita;

    /**
     * Recupera il valore della propriet?? esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESITO() {
        return esito;
    }

    /**
     * Imposta il valore della propriet?? esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESITO(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della propriet?? causale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSALE() {
        return causale;
    }

    /**
     * Imposta il valore della propriet?? causale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSALE(String value) {
        this.causale = value;
    }

    /**
     * Recupera il valore della propriet?? motivazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVAZIONE() {
        return motivazione;
    }

    /**
     * Imposta il valore della propriet?? motivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVAZIONE(String value) {
        this.motivazione = value;
    }

    /**
     * Recupera il valore della propriet?? dtammissibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTAMMISSIBILITA() {
        return dtammissibilita;
    }

    /**
     * Imposta il valore della propriet?? dtammissibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTAMMISSIBILITA(String value) {
        this.dtammissibilita = value;
    }

}
