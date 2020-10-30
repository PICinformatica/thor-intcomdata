
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Verifica complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Verifica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="verificaLaboratorio" type="{http://thor.edison.it}BooleanType" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="causeLaboratorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="riferimentoResoconto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dataSostituzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verifica", propOrder = {
    "esito",
    "verificaLaboratorio",
    "causeLaboratorio",
    "riferimentoResoconto",
    "dataSostituzione"
})
public class Verifica {

    protected String esito;
    protected String verificaLaboratorio;
    protected String causeLaboratorio;
    protected String riferimentoResoconto;
    protected String dataSostituzione;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà verificaLaboratorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificaLaboratorio() {
        return verificaLaboratorio;
    }

    /**
     * Imposta il valore della proprietà verificaLaboratorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificaLaboratorio(String value) {
        this.verificaLaboratorio = value;
    }

    /**
     * Recupera il valore della proprietà causeLaboratorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseLaboratorio() {
        return causeLaboratorio;
    }

    /**
     * Imposta il valore della proprietà causeLaboratorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseLaboratorio(String value) {
        this.causeLaboratorio = value;
    }

    /**
     * Recupera il valore della proprietà riferimentoResoconto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiferimentoResoconto() {
        return riferimentoResoconto;
    }

    /**
     * Imposta il valore della proprietà riferimentoResoconto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiferimentoResoconto(String value) {
        this.riferimentoResoconto = value;
    }

    /**
     * Recupera il valore della proprietà dataSostituzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSostituzione() {
        return dataSostituzione;
    }

    /**
     * Imposta il valore della proprietà dataSostituzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSostituzione(String value) {
        this.dataSostituzione = value;
    }

}
