
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_EE_ALLType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_EE_ALLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OUTBOUND_REQUEST" type="{}T_I_TSE_EE_OUT_REQType"/>
 *         &lt;element name="INBOUND_REQUEST" type="{}T_I_TSE_EE_INB_REQType"/>
 *         &lt;element name="TRACKING_THOR_EE" type="{}T_I_TRACKING_THOR_EEType"/>
 *         &lt;element name="ESITO" type="{}T_I_ESITO_TECNICOType"/>
 *         &lt;element name="INVIO" type="{}T_I_INVIOType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_TSE_EE_ALLType", propOrder = {
    "outboundrequest",
    "inboundrequest",
    "trackingthoree",
    "esito",
    "invio"
})
public class TITSEEEALLType {

    @XmlElement(name = "OUTBOUND_REQUEST", required = true)
    protected TITSEEEOUTREQType outboundrequest;
    @XmlElement(name = "INBOUND_REQUEST", required = true)
    protected TITSEEEINBREQType inboundrequest;
    @XmlElement(name = "TRACKING_THOR_EE", required = true)
    protected TITRACKINGTHOREEType trackingthoree;
    @XmlElement(name = "ESITO", required = true)
    protected TIESITOTECNICOType esito;
    @XmlElement(name = "INVIO", required = true)
    protected TIINVIOType invio;

    /**
     * Recupera il valore della proprietà outboundrequest.
     * 
     * @return
     *     possible object is
     *     {@link TITSEEEOUTREQType }
     *     
     */
    public TITSEEEOUTREQType getOUTBOUNDREQUEST() {
        return outboundrequest;
    }

    /**
     * Imposta il valore della proprietà outboundrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEEEOUTREQType }
     *     
     */
    public void setOUTBOUNDREQUEST(TITSEEEOUTREQType value) {
        this.outboundrequest = value;
    }

    /**
     * Recupera il valore della proprietà inboundrequest.
     * 
     * @return
     *     possible object is
     *     {@link TITSEEEINBREQType }
     *     
     */
    public TITSEEEINBREQType getINBOUNDREQUEST() {
        return inboundrequest;
    }

    /**
     * Imposta il valore della proprietà inboundrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEEEINBREQType }
     *     
     */
    public void setINBOUNDREQUEST(TITSEEEINBREQType value) {
        this.inboundrequest = value;
    }

    /**
     * Recupera il valore della proprietà trackingthoree.
     * 
     * @return
     *     possible object is
     *     {@link TITRACKINGTHOREEType }
     *     
     */
    public TITRACKINGTHOREEType getTRACKINGTHOREE() {
        return trackingthoree;
    }

    /**
     * Imposta il valore della proprietà trackingthoree.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRACKINGTHOREEType }
     *     
     */
    public void setTRACKINGTHOREE(TITRACKINGTHOREEType value) {
        this.trackingthoree = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link TIESITOTECNICOType }
     *     
     */
    public TIESITOTECNICOType getESITO() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link TIESITOTECNICOType }
     *     
     */
    public void setESITO(TIESITOTECNICOType value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà invio.
     * 
     * @return
     *     possible object is
     *     {@link TIINVIOType }
     *     
     */
    public TIINVIOType getINVIO() {
        return invio;
    }

    /**
     * Imposta il valore della proprietà invio.
     * 
     * @param value
     *     allowed object is
     *     {@link TIINVIOType }
     *     
     */
    public void setINVIO(TIINVIOType value) {
        this.invio = value;
    }

}
