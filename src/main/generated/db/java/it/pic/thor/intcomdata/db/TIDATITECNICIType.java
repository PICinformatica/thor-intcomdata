
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DATI_TECNICIType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DATI_TECNICIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDR_PRESSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAX_PRELIEVO_ORA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_TOTALE_UTILIZZATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CATEGORIA_USO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLASSE_PRELIEVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRELIEVO_ANNUO_PREVISTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_MAX_RICHIESTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTENZA_TOTALE_INSTALLATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EROGAZIONE_SERVIZIO_ENERGIA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHIPPER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORNITURA_REMI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CONSUMO_ANNUO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATI_TECNICI_RICHIESTI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COMPETENZA_LETTURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PERIODICITA_LETTURA">
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
@XmlType(name = "T_I_DATI_TECNICIType", propOrder = {
    "pdrpressione",
    "maxprelievoora",
    "potenzatotaleutilizzata",
    "categoriauso",
    "classeprelievo",
    "prelievoannuoprevisto",
    "potenzamaxrichiesta",
    "potenzatotaleinstallata",
    "erogazioneservizioenergia",
    "shipper",
    "fornituraremi",
    "cg",
    "consumoannuo",
    "datitecnicirichiesti",
    "competenzalettura",
    "periodicitalettura"
})
public class TIDATITECNICIType {

    @XmlElement(name = "PDR_PRESSIONE", required = true)
    protected String pdrpressione;
    @XmlElement(name = "MAX_PRELIEVO_ORA", required = true)
    protected String maxprelievoora;
    @XmlElement(name = "POTENZA_TOTALE_UTILIZZATA", required = true)
    protected String potenzatotaleutilizzata;
    @XmlElement(name = "CATEGORIA_USO", required = true)
    protected String categoriauso;
    @XmlElement(name = "CLASSE_PRELIEVO", required = true)
    protected String classeprelievo;
    @XmlElement(name = "PRELIEVO_ANNUO_PREVISTO", required = true)
    protected String prelievoannuoprevisto;
    @XmlElement(name = "POTENZA_MAX_RICHIESTA", required = true)
    protected String potenzamaxrichiesta;
    @XmlElement(name = "POTENZA_TOTALE_INSTALLATA", required = true)
    protected String potenzatotaleinstallata;
    @XmlElement(name = "EROGAZIONE_SERVIZIO_ENERGIA", required = true)
    protected String erogazioneservizioenergia;
    @XmlElement(name = "SHIPPER", required = true)
    protected String shipper;
    @XmlElement(name = "FORNITURA_REMI", required = true)
    protected String fornituraremi;
    @XmlElement(name = "CG", required = true)
    protected String cg;
    @XmlElement(name = "CONSUMO_ANNUO", required = true)
    protected String consumoannuo;
    @XmlElement(name = "DATI_TECNICI_RICHIESTI", required = true)
    protected String datitecnicirichiesti;
    @XmlElement(name = "COMPETENZA_LETTURA", required = true)
    protected String competenzalettura;
    @XmlElement(name = "PERIODICITA_LETTURA", required = true)
    protected String periodicitalettura;

    /**
     * Recupera il valore della proprietà pdrpressione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDRPRESSIONE() {
        return pdrpressione;
    }

    /**
     * Imposta il valore della proprietà pdrpressione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDRPRESSIONE(String value) {
        this.pdrpressione = value;
    }

    /**
     * Recupera il valore della proprietà maxprelievoora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXPRELIEVOORA() {
        return maxprelievoora;
    }

    /**
     * Imposta il valore della proprietà maxprelievoora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXPRELIEVOORA(String value) {
        this.maxprelievoora = value;
    }

    /**
     * Recupera il valore della proprietà potenzatotaleutilizzata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZATOTALEUTILIZZATA() {
        return potenzatotaleutilizzata;
    }

    /**
     * Imposta il valore della proprietà potenzatotaleutilizzata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZATOTALEUTILIZZATA(String value) {
        this.potenzatotaleutilizzata = value;
    }

    /**
     * Recupera il valore della proprietà categoriauso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIAUSO() {
        return categoriauso;
    }

    /**
     * Imposta il valore della proprietà categoriauso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIAUSO(String value) {
        this.categoriauso = value;
    }

    /**
     * Recupera il valore della proprietà classeprelievo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSEPRELIEVO() {
        return classeprelievo;
    }

    /**
     * Imposta il valore della proprietà classeprelievo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSEPRELIEVO(String value) {
        this.classeprelievo = value;
    }

    /**
     * Recupera il valore della proprietà prelievoannuoprevisto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRELIEVOANNUOPREVISTO() {
        return prelievoannuoprevisto;
    }

    /**
     * Imposta il valore della proprietà prelievoannuoprevisto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRELIEVOANNUOPREVISTO(String value) {
        this.prelievoannuoprevisto = value;
    }

    /**
     * Recupera il valore della proprietà potenzamaxrichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZAMAXRICHIESTA() {
        return potenzamaxrichiesta;
    }

    /**
     * Imposta il valore della proprietà potenzamaxrichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZAMAXRICHIESTA(String value) {
        this.potenzamaxrichiesta = value;
    }

    /**
     * Recupera il valore della proprietà potenzatotaleinstallata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENZATOTALEINSTALLATA() {
        return potenzatotaleinstallata;
    }

    /**
     * Imposta il valore della proprietà potenzatotaleinstallata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENZATOTALEINSTALLATA(String value) {
        this.potenzatotaleinstallata = value;
    }

    /**
     * Recupera il valore della proprietà erogazioneservizioenergia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEROGAZIONESERVIZIOENERGIA() {
        return erogazioneservizioenergia;
    }

    /**
     * Imposta il valore della proprietà erogazioneservizioenergia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEROGAZIONESERVIZIOENERGIA(String value) {
        this.erogazioneservizioenergia = value;
    }

    /**
     * Recupera il valore della proprietà shipper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHIPPER() {
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
    public void setSHIPPER(String value) {
        this.shipper = value;
    }

    /**
     * Recupera il valore della proprietà fornituraremi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORNITURAREMI() {
        return fornituraremi;
    }

    /**
     * Imposta il valore della proprietà fornituraremi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORNITURAREMI(String value) {
        this.fornituraremi = value;
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
     * Recupera il valore della proprietà consumoannuo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSUMOANNUO() {
        return consumoannuo;
    }

    /**
     * Imposta il valore della proprietà consumoannuo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSUMOANNUO(String value) {
        this.consumoannuo = value;
    }

    /**
     * Recupera il valore della proprietà datitecnicirichiesti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATITECNICIRICHIESTI() {
        return datitecnicirichiesti;
    }

    /**
     * Imposta il valore della proprietà datitecnicirichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATITECNICIRICHIESTI(String value) {
        this.datitecnicirichiesti = value;
    }

    /**
     * Recupera il valore della proprietà competenzalettura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPETENZALETTURA() {
        return competenzalettura;
    }

    /**
     * Imposta il valore della proprietà competenzalettura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPETENZALETTURA(String value) {
        this.competenzalettura = value;
    }

    /**
     * Recupera il valore della proprietà periodicitalettura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERIODICITALETTURA() {
        return periodicitalettura;
    }

    /**
     * Imposta il valore della proprietà periodicitalettura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERIODICITALETTURA(String value) {
        this.periodicitalettura = value;
    }

}
