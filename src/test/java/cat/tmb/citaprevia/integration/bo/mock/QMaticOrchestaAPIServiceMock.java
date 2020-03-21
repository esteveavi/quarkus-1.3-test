package cat.tmb.citaprevia.integration.bo.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cat.tmb.citaprevia.api.services.qmatic.QMaticOrchestaAPIService;
import cat.tmb.citaprevia.api.services.qmatic.dto.Branch;
import cat.tmb.citaprevia.api.services.qmatic.dto.BranchResponse;
import io.quarkus.test.Mock;

@Mock
@ApplicationScoped 
public class QMaticOrchestaAPIServiceMock extends QMaticOrchestaAPIService
{

	private static final Logger logger = LogManager.getLogger(QMaticOrchestaAPIServiceMock.class);

	@Override	
	public BranchResponse getBranches() {
		logger.info("MOCK ORQUESTRA API CLIENT!!!!");
		BranchResponse response  = new BranchResponse();
		List<Branch> branchList = new ArrayList<Branch>();
		Branch newBranch = new Branch();
		newBranch.setName("TestBranch");
		newBranch.setPublicId("BranchPublicId");
		newBranch.setCreated(new Date());
		branchList.add(newBranch);
		response.setBranchList(branchList);
		return response;
	}


}