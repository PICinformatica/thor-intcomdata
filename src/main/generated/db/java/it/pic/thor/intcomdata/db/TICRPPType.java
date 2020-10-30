
package it.pic.thor.intcomdata.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per T_I_CRPPType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="T_I_CRPPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MM1_F1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM1_F2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM1_F3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM_F1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM_F2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM_F3">
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
@XmlType(name = "T_I_CRPPType", propOrder = {
    "mm1F1",
    "mm1F2",
    "mm1F3",
    "mmf1",
    "mmf2",
    "mmf3"
})
public class TICRPPType {

    @XmlElement(name = "MM1_F1", required = true)
    protected String mm1F1;
    @XmlElement(name = "MM1_F2", required = true)
    protected String mm1F2;
    @XmlElement(name = "MM1_F3", required = true)
    protected String mm1F3;
    @XmlElement(name = "MM_F1", required = true)
    protected String mmf1;
    @XmlElement(name = "MM_F2", required = true)
    protected String mmf2;
    @XmlElement(name = "MM_F3", required = true)
    protected String mmf3;

    /**
     * Recupera il valore della proprietà mm1F1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM1F1() {
        return mm1F1;
    }

    /**
     * Imposta il valore della proprietà mm1F1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM1F1(String value) {
        this.mm1F1 = value;
    }

    /**
     * Recupera il valore della proprietà mm1F2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM1F2() {
        return mm1F2;
    }

    /**
     * Imposta il valore della proprietà mm1F2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM1F2(String value) {
        this.mm1F2 = value;
    }

    /**
     * Recupera il valore della proprietà mm1F3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM1F3() {
        return mm1F3;
    }

    /**
     * Imposta il valore della proprietà mm1F3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM1F3(String value) {
        this.mm1F3 = value;
    }

    /**
     * Recupera il valore della proprietà mmf1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMF1() {
        return mmf1;
    }

    /**
     * Imposta il valore della proprietà mmf1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMF1(String value) {
        this.mmf1 = value;
    }

    /**
     * Recupera il valore della proprietà mmf2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMF2() {
        return mmf2;
    }

    /**
     * Imposta il valore della proprietà mmf2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMF2(String value) {
        this.mmf2 = value;
    }

    /**
     * Recupera il valore della proprietà mmf3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMF3() {
        return mmf3;
    }

    /**
     * Imposta il valore della proprietà mmf3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMF3(String value) {
        this.mmf3 = value;
    }

}
