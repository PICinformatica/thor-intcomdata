
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Misuratore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Misuratore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matricola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="numeroCifre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="valore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="coeffC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="accessibilita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataUltimaVerifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="gruppoIntegrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataInstallazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telegestione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Misuratore", propOrder = {
    "matricola",
    "numeroCifre",
    "classe",
    "anno",
    "valore",
    "data",
    "tipo",
    "coeffC",
    "accessibilita",
    "dataUltimaVerifica",
    "gruppoIntegrato",
    "dataInstallazione",
    "telegestione",
    "tipologia"
})
public class Misuratore {

    protected String matricola;
    protected String numeroCifre;
    protected String classe;
    protected String anno;
    protected String valore;
    protected String data;
    protected String tipo;
    protected String coeffC;
    protected String accessibilita;
    protected String dataUltimaVerifica;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String gruppoIntegrato;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String dataInstallazione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String telegestione;
    @XmlElement(namespace = "http://thor.edison.it")
    protected String tipologia;

    /**
     * Recupera il valore della proprietà matricola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Imposta il valore della proprietà matricola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricola(String value) {
        this.matricola = value;
    }

    /**
     * Recupera il valore della proprietà numeroCifre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCifre() {
        return numeroCifre;
    }

    /**
     * Imposta il valore della proprietà numeroCifre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCifre(String value) {
        this.numeroCifre = value;
    }

    /**
     * Recupera il valore della proprietà classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Imposta il valore della proprietà classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasse(String value) {
        this.classe = value;
    }

    /**
     * Recupera il valore della proprietà anno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnno() {
        return anno;
    }

    /**
     * Imposta il valore della proprietà anno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnno(String value) {
        this.anno = value;
    }

    /**
     * Recupera il valore della proprietà valore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Imposta il valore della proprietà valore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
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
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà coeffC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoeffC() {
        return coeffC;
    }

    /**
     * Imposta il valore della proprietà coeffC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoeffC(String value) {
        this.coeffC = value;
    }

    /**
     * Recupera il valore della proprietà accessibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessibilita() {
        return accessibilita;
    }

    /**
     * Imposta il valore della proprietà accessibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessibilita(String value) {
        this.accessibilita = value;
    }

    /**
     * Recupera il valore della proprietà dataUltimaVerifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaVerifica() {
        return dataUltimaVerifica;
    }

    /**
     * Imposta il valore della proprietà dataUltimaVerifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaVerifica(String value) {
        this.dataUltimaVerifica = value;
    }

    /**
     * Recupera il valore della proprietà gruppoIntegrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppoIntegrato() {
        return gruppoIntegrato;
    }

    /**
     * Imposta il valore della proprietà gruppoIntegrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppoIntegrato(String value) {
        this.gruppoIntegrato = value;
    }

    /**
     * Recupera il valore della proprietà dataInstallazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInstallazione() {
        return dataInstallazione;
    }

    /**
     * Imposta il valore della proprietà dataInstallazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInstallazione(String value) {
        this.dataInstallazione = value;
    }

    /**
     * Recupera il valore della proprietà telegestione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelegestione() {
        return telegestione;
    }

    /**
     * Imposta il valore della proprietà telegestione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelegestione(String value) {
        this.telegestione = value;
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
