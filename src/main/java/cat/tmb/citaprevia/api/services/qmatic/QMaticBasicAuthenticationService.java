package cat.tmb.citaprevia.api.services.qmatic;

import java.util.Base64;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/security/jwt/")
@RegisterRestClient
@Dependent
public interface QMaticBasicAuthenticationService {

	
    @GET
    @ClientHeaderParam(name="Authorization",
                       value="{basicAuthentication}",
                       required=true)
    @Produces("application/json")
    Response getAuthorizationJWTToken();

	default String basicAuthentication() {
		String username = ConfigProvider.getConfig().getValue("qmatic.api.username", String.class);
		String password = ConfigProvider.getConfig().getValue("qmatic.api.password", String.class);
		String usernamePassword = username+":"+password;
		return "Basic " + 
				Base64.getEncoder().encodeToString(usernamePassword.getBytes());
	}
}
