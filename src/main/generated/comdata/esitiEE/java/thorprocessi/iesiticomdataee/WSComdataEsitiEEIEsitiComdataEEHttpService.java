package thorprocessi.iesiticomdataee;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "WSComdataEsitiEE_IEsitiComdataEEHttpService",
                  wsdlLocation = "classpath:/wsdl/THORProcessi_WSComdataEsitiEE.wsdl",
                  targetNamespace = "http://THORProcessi/IEsitiComdataEE")
public class WSComdataEsitiEEIEsitiComdataEEHttpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://THORProcessi/IEsitiComdataEE", "WSComdataEsitiEE_IEsitiComdataEEHttpService");
    public final static QName WSComdataEsitiEEIEsitiComdataEEHttpPort = new QName("http://THORProcessi/IEsitiComdataEE", "WSComdataEsitiEE_IEsitiComdataEEHttpPort");
    static {
        URL url = WSComdataEsitiEEIEsitiComdataEEHttpService.class.getClassLoader().getResource("/wsdl/THORProcessi_WSComdataEsitiEE.wsdl");
        if (url == null) {
            url = WSComdataEsitiEEIEsitiComdataEEHttpService.class.getClassLoader().getResource("wsdl/THORProcessi_WSComdataEsitiEE.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(WSComdataEsitiEEIEsitiComdataEEHttpService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:/wsdl/THORProcessi_WSComdataEsitiEE.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSComdataEsitiEEIEsitiComdataEEHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IEsitiComdataEE
     */
    @WebEndpoint(name = "WSComdataEsitiEE_IEsitiComdataEEHttpPort")
    public IEsitiComdataEE getWSComdataEsitiEEIEsitiComdataEEHttpPort() {
        return super.getPort(WSComdataEsitiEEIEsitiComdataEEHttpPort, IEsitiComdataEE.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEsitiComdataEE
     */
    @WebEndpoint(name = "WSComdataEsitiEE_IEsitiComdataEEHttpPort")
    public IEsitiComdataEE getWSComdataEsitiEEIEsitiComdataEEHttpPort(WebServiceFeature... features) {
        return super.getPort(WSComdataEsitiEEIEsitiComdataEEHttpPort, IEsitiComdataEE.class, features);
    }

}
