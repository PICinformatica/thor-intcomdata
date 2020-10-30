
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD>

 * <STYLE type=text/css> p{margin:0px;}</STYLE>

 * </HEAD>

 * <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Contiene tutti i dati della lettura.</BODY></HTML>
 * 
 * <p>Classe Java per LetturaEE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LetturaEE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matricolaAttiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricolaReattiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricolaPotenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attivaF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attivaF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attivaF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reattivaF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reattivaF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reattivaF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="potenzaF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="potenzaF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="potenzaF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetturaEE", propOrder = {
    "matricolaAttiva",
    "matricolaReattiva",
    "matricolaPotenza",
    "attivaF1",
    "attivaF2",
    "attivaF3",
    "reattivaF1",
    "reattivaF2",
    "reattivaF3",
    "potenzaF1",
    "potenzaF2",
    "potenzaF3",
    "data",
    "tipologia"
})
public class LetturaEE {

    protected String matricolaAttiva;
    protected String matricolaReattiva;
    protected String matricolaPotenza;
    protected String attivaF1;
    protected String attivaF2;
    protected String attivaF3;
    protected String reattivaF1;
    protected String reattivaF2;
    protected String reattivaF3;
    protected String potenzaF1;
    protected String potenzaF2;
    protected String potenzaF3;
    protected String data;
    protected String tipologia;

    /**
     * Recupera il valore della proprietà matricolaAttiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricolaAttiva() {
        return matricolaAttiva;
    }

    /**
     * Imposta il valore della proprietà matricolaAttiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricolaAttiva(String value) {
        this.matricolaAttiva = value;
    }

    /**
     * Recupera il valore della proprietà matricolaReattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricolaReattiva() {
        return matricolaReattiva;
    }

    /**
     * Imposta il valore della proprietà matricolaReattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricolaReattiva(String value) {
        this.matricolaReattiva = value;
    }

    /**
     * Recupera il valore della proprietà matricolaPotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricolaPotenza() {
        return matricolaPotenza;
    }

    /**
     * Imposta il valore della proprietà matricolaPotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricolaPotenza(String value) {
        this.matricolaPotenza = value;
    }

    /**
     * Recupera il valore della proprietà attivaF1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttivaF1() {
        return attivaF1;
    }

    /**
     * Imposta il valore della proprietà attivaF1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttivaF1(String value) {
        this.attivaF1 = value;
    }

    /**
     * Recupera il valore della proprietà attivaF2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttivaF2() {
        return attivaF2;
    }

    /**
     * Imposta il valore della proprietà attivaF2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttivaF2(String value) {
        this.attivaF2 = value;
    }

    /**
     * Recupera il valore della proprietà attivaF3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttivaF3() {
        return attivaF3;
    }

    /**
     * Imposta il valore della proprietà attivaF3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttivaF3(String value) {
        this.attivaF3 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaF1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReattivaF1() {
        return reattivaF1;
    }

    /**
     * Imposta il valore della proprietà reattivaF1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReattivaF1(String value) {
        this.reattivaF1 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaF2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReattivaF2() {
        return reattivaF2;
    }

    /**
     * Imposta il valore della proprietà reattivaF2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReattivaF2(String value) {
        this.reattivaF2 = value;
    }

    /**
     * Recupera il valore della proprietà reattivaF3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReattivaF3() {
        return reattivaF3;
    }

    /**
     * Imposta il valore della proprietà reattivaF3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReattivaF3(String value) {
        this.reattivaF3 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaF1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaF1() {
        return potenzaF1;
    }

    /**
     * Imposta il valore della proprietà potenzaF1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaF1(String value) {
        this.potenzaF1 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaF2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaF2() {
        return potenzaF2;
    }

    /**
     * Imposta il valore della proprietà potenzaF2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaF2(String value) {
        this.potenzaF2 = value;
    }

    /**
     * Recupera il valore della proprietà potenzaF3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaF3() {
        return potenzaF3;
    }

    /**
     * Imposta il valore della proprietà potenzaF3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaF3(String value) {
        this.potenzaF3 = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologia(String value) {
        this.tipologia = value;
    }

}
