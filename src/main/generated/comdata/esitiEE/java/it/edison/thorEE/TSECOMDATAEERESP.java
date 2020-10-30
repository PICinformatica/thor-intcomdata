
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TSE_COMDATA_EE_RESP complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TSE_COMDATA_EE_RESP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tracking" type="{http://thor.edison.it}Tracking" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ammissibilita" type="{http://thor.edison.it}Ammissibilita" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSE_COMDATA_EE_RESP", propOrder = {
    "tracking",
    "ammissibilita"
})
public class TSECOMDATAEERESP {

    @XmlElement(namespace = "")
    protected it.edison.thorEE.Tracking tracking;
    @XmlElement(namespace = "")
    protected it.edison.thorEE.Ammissibilita ammissibilita;

    /**
     * Recupera il valore della proprietà tracking.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.Tracking }
     *     
     */
    public it.edison.thorEE.Tracking getTracking() {
        return tracking;
    }

    /**
     * Imposta il valore della proprietà tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.Tracking }
     *     
     */
    public void setTracking(Tracking value) {
        this.tracking = value;
    }

    /**
     * Recupera il valore della proprietà ammissibilita.
     * 
     * @return
     *     possible object is
     *     {@link it.edison.thorEE.Ammissibilita }
     *     
     */
    public it.edison.thorEE.Ammissibilita getAmmissibilita() {
        return ammissibilita;
    }

    /**
     * Imposta il valore della proprietà ammissibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link it.edison.thorEE.Ammissibilita }
     *     
     */
    public void setAmmissibilita(Ammissibilita value) {
        this.ammissibilita = value;
    }

}
