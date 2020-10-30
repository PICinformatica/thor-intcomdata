
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_ANNULLAMENTO_APPUNTAMENTOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_ANNULLAMENTO_APPUNTAMENTOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATA_ANNULLAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAUSA_ANNULLAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_LIMITE">
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
@XmlType(name = "T_I_ANNULLAMENTO_APPUNTAMENTOType", propOrder = {
    "dataannullamento",
    "causaannullamento",
    "datalimite"
})
public class TIANNULLAMENTOAPPUNTAMENTOType {

    @XmlElement(name = "DATA_ANNULLAMENTO", required = true)
    protected String dataannullamento;
    @XmlElement(name = "CAUSA_ANNULLAMENTO", required = true)
    protected String causaannullamento;
    @XmlElement(name = "DATA_LIMITE", required = true)
    protected String datalimite;

    /**
     * Recupera il valore della proprietà dataannullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAANNULLAMENTO() {
        return dataannullamento;
    }

    /**
     * Imposta il valore della proprietà dataannullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAANNULLAMENTO(String value) {
        this.dataannullamento = value;
    }

    /**
     * Recupera il valore della proprietà causaannullamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAUSAANNULLAMENTO() {
        return causaannullamento;
    }

    /**
     * Imposta il valore della proprietà causaannullamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAUSAANNULLAMENTO(String value) {
        this.causaannullamento = value;
    }

    /**
     * Recupera il valore della proprietà datalimite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATALIMITE() {
        return datalimite;
    }

    /**
     * Imposta il valore della proprietà datalimite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATALIMITE(String value) {
        this.datalimite = value;
    }

}
