package cat.tmb.citaprevia.integration.services;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cat.tmb.citaprevia.api.services.qmatic.QMaticAuthorizationService;
import cat.tmb.citaprevia.api.services.qmatic.QMaticCalendarAPIService;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class QMaticAuthorizationTest {

	private static final Logger logger = LogManager.getLogger(QMaticAuthorizationTest.class);

	@Inject 
	QMaticAuthorizationService qmaticAPIClient;
	
	@Inject
	@RestClient
	QMaticCalendarAPIService qMaticOrchestaAPIService;
	
    @Test
    public void testBasicAuthentication() {
    	String token = qmaticAPIClient.getNewAuthorizationToken();
    	Assertions.assertNotNull(token);
    	
    	/* Check valid token 
    	 * CAN'T BE tested as the token has an invalid date value in field exp
    	 * */
    	//Assertions.assertTrue(qmaticAPIClient.isValidToken(token));
    }
 
    @Test
    public void testQMaticBranchesEndpoint() {
    	Response response = qMaticOrchestaAPIService.getBranches(qmaticAPIClient);
    	Assertions.assertNotNull(response);
    	Assertions.assertEquals(200, response.getStatus());
    	logger.debug("Result: {}", response.readEntity(String.class));
    	
    }
    
    /*
    @Test
    public void testQMaticBranchServicesEndpoint() {
    	Response response = qMaticOrchestaAPIService.getBranchServices("4");
    	Assertions.assertNotNull(response);
    	Assertions.assertEquals(200, response.getStatus());
    	logger.debug("Result: {}", response.readEntity(String.class));
    	
    } 
    */
    
}