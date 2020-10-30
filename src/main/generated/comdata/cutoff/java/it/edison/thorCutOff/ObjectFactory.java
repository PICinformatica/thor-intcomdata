
package it.edison.thorCutOff;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.edison.thor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.edison.thor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CutOff }
     * 
     */
    public CutOff createCutOff() {
        return new CutOff();
    }

    /**
     * Create an instance of {@link TSECUTOFF }
     * 
     */
    public TSECUTOFF createTSECUTOFF() {
        return new TSECUTOFF();
    }

    /**
     * Create an instance of {@link Azione }
     * 
     */
    public Azione createAzione() {
        return new Azione();
    }

}
