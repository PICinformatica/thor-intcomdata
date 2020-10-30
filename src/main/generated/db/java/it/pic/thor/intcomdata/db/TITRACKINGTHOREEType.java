
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_TRACKING_THOR_EEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_TRACKING_THOR_EEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CD_PRATICA_THOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERVIZIO_THOR" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="SERVIZIO_DL" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="STATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTRIBUTORE" type="{}T_I_DISTRIBUTOREType"/>
 *         &lt;element name="SOCIETA_VENDITA" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="AREA_GESTIONALE" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="AREA_GESTIONALE_USCENTE" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="SISTEMA_FATTURAZIONE" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="SISTEMA_ORIGINE" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="SISTEMA_DESTINAZIONE" type="{}T_I_DETTAGLIOType"/>
 *         &lt;element name="CD_PRATICA_MITTENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_PRATICA_TRADER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLUSSO" type="{}T_I_INFO_FLUSSOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PARTITA_IVA_EDISON">
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
@XmlType(name = "T_I_TRACKING_THOR_EEType", propOrder = {
    "cdpraticathor",
    "pod",
    "serviziothor",
    "serviziodl",
    "stato",
    "distributore",
    "societavendita",
    "areagestionale",
    "areagestionaleuscente",
    "sistemafatturazione",
    "sistemaorigine",
    "sistemadestinazione",
    "cdpraticamittente",
    "cdpraticadl",
    "cdpraticatrader",
    "flusso",
    "partitaivaedison"
})
public class TITRACKINGTHOREEType {

    @XmlElement(name = "CD_PRATICA_THOR", required = true)
    protected String cdpraticathor;
    @XmlElement(name = "POD", required = true)
    protected String pod;
    @XmlElement(name = "SERVIZIO_THOR", required = true)
    protected TIDETTAGLIOType serviziothor;
    @XmlElement(name = "SERVIZIO_DL", required = true)
    protected TIDETTAGLIOType serviziodl;
    @XmlElement(name = "STATO", required = true)
    protected String stato;
    @XmlElement(name = "DISTRIBUTORE", required = true)
    protected TIDISTRIBUTOREType distributore;
    @XmlElement(name = "SOCIETA_VENDITA", required = true)
    protected TIDETTAGLIOType societavendita;
    @XmlElement(name = "AREA_GESTIONALE", required = true)
    protected TIDETTAGLIOType areagestionale;
    @XmlElement(name = "AREA_GESTIONALE_USCENTE", required = true)
    protected TIDETTAGLIOType areagestionaleuscente;
    @XmlElement(name = "SISTEMA_FATTURAZIONE", required = true)
    protected TIDETTAGLIOType sistemafatturazione;
    @XmlElement(name = "SISTEMA_ORIGINE", required = true)
    protected TIDETTAGLIOType sistemaorigine;
    @XmlElement(name = "SISTEMA_DESTINAZIONE", required = true)
    protected TIDETTAGLIOType sistemadestinazione;
    @XmlElement(name = "CD_PRATICA_MITTENTE", required = true)
    protected String cdpraticamittente;
    @XmlElement(name = "CD_PRATICA_DL", required = true)
    protected String cdpraticadl;
    @XmlElement(name = "CD_PRATICA_TRADER", required = true)
    protected String cdpraticatrader;
    @XmlElement(name = "FLUSSO")
    protected List<TIINFOFLUSSOType> flusso;
    @XmlElement(name = "PARTITA_IVA_EDISON", required = true)
    protected String partitaivaedison;

    /**
     * Recupera il valore della proprietà cdpraticathor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICATHOR() {
        return cdpraticathor;
    }

    /**
     * Imposta il valore della proprietà cdpraticathor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICATHOR(String value) {
        this.cdpraticathor = value;
    }

    /**
     * Recupera il valore della proprietà pod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOD() {
        return pod;
    }

    /**
     * Imposta il valore della proprietà pod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOD(String value) {
        this.pod = value;
    }

    /**
     * Recupera il valore della proprietà serviziothor.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSERVIZIOTHOR() {
        return serviziothor;
    }

    /**
     * Imposta il valore della proprietà serviziothor.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSERVIZIOTHOR(TIDETTAGLIOType value) {
        this.serviziothor = value;
    }

    /**
     * Recupera il valore della proprietà serviziodl.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSERVIZIODL() {
        return serviziodl;
    }

    /**
     * Imposta il valore della proprietà serviziodl.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSERVIZIODL(TIDETTAGLIOType value) {
        this.serviziodl = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATO() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATO(String value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà distributore.
     * 
     * @return
     *     possible object is
     *     {@link TIDISTRIBUTOREType }
     *     
     */
    public TIDISTRIBUTOREType getDISTRIBUTORE() {
        return distributore;
    }

