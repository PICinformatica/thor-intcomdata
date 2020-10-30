
package it.edison.thorGAS;

import it.edison.thorGAS.Ammissibilita;
import it.edison.thorGAS.ArrayOfDettaglioPreventivo;
import it.edison.thorGAS.DatiTecniciPreventivo;
import it.edison.thorGAS.DettaglioPreventivo;
import it.edison.thorGAS.Esito;
import it.edison.thorGAS.Preventivo;
import it.edison.thorGAS.Tracking;

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
     * Create an instance of {@link TSECOMDATAGASREQ }
     * 
     */
    public TSECOMDATAGASREQ createTSECOMDATAGASREQ() {
        return new TSECOMDATAGASREQ();
    }

    /**
     * Create an instance of {@link TSECOMDATAGASRESP }
     * 
     */
    public TSECOMDATAGASRESP createTSECOMDATAGASRESP() {
        return new TSECOMDATAGASRESP();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.Preventivo }
     * 
     */
    public it.edison.thorGAS.Preventivo createPreventivo() {
        return new Preventivo();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.ArrayOfDettaglioPreventivo }
     * 
     */
    public it.edison.thorGAS.ArrayOfDettaglioPreventivo createArrayOfDettaglioPreventivo() {
        return new ArrayOfDettaglioPreventivo();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.DettaglioPreventivo }
     * 
     */
    public it.edison.thorGAS.DettaglioPreventivo createDettaglioPreventivo() {
        return new DettaglioPreventivo();
    }

    /**
     * Create an instance of {@link Misuratore }
     * 
     */
    public Misuratore createMisuratore() {
        return new Misuratore();
    }

    /**
     * Create an instance of {@link Verifica }
     * 
     */
    public Verifica createVerifica() {
        return new Verifica();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.Ammissibilita }
     * 
     */
    public it.edison.thorGAS.Ammissibilita createAmmissibilita() {
        return new Ammissibilita();
    }

    /**
     * Create an instance of {@link Indirizzo }
     * 
     */
    public Indirizzo createIndirizzo() {
        return new Indirizzo();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.DatiTecniciPreventivo }
     * 
     */
    public it.edison.thorGAS.DatiTecniciPreventivo createDatiTecniciPreventivo() {
        return new DatiTecniciPreventivo();
    }

    /**
     * Create an instance of {@link Documentazione }
     * 
     */
    public Documentazione createDocumentazione() {
        return new Documentazione();
    }

    /**
     * Create an instance of {@link Annullamento }
     * 
     */
    public Annullamento createAnnullamento() {
        return new Annullamento();
    }

    /**
     * Create an instance of {@link DatiTecnici }
     * 
     */
    public DatiTecnici createDatiTecnici() {
        return new DatiTecnici();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.Esito }
     * 
     */
    public it.edison.thorGAS.Esito createEsito() {
        return new Esito();
    }

    /**
     * Create an instance of {@link it.edison.thorGAS.Tracking }
     * 
     */
    public it.edison.thorGAS.Tracking createTracking() {
        return new Tracking();
    }

}
