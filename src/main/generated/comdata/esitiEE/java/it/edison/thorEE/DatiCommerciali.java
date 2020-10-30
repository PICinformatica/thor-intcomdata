
package it.edison.thorEE;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <HTML><HEAD> <STYLE type=text/css> p{margin:0px;}</STYLE> </HEAD> <BODY style="FONT-FAMILY: arial; FONT-SIZE: 10pt" bgColor=#f5f5f5>Dati commerciali del cliente a sistema</BODY></HTML>
 * 
 * <p>Classe Java per DatiCommerciali complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiCommerciali"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usoEnergia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoContratto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settoreMerceologico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trattamentoIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzioneTariffaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiCommerciali", propOrder = {
    "usoEnergia",
    "tipoContratto",
    "settoreMerceologico",
    "trattamentoIva",
    "opzioneTariffaria"
})
public class DatiCommerciali {

    protected String usoEnergia;
    protected String tipoContratto;
    protected String settoreMerceologico;
    protected String trattamentoIva;
    protected String opzioneTariffaria;

    /**
     * Recupera il valore della proprietà usoEnergia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoEnergia() {
        return usoEnergia;
    }

    /**
     * Imposta il valore della proprietà usoEnergia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoEnergia(String value) {
        this.usoEnergia = value;
    }

    /**
     * Recupera il valore della proprietà tipoContratto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContratto() {
        return tipoContratto;
    }

    /**
     * Imposta il valore della proprietà tipoContratto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContratto(String value) {
        this.tipoContratto = value;
    }

    /**
     * Recupera il valore della proprietà settoreMerceologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettoreMerceologico() {
        return settoreMerceologico;
    }

    /**
     * Imposta il valore della proprietà settoreMerceologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettoreMerceologico(String value) {
        this.settoreMerceologico = value;
    }

    /**
     * Recupera il valore della proprietà trattamentoIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrattamentoIva() {
        return trattamentoIva;
    }

    /**
     * Imposta il valore della proprietà trattamentoIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrattamentoIva(String value) {
        this.trattamentoIva = value;
    }

    /**
     * Recupera il valore della proprietà opzioneTariffaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzioneTariffaria() {
        return opzioneTariffaria;
    }

    /**
     * Imposta il valore della proprietà opzioneTariffaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzioneTariffaria(String value) {
        this.opzioneTariffaria = value;
    }

}
