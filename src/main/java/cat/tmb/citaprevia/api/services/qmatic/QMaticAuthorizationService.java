package cat.tmb.citaprevia.api.services.qmatic;

import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class QMaticAuthorizationService {


	private static final Logger logger = LogManager.getLogger(QMaticAuthorizationService.class);

	public QMaticAuthorizationService() {}


	public String authorizationToken = "";
	public Date authorizationTokenExpirationDatetime; 
	
	private static final String BEARER_PREFIX = "Bearer ";
	
	@ConfigProperty(name="qmatic.jwt.expiration.hours", defaultValue="24")
	int qmaticTokenExpirationHours;


    void onStart(@Observes StartupEvent ev) {               
    	logger.info("The QMaticAuthorizationService is starting...");
    }

	@Inject 
	@RestClient
	QMaticBasicAuthenticationService authService;

	@HeaderParam("Authorization")
	public String getAuthorizationHeaderValue() {
		if (authorizationToken != null && !authorizationToken.equals("") 
				&& authorizationTokenExpirationDatetime != null && new Date().before(authorizationTokenExpirationDatetime)) {
			logger.debug("QMaticAuthorizationService: Reusing token {} that expires at {}", authorizationToken,authorizationTokenExpirationDatetime);
			return BEARER_PREFIX + authorizationToken;
		} else {
			logger.debug("QMaticAuthorizationService: No valid tokwn found. Getting new one");
			return BEARER_PREFIX + getNewAuthorizationToken();
		}


	}


	public String getNewAuthorizationToken() {

		Response response = authService.getAuthorizationJWTToken();
		logger.info("- Status: {}", response.getStatus());
		if (response.getStatus() == 200) {
			authorizationToken = response.readEntity(String.class);
			authorizationTokenExpirationDatetime = new Date();
			/*Add 24 hours as this is the valid time*/
			Calendar cal = Calendar.getInstance();
			cal.setTime(authorizationTokenExpirationDatetime);
			cal.add(Calendar.HOUR, qmaticTokenExpirationHours);
			authorizationTokenExpirationDatetime = cal.getTime();
			return authorizationToken;
		} else {
			authorizationToken = "";
			authorizationTokenExpirationDatetime = null;
		}
		return "";


	}



	/**
	 * This method can not be used as the tokens issued has the exp date field with an invalid date value
	 * @param token
	 * @return
	 */
	public boolean isValidToken(String token) {
		boolean result = false;
		try {
			DecodedJWT jwt = JWT.decode(token);
			if (jwt.getExpiresAt().after(new Date())){
				return true;
			} else {
				logger.debug("Token {} expired at {}", token, jwt.getExpiresAt());
				return false;
			}


		} catch (JWTDecodeException exception){
			logger.error("Error decoding token: "+token, exception);
		}
		return result;
	}


}
