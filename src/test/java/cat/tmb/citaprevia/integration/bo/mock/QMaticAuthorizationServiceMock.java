package cat.tmb.citaprevia.integration.bo.mock;

import javax.enterprise.context.ApplicationScoped;

import cat.tmb.citaprevia.api.services.qmatic.QMaticAuthorizationService;
import io.quarkus.test.Mock;

@Mock
@ApplicationScoped 
public class QMaticAuthorizationServiceMock extends QMaticAuthorizationService{
	@Override
	public String getAuthorizationHeaderValue() {
		return "";
	}

}
