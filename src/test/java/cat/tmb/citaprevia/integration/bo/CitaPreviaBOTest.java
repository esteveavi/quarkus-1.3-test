package cat.tmb.citaprevia.integration.bo;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cat.tmb.citaprevia.api.bo.CitaPreviaBO;
import cat.tmb.citaprevia.integration.TransactionalQuarkusTest;

@TransactionalQuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CitaPreviaBOTest {


	@Inject 
	CitaPreviaBO citaPreviaBO;



	@Test
	public void testGetQMaticBranches() {
		Assertions.assertNull(citaPreviaBO.getQMaticBranches());
		}

}

