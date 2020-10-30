
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TSE_COMDATA_ALLType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TSE_COMDATA_ALLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUTOFF" type="{}T_I_TSE_CUTOFFType"/>
 *         &lt;element name="ESITIEE" type="{}T_I_TSE_EE_ALLType"/>
 *         &lt;element name="ESITIGAS" type="{}T_I_TSE_GAS_ALLType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_TSE_COMDATA_ALLType", propOrder = {
    "cutoff",
    "esitiee",
    "esitigas"
})
public class TITSECOMDATAALLType {

    @XmlElement(name = "CUTOFF", required = true)
    protected TITSECUTOFFType cutoff;
    @XmlElement(name = "ESITIEE", required = true)
    protected TITSEEEALLType esitiee;
    @XmlElement(name = "ESITIGAS", required = true)
    protected TITSEGASALLType esitigas;

    /**
     * Recupera il valore della proprietà cutoff.
     * 
     * @return
     *     possible object is
     *     {@link TITSECUTOFFType }
     *     
     */
    public TITSECUTOFFType getCUTOFF() {
        return cutoff;
    }

    /**
     * Imposta il valore della proprietà cutoff.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSECUTOFFType }
     *     
     */
    public void setCUTOFF(TITSECUTOFFType value) {
        this.cutoff = value;
    }

    /**
     * Recupera il valore della proprietà esitiee.
     * 
     * @return
     *     possible object is
     *     {@link TITSEEEALLType }
     *     
     */
    public TITSEEEALLType getESITIEE() {
        return esitiee;
    }

    /**
     * Imposta il valore della proprietà esitiee.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEEEALLType }
     *     
     */
    public void setESITIEE(TITSEEEALLType value) {
        this.esitiee = value;
    }

    /**
     * Recupera il valore della proprietà esitigas.
     * 
     * @return
     *     possible object is
     *     {@link TITSEGASALLType }
     *     
     */
    public TITSEGASALLType getESITIGAS() {
        return esitigas;
    }

    /**
     * Imposta il valore della proprietà esitigas.
     * 
     * @param value
     *     allowed object is
     *     {@link TITSEGASALLType }
     *     
     */
    public void setESITIGAS(TITSEGASALLType value) {
        this.esitigas = value;
    }

}
