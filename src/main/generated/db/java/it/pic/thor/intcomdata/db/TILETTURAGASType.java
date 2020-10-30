
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_LETTURA_GASType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_LETTURA_GASType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MATRICOLA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NR_CIFRE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLASSE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANNO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VALORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_LETTURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COEFF_C">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACCESSIBILITA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_ULTIMA_VERIFICA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRUPPO_MIS_INTEGRATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_INSTALLAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEGESTIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_I_LETTURA_GASType", propOrder = {
    "matricola",
    "nrcifre",
    "classe",
    "anno",
    "valore",
    "dtlettura",
    "tipo",
    "coeffc",
    "accessibilita",
    "dtultimaverifica",
    "gruppomisintegrato",
    "datainstallazione",
    "telegestione",
    "tipologia"
})
public class TILETTURAGASType {

    @XmlElement(name = "MATRICOLA", required = true)
    protected String matricola;
    @XmlElement(name = "NR_CIFRE", required = true)
    protected String nrcifre;
    @XmlElement(name = "CLASSE", required = true)
    protected String classe;
    @XmlElement(name = "ANNO", required = true)
    protected String anno;
    @XmlElement(name = "VALORE", required = true)
    protected String valore;
    @XmlElement(name = "DT_LETTURA", required = true)
    protected String dtlettura;
    @XmlElement(name = "TIPO", required = true)
    protected String tipo;
    @XmlElement(name = "COEFF_C", required = true)
    protected String coeffc;
    @XmlElement(name = "ACCESSIBILITA", required = true)
    protected String accessibilita;
    @XmlElement(name = "DT_ULTIMA_VERIFICA", required = true)
    protected String dtultimaverifica;
    @XmlElement(name = "GRUPPO_MIS_INTEGRATO", required = true)
    protected String gruppomisintegrato;
    @XmlElement(name = "DATA_INSTALLAZIONE", required = true)
    protected String datainstallazione;
    @XmlElement(name = "TELEGESTIONE", required = true)
    protected String telegestione;
    @XmlElement(name = "TIPOLOGIA", required = true)
    protected String tipologia;

    /**
     * Recupera il valore della proprietà matricola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATRICOLA() {
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
    public void setMATRICOLA(String value) {
        this.matricola = value;
    }

    /**
     * Recupera il valore della proprietà nrcifre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCIFRE() {
        return nrcifre;
    }

    /**
     * Imposta il valore della proprietà nrcifre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCIFRE(String value) {
        this.nrcifre = value;
    }

    /**
     * Recupera il valore della proprietà classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSE() {
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
    public void setCLASSE(String value) {
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
    public String getANNO() {
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
    public void setANNO(String value) {
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
    public String getVALORE() {
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
    public void setVALORE(String value) {
        this.valore = value;
    }

    /**
     * Recupera il valore della proprietà dtlettura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTLETTURA() {
        return dtlettura;
    }

    /**
     * Imposta il valore della proprietà dtlettura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTLETTURA(String value) {
        this.dtlettura = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
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
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà coeffc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOEFFC() {
        return coeffc;
    }

    /**
     * Imposta il valore della proprietà coeffc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOEFFC(String value) {
        this.coeffc = value;
    }

    /**
     * Recupera il valore della proprietà accessibilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCESSIBILITA() {
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
    public void setACCESSIBILITA(String value) {
        this.accessibilita = value;
    }

    /**
     * Recupera il valore della proprietà dtultimaverifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTULTIMAVERIFICA() {
        return dtultimaverifica;
    }

    /**
     * Imposta il valore della proprietà dtultimaverifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTULTIMAVERIFICA(String value) {
        this.dtultimaverifica = value;
    }

    /**
     * Recupera il valore della proprietà gruppomisintegrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPPOMISINTEGRATO() {
        return gruppomisintegrato;
    }

    /**
     * Imposta il valore della proprietà gruppomisintegrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPPOMISINTEGRATO(String value) {
        this.gruppomisintegrato = value;
    }

    /**
     * Recupera il valore della proprietà datainstallazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAINSTALLAZIONE() {
        return datainstallazione;
    }

    /**
     * Imposta il valore della proprietà datainstallazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAINSTALLAZIONE(String value) {
        this.datainstallazione = value;
    }

    /**
     * Recupera il valore della proprietà telegestione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEGESTIONE() {
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
    public void setTELEGESTIONE(String value) {
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
    public String getTIPOLOGIA() {
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
    public void setTIPOLOGIA(String value) {
        this.tipologia = value;
    }

}
