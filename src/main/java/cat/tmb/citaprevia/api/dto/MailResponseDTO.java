package cat.tmb.citaprevia.api.dto;

public class MailResponseDTO {

	public MailResponseDTO() {}
	
	
	
	public MailResponseDTO(boolean resultSuccessful, String error) {
		super();
		this.resultSuccessful = resultSuccessful;
		this.error = error;
	}



	private boolean resultSuccessful = true;
	
	private String error;

	public boolean isResultSuccessful() {
		return resultSuccessful;
	}

	public void setResultSuccessful(boolean resultSuccessful) {
		this.resultSuccessful = resultSuccessful;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
