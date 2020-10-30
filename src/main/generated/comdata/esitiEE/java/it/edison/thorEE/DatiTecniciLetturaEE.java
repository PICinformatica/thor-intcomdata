
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD> <STYLE type=text/css> p{margin:0px;}</STYLE> </HEAD> <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Dati misuratore</BODY></HTML>
 * 
 * <p>Classe Java per DatiTecniciLetturaEE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiTecniciLetturaEE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lettura" type="{http://thor.edison.it}LetturaEE" minOccurs="0"/&gt;
 *         &lt;element name="misuratoreElettronico" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="tipologiaMisuratore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costanteTrasferimentoAttiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costanteTrasferimentoReattiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costanteTrasferimentoPotenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="malfunzionamento" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="acquisitoConsensoSostituzione" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="immediataSostituzione" type="{http://thor.edison.it}BooleanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTecniciLetturaEE", propOrder = {
    "lettura",
    "misuratoreElettronico",
    "tipologiaMisuratore",
    "costanteTrasferimentoAttiva",
    "costanteTrasferimentoReattiva",
    "costanteTrasferimentoPotenza",
    "malfunzionamento",
    "acquisitoConsensoSostituzione",
    "immediataSostituzione"
})
public class DatiTecniciLetturaEE {

    protected LetturaEE lettura;
    protected String misuratoreElettronico;
    protected String tipologiaMisuratore;
    protected String costanteTrasferimentoAttiva;
    protected String costanteTrasferimentoReattiva;
    protected String costanteTrasferimentoPotenza;
    protected String malfunzionamento;
    protected String acquisitoConsensoSostituzione;
    protected String immediataSostituzione;

    /**
     * Recupera il valore della proprietà lettura.
     * 
     * @return
     *     possible object is
     *     {@link LetturaEE }
     *     
     */
    public LetturaEE getLettura() {
        return lettura;
    }

    /**
     * Imposta il valore della proprietà lettura.
     * 
     * @param value
     *     allowed object is
     *     {@link LetturaEE }
     *     
     */
    public void setLettura(LetturaEE value) {
        this.lettura = value;
    }

    /**
     * Recupera il valore della proprietà misuratoreElettronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisuratoreElettronico() {
        return misuratoreElettronico;
    }

    /**
     * Imposta il valore della proprietà misuratoreElettronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisuratoreElettronico(String value) {
        this.misuratoreElettronico = value;
    }

    /**
     * Recupera il valore della proprietà tipologiaMisuratore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiaMisuratore() {
        return tipologiaMisuratore;
    }

    /**
     * Imposta il valore della proprietà tipologiaMisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiaMisuratore(String value) {
        this.tipologiaMisuratore = value;
    }

    /**
     * Recupera il valore della proprietà costanteTrasferimentoAttiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostanteTrasferimentoAttiva() {
        return costanteTrasferimentoAttiva;
    }

    /**
     * Imposta il valore della proprietà costanteTrasferimentoAttiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostanteTrasferimentoAttiva(String value) {
        this.costanteTrasferimentoAttiva = value;
    }

    /**
     * Recupera il valore della proprietà costanteTrasferimentoReattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostanteTrasferimentoReattiva() {
        return costanteTrasferimentoReattiva;
    }

    /**
     * Imposta il valore della proprietà costanteTrasferimentoReattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostanteTrasferimentoReattiva(String value) {
        this.costanteTrasferimentoReattiva = value;
    }

    /**
     * Recupera il valore della proprietà costanteTrasferimentoPotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostanteTrasferimentoPotenza() {
        return costanteTrasferimentoPotenza;
    }

    /**
     * Imposta il valore della proprietà costanteTrasferimentoPotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostanteTrasferimentoPotenza(String value) {
        this.costanteTrasferimentoPotenza = value;
    }

    /**
     * Recupera il valore della proprietà malfunzionamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMalfunzionamento() {
        return malfunzionamento;
    }

    /**
     * Imposta il valore della proprietà malfunzionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMalfunzionamento(String value) {
        this.malfunzionamento = value;
    }

    /**
     * Recupera il valore della proprietà acquisitoConsensoSostituzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisitoConsensoSostituzione() {
        return acquisitoConsensoSostituzione;
    }

    /**
     * Imposta il valore della proprietà acquisitoConsensoSostituzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisitoConsensoSostituzione(String value) {
        this.acquisitoConsensoSostituzione = value;
    }

    /**
     * Recupera il valore della proprietà immediataSostituzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmediataSostituzione() {
        return immediataSostituzione;
    }

    /**
     * Imposta il valore della proprietà immediataSostituzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmediataSostituzione(String value) {
        this.immediataSostituzione = value;
    }

}
