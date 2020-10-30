
package it.pic.thor.intcomdata.db;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per T_I_PREVENTIVOType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_PREVENTIVOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CD_DL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMPORTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DT_SCADENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GIORNI_MAX_ESECUZIONE_LAVORO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}T_I_DETTAGLIO_PREVENTIVOType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NOTE">
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
@XmlType(name = "T_I_PREVENTIVOType", propOrder = {
    "id",
    "cddl",
    "importo",
    "dtscadenza",
    "giornimaxesecuzionelavoro",
    "dettaglio",
    "note"
})
public class TIPREVENTIVOType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "CD_DL", required = true)
    protected String cddl;
    @XmlElement(name = "IMPORTO", required = true)
    protected String importo;
    @XmlElement(name = "DT_SCADENZA", required = true)
    protected String dtscadenza;
    @XmlElement(name = "GIORNI_MAX_ESECUZIONE_LAVORO", required = true)
    protected String giornimaxesecuzionelavoro;
    @XmlElementWrapper(name = "DETTAGLIO")
    @XmlElement(name = "T_I_DETTAGLIO_PREVENTIVO")
    protected List<TIDETTAGLIOPREVENTIVOType> dettaglio;
    @XmlElement(name = "NOTE", required = true)
    protected String note;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà cddl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDDL() {
        return cddl;
    }

    /**
     * Imposta il valore della proprietà cddl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDDL(String value) {
        this.cddl = value;
    }

    /**
     * Recupera il valore della proprietà importo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPORTO() {
        return importo;
    }

    /**
     * Imposta il valore della proprietà importo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPORTO(String value) {
        this.importo = value;
    }

    /**
     * Recupera il valore della proprietà dtscadenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSCADENZA() {
        return dtscadenza;
    }

    /**
     * Imposta il valore della proprietà dtscadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSCADENZA(String value) {
        this.dtscadenza = value;
    }

    /**
     * Recupera il valore della proprietà giornimaxesecuzionelavoro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIORNIMAXESECUZIONELAVORO() {
        return giornimaxesecuzionelavoro;
    }

    /**
     * Imposta il valore della proprietà giornimaxesecuzionelavoro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIORNIMAXESECUZIONELAVORO(String value) {
        this.giornimaxesecuzionelavoro = value;
    }

    /**
     * Gets the value of the dettaglio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDETTAGLIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIDETTAGLIOPREVENTIVOType }
     * 
     * 
     */
    public List<TIDETTAGLIOPREVENTIVOType> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<TIDETTAGLIOPREVENTIVOType>();
        }
        return this.dettaglio;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTE() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTE(String value) {
        this.note = value;
    }

}
