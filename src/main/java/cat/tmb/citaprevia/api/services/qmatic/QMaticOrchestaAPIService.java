package cat.tmb.citaprevia.api.services.qmatic;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import cat.tmb.citaprevia.api.services.qmatic.dto.BranchResponse;
import cat.tmb.citaprevia.api.services.qmatic.dto.ServiceResponse;
import io.quarkus.cache.CacheResult;

@ApplicationScoped
public class QMaticOrchestaAPIService {

	private static final Logger logger = LogManager.getLogger(QMaticOrchestaAPIService.class);


	@Inject
	@RestClient
	public QMaticCalendarAPIService qMaticOrchestaAPIService;

	@Inject
	public QMaticAuthorizationService qMaticAuthorizationService;

	public QMaticOrchestaAPIService() {}

	@CacheResult(cacheName = "qmatic-branches") 
	public BranchResponse getBranches() {
		logger.info("Fetching QMatic branches from de QMatic API");
		Response response = qMaticOrchestaAPIService.getBranches(qMaticAuthorizationService);
		if (response.getStatus() == 200) {
			BranchResponse branchResponse = response.readEntity(BranchResponse.class);
			response.close();
			return branchResponse;
		}else {
			logger.warn("QMaticAPI getBranches returned {}", response.getStatus());
			return null;
		}

	}

	@CacheResult(cacheName = "qmatic-services") 
	public ServiceResponse getBranchesServices(String branchId) {
		logger.info("Fetching QMatic services from de QMatic API for branch {}", branchId);
		Response response = qMaticOrchestaAPIService.getBranchServices(qMaticAuthorizationService, branchId);
		if (response.getStatus() == 200) {
			ServiceResponse serviceResponse = response.readEntity(ServiceResponse.class);
			response.close();
			return serviceResponse;
		}else {
			logger.warn("QMaticAPI getBranchesServices returned {}", response.getStatus());
			return null;
		}

	}


}
