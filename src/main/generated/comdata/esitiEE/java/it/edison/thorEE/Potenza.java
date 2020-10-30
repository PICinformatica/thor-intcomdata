
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD> <STYLE type=text/css> p{margin:0px;}</STYLE> </HEAD> <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Potenza attaule</BODY></HTML>
 * 
 * <p>Classe Java per Potenza complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Potenza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="impegnata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disponibile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="franchigia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Potenza", propOrder = {
    "impegnata",
    "disponibile",
    "franchigia"
})
public class Potenza {

    protected String impegnata;
    protected String disponibile;
    protected String franchigia;

    /**
     * Recupera il valore della proprietà impegnata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpegnata() {
        return impegnata;
    }

    /**
     * Imposta il valore della proprietà impegnata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpegnata(String value) {
        this.impegnata = value;
    }

    /**
     * Recupera il valore della proprietà disponibile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisponibile() {
        return disponibile;
    }

    /**
     * Imposta il valore della proprietà disponibile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisponibile(String value) {
        this.disponibile = value;
    }

    /**
     * Recupera il valore della proprietà franchigia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchigia() {
        return franchigia;
    }

    /**
     * Imposta il valore della proprietà franchigia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchigia(String value) {
        this.franchigia = value;
    }

}