    /**
     * Imposta il valore della proprietà distributore.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDISTRIBUTOREType }
     *     
     */
    public void setDISTRIBUTORE(TIDISTRIBUTOREType value) {
        this.distributore = value;
    }

    /**
     * Recupera il valore della proprietà societavendita.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSOCIETAVENDITA() {
        return societavendita;
    }

    /**
     * Imposta il valore della proprietà societavendita.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSOCIETAVENDITA(TIDETTAGLIOType value) {
        this.societavendita = value;
    }

    /**
     * Recupera il valore della proprietà areagestionale.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getAREAGESTIONALE() {
        return areagestionale;
    }

    /**
     * Imposta il valore della proprietà areagestionale.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setAREAGESTIONALE(TIDETTAGLIOType value) {
        this.areagestionale = value;
    }

    /**
     * Recupera il valore della proprietà areagestionaleuscente.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getAREAGESTIONALEUSCENTE() {
        return areagestionaleuscente;
    }

    /**
     * Imposta il valore della proprietà areagestionaleuscente.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setAREAGESTIONALEUSCENTE(TIDETTAGLIOType value) {
        this.areagestionaleuscente = value;
    }

    /**
     * Recupera il valore della proprietà sistemafatturazione.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSISTEMAFATTURAZIONE() {
        return sistemafatturazione;
    }

    /**
     * Imposta il valore della proprietà sistemafatturazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSISTEMAFATTURAZIONE(TIDETTAGLIOType value) {
        this.sistemafatturazione = value;
    }

    /**
     * Recupera il valore della proprietà sistemaorigine.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSISTEMAORIGINE() {
        return sistemaorigine;
    }

    /**
     * Imposta il valore della proprietà sistemaorigine.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSISTEMAORIGINE(TIDETTAGLIOType value) {
        this.sistemaorigine = value;
    }

    /**
     * Recupera il valore della proprietà sistemadestinazione.
     * 
     * @return
     *     possible object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public TIDETTAGLIOType getSISTEMADESTINAZIONE() {
        return sistemadestinazione;
    }

    /**
     * Imposta il valore della proprietà sistemadestinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TIDETTAGLIOType }
     *     
     */
    public void setSISTEMADESTINAZIONE(TIDETTAGLIOType value) {
        this.sistemadestinazione = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticamittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICAMITTENTE() {
        return cdpraticamittente;
    }

    /**
     * Imposta il valore della proprietà cdpraticamittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICAMITTENTE(String value) {
        this.cdpraticamittente = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticadl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICADL() {
        return cdpraticadl;
    }

    /**
     * Imposta il valore della proprietà cdpraticadl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICADL(String value) {
        this.cdpraticadl = value;
    }

    /**
     * Recupera il valore della proprietà cdpraticatrader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDPRATICATRADER() {
        return cdpraticatrader;
    }

    /**
     * Imposta il valore della proprietà cdpraticatrader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDPRATICATRADER(String value) {
        this.cdpraticatrader = value;
    }

    /**
     * Gets the value of the flusso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flusso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFLUSSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIINFOFLUSSOType }
     * 
     * 
     */
    public List<TIINFOFLUSSOType> getFLUSSO() {
        if (flusso == null) {
            flusso = new ArrayList<TIINFOFLUSSOType>();
        }
        return this.flusso;
    }

    /**
     * Recupera il valore della proprietà partitaivaedison.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTITAIVAEDISON() {
        return partitaivaedison;
    }

    /**
     * Imposta il valore della proprietà partitaivaedison.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTITAIVAEDISON(String value) {
        this.partitaivaedison = value;
    }

}
