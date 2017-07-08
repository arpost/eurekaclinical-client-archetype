package ${package}.client;

import java.net.URI;
import org.eurekaclinical.common.comm.clients.AuthorizingEurekaClinicalProxyClient;


/**
 * Created by akalsan on 9/21/16.
 */
public class Client extends AuthorizingEurekaClinicalProxyClient {

    private final URI serviceUrl;

    public Client(String inServiceUrl) {
        super(null);
        this.serviceUrl = URI.create(inServiceUrl);
    }

    @Override
    protected URI getResourceUrl() {
        return this.serviceUrl;
    }

}
