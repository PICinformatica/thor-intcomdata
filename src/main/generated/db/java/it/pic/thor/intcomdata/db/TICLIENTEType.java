
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_CLIENTEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_CLIENTEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COGNOME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RAGIONE_SOCIALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_FISCALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PT_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TELEFONO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMAIL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CELLULARE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FAX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_FISCALE_STRANIERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
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
@XmlType(name = "T_I_CLIENTEType", propOrder = {
    "nome",
    "cognome",
    "ragionesociale",
    "cdfiscale",
    "ptiva",
    "telefono",
    "email",
    "cellulare",
    "fax",
    "cdfiscalestraniero"
})
public class TICLIENTEType {

    @XmlElement(name = "NOME", required = true)
    protected String nome;
    @XmlElement(name = "COGNOME", required = true)
    protected String cognome;
    @XmlElement(name = "RAGIONE_SOCIALE", required = true)
    protected String ragionesociale;
    @XmlElement(name = "CD_FISCALE", required = true)
    protected String cdfiscale;
    @XmlElement(name = "PT_IVA", required = true)
    protected String ptiva;
    @XmlElement(name = "TELEFONO", required = true)
    protected String telefono;
    @XmlElement(name = "EMAIL", required = true)
    protected String email;
    @XmlElement(name = "CELLULARE", required = true)
    protected String cellulare;
    @XmlElement(name = "FAX", required = true)
    protected String fax;
    @XmlElement(name = "CD_FISCALE_STRANIERO", required = true)
    protected String cdfiscalestraniero;

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOME() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOME(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOGNOME() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOGNOME(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà ragionesociale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAGIONESOCIALE() {
        return ragionesociale;
    }

    /**
     * Imposta il valore della proprietà ragionesociale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAGIONESOCIALE(String value) {
        this.ragionesociale = value;
    }

    /**
     * Recupera il valore della proprietà cdfiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDFISCALE() {
        return cdfiscale;
    }

    /**
     * Imposta il valore della proprietà cdfiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDFISCALE(String value) {
        this.cdfiscale = value;
    }

    /**
     * Recupera il valore della proprietà ptiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTIVA() {
        return ptiva;
    }

    /**
     * Imposta il valore della proprietà ptiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTIVA(String value) {
        this.ptiva = value;
    }

    /**
     * Recupera il valore della proprietà telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO() {
        return telefono;
    }

    /**
     * Imposta il valore della proprietà telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO(String value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà cellulare.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCELLULARE() {
        return cellulare;
    }

    /**
     * Imposta il valore della proprietà cellulare.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCELLULARE(String value) {
        this.cellulare = value;
    }

    /**
     * Recupera il valore della proprietà fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Imposta il valore della proprietà fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Recupera il valore della proprietà cdfiscalestraniero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDFISCALESTRANIERO() {
        return cdfiscalestraniero;
    }

    /**
     * Imposta il valore della proprietà cdfiscalestraniero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDFISCALESTRANIERO(String value) {
        this.cdfiscalestraniero = value;
    }

}
