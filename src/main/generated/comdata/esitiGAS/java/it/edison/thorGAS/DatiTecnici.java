
package it.edison.thorGAS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiTecnici complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiTecnici"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdrPressione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="maxPrelievoOra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="potenzaTotaleUtilizzata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="categoriaUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="classePrelievo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="prelievoAnnuoPrevisto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="potenzaMaxRichiesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="potenzaTotaleInstallata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="erogazioneServizioEnergia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="shipper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="fornituraREMI" type="{http://thor.edison.it}BooleanType" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="CG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="consumoAnnuo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="datiTecniciRichiesti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="competenzaLettura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="periodicitaLettura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTecnici", propOrder = {
    "pdrPressione",
    "maxPrelievoOra",
    "potenzaTotaleUtilizzata",
    "categoriaUso",
    "classePrelievo",
    "prelievoAnnuoPrevisto",
    "potenzaMaxRichiesta",
    "potenzaTotaleInstallata",
    "erogazioneServizioEnergia",
    "shipper",
    "fornituraREMI",
    "cg",
    "consumoAnnuo",
    "datiTecniciRichiesti",
    "competenzaLettura",
    "periodicitaLettura"
})
public class DatiTecnici {

    protected String pdrPressione;
    protected String maxPrelievoOra;
    protected String potenzaTotaleUtilizzata;
    protected String categoriaUso;
    protected String classePrelievo;
    protected String prelievoAnnuoPrevisto;
    protected String potenzaMaxRichiesta;
    protected String potenzaTotaleInstallata;
    protected String erogazioneServizioEnergia;
    protected String shipper;
    protected String fornituraREMI;
    @XmlElement(name = "CG")
    protected String cg;
    protected String consumoAnnuo;
    protected String datiTecniciRichiesti;
    protected String competenzaLettura;
    protected String periodicitaLettura;

    /**
     * Recupera il valore della proprietà pdrPressione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdrPressione() {
        return pdrPressione;
    }

    /**
     * Imposta il valore della proprietà pdrPressione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdrPressione(String value) {
        this.pdrPressione = value;
    }

    /**
     * Recupera il valore della proprietà maxPrelievoOra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrelievoOra() {
        return maxPrelievoOra;
    }

    /**
     * Imposta il valore della proprietà maxPrelievoOra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrelievoOra(String value) {
        this.maxPrelievoOra = value;
    }

    /**
     * Recupera il valore della proprietà potenzaTotaleUtilizzata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaTotaleUtilizzata() {
        return potenzaTotaleUtilizzata;
    }

    /**
     * Imposta il valore della proprietà potenzaTotaleUtilizzata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaTotaleUtilizzata(String value) {
        this.potenzaTotaleUtilizzata = value;
    }

    /**
     * Recupera il valore della proprietà categoriaUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaUso() {
        return categoriaUso;
    }

    /**
     * Imposta il valore della proprietà categoriaUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaUso(String value) {
        this.categoriaUso = value;
    }

    /**
     * Recupera il valore della proprietà classePrelievo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassePrelievo() {
        return classePrelievo;
    }

    /**
     * Imposta il valore della proprietà classePrelievo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassePrelievo(String value) {
        this.classePrelievo = value;
    }

    /**
     * Recupera il valore della proprietà prelievoAnnuoPrevisto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrelievoAnnuoPrevisto() {
        return prelievoAnnuoPrevisto;
    }

    /**
     * Imposta il valore della proprietà prelievoAnnuoPrevisto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrelievoAnnuoPrevisto(String value) {
        this.prelievoAnnuoPrevisto = value;
    }

    /**
     * Recupera il valore della proprietà potenzaMaxRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaMaxRichiesta() {
        return potenzaMaxRichiesta;
    }

    /**
     * Imposta il valore della proprietà potenzaMaxRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaMaxRichiesta(String value) {
        this.potenzaMaxRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà potenzaTotaleInstallata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenzaTotaleInstallata() {
        return potenzaTotaleInstallata;
    }

    /**
     * Imposta il valore della proprietà potenzaTotaleInstallata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenzaTotaleInstallata(String value) {
        this.potenzaTotaleInstallata = value;
    }

    /**
     * Recupera il valore della proprietà erogazioneServizioEnergia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErogazioneServizioEnergia() {
        return erogazioneServizioEnergia;
    }

    /**
     * Imposta il valore della proprietà erogazioneServizioEnergia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErogazioneServizioEnergia(String value) {
        this.erogazioneServizioEnergia = value;
    }

    /**
     * Recupera il valore della proprietà shipper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * Imposta il valore della proprietà shipper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipper(String value) {
        this.shipper = value;
    }

    /**
     * Recupera il valore della proprietà fornituraREMI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFornituraREMI() {
        return fornituraREMI;
    }

    /**
     * Imposta il valore della proprietà fornituraREMI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFornituraREMI(String value) {
        this.fornituraREMI = value;
    }

    /**
     * Recupera il valore della proprietà cg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCG() {
        return cg;
    }

    /**
     * Imposta il valore della proprietà cg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCG(String value) {
        this.cg = value;
    }

    /**
     * Recupera il valore della proprietà consumoAnnuo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoAnnuo() {
        return consumoAnnuo;
    }

    /**
     * Imposta il valore della proprietà consumoAnnuo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoAnnuo(String value) {
        this.consumoAnnuo = value;
    }

    /**
     * Recupera il valore della proprietà datiTecniciRichiesti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatiTecniciRichiesti() {
        return datiTecniciRichiesti;
    }

    /**
     * Imposta il valore della proprietà datiTecniciRichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatiTecniciRichiesti(String value) {
        this.datiTecniciRichiesti = value;
    }

    /**
     * Recupera il valore della proprietà competenzaLettura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetenzaLettura() {
        return competenzaLettura;
    }

    /**
     * Imposta il valore della proprietà competenzaLettura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetenzaLettura(String value) {
        this.competenzaLettura = value;
    }

    /**
     * Recupera il valore della proprietà periodicitaLettura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicitaLettura() {
        return periodicitaLettura;
    }

    /**
     * Imposta il valore della proprietà periodicitaLettura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicitaLettura(String value) {
        this.periodicitaLettura = value;
    }

}
