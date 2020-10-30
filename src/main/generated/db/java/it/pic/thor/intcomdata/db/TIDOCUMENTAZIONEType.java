
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DOCUMENTAZIONEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DOCUMENTAZIONEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RIFERIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MANCANTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INDIRIZZO_INVIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_RICEZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ACCERTAMENTO">
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
@XmlType(name = "T_I_DOCUMENTAZIONEType", propOrder = {
    "riferimento",
    "mancante",
    "indirizzoinvio",
    "dataricezione",
    "dataaccertamento"
})
public class TIDOCUMENTAZIONEType {

    @XmlElement(name = "RIFERIMENTO", required = true)
    protected String riferimento;
    @XmlElement(name = "MANCANTE", required = true)
    protected String mancante;
    @XmlElement(name = "INDIRIZZO_INVIO", required = true)
    protected String indirizzoinvio;
    @XmlElement(name = "DATA_RICEZIONE", required = true)
    protected String dataricezione;
    @XmlElement(name = "DATA_ACCERTAMENTO", required = true)
    protected String dataaccertamento;

    /**
     * Recupera il valore della proprietà riferimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIFERIMENTO() {
        return riferimento;
    }

    /**
     * Imposta il valore della proprietà riferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIFERIMENTO(String value) {
        this.riferimento = value;
    }

    /**
     * Recupera il valore della proprietà mancante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANCANTE() {
        return mancante;
    }

    /**
     * Imposta il valore della proprietà mancante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANCANTE(String value) {
        this.mancante = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoinvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDIRIZZOINVIO() {
        return indirizzoinvio;
    }

    /**
     * Imposta il valore della proprietà indirizzoinvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDIRIZZOINVIO(String value) {
        this.indirizzoinvio = value;
    }

    /**
     * Recupera il valore della proprietà dataricezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATARICEZIONE() {
        return dataricezione;
    }

    /**
     * Imposta il valore della proprietà dataricezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATARICEZIONE(String value) {
        this.dataricezione = value;
    }

    /**
     * Recupera il valore della proprietà dataaccertamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAACCERTAMENTO() {
        return dataaccertamento;
    }

    /**
     * Imposta il valore della proprietà dataaccertamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAACCERTAMENTO(String value) {
        this.dataaccertamento = value;
    }

}
