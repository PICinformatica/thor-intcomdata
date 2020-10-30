
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Documentazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Documentazione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="riferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="mancante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="indirizzoInvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataAccertamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentazione", propOrder = {
    "riferimento",
    "mancante",
    "indirizzoInvio",
    "dataRicezione",
    "dataAccertamento"
})
public class Documentazione {

    protected String riferimento;
    protected String mancante;
    protected String indirizzoInvio;
    protected String dataRicezione;
    protected String dataAccertamento;

    /**
     * Recupera il valore della proprietà riferimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimento() {
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
    public void setRiferimento(String value) {
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
    public String getMancante() {
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
    public void setMancante(String value) {
        this.mancante = value;
    }

    /**
     * Recupera il valore della proprietà indirizzoInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoInvio() {
        return indirizzoInvio;
    }

    /**
     * Imposta il valore della proprietà indirizzoInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoInvio(String value) {
        this.indirizzoInvio = value;
    }

    /**
     * Recupera il valore della proprietà dataRicezione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRicezione() {
        return dataRicezione;
    }

    /**
     * Imposta il valore della proprietà dataRicezione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicezione(String value) {
        this.dataRicezione = value;
    }

    /**
     * Recupera il valore della proprietà dataAccertamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAccertamento() {
        return dataAccertamento;
    }

    /**
     * Imposta il valore della proprietà dataAccertamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAccertamento(String value) {
        this.dataAccertamento = value;
    }

}
