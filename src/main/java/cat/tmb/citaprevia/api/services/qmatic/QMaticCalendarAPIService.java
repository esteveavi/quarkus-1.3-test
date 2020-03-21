package cat.tmb.citaprevia.api.services.qmatic;

import javax.enterprise.context.Dependent;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/v1/")
@RegisterRestClient
@Dependent
public interface QMaticCalendarAPIService {
	
    @GET
    @Path("/branches/")
    @Produces("application/json")
    //@Fallback(fallbackMethod="queueForLater")
	Response getBranches(@BeanParam QMaticAuthorizationService authorization);
    
    
    @GET
    @Path("/branches/{branchId}/services/")
    @Produces("application/json")
	Response getBranchServices(@BeanParam QMaticAuthorizationService authorization, @PathParam("branchId") String branchId);
    
    /*Fault tolerant fallback: TODO
    default boolean queueForLater(Entity e) {
        return false;
    }
    */

	
    
}
