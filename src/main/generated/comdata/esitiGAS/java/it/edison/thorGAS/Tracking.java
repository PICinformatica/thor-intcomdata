
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD>

 * <STYLE type=text/css> p{margin:0px;}</STYLE>

 * </HEAD>

 * <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Contiene tutti i campi di tracking obbligatori per la comunicazione.</BODY></HTML>
 * 
 * <p>Classe Java per Tracking complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Tracking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commodity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codiceFlusso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="societaVendita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaGestionale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sistemaFatturazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sistemaOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sistemaDestinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codicePraticaMittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codicePraticaThor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codicePraticaDistributore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tracking", propOrder = {
    "commodity",
    "servizio",
    "codiceFlusso",
    "societaVendita",
    "areaGestionale",
    "sistemaFatturazione",
    "sistemaOrigine",
    "sistemaDestinazione",
    "codicePraticaMittente",
    "codicePraticaThor",
    "codicePraticaDistributore"
})
public class Tracking {

    @XmlElement(namespace = "http://thor.edison.it")
    protected String commodity;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String servizio;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String codiceFlusso;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String societaVendita;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String areaGestionale;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String sistemaFatturazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String sistemaOrigine;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String sistemaDestinazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String codicePraticaMittente;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String codicePraticaThor;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String codicePraticaDistributore;

    /**
     * Recupera il valore della proprietà commodity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Imposta il valore della proprietà commodity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * Recupera il valore della proprietà servizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServizio() {
        return servizio;
    }

    /**
     * Imposta il valore della proprietà servizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServizio(String value) {
        this.servizio = value;
    }

    /**
     * Recupera il valore della proprietà codiceFlusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFlusso() {
        return codiceFlusso;
    }

    /**
     * Imposta il valore della proprietà codiceFlusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFlusso(String value) {
        this.codiceFlusso = value;
    }

    /**
     * Recupera il valore della proprietà societaVendita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocietaVendita() {
        return societaVendita;
    }

    /**
     * Imposta il valore della proprietà societaVendita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocietaVendita(String value) {
        this.societaVendita = value;
    }

    /**
     * Recupera il valore della proprietà areaGestionale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaGestionale() {
        return areaGestionale;
    }

    /**
     * Imposta il valore della proprietà areaGestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaGestionale(String value) {
        this.areaGestionale = value;
    }

    /**
     * Recupera il valore della proprietà sistemaFatturazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaFatturazione() {
        return sistemaFatturazione;
    }

    /**
     * Imposta il valore della proprietà sistemaFatturazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaFatturazione(String value) {
        this.sistemaFatturazione = value;
    }

    /**
     * Recupera il valore della proprietà sistemaOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOrigine() {
        return sistemaOrigine;
    }

    /**
     * Imposta il valore della proprietà sistemaOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigine(String value) {
        this.sistemaOrigine = value;
    }

    /**
     * Recupera il valore della proprietà sistemaDestinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaDestinazione() {
        return sistemaDestinazione;
    }

    /**
     * Imposta il valore della proprietà sistemaDestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaDestinazione(String value) {
        this.sistemaDestinazione = value;
    }

    /**
     * Recupera il valore della proprietà codicePraticaMittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePraticaMittente() {
        return codicePraticaMittente;
    }

    /**
     * Imposta il valore della proprietà codicePraticaMittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePraticaMittente(String value) {
        this.codicePraticaMittente = value;
    }

    /**
     * Recupera il valore della proprietà codicePraticaThor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePraticaThor() {
        return codicePraticaThor;
    }

    /**
     * Imposta il valore della proprietà codicePraticaThor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePraticaThor(String value) {
        this.codicePraticaThor = value;
    }

    /**
     * Recupera il valore della proprietà codicePraticaDistributore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePraticaDistributore() {
        return codicePraticaDistributore;
    }

    /**
     * Imposta il valore della proprietà codicePraticaDistributore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePraticaDistributore(String value) {
        this.codicePraticaDistributore = value;
    }

}
