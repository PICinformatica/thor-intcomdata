
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_SECONDO_APPUNTAMENTOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_SECONDO_APPUNTAMENTOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODICE_APPUNTAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APPUNTAMENTO" type="{}T_I_APPUNTAMENTOType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_SECONDO_APPUNTAMENTOType", propOrder = {
    "codiceappuntamento",
    "appuntamento"
})
public class TISECONDOAPPUNTAMENTOType {

    @XmlElement(name = "CODICE_APPUNTAMENTO", required = true)
    protected String codiceappuntamento;
    @XmlElement(name = "APPUNTAMENTO", required = true)
    protected TIAPPUNTAMENTOType appuntamento;

    /**
     * Recupera il valore della proprietà codiceappuntamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAPPUNTAMENTO() {
        return codiceappuntamento;
    }

    /**
     * Imposta il valore della proprietà codiceappuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAPPUNTAMENTO(String value) {
        this.codiceappuntamento = value;
    }

    /**
     * Recupera il valore della proprietà appuntamento.
     * 
     * @return
     *     possible object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public TIAPPUNTAMENTOType getAPPUNTAMENTO() {
        return appuntamento;
    }

    /**
     * Imposta il valore della proprietà appuntamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TIAPPUNTAMENTOType }
     *     
     */
    public void setAPPUNTAMENTO(TIAPPUNTAMENTOType value) {
        this.appuntamento = value;
    }

}
