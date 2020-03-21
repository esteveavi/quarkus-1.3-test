package cat.tmb.citaprevia.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CancelAppointment{


	public CancelAppointment() {

	}

	@NotEmpty
	private String appointmentCode;
	
	@NotEmpty
	@Email
	private String customerEmail;
	
	public String getAppointmentCode() {
		return appointmentCode;
	}
	public void setAppointmentCode(String appointmentCode) {
		this.appointmentCode = appointmentCode;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	



}
