
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_DATI_TECNICI_LETTURA_EEType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_DATI_TECNICI_LETTURA_EEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LETTURA" type="{}T_I_LETTURA_EEType"/>
 *         &lt;element name="MISURATORE_ELETTRONICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_MISURATORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COSTANTE_TRASF_ATTIVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COSTANTE_TRASF_REATTIVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COSTANTE_TRASF_POTENZA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MALFUNZIONAMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACQUISITO_CONS_SOST">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMMEDIATA_SOST">
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
@XmlType(name = "T_I_DATI_TECNICI_LETTURA_EEType", propOrder = {
    "lettura",
    "misuratoreelettronico",
    "tipologiamisuratore",
    "costantetrasfattiva",
    "costantetrasfreattiva",
    "costantetrasfpotenza",
    "malfunzionamento",
    "acquisitoconssost",
    "immediatasost"
})
public class TIDATITECNICILETTURAEEType {

    @XmlElement(name = "LETTURA", required = true)
    protected TILETTURAEEType lettura;
    @XmlElement(name = "MISURATORE_ELETTRONICO", required = true)
    protected String misuratoreelettronico;
    @XmlElement(name = "TIPOLOGIA_MISURATORE", required = true)
    protected String tipologiamisuratore;
    @XmlElement(name = "COSTANTE_TRASF_ATTIVA", required = true)
    protected String costantetrasfattiva;
    @XmlElement(name = "COSTANTE_TRASF_REATTIVA", required = true)
    protected String costantetrasfreattiva;
    @XmlElement(name = "COSTANTE_TRASF_POTENZA", required = true)
    protected String costantetrasfpotenza;
    @XmlElement(name = "MALFUNZIONAMENTO", required = true)
    protected String malfunzionamento;
    @XmlElement(name = "ACQUISITO_CONS_SOST", required = true)
    protected String acquisitoconssost;
    @XmlElement(name = "IMMEDIATA_SOST", required = true)
    protected String immediatasost;

    /**
     * Recupera il valore della proprietà lettura.
     * 
     * @return
     *     possible object is
     *     {@link TILETTURAEEType }
     *     
     */
    public TILETTURAEEType getLETTURA() {
        return lettura;
    }

    /**
     * Imposta il valore della proprietà lettura.
     * 
     * @param value
     *     allowed object is
     *     {@link TILETTURAEEType }
     *     
     */
    public void setLETTURA(TILETTURAEEType value) {
        this.lettura = value;
    }

    /**
     * Recupera il valore della proprietà misuratoreelettronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISURATOREELETTRONICO() {
        return misuratoreelettronico;
    }

    /**
     * Imposta il valore della proprietà misuratoreelettronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISURATOREELETTRONICO(String value) {
        this.misuratoreelettronico = value;
    }

    /**
     * Recupera il valore della proprietà tipologiamisuratore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLOGIAMISURATORE() {
        return tipologiamisuratore;
    }

    /**
     * Imposta il valore della proprietà tipologiamisuratore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLOGIAMISURATORE(String value) {
        this.tipologiamisuratore = value;
    }

    /**
     * Recupera il valore della proprietà costantetrasfattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTANTETRASFATTIVA() {
        return costantetrasfattiva;
    }

    /**
     * Imposta il valore della proprietà costantetrasfattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTANTETRASFATTIVA(String value) {
        this.costantetrasfattiva = value;
    }

    /**
     * Recupera il valore della proprietà costantetrasfreattiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTANTETRASFREATTIVA() {
        return costantetrasfreattiva;
    }

    /**
     * Imposta il valore della proprietà costantetrasfreattiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTANTETRASFREATTIVA(String value) {
        this.costantetrasfreattiva = value;
    }

    /**
     * Recupera il valore della proprietà costantetrasfpotenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTANTETRASFPOTENZA() {
        return costantetrasfpotenza;
    }

    /**
     * Imposta il valore della proprietà costantetrasfpotenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTANTETRASFPOTENZA(String value) {
        this.costantetrasfpotenza = value;
    }

    /**
     * Recupera il valore della proprietà malfunzionamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMALFUNZIONAMENTO() {
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
    public void setMALFUNZIONAMENTO(String value) {
        this.malfunzionamento = value;
    }

    /**
     * Recupera il valore della proprietà acquisitoconssost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACQUISITOCONSSOST() {
        return acquisitoconssost;
    }

    /**
     * Imposta il valore della proprietà acquisitoconssost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACQUISITOCONSSOST(String value) {
        this.acquisitoconssost = value;
    }

    /**
     * Recupera il valore della proprietà immediatasost.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMMEDIATASOST() {
        return immediatasost;
    }

    /**
     * Imposta il valore della proprietà immediatasost.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMMEDIATASOST(String value) {
        this.immediatasost = value;
    }

}
