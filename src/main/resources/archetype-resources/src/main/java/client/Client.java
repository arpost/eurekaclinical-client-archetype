package ${package}.client;

import java.net.URI;
import org.eurekaclinical.common.comm.clients.AuthorizingEurekaClinicalClient;


/**
 * A basic Eureka! Clinical REST API client for a microservice that implements
 * the users and roles APIs.
 */
public class Client extends AuthorizingEurekaClinicalClient {

    private final URI resourceUrl;

    /**
     * Constructs the REST client with the provided base URL for the service's
     * REST resources.
     * 
     * @param inResourceUrl the base URL for the service's rest resources. For
     * example, if the the users resource is
     * <code>https://mydomain.org/eurekaclinical-mymicroservice-service/api/protected/users</code>, 
     * then this argument should be
     * <code>https://mydomain.org/eurekaclinical-mymicroservice-service</code>.
     */
    public Client(String inResourceUrl) {
        super(null);
        this.resourceUrl = URI.create(inResourceUrl);
    }

    /**
     * Returns the base URL for the service's REST resources as a URI.
     * 
     * @return a URI.
     */
    @Override
    protected URI getResourceUrl() {
        return this.resourceUrl;
    }

}
