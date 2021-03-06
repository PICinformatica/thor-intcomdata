
package it.edison.thorGAS;

import it.edison.thorGAS.ArrayOfDettaglioPreventivo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD>

 * <STYLE type=text/css> p{margin:0px;}</STYLE>

 * </HEAD>

 * <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Contiene le informazioni legate ad un preventivo.</BODY></HTML>
 * 
 * <p>Classe Java per Preventivo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Preventivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceDL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="giorniMaxEsecuzioneLavoro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dettaglio" type="{http://thor.edison.it}ArrayOfDettaglioPreventivo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preventivo", propOrder = {
    "id",
    "codiceDL",
    "importo",
    "dataScadenza",
    "giorniMaxEsecuzioneLavoro",
    "dettaglio",
    "note"
})
public class Preventivo {

    @XmlElement(namespace = "http://thor.edison.it")
    protected String id;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String codiceDL;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String importo;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String dataScadenza;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String giorniMaxEsecuzioneLavoro;
    @XmlElement(namespace = "http://thor.edison.it")
    protected List<it.edison.thorGAS.ArrayOfDettaglioPreventivo> dettaglio;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String note;

    /**
     * Recupera il valore della propriet?? id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet?? id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della propriet?? codiceDL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDL() {
        return codiceDL;
    }

    /**
     * Imposta il valore della propriet?? codiceDL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDL(String value) {
        this.codiceDL = value;
    }

    /**
     * Recupera il valore della propriet?? importo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporto() {
        return importo;
    }

    /**
     * Imposta il valore della propriet?? importo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporto(String value) {
        this.importo = value;
    }

    /**
     * Recupera il valore della propriet?? dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Imposta il valore della propriet?? dataScadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScadenza(String value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della propriet?? giorniMaxEsecuzioneLavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiorniMaxEsecuzioneLavoro() {
        return giorniMaxEsecuzioneLavoro;
    }

    /**
     * Imposta il valore della propriet?? giorniMaxEsecuzioneLavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiorniMaxEsecuzioneLavoro(String value) {
        this.giorniMaxEsecuzioneLavoro = value;
    }

    /**
     * Gets the value of the dettaglio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link it.edison.thorGAS.ArrayOfDettaglioPreventivo }
     * 
     * 
     */
    public List<it.edison.thorGAS.ArrayOfDettaglioPreventivo> getDettaglio() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<ArrayOfDettaglioPreventivo>();
        }
        return this.dettaglio;
    }

    /**
     * Recupera il valore della propriet?? note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della propriet?? note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
