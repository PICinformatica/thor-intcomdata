
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_VERIFICAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_VERIFICAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VERIFICA_LABORATORIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSE_LABORATORIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIFERIMENTO_RESOCONTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_SOSTITUZIONE">
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
@XmlType(name = "T_I_VERIFICAType", propOrder = {
    "esito",
    "verificalaboratorio",
    "causelaboratorio",
    "riferimentoresoconto",
    "datasostituzione"
})
public class TIVERIFICAType {

    @XmlElement(name = "ESITO", required = true)
    protected String esito;
    @XmlElement(name = "VERIFICA_LABORATORIO", required = true)
    protected String verificalaboratorio;
    @XmlElement(name = "CAUSE_LABORATORIO", required = true)
    protected String causelaboratorio;
    @XmlElement(name = "RIFERIMENTO_RESOCONTO", required = true)
    protected String riferimentoresoconto;
    @XmlElement(name = "DATA_SOSTITUZIONE", required = true)
    protected String datasostituzione;

    /**
     * Recupera il valore della proprietà esito.
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
     * Imposta il valore della proprietà esito.
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
     * Recupera il valore della proprietà verificalaboratorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFICALABORATORIO() {
        return verificalaboratorio;
    }

    /**
     * Imposta il valore della proprietà verificalaboratorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFICALABORATORIO(String value) {
        this.verificalaboratorio = value;
    }

    /**
     * Recupera il valore della proprietà causelaboratorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSELABORATORIO() {
        return causelaboratorio;
    }

    /**
     * Imposta il valore della proprietà causelaboratorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSELABORATORIO(String value) {
        this.causelaboratorio = value;
    }

    /**
     * Recupera il valore della proprietà riferimentoresoconto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTORESOCONTO() {
        return riferimentoresoconto;
    }

    /**
     * Imposta il valore della proprietà riferimentoresoconto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTORESOCONTO(String value) {
        this.riferimentoresoconto = value;
    }

    /**
     * Recupera il valore della proprietà datasostituzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASOSTITUZIONE() {
        return datasostituzione;
    }

    /**
     * Imposta il valore della proprietà datasostituzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASOSTITUZIONE(String value) {
        this.datasostituzione = value;
    }

}
