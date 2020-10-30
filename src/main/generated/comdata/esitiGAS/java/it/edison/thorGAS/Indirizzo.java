
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD>

 * <STYLE type=text/css> p{margin:0px;}</STYLE>

 * </HEAD>

 * <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>

 * <P>Contiene tutte le informazioni dell'indirizzo. </P></BODY></HTML>
 * 
 * <p>Classe Java per Indirizzo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Indirizzo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="toponimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="via" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroEstensione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="istat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="piano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="altro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Indirizzo", propOrder = {
    "toponimo",
    "via",
    "civico",
    "numeroEstensione",
    "cap",
    "istat",
    "comune",
    "provincia",
    "scala",
    "piano",
    "interno",
    "frazione",
    "presso",
    "nazione",
    "altro"
})
public class Indirizzo {

    @XmlElement(namespace = "http://thor.edison.it")
    protected String toponimo;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String via;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String civico;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String numeroEstensione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String cap;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String istat;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String comune;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String provincia;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String scala;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String piano;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String interno;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String frazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String presso;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String nazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String altro;

    /**
     * Recupera il valore della proprietà toponimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToponimo() {
        return toponimo;
    }

    /**
     * Imposta il valore della proprietà toponimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToponimo(String value) {
        this.toponimo = value;
    }

    /**
     * Recupera il valore della proprietà via.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVia() {
        return via;
    }

    /**
     * Imposta il valore della proprietà via.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVia(String value) {
        this.via = value;
    }

    /**
     * Recupera il valore della proprietà civico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivico() {
        return civico;
    }

    /**
     * Imposta il valore della proprietà civico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivico(String value) {
        this.civico = value;
    }

    /**
     * Recupera il valore della proprietà numeroEstensione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEstensione() {
        return numeroEstensione;
    }

    /**
     * Imposta il valore della proprietà numeroEstensione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEstensione(String value) {
        this.numeroEstensione = value;
    }

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCap() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà istat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstat() {
        return istat;
    }

    /**
     * Imposta il valore della proprietà istat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstat(String value) {
        this.istat = value;
    }

    /**
     * Recupera il valore della proprietà comune.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Imposta il valore della proprietà comune.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà scala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScala() {
        return scala;
    }

    /**
     * Imposta il valore della proprietà scala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScala(String value) {
        this.scala = value;
    }

    /**
     * Recupera il valore della proprietà piano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiano() {
        return piano;
    }

    /**
     * Imposta il valore della proprietà piano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiano(String value) {
        this.piano = value;
    }

    /**
     * Recupera il valore della proprietà interno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterno() {
        return interno;
    }

    /**
     * Imposta il valore della proprietà interno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterno(String value) {
        this.interno = value;
    }

    /**
     * Recupera il valore della proprietà frazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrazione() {
        return frazione;
    }

    /**
     * Imposta il valore della proprietà frazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrazione(String value) {
        this.frazione = value;
    }

    /**
     * Recupera il valore della proprietà presso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresso() {
        return presso;
    }

    /**
     * Imposta il valore della proprietà presso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresso(String value) {
        this.presso = value;
    }

    /**
     * Recupera il valore della proprietà nazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazione() {
        return nazione;
    }

    /**
     * Imposta il valore della proprietà nazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazione(String value) {
        this.nazione = value;
    }

    /**
     * Recupera il valore della proprietà altro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltro() {
        return altro;
    }

    /**
     * Imposta il valore della proprietà altro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltro(String value) {
        this.altro = value;
    }

}
