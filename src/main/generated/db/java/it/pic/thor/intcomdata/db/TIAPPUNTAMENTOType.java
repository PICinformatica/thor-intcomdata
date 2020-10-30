
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_APPUNTAMENTOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_APPUNTAMENTOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DT_DISPONIBILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FASCIA_DISPONIBILITA">
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
@XmlType(name = "T_I_APPUNTAMENTOType", propOrder = {
    "dtdisponibilita",
    "fasciadisponibilita"
})
public class TIAPPUNTAMENTOType {

    @XmlElement(name = "DT_DISPONIBILITA", required = true)
    protected String dtdisponibilita;
    @XmlElement(name = "FASCIA_DISPONIBILITA", required = true)
    protected String fasciadisponibilita;

    /**
     * Recupera il valore della proprietà dtdisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDISPONIBILITA() {
        return dtdisponibilita;
    }

    /**
     * Imposta il valore della proprietà dtdisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDISPONIBILITA(String value) {
        this.dtdisponibilita = value;
    }

    /**
     * Recupera il valore della proprietà fasciadisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCIADISPONIBILITA() {
        return fasciadisponibilita;
    }

    /**
     * Imposta il valore della proprietà fasciadisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCIADISPONIBILITA(String value) {
        this.fasciadisponibilita = value;
    }

}
