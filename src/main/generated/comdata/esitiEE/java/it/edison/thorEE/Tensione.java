
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD> <STYLE type=text/css> p{margin:0px;}</STYLE> </HEAD> <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Tensione attuale presente a sistema</BODY></HTML>
 * 
 * <p>Classe Java per Tensione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Tensione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alimentazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monoTrifase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tensione", propOrder = {
    "alimentazione",
    "fase",
    "monoTrifase"
})
public class Tensione {

    protected String alimentazione;
    protected String fase;
    protected String monoTrifase;

    /**
     * Recupera il valore della proprietà alimentazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlimentazione() {
        return alimentazione;
    }

    /**
     * Imposta il valore della proprietà alimentazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlimentazione(String value) {
        this.alimentazione = value;
    }

    /**
     * Recupera il valore della proprietà fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFase() {
        return fase;
    }

    /**
     * Imposta il valore della proprietà fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFase(String value) {
        this.fase = value;
    }

    /**
     * Recupera il valore della proprietà monoTrifase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonoTrifase() {
        return monoTrifase;
    }

    /**
     * Imposta il valore della proprietà monoTrifase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonoTrifase(String value) {
        this.monoTrifase = value;
    }

}
