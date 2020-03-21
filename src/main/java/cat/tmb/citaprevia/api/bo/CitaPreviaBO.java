package cat.tmb.citaprevia.api.bo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import cat.tmb.citaprevia.api.dto.Address;
import cat.tmb.citaprevia.api.dto.Branch;
import cat.tmb.citaprevia.api.dto.Service;
import cat.tmb.citaprevia.api.services.qmatic.QMaticOrchestaAPIService;
import cat.tmb.citaprevia.api.services.qmatic.dto.BranchResponse;
import cat.tmb.citaprevia.api.services.qmatic.dto.ServiceResponse;


/**
 * @author UT14568
 *
 */
@ApplicationScoped
public class CitaPreviaBO {

	private static final Logger logger = LogManager.getLogger(CitaPreviaBO.class);

	private static long REMAINDER_SCHEDULER_IMPRECISION_MINUTES = 3;

	@ConfigProperty(name="citaprevia.bo.codi.longitud", defaultValue="10")
	int codeLength;

	public CitaPreviaBO() {}

	@Inject
	QMaticOrchestaAPIService qMaticOrchestaAPIService;
	
	

	/**
	 * Fetches QMatic branches
	 * @return
	 */
	public List<Branch> getQMaticBranches() {

		List<Branch> result = new ArrayList<Branch>();
		BranchResponse response = null;

		try {
			response = qMaticOrchestaAPIService.getBranches();
		} catch (Exception e) {
			logger.error(e);
			return result;
		}

		if (response != null) {
			logger.debug("Processing branch responses...");

			for (cat.tmb.citaprevia.api.services.qmatic.dto.Branch branchResponse : response.getBranchList()) {
				Branch branch = new Branch();
				branch.setName(branchResponse.getName());
				branch.setEmail(branchResponse.getEmail());
				branch.setFullTimeZone(branchResponse.getFullTimeZone());
				branch.setPhone(branchResponse.getPhone());
				branch.setPrefix(branchResponse.getBranchPrefix());
				branch.setPublicId(branchResponse.getPublicId());
				branch.setTimeZone(branchResponse.getTimeZone());
				Address address = new Address();

				address.setAddressLine1(branchResponse.getAddressLine1());
				address.setAddressLine2(branchResponse.getAddressLine2());
				address.setCity(branchResponse.getAddressCity());
				address.setCountry(branchResponse.getAddressCountry());
				address.setState(branchResponse.getAddressState());
				address.setZipcode(branchResponse.getAddressZip());
				branch.setAddress(address);


				result.add(branch);
			}
		}
		return result;
	}

	/**
	 * Fetches the QMatic services for specific branch
	 * @param branchId
	 * @return
	 */
	public List<Service> getQMaticBranchesServices(String branchId) {

		List<Service> result = new ArrayList<Service>();
		ServiceResponse response = null;

		try {
			response = qMaticOrchestaAPIService.getBranchesServices(branchId);
		} catch (Exception e) {
			logger.error(e);
			return result;
		}

		if (response != null) {
			logger.debug("Processing branch services responses...");

			for (cat.tmb.citaprevia.api.services.qmatic.dto.Service serviceResponse : response.getServiceList()) {
				Service service = new Service();
				service.setName(serviceResponse.getName());
				service.setActive(serviceResponse.getActive());
				service.setAdditionalCustomerDuration(serviceResponse.getAdditionalCustomerDuration());
				service.setCustom(serviceResponse.getCustom());
				service.setDuration(serviceResponse.getDuration());
				service.setPublicEnabled(serviceResponse.getPublicEnabled());
				service.setPublicId(serviceResponse.getPublicId());
				result.add(service);
			}
		}
		return result;
	}

	/**
	 * TODO
	 * @param branchId
	 * @param serviceId
	 * @return
	 */
	public List<LocalDate> getQMaticBranchesServicesDates(String branchId, String serviceId) {

		List<LocalDate> result = new ArrayList<LocalDate>();

		result.add(LocalDate.now());
		result.add(LocalDate.now());
		result.add(LocalDate.now());
		result.add(LocalDate.now());


		return result;
	}




	/**
	 * TODO
	 * @param branchPublicId
	 * @param servicePublicId
	 * @param serviceDate
	 * @return
	 */
	public List<LocalTime> getQMaticBranchesServicesDatesTimes(String branchPublicId, String servicePublicId,
			LocalDate serviceDate) {
		List<LocalTime> result = new ArrayList<LocalTime>();

		result.add(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));
		result.add(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));
		result.add(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));
		result.add(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));


		return result;
	}




}
