
package lifetime.teams;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * The Platform API to manage teams in the platform.
 * To use this API you need to send an authentication argument with username/password, or use the AuthenticationService Web Service API to acquire a session token to send as argument.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TeamManagementService", targetNamespace = "http://LifeTimeServices/TeamManagementService/", wsdlLocation = "http://outsystemscloud/LifeTimeServices/TeamManagementService.asmx?WSDL")
public class TeamManagementService
    extends Service
{

    private final static URL TEAMMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(lifetime.teams.TeamManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = lifetime.teams.TeamManagementService.class.getResource(".");
            url = new URL(baseUrl, "http://outsystemscloud/LifeTimeServices/TeamManagementService.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://outsystemscloud/LifeTimeServices/TeamManagementService.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TEAMMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public TeamManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TeamManagementService() {
        super(TEAMMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://LifeTimeServices/TeamManagementService/", "TeamManagementService"));
    }

    /**
     * 
     * @return
     *     returns TeamManagementServiceSoap
     */
    @WebEndpoint(name = "TeamManagementServiceSoap")
    public TeamManagementServiceSoap getTeamManagementServiceSoap() {
        return super.getPort(new QName("http://LifeTimeServices/TeamManagementService/", "TeamManagementServiceSoap"), TeamManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TeamManagementServiceSoap
     */
    @WebEndpoint(name = "TeamManagementServiceSoap")
    public TeamManagementServiceSoap getTeamManagementServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/TeamManagementService/", "TeamManagementServiceSoap"), TeamManagementServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns TeamManagementServiceSoap
     */
    @WebEndpoint(name = "TeamManagementServiceSoap12")
    public TeamManagementServiceSoap getTeamManagementServiceSoap12() {
        return super.getPort(new QName("http://LifeTimeServices/TeamManagementService/", "TeamManagementServiceSoap12"), TeamManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TeamManagementServiceSoap
     */
    @WebEndpoint(name = "TeamManagementServiceSoap12")
    public TeamManagementServiceSoap getTeamManagementServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/TeamManagementService/", "TeamManagementServiceSoap12"), TeamManagementServiceSoap.class, features);
    }

}
