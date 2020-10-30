
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_GAS_ALLType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_GAS_ALLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OUTBOUND_REQUEST" type="{}T_I_TSE_GAS_OUT_REQType"/>
 *         &lt;element name="INBOUND_REQUEST" type="{}T_I_TSE_GAS_INB_REQType"/>
 *         &lt;element name="TRACKING_THOR_GAS" type="{}T_I_TRACKING_THOR_GASType"/>
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
@XmlType(name = "T_I_TSE_GAS_ALLType", propOrder = {
    "outboundrequest",
    "inboundrequest",
    "trackingthorgas",
    "esito",
    "invio"
})
public class TITSEGASALLType {

    @XmlElement(name = "OUTBOUND_REQUEST", required = true)
    protected TITSEGASOUTREQType outboundrequest;
    @XmlElement(name = "INBOUND_REQUEST", required = true)
    protected TITSEGASINBREQType inboundrequest;
    @XmlElement(name = "TRACKING_THOR_GAS", required = true)
    protected TITRACKINGTHORGASType trackingthorgas;
    @XmlElement(name = "ESITO", required = true)
    protected TIESITOTECNICOType esito;
    @XmlElement(name = "INVIO", required = true)
    protected TIINVIOType invio;

    /**
     * Recupera il valore della proprietà outboundrequest.
     * 
     * @return
     *     possible object is
     *     {@link TITSEGASOUTREQType }
     *     
     */
    public TITSEGASOUTREQType getOUTBOUNDREQUEST() {
        return outboundrequest;
    }

    /**
     * Imposta il valore della proprietà outboundrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEGASOUTREQType }
     *     
     */
    public void setOUTBOUNDREQUEST(TITSEGASOUTREQType value) {
        this.outboundrequest = value;
    }

    /**
     * Recupera il valore della proprietà inboundrequest.
     * 
     * @return
     *     possible object is
     *     {@link TITSEGASINBREQType }
     *     
     */
    public TITSEGASINBREQType getINBOUNDREQUEST() {
        return inboundrequest;
    }

    /**
     * Imposta il valore della proprietà inboundrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEGASINBREQType }
     *     
     */
    public void setINBOUNDREQUEST(TITSEGASINBREQType value) {
        this.inboundrequest = value;
    }

    /**
     * Recupera il valore della proprietà trackingthorgas.
     * 
     * @return
     *     possible object is
     *     {@link TITRACKINGTHORGASType }
     *     
     */
    public TITRACKINGTHORGASType getTRACKINGTHORGAS() {
        return trackingthorgas;
    }

    /**
     * Imposta il valore della proprietà trackingthorgas.
     * 
     * @param value
     *     allowed object is
     *     {@link TITRACKINGTHORGASType }
     *     
     */
    public void setTRACKINGTHORGAS(TITRACKINGTHORGASType value) {
        this.trackingthorgas = value;
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
